
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
    "assigner",
    "severity",
    "cvssV3Vector",
    "cvssV3BaseScore",
    "modificationTime"
})
@Generated("jsonschema2pojo")
public class CvssDetail {

    @JsonProperty("assigner")
    private String assigner;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("cvssV3Vector")
    private String cvssV3Vector;
    @JsonProperty("cvssV3BaseScore")
    private Double cvssV3BaseScore;
    @JsonProperty("modificationTime")
    private String modificationTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("assigner")
    public String getAssigner() {
        return assigner;
    }

    @JsonProperty("assigner")
    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("cvssV3Vector")
    public String getCvssV3Vector() {
        return cvssV3Vector;
    }

    @JsonProperty("cvssV3Vector")
    public void setCvssV3Vector(String cvssV3Vector) {
        this.cvssV3Vector = cvssV3Vector;
    }

    @JsonProperty("cvssV3BaseScore")
    public Double getCvssV3BaseScore() {
        return cvssV3BaseScore;
    }

    @JsonProperty("cvssV3BaseScore")
    public void setCvssV3BaseScore(Double cvssV3BaseScore) {
        this.cvssV3BaseScore = cvssV3BaseScore;
    }

    @JsonProperty("modificationTime")
    public String getModificationTime() {
        return modificationTime;
    }

    @JsonProperty("modificationTime")
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
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
