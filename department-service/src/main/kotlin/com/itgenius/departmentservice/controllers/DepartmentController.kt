package com.itgenius.departmentservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/departments")
class DepartmentController {

    @GetMapping
    fun getDepartments(): String {
        return "Hello from Department Service!"
    }

}