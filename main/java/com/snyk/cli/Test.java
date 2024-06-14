
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
    "vulnerabilities",
    "ok",
    "dependencyCount",
    "org",
    "policy",
    "isPrivate",
    "licensesPolicy",
    "packageManager",
    "ignoreSettings",
    "summary",
    "remediation",
    "filesystemPolicy",
    "filtered",
    "uniqueCount",
    "projectName",
    "displayTargetFile",
    "hasUnknownVersions",
    "path"
})
@Generated("jsonschema2pojo")
public class Test {

    @JsonProperty("vulnerabilities")
    private List<Vulnerability> vulnerabilities;
    @JsonProperty("ok")
    private Boolean ok;
    @JsonProperty("dependencyCount")
    private Integer dependencyCount;
    @JsonProperty("org")
    private String org;
    @JsonProperty("policy")
    private String policy;
    @JsonProperty("isPrivate")
    private Boolean isPrivate;
    @JsonProperty("licensesPolicy")
    private LicensesPolicy licensesPolicy;
    @JsonProperty("packageManager")
    private String packageManager;
    @JsonProperty("ignoreSettings")
    private IgnoreSettings ignoreSettings;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("remediation")
    private Remediation remediation;
    @JsonProperty("filesystemPolicy")
    private Boolean filesystemPolicy;
    @JsonProperty("filtered")
    private Filtered filtered;
    @JsonProperty("uniqueCount")
    private Integer uniqueCount;
    @JsonProperty("projectName")
    private String projectName;
    @JsonProperty("displayTargetFile")
    private String displayTargetFile;
    @JsonProperty("hasUnknownVersions")
    private Boolean hasUnknownVersions;
    @JsonProperty("path")
    private String path;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("vulnerabilities")
    public List<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    @JsonProperty("vulnerabilities")
    public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    @JsonProperty("ok")
    public Boolean getOk() {
        return ok;
    }

    @JsonProperty("ok")
    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    @JsonProperty("dependencyCount")
    public Integer getDependencyCount() {
        return dependencyCount;
    }

    @JsonProperty("dependencyCount")
    public void setDependencyCount(Integer dependencyCount) {
        this.dependencyCount = dependencyCount;
    }

    @JsonProperty("org")
    public String getOrg() {
        return org;
    }

    @JsonProperty("org")
    public void setOrg(String org) {
        this.org = org;
    }

    @JsonProperty("policy")
    public String getPolicy() {
        return policy;
    }

    @JsonProperty("policy")
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @JsonProperty("isPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("licensesPolicy")
    public LicensesPolicy getLicensesPolicy() {
        return licensesPolicy;
    }

    @JsonProperty("licensesPolicy")
    public void setLicensesPolicy(LicensesPolicy licensesPolicy) {
        this.licensesPolicy = licensesPolicy;
    }

    @JsonProperty("packageManager")
    public String getPackageManager() {
        return packageManager;
    }

    @JsonProperty("packageManager")
    public void setPackageManager(String packageManager) {
        this.packageManager = packageManager;
    }

    @JsonProperty("ignoreSettings")
    public IgnoreSettings getIgnoreSettings() {
        return ignoreSettings;
    }

    @JsonProperty("ignoreSettings")
    public void setIgnoreSettings(IgnoreSettings ignoreSettings) {
        this.ignoreSettings = ignoreSettings;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("remediation")
    public Remediation getRemediation() {
        return remediation;
    }

    @JsonProperty("remediation")
    public void setRemediation(Remediation remediation) {
        this.remediation = remediation;
    }

    @JsonProperty("filesystemPolicy")
    public Boolean getFilesystemPolicy() {
        return filesystemPolicy;
    }

    @JsonProperty("filesystemPolicy")
    public void setFilesystemPolicy(Boolean filesystemPolicy) {
        this.filesystemPolicy = filesystemPolicy;
    }

    @JsonProperty("filtered")
    public Filtered getFiltered() {
        return filtered;
    }

    @JsonProperty("filtered")
    public void setFiltered(Filtered filtered) {
        this.filtered = filtered;
    }

    @JsonProperty("uniqueCount")
    public Integer getUniqueCount() {
        return uniqueCount;
    }

    @JsonProperty("uniqueCount")
    public void setUniqueCount(Integer uniqueCount) {
        this.uniqueCount = uniqueCount;
    }

    @JsonProperty("projectName")
    public String getProjectName() {
        return projectName;
    }

    @JsonProperty("projectName")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @JsonProperty("displayTargetFile")
    public String getDisplayTargetFile() {
        return displayTargetFile;
    }

    @JsonProperty("displayTargetFile")
    public void setDisplayTargetFile(String displayTargetFile) {
        this.displayTargetFile = displayTargetFile;
    }

    @JsonProperty("hasUnknownVersions")
    public Boolean getHasUnknownVersions() {
        return hasUnknownVersions;
    }

    @JsonProperty("hasUnknownVersions")
    public void setHasUnknownVersions(Boolean hasUnknownVersions) {
        this.hasUnknownVersions = hasUnknownVersions;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
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
