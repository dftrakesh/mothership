package io.github.dft.mothership.model.quote.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    public String id;
    public String provider;
    public Double price;
    public Double creditsApplied;
    public Truck truck;
    public TransitDays transitDays;
    public List<String> services;
    public List<String> warnings;
    public String estimatedPickupDate;
    public String estimatedDeliveryDate;
}
