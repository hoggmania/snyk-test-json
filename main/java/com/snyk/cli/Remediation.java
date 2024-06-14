
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
    "unresolved",
    "upgrade",
    "patch",
    "ignore",
    "pin"
})
@Generated("jsonschema2pojo")
public class Remediation {

    @JsonProperty("unresolved")
    private List<Object> unresolved;
    @JsonProperty("upgrade")
    private Upgrade upgrade;
    @JsonProperty("patch")
    private Patch patch;
    @JsonProperty("ignore")
    private Ignore ignore;
    @JsonProperty("pin")
    private Pin pin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("unresolved")
    public List<Object> getUnresolved() {
        return unresolved;
    }

    @JsonProperty("unresolved")
    public void setUnresolved(List<Object> unresolved) {
        this.unresolved = unresolved;
    }

    @JsonProperty("upgrade")
    public Upgrade getUpgrade() {
        return upgrade;
    }

    @JsonProperty("upgrade")
    public void setUpgrade(Upgrade upgrade) {
        this.upgrade = upgrade;
    }

    @JsonProperty("patch")
    public Patch getPatch() {
        return patch;
    }

    @JsonProperty("patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    @JsonProperty("ignore")
    public Ignore getIgnore() {
        return ignore;
    }

    @JsonProperty("ignore")
    public void setIgnore(Ignore ignore) {
        this.ignore = ignore;
    }

    @JsonProperty("pin")
    public Pin getPin() {
        return pin;
    }

    @JsonProperty("pin")
    public void setPin(Pin pin) {
        this.pin = pin;
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
