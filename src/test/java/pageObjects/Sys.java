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
"country",
"sunrise",
"sunset"
})
@Generated("jsonschema2pojo")
public class Sys {

@JsonProperty("country")
private String country;
@JsonProperty("sunrise")
private long sunrise;
@JsonProperty("sunset")
private long sunset;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("sunrise")
public long getSunrise() {
return sunrise;
}

@JsonProperty("sunrise")
public void setSunrise(long sunrise) {
this.sunrise = sunrise;
}

@JsonProperty("sunset")
public long getSunset() {
return sunset;
}

@JsonProperty("sunset")
public void setSunset(long sunset) {
this.sunset = sunset;
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