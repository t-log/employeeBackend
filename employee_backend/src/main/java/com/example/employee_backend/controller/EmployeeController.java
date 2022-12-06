package com.example.employee_backend.controller;

import com.example.employee_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String homePage(){return "Welcome to homepage";}

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String empAddPage(@RequestBody Employee e){
        System.out.println(e.getEmpCode());
        System.out.println(e.getEmpName().toString());
//        System.out.println(e.getCompanyName().toString());
//        System.out.println(e.getDesignation().toString());

        System.out.println(e.getSalary());
        return "Add employee page";}

//    @PostMapping("/search")
//    public String empSearchPage(){return "Add search page";}
//
//    @PostMapping("/edit")
//    public String empEditPage(){return "Add edit page";}
//
//    @GetMapping("/viewAll")
//    public String empViewPage(){return "Adds view All page";}
//
//    @PostMapping("/delete")
//    public String empDeletePage(){return "Adds employee delete page";}


}
