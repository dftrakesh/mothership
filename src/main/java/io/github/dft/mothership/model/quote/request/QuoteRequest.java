package io.github.dft.mothership.model.quote.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuoteRequest {
    public Pickup pickup;
    public Delivery delivery;
    public List<Freight> freight;
    public String pickupReadyDate;
}
