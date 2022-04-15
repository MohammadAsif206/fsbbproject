package com.practice.fsbbproject.controller;


import com.practice.fsbbproject.model.Address;
import com.practice.fsbbproject.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/")
    public Employee getEmployee(){

        Employee employee = Employee.builder()
                .id(206)
                .name("Mohammad Asif")
                .email("masif@example.com")
                .phone(2142142145)
                .address(Address.builder().streetName("11 Audelia Rd").cityName("Dallas").countryName("USA").build())
                .build();


        return employee;
    }
}
