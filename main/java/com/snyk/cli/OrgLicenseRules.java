
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
    "AGPL-1.0",
    "AGPL-3.0",
    "Artistic-1.0",
    "Artistic-2.0",
    "CDDL-1.0",
    "CPOL-1.02",
    "EPL-1.0",
    "GPL-2.0",
    "GPL-3.0",
    "LGPL-2.0",
    "LGPL-2.1",
    "LGPL-3.0",
    "MPL-1.1",
    "MPL-2.0",
    "MS-RL",
    "SimPL-2.0"
})
@Generated("jsonschema2pojo")
public class OrgLicenseRules {

    @JsonProperty("AGPL-1.0")
    private Agpl10 agpl10;
    @JsonProperty("AGPL-3.0")
    private Agpl30 agpl30;
    @JsonProperty("Artistic-1.0")
    private Artistic10 artistic10;
    @JsonProperty("Artistic-2.0")
    private Artistic20 artistic20;
    @JsonProperty("CDDL-1.0")
    private Cddl10 cddl10;
    @JsonProperty("CPOL-1.02")
    private Cpol102 cpol102;
    @JsonProperty("EPL-1.0")
    private Epl10 epl10;
    @JsonProperty("GPL-2.0")
    private Gpl20 gpl20;
    @JsonProperty("GPL-3.0")
    private Gpl30 gpl30;
    @JsonProperty("LGPL-2.0")
    private Lgpl20 lgpl20;
    @JsonProperty("LGPL-2.1")
    private Lgpl21 lgpl21;
    @JsonProperty("LGPL-3.0")
    private Lgpl30 lgpl30;
    @JsonProperty("MPL-1.1")
    private Mpl11 mpl11;
    @JsonProperty("MPL-2.0")
    private Mpl20 mpl20;
    @JsonProperty("MS-RL")
    private MsRl msRl;
    @JsonProperty("SimPL-2.0")
    private SimPL20 simPL20;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AGPL-1.0")
    public Agpl10 getAgpl10() {
        return agpl10;
    }

    @JsonProperty("AGPL-1.0")
    public void setAgpl10(Agpl10 agpl10) {
        this.agpl10 = agpl10;
    }

    @JsonProperty("AGPL-3.0")
    public Agpl30 getAgpl30() {
        return agpl30;
    }

    @JsonProperty("AGPL-3.0")
    public void setAgpl30(Agpl30 agpl30) {
        this.agpl30 = agpl30;
    }

    @JsonProperty("Artistic-1.0")
    public Artistic10 getArtistic10() {
        return artistic10;
    }

    @JsonProperty("Artistic-1.0")
    public void setArtistic10(Artistic10 artistic10) {
        this.artistic10 = artistic10;
    }

    @JsonProperty("Artistic-2.0")
    public Artistic20 getArtistic20() {
        return artistic20;
    }

    @JsonProperty("Artistic-2.0")
    public void setArtistic20(Artistic20 artistic20) {
        this.artistic20 = artistic20;
    }

    @JsonProperty("CDDL-1.0")
    public Cddl10 getCddl10() {
        return cddl10;
    }

    @JsonProperty("CDDL-1.0")
    public void setCddl10(Cddl10 cddl10) {
        this.cddl10 = cddl10;
    }

    @JsonProperty("CPOL-1.02")
    public Cpol102 getCpol102() {
        return cpol102;
    }

    @JsonProperty("CPOL-1.02")
    public void setCpol102(Cpol102 cpol102) {
        this.cpol102 = cpol102;
    }

    @JsonProperty("EPL-1.0")
    public Epl10 getEpl10() {
        return epl10;
    }

    @JsonProperty("EPL-1.0")
    public void setEpl10(Epl10 epl10) {
        this.epl10 = epl10;
    }

    @JsonProperty("GPL-2.0")
    public Gpl20 getGpl20() {
        return gpl20;
    }

    @JsonProperty("GPL-2.0")
    public void setGpl20(Gpl20 gpl20) {
        this.gpl20 = gpl20;
    }

    @JsonProperty("GPL-3.0")
    public Gpl30 getGpl30() {
        return gpl30;
    }

    @JsonProperty("GPL-3.0")
    public void setGpl30(Gpl30 gpl30) {
        this.gpl30 = gpl30;
    }

    @JsonProperty("LGPL-2.0")
    public Lgpl20 getLgpl20() {
        return lgpl20;
    }

    @JsonProperty("LGPL-2.0")
    public void setLgpl20(Lgpl20 lgpl20) {
        this.lgpl20 = lgpl20;
    }

    @JsonProperty("LGPL-2.1")
    public Lgpl21 getLgpl21() {
        return lgpl21;
    }

    @JsonProperty("LGPL-2.1")
    public void setLgpl21(Lgpl21 lgpl21) {
        this.lgpl21 = lgpl21;
    }

    @JsonProperty("LGPL-3.0")
    public Lgpl30 getLgpl30() {
        return lgpl30;
    }

    @JsonProperty("LGPL-3.0")
    public void setLgpl30(Lgpl30 lgpl30) {
        this.lgpl30 = lgpl30;
    }

    @JsonProperty("MPL-1.1")
    public Mpl11 getMpl11() {
        return mpl11;
    }

    @JsonProperty("MPL-1.1")
    public void setMpl11(Mpl11 mpl11) {
        this.mpl11 = mpl11;
    }

    @JsonProperty("MPL-2.0")
    public Mpl20 getMpl20() {
        return mpl20;
    }

    @JsonProperty("MPL-2.0")
    public void setMpl20(Mpl20 mpl20) {
        this.mpl20 = mpl20;
    }

    @JsonProperty("MS-RL")
    public MsRl getMsRl() {
        return msRl;
    }

    @JsonProperty("MS-RL")
    public void setMsRl(MsRl msRl) {
        this.msRl = msRl;
    }

    @JsonProperty("SimPL-2.0")
    public SimPL20 getSimPL20() {
        return simPL20;
    }

    @JsonProperty("SimPL-2.0")
    public void setSimPL20(SimPL20 simPL20) {
        this.simPL20 = simPL20;
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
