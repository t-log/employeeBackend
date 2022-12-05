package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String homePage(){return "Welcome to homepage";}

    @GetMapping("/add")
    public String empAddPage(){return "Add employee page";}

    @GetMapping("/search")
    public String empSearchPage(){return "Add search page";}

    @GetMapping("/edit")
    public String empEditPage(){return "Add edit page";}

    @GetMapping("/viewAll")
    public String empViewPage(){return "Adds view All page";}


}
