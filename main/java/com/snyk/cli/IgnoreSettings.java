
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
    "adminOnly",
    "reasonRequired",
    "disregardFilesystemIgnores"
})
@Generated("jsonschema2pojo")
public class IgnoreSettings {

    @JsonProperty("adminOnly")
    private Boolean adminOnly;
    @JsonProperty("reasonRequired")
    private Boolean reasonRequired;
    @JsonProperty("disregardFilesystemIgnores")
    private Boolean disregardFilesystemIgnores;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("adminOnly")
    public Boolean getAdminOnly() {
        return adminOnly;
    }

    @JsonProperty("adminOnly")
    public void setAdminOnly(Boolean adminOnly) {
        this.adminOnly = adminOnly;
    }

    @JsonProperty("reasonRequired")
    public Boolean getReasonRequired() {
        return reasonRequired;
    }

    @JsonProperty("reasonRequired")
    public void setReasonRequired(Boolean reasonRequired) {
        this.reasonRequired = reasonRequired;
    }

    @JsonProperty("disregardFilesystemIgnores")
    public Boolean getDisregardFilesystemIgnores() {
        return disregardFilesystemIgnores;
    }

    @JsonProperty("disregardFilesystemIgnores")
    public void setDisregardFilesystemIgnores(Boolean disregardFilesystemIgnores) {
        this.disregardFilesystemIgnores = disregardFilesystemIgnores;
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
