package com.itgenius.employeeservice.repository

import com.itgenius.employeeservice.models.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository: JpaRepository<Employee, Int> {
    fun findByDepartmentId(departmentId: Int): List<Employee>
    fun findByOrganizationId(organizationId: Int): List<Employee>
}