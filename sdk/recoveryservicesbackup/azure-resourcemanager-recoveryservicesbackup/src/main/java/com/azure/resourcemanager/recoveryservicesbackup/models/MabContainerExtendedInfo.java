// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Additional information of the container. */
@Fluent
public final class MabContainerExtendedInfo {
    /*
     * Time stamp when this container was refreshed.
     */
    @JsonProperty(value = "lastRefreshedAt")
    private OffsetDateTime lastRefreshedAt;

    /*
     * Type of backup items associated with this container.
     */
    @JsonProperty(value = "backupItemType")
    private BackupItemType backupItemType;

    /*
     * List of backup items associated with this container.
     */
    @JsonProperty(value = "backupItems")
    private List<String> backupItems;

    /*
     * Backup policy associated with this container.
     */
    @JsonProperty(value = "policyName")
    private String policyName;

    /*
     * Latest backup status of this container.
     */
    @JsonProperty(value = "lastBackupStatus")
    private String lastBackupStatus;

    /**
     * Get the lastRefreshedAt property: Time stamp when this container was refreshed.
     *
     * @return the lastRefreshedAt value.
     */
    public OffsetDateTime lastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Set the lastRefreshedAt property: Time stamp when this container was refreshed.
     *
     * @param lastRefreshedAt the lastRefreshedAt value to set.
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withLastRefreshedAt(OffsetDateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
        return this;
    }

    /**
     * Get the backupItemType property: Type of backup items associated with this container.
     *
     * @return the backupItemType value.
     */
    public BackupItemType backupItemType() {
        return this.backupItemType;
    }

    /**
     * Set the backupItemType property: Type of backup items associated with this container.
     *
     * @param backupItemType the backupItemType value to set.
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withBackupItemType(BackupItemType backupItemType) {
        this.backupItemType = backupItemType;
        return this;
    }

    /**
     * Get the backupItems property: List of backup items associated with this container.
     *
     * @return the backupItems value.
     */
    public List<String> backupItems() {
        return this.backupItems;
    }

    /**
     * Set the backupItems property: List of backup items associated with this container.
     *
     * @param backupItems the backupItems value to set.
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withBackupItems(List<String> backupItems) {
        this.backupItems = backupItems;
        return this;
    }

    /**
     * Get the policyName property: Backup policy associated with this container.
     *
     * @return the policyName value.
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set the policyName property: Backup policy associated with this container.
     *
     * @param policyName the policyName value to set.
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get the lastBackupStatus property: Latest backup status of this container.
     *
     * @return the lastBackupStatus value.
     */
    public String lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set the lastBackupStatus property: Latest backup status of this container.
     *
     * @param lastBackupStatus the lastBackupStatus value to set.
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withLastBackupStatus(String lastBackupStatus) {
        this.lastBackupStatus = lastBackupStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
