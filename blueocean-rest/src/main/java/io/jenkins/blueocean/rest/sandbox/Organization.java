package io.jenkins.blueocean.rest.sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API endpoint for an organization that houses all the pipelines.
 *
 * @author Kohsuke Kawaguchi
 */
public abstract class Organization extends Resource {
    @JsonProperty
    public abstract String getName();

    public abstract PipelineContainer getPipelines();

}

