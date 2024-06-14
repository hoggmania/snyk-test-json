
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
    "severities",
    "orgLicenseRules"
})
@Generated("jsonschema2pojo")
public class LicensesPolicy {

    @JsonProperty("severities")
    private Severities severities;
    @JsonProperty("orgLicenseRules")
    private OrgLicenseRules orgLicenseRules;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("severities")
    public Severities getSeverities() {
        return severities;
    }

    @JsonProperty("severities")
    public void setSeverities(Severities severities) {
        this.severities = severities;
    }

    @JsonProperty("orgLicenseRules")
    public OrgLicenseRules getOrgLicenseRules() {
        return orgLicenseRules;
    }

    @JsonProperty("orgLicenseRules")
    public void setOrgLicenseRules(OrgLicenseRules orgLicenseRules) {
        this.orgLicenseRules = orgLicenseRules;
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
