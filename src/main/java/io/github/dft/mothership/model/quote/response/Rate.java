package io.github.dft.mothership.model.quote.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    private String id;
    private String provider;
    private Double price;
    private Double creditsApplied;
    private Truck truck;
    private TransitDays transitDays;
    private List<String> services;
    private List<String> warnings;
    private String estimatedPickupDate;
    private String estimatedDeliveryDate;
}
