// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.context.core.impl;

import com.azure.core.management.exception.ManagementException;
import com.azure.resourcemanager.servicebus.models.Queue;
import com.azure.resourcemanager.servicebus.models.ServiceBusNamespace;
import com.azure.spring.cloud.context.core.api.AzureResourceMetadata;
import com.azure.spring.core.util.Tuple;

/**
 * Resource manager for Service Bus queue.
 */
public class ServiceBusQueueManager extends AzureManager<Queue, Tuple<ServiceBusNamespace, String>> {


    public ServiceBusQueueManager(AzureResourceMetadata azureResourceMetadata) {
        super(azureResourceMetadata);
    }

    @Override
    String getResourceName(Tuple<ServiceBusNamespace, String> key) {
        return key.getSecond();
    }

    @Override
    String getResourceType() {
        return Queue.class.getSimpleName();
    }

    @Override
    public Queue internalGet(Tuple<ServiceBusNamespace, String> namespaceAndName) {
        try {
            return namespaceAndName.getFirst().queues().getByName(namespaceAndName.getSecond());
        } catch (ManagementException e) {
            if (e.getResponse().getStatusCode() == 404) {
                return null;
            } else {
                throw e;
            }
        }
    }

    @Override
    public Queue internalCreate(Tuple<ServiceBusNamespace, String> namespaceAndName) {
        return namespaceAndName.getFirst().queues().define(namespaceAndName.getSecond()).create();
    }
}