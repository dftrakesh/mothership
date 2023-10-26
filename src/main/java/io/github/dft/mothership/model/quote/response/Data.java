package io.github.dft.mothership.model.quote.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.dft.mothership.model.quote.request.Delivery;
import io.github.dft.mothership.model.quote.request.Freight;
import io.github.dft.mothership.model.quote.request.Pickup;

import java.util.List;

@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    public String id;
    public Pickup pickup;
    public Delivery delivery;
    public Metadata metadata;
    public List<Rate> rates;
    public List<Freight> freight;
    public String expiresAt;
}
