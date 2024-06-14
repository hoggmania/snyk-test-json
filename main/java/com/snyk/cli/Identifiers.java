
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
    "CVE",
    "CWE",
    "GHSA"
})
@Generated("jsonschema2pojo")
public class Identifiers {

    @JsonProperty("CVE")
    private List<String> cve;
    @JsonProperty("CWE")
    private List<String> cwe;
    @JsonProperty("GHSA")
    private List<String> ghsa;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("CVE")
    public List<String> getCve() {
        return cve;
    }

    @JsonProperty("CVE")
    public void setCve(List<String> cve) {
        this.cve = cve;
    }

    @JsonProperty("CWE")
    public List<String> getCwe() {
        return cwe;
    }

    @JsonProperty("CWE")
    public void setCwe(List<String> cwe) {
        this.cwe = cwe;
    }

    @JsonProperty("GHSA")
    public List<String> getGhsa() {
        return ghsa;
    }

    @JsonProperty("GHSA")
    public void setGhsa(List<String> ghsa) {
        this.ghsa = ghsa;
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
