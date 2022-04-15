package com.practice.fsbbproject.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
    private String streetName;
    private String cityName;
    private String countryName;
}
