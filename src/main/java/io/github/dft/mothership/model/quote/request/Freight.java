package io.github.dft.mothership.model.quote.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Freight {
    public String type;
    public Integer width;
    public Integer weight;
    public Integer length;
    public Integer height;
    public Integer quantity;
    public String description;
}
