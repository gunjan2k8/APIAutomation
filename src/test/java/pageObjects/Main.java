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
"temp",
"feels_like",
"temp_min",
"temp_max",
"pressure",
"humidity",
"sea_level",
"grnd_level"
})
@Generated("jsonschema2pojo")
public class Main {

@JsonProperty("temp")
private double temp;
@JsonProperty("feels_like")
private double feelsLike;
@JsonProperty("temp_min")
private double tempMin;
@JsonProperty("temp_max")
private double tempMax;
@JsonProperty("pressure")
private long pressure;
@JsonProperty("humidity")
private long humidity;
@JsonProperty("sea_level")
private long seaLevel;
@JsonProperty("grnd_level")
private long grndLevel;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("temp")
public double getTemp() {
return temp;
}

@JsonProperty("temp")
public void setTemp(double temp) {
this.temp = temp;
}

@JsonProperty("feels_like")
public double getFeelsLike() {
return feelsLike;
}

@JsonProperty("feels_like")
public void setFeelsLike(double feelsLike) {
this.feelsLike = feelsLike;
}

@JsonProperty("temp_min")
public double getTempMin() {
return tempMin;
}

@JsonProperty("temp_min")
public void setTempMin(double tempMin) {
this.tempMin = tempMin;
}

@JsonProperty("temp_max")
public double getTempMax() {
return tempMax;
}

@JsonProperty("temp_max")
public void setTempMax(double tempMax) {
this.tempMax = tempMax;
}

@JsonProperty("pressure")
public long getPressure() {
return pressure;
}

@JsonProperty("pressure")
public void setPressure(long pressure) {
this.pressure = pressure;
}

@JsonProperty("humidity")
public long getHumidity() {
return humidity;
}

@JsonProperty("humidity")
public void setHumidity(long humidity) {
this.humidity = humidity;
}

@JsonProperty("sea_level")
public long getSeaLevel() {
return seaLevel;
}

@JsonProperty("sea_level")
public void setSeaLevel(long seaLevel) {
this.seaLevel = seaLevel;
}

@JsonProperty("grnd_level")
public long getGrndLevel() {
return grndLevel;
}

@JsonProperty("grnd_level")
public void setGrndLevel(long grndLevel) {
this.grndLevel = grndLevel;
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