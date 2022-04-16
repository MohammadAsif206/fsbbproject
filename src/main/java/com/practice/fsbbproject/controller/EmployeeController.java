package com.practice.fsbbproject.controller;


import com.practice.fsbbproject.model.Address;
import com.practice.fsbbproject.model.Employee;
import com.practice.fsbbproject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController

public class EmployeeController {

   @Autowired

   private EmployeeService employeeList;
    @GetMapping("/employee")
    public List <Employee> getEmployee(){
        return employeeList.getEmployeeList();
    }
//
//    @RequestMapping("/{id}")
//    public Employee getOneEmployee(@PathVariable int id){
//        return employeeList.stream().filter(x -> x.getId()==id).findFirst().get();
//    }
    @GetMapping("/employee/{id}")
    public Employee getEmployeeByIdAndName(@PathVariable int id,String name){
        return employeeList.getEmployeeById(id,name);
    }

    @PostMapping("/employee")
    public List<Employee> postEmploy(@RequestBody Employee employee){
        return employeeList.addEmployee(employee);

    }
    @PutMapping("/employee/{id}")
    public Employee updateInfoOfAnEmployee(@PathVariable int id, @RequestBody Employee employee){
       return  employeeList.updateInfoOfAnEmployee(id,employee);

    }
    @DeleteMapping("/employee/{id}")
    public List<Employee> deleteInfoOfAnEmployee(@PathVariable int id){

      return  employeeList.deleteInfoOfAnEmployee(id);

    }

}
