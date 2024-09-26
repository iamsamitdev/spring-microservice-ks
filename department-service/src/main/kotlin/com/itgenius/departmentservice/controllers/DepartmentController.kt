package com.itgenius.departmentservice.controllers

import com.itgenius.departmentservice.models.Department
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/departments")
class DepartmentController {

    @GetMapping
    fun getDepartments(): List<Department> {
        return listOf(
            Department(1, "IT", "Bangkok", "IT-001"),
            Department(2, "HR", "Bangkok", "HR-001"),
            Department(3, "Accounting", "Bangkok", "ACC-001")
        )
    }

    @GetMapping("/{id}")
    fun getDepartment(@PathVariable id: Int): Department {
        return Department(1, "IT", "Bangkok", "IT-001")
    }

    @PostMapping
    fun saveDepartment(@RequestBody department: Department): Department {
        return department
    }

    @PutMapping("/{id}")
    fun updateDepartment(@PathVariable id: Int, @RequestBody department: Department): Department {
        return department.copy(departmentId = id)
    }

    @DeleteMapping("/{id}")
    fun deleteDepartment(@PathVariable id: Int): String {
        return "Delete department with id: $id"
    }

}