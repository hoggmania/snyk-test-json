
package com.snyk.cli;

import java.util.LinkedHashMap;
import java.util.List;
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
    "ignore",
    "patch"
})
@Generated("jsonschema2pojo")
public class Filtered {

    @JsonProperty("ignore")
    private List<Object> ignore;
    @JsonProperty("patch")
    private List<Object> patch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ignore")
    public List<Object> getIgnore() {
        return ignore;
    }

    @JsonProperty("ignore")
    public void setIgnore(List<Object> ignore) {
        this.ignore = ignore;
    }

    @JsonProperty("patch")
    public List<Object> getPatch() {
        return patch;
    }

    @JsonProperty("patch")
    public void setPatch(List<Object> patch) {
        this.patch = patch;
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
