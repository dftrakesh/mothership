package io.github.dft.mothership.model.quote.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Freight {
    private String type;
    private Integer width;
    private Integer weight;
    private Integer length;
    private Integer height;
    private Integer quantity;
    private String description;
}
