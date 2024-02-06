package io.github.dft.mothership.model.quote.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuoteRequest {
    private Pickup pickup;
    private Delivery delivery;
    private List<Freight> freight;
    private String pickupReadyDate;
    private Integer declaredFreightValue;
    private Boolean applyAvailableCredits;
    private Integer rateResponseTimeoutMs;
}
