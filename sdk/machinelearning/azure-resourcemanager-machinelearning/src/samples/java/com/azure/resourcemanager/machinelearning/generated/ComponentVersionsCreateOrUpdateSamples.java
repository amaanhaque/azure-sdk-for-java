// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.machinelearning.models.ComponentVersionDetails;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** Samples for ComponentVersions CreateOrUpdate. */
public final class ComponentVersionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/ComponentVersion/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Component Version.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateComponentVersion(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) throws IOException {
        manager
            .componentVersions()
            .define("string")
            .withExistingComponent("test-rg", "my-aml-workspace", "string")
            .withProperties(
                new ComponentVersionDetails()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withIsAnonymous(false)
                    .withComponentSpec(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"8ced901b-d826-477d-bfef-329da9672513\":null}",
                                Object.class,
                                SerializerEncoding.JSON)))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
