
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
    "upgradeTo",
    "upgrades",
    "vulns"
})
@Generated("jsonschema2pojo")
public class IoQuarkusQuarkusResteasyReactive353 {

    @JsonProperty("upgradeTo")
    private String upgradeTo;
    @JsonProperty("upgrades")
    private List<String> upgrades;
    @JsonProperty("vulns")
    private List<String> vulns;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("upgradeTo")
    public String getUpgradeTo() {
        return upgradeTo;
    }

    @JsonProperty("upgradeTo")
    public void setUpgradeTo(String upgradeTo) {
        this.upgradeTo = upgradeTo;
    }

    @JsonProperty("upgrades")
    public List<String> getUpgrades() {
        return upgrades;
    }

    @JsonProperty("upgrades")
    public void setUpgrades(List<String> upgrades) {
        this.upgrades = upgrades;
    }

    @JsonProperty("vulns")
    public List<String> getVulns() {
        return vulns;
    }

    @JsonProperty("vulns")
    public void setVulns(List<String> vulns) {
        this.vulns = vulns;
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
