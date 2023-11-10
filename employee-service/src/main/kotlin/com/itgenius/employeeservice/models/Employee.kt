package com.itgenius.employeeservice.models

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
@Table(name = "employees")
data class Employee(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0,

    @Column(name = "name")
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    val name: String = "",

    @Column(name = "email")
    @NotBlank(message = "Email is required")
    @Email(message = "Email is invalid")
    @Size(min = 3, max = 50, message = "Email must be between 3 and 50 characters")
    val email: String = "",

    @Column(name = "age")
    @NotBlank(message = "Age is required")
    val age: Int = 0,

    @Column(name = "position")
    @NotBlank(message = "Position is required")
    val position: String = "",

    @Column(name = "organizationId")
    @NotBlank(message = "OrganizationId is required")
    val organizationId: Int = 0,

    @Column(name = "departmentId")
    @NotBlank(message = "DepartmentId is required")
    val departmentId: Int = 0,


)
