package com.itgenius.employeeservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/employees")
class EmployeeController {

    @GetMapping
    fun index(): String {
        return "Hello from Employee Service"
    }

}