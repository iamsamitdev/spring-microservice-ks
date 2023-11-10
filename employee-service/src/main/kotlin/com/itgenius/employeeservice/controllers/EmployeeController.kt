package com.itgenius.employeeservice.controllers

import com.itgenius.employeeservice.models.Employee
import com.itgenius.employeeservice.services.EmployeeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/employees")
class EmployeeController (
    private val employeeService: EmployeeService
) {

    // CRUD
    // Get All Employees
    @GetMapping
    fun getAllEmployees(): List<Employee> = employeeService.findAllEmployees()

    // Get Employee By Id
    @GetMapping("/{id}")
    fun getEmployeeById(@PathVariable id: Int): ResponseEntity<Employee> {
        val employee = employeeService.findEmployeeById(id)
        return employee.map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity(HttpStatus.NOT_FOUND))
    }

    // Add new Employee
    @PostMapping
    fun addEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        val newEmployee = employeeService.addEmployee(employee)
        return ResponseEntity(newEmployee, HttpStatus.CREATED)
    }

    // Update Employee
    @PutMapping("/{id}")
    fun updateEmployee(@PathVariable id: Int, @RequestBody updateEmployee: Employee): ResponseEntity<Employee> {
        return try {
            val employee = employeeService.updateEmployee(id, updateEmployee)
            ResponseEntity(employee, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id: Int): ResponseEntity<String> {
        return try {
            val message = employeeService.deleteEmployee(id)
            ResponseEntity(message, HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

}