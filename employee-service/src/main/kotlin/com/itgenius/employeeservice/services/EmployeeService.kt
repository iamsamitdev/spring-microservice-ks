package com.itgenius.employeeservice.services

import com.itgenius.employeeservice.models.Employee
import com.itgenius.employeeservice.repository.EmployeeRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class EmployeeService(private  val employeeRepository: EmployeeRepository) {

    // CRUD

    // find all employees
    fun findAllEmployees(): List<Employee> = employeeRepository.findAll()

    // find employee by id
    fun findEmployeeById(id: Int): Optional<Employee> = employeeRepository.findById(id)

    // add new employee
    fun addEmployee(employee: Employee): Employee = employeeRepository.save(employee)

    // update employee
    fun updateEmployee(id: Int, updateEmployee: Employee): Employee {
        return if(employeeRepository.existsById(id)) {
            updateEmployee.id = id
            employeeRepository.save(updateEmployee)
        } else {
            throw Exception("Employee not found with id: $id")
        }
    }

    // delete employee
    fun deleteEmployee(id: Int): String {
        return if(employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id)
            "Employee deleted successfully"
        } else {
            throw Exception("Employee not found with id: $id")
        }
    }

    // find employee by department id
    fun findByDepartmentId(departmentId: Int): List<Employee> = employeeRepository.findByDepartmentId(departmentId)

    // find employee by organization id
    fun findByOrganizationId(organizationId: Int): List<Employee> = employeeRepository.findByOrganizationId(organizationId)

}