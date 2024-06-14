
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
    "licenseType",
    "severity",
    "instructions"
})
@Generated("jsonschema2pojo")
public class Epl10 {

    @JsonProperty("licenseType")
    private String licenseType;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("instructions")
    private String instructions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("licenseType")
    public String getLicenseType() {
        return licenseType;
    }

    @JsonProperty("licenseType")
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
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
