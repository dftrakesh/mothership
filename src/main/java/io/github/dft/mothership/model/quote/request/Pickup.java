package io.github.dft.mothership.model.quote.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pickup {
    private String name;
    private String zip;
    private String city;
    private String state;
    private String street;
    private Address address;
    private String openTime;
    private String closeTime;
    private String phoneNumber;
    private List<String> emails;
    private List<String> accessorials;
}
