package com.practice.fsbbproject.services;

import com.practice.fsbbproject.model.Address;
import com.practice.fsbbproject.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    //Entity
    private List<Employee> employeeList = new ArrayList<>(List.of(
            Employee.builder()
                    .id(201)
                    .name("khadij Asif")
                    .email("kasif@example.com")
                    .phone(2142142143)
                    .address(Address.builder().streetName("11 Audelia Rd").cityName("Dallas").countryName("USA").build())
                    .build(),
            Employee.builder()
                    .id(202)
                    .name("Mohammad Asif")
                    .email("masif@example.com")
                    .phone(2142142140)
                    .address(Address.builder().streetName("11 Audelia Rd").cityName("Dallas").countryName("USA").build())
                    .build(),
            Employee.builder()
                    .id(204)
                    .name("Ali Asif")
                    .email("aasif@example.com")
                    .phone(2142142145)
                    .address(Address.builder().streetName("11 Audelia Rd").cityName("Dallas").countryName("USA").build())
                    .build(),
            Employee.builder()
                    .id(203)
                    .name("Asif Ali")
                    .email("aasif@example.com")
                    .phone(2142142145)
                    .address(Address.builder().streetName("11 Audelia Rd").cityName("Dallas").countryName("USA").build())
                    .build()
    ));
    public List<Employee> getEmployeeList(){
        return employeeList;
    }
    public Employee getEmployeeById(@PathVariable int id, @PathVariable String name){
        return employeeList.stream().filter(x->x.getId()==id).findFirst().get();
    }

    public List<Employee> addEmployee(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    public Employee updateInfoOfAnEmployee(int id, Employee employee) {
        return employeeList.stream()
                .filter(x->x.getId()==id)
                .peek(val-> val.setName(employee.getName()))
                .peek(val -> val.setEmail(employee.getEmail()))
                .peek(val-> val.setPhone(employee.getPhone() ))
                .peek(val->val.setAddress(employee.getAddress()))
                .findFirst().get();
    }

    public List<Employee> deleteInfoOfAnEmployee(int id) {
        employeeList.removeIf(x->x.getId()==id);
        return employeeList;
    }
}
