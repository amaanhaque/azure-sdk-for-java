// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class to select a track. */
@Fluent
public final class TrackSelection {
    /*
     * TrackSelections is a track property condition list which can specify
     * track(s)
     */
    @JsonProperty(value = "trackSelections")
    private List<TrackPropertyCondition> trackSelections;

    /**
     * Get the trackSelections property: TrackSelections is a track property condition list which can specify track(s).
     *
     * @return the trackSelections value.
     */
    public List<TrackPropertyCondition> trackSelections() {
        return this.trackSelections;
    }

    /**
     * Set the trackSelections property: TrackSelections is a track property condition list which can specify track(s).
     *
     * @param trackSelections the trackSelections value to set.
     * @return the TrackSelection object itself.
     */
    public TrackSelection withTrackSelections(List<TrackPropertyCondition> trackSelections) {
        this.trackSelections = trackSelections;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (trackSelections() != null) {
            trackSelections().forEach(e -> e.validate());
        }
    }
}
