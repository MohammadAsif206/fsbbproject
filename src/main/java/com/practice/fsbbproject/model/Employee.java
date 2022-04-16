package com.practice.fsbbproject.model;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {

    private int id;
    private String name;
    private String email;
    private int phone;
    private Address address;
}
