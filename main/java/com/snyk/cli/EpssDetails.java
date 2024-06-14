
package com.snyk.cli;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "percentile",
    "probability",
    "modelVersion"
})
@Generated("jsonschema2pojo")
public class EpssDetails {

    @JsonProperty("percentile")
    private String percentile;
    @JsonProperty("probability")
    private String probability;
    @JsonProperty("modelVersion")
    private String modelVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("percentile")
    public String getPercentile() {
        return percentile;
    }

    @JsonProperty("percentile")
    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }

    @JsonProperty("probability")
    public String getProbability() {
        return probability;
    }

    @JsonProperty("probability")
    public void setProbability(String probability) {
        this.probability = probability;
    }

    @JsonProperty("modelVersion")
    public String getModelVersion() {
        return modelVersion;
    }

    @JsonProperty("modelVersion")
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
