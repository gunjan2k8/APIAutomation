package pageObjects;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"speed",
"deg",
"gust"
})
@Generated("jsonschema2pojo")
public class Wind {

@JsonProperty("speed")
private double speed;
@JsonProperty("deg")
private long deg;
@JsonProperty("gust")
private double gust;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("speed")
public double getSpeed() {
return speed;
}

@JsonProperty("speed")
public void setSpeed(double speed) {
this.speed = speed;
}

@JsonProperty("deg")
public long getDeg() {
return deg;
}

@JsonProperty("deg")
public void setDeg(long deg) {
this.deg = deg;
}

@JsonProperty("gust")
public double getGust() {
return gust;
}

@JsonProperty("gust")
public void setGust(double gust) {
this.gust = gust;
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