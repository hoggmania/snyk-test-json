
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
    "io.quarkus:quarkus-resteasy-reactive@3.5.3",
    "io.quarkus:quarkus-vertx@3.5.3"
})
@Generated("jsonschema2pojo")
public class Upgrade {

    @JsonProperty("io.quarkus:quarkus-resteasy-reactive@3.5.3")
    private IoQuarkusQuarkusResteasyReactive353 ioQuarkusQuarkusResteasyReactive353;
    @JsonProperty("io.quarkus:quarkus-vertx@3.5.3")
    private IoQuarkusQuarkusVertx353 ioQuarkusQuarkusVertx353;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("io.quarkus:quarkus-resteasy-reactive@3.5.3")
    public IoQuarkusQuarkusResteasyReactive353 getIoQuarkusQuarkusResteasyReactive353() {
        return ioQuarkusQuarkusResteasyReactive353;
    }

    @JsonProperty("io.quarkus:quarkus-resteasy-reactive@3.5.3")
    public void setIoQuarkusQuarkusResteasyReactive353(IoQuarkusQuarkusResteasyReactive353 ioQuarkusQuarkusResteasyReactive353) {
        this.ioQuarkusQuarkusResteasyReactive353 = ioQuarkusQuarkusResteasyReactive353;
    }

    @JsonProperty("io.quarkus:quarkus-vertx@3.5.3")
    public IoQuarkusQuarkusVertx353 getIoQuarkusQuarkusVertx353() {
        return ioQuarkusQuarkusVertx353;
    }

    @JsonProperty("io.quarkus:quarkus-vertx@3.5.3")
    public void setIoQuarkusQuarkusVertx353(IoQuarkusQuarkusVertx353 ioQuarkusQuarkusVertx353) {
        this.ioQuarkusQuarkusVertx353 = ioQuarkusQuarkusVertx353;
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
