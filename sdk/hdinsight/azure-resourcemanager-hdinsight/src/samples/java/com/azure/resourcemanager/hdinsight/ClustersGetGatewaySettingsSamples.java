// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight;

import com.azure.core.util.Context;

/** Samples for Clusters GetGatewaySettings. */
public final class ClustersGetGatewaySettingsSamples {
    /**
     * Sample code: Get HTTP settings.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void getHTTPSettings(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.clusters().getGatewaySettingsWithResponse("rg1", "cluster1", Context.NONE);
    }
}