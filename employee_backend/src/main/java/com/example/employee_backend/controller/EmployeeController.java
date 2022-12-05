package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String homePage(){return "Welcome to homepage";}

    @GetMapping("/add")
    public String empAddPage(){return "Add employee page";}


}
