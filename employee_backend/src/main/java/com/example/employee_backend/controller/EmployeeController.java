package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;
    @GetMapping("/")
    public String homePage(){return "Welcome to homepage";}
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String empAddPage(@RequestBody Employee e){
        System.out.println(e.getEmpCode());
        System.out.println(e.getEmpName().toString());
        System.out.println(e.getCompanyName().toString());
        System.out.println(e.getDesignation().toString());

        System.out.println(e.getSalary());
        dao.save(e);
        return "Add employee page";}

//    @PostMapping("/search")
//    public String empSearchPage(){return "Add search page";}
//
//    @PostMapping("/edit")
//    public String empEditPage(){return "Add edit page";}
//
    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<Employee> viewAllPage()
    {
        return (List<Employee>) dao.findAll();
    }
//
//    @PostMapping("/delete")
//    public String empDeletePage(){return "Adds employee delete page";}


}
