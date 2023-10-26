package io.github.dft.mothership.model.quote.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Delivery {
    public String name;
    public String zip;
    public String city;
    public String state;
    public String street;
    public Address address;
    public String openTime;
    public String closeTime;
    public String phoneNumber;
    public List<String> emails;
    public List<String> accessorials;
}
