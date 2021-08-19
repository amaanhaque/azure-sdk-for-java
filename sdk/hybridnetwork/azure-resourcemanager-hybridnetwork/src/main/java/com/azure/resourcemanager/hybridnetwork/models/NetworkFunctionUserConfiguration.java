// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network function user configuration. */
@Fluent
public final class NetworkFunctionUserConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkFunctionUserConfiguration.class);

    /*
     * The name of the network function role.
     */
    @JsonProperty(value = "roleName")
    private String roleName;

    /*
     * The user data parameters from the customer.
     */
    @JsonProperty(value = "userDataParameters")
    private Object userDataParameters;

    /*
     * The network interface configuration.
     */
    @JsonProperty(value = "networkInterfaces")
    private List<NetworkInterface> networkInterfaces;

    /*
     * Specifies the operating system settings for the role instance.
     */
    @JsonProperty(value = "osProfile")
    private NetworkFunctionUserConfigurationOsProfile osProfile;

    /**
     * Get the roleName property: The name of the network function role.
     *
     * @return the roleName value.
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set the roleName property: The name of the network function role.
     *
     * @param roleName the roleName value to set.
     * @return the NetworkFunctionUserConfiguration object itself.
     */
    public NetworkFunctionUserConfiguration withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the userDataParameters property: The user data parameters from the customer.
     *
     * @return the userDataParameters value.
     */
    public Object userDataParameters() {
        return this.userDataParameters;
    }

    /**
     * Set the userDataParameters property: The user data parameters from the customer.
     *
     * @param userDataParameters the userDataParameters value to set.
     * @return the NetworkFunctionUserConfiguration object itself.
     */
    public NetworkFunctionUserConfiguration withUserDataParameters(Object userDataParameters) {
        this.userDataParameters = userDataParameters;
        return this;
    }

    /**
     * Get the networkInterfaces property: The network interface configuration.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: The network interface configuration.
     *
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the NetworkFunctionUserConfiguration object itself.
     */
    public NetworkFunctionUserConfiguration withNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the role instance.
     *
     * @return the osProfile value.
     */
    public NetworkFunctionUserConfigurationOsProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the role instance.
     *
     * @param osProfile the osProfile value to set.
     * @return the NetworkFunctionUserConfiguration object itself.
     */
    public NetworkFunctionUserConfiguration withOsProfile(NetworkFunctionUserConfigurationOsProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
    }
}