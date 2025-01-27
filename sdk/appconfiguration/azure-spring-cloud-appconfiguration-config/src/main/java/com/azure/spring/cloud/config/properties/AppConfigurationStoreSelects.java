// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.config.properties;

import static com.azure.spring.cloud.config.AppConfigurationConstants.EMPTY_LABEL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotNull;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * Properties on what Selects are checked before loading configurations.
 */
public final class AppConfigurationStoreSelects {

    /**
     * Label for requesting all configurations with (No Label)
     */
    private static final String[] EMPTY_LABEL_ARRAY = { EMPTY_LABEL };

    /**
     * Separator for multiple labels
     */
    public static final String LABEL_SEPARATOR = ",";

    @NotNull
    private String keyFilter = "/application/";

    private String labelFilter;

    /**
     * @return the keyFilter
     */
    public String getKeyFilter() {
        return keyFilter;
    }

    /**
     * @param keyFilter the keyFilter to set
     * @return AppConfigurationStoreSelects
     */
    public AppConfigurationStoreSelects setKeyFilter(String keyFilter) {
        this.keyFilter = keyFilter;
        return this;
    }

    /**
     * @param profiles List of current Spring profiles to default to using is null label is set.
     * @return List of reversed label values, which are split by the separator, the latter label has higher priority
     */
    public String[] getLabelFilter(List<String> profiles) {
        if (labelFilter == null && profiles.size() > 0) {
            Collections.reverse(profiles);
            return profiles.toArray(new String[profiles.size()]);
        } else if (!StringUtils.hasText(labelFilter)) {
            return EMPTY_LABEL_ARRAY;
        }

        // The use of trim makes label= dev,prod and label= dev, prod equal.
        List<String> labels = Arrays.stream(labelFilter.split(LABEL_SEPARATOR))
            .map(this::mapLabel)
            .distinct()
            .collect(Collectors.toList());

        if (labelFilter.endsWith(",")) {
            labels.add(EMPTY_LABEL);
        }

        Collections.reverse(labels);
        String[] t = new String[labels.size()];
        return labels.toArray(t);
    }

    /**
     * Get all labels as a single String
     * @param profiles current user profiles
     * @return comma separated list of labels
     */
    public String getLabelFilterText(List<String> profiles) {
        return String.join(",", getLabelFilter(profiles));
    }

    /**
     * Used for Generating Property Source name only.
     * 
     * @return String all labels combined.
     */
    public String getLabel() {
        return labelFilter;
    }

    /**
     * @param labelFilter the labelFilter to set
     * @return AppConfigurationStoreSelects
     */
    public AppConfigurationStoreSelects setLabelFilter(String labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }

    /**
     * Validates key-filter and label-filter are valid.
     */
    @PostConstruct
    public void validateAndInit() {
        Assert.isTrue(!keyFilter.contains("*"), "KeyFilter must not contain asterisk(*)");
        if (labelFilter != null) {
            Assert.isTrue(!labelFilter.contains("*"), "LabelFilter must not contain asterisk(*)");
        }
    }

    private String mapLabel(String label) {
        if (label == null || "".equals(label) || EMPTY_LABEL.equals(label)) {
            return EMPTY_LABEL;
        }
        return label.trim();
    }
}
