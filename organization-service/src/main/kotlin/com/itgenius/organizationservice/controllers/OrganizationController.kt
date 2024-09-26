package com.itgenius.organizationservice.controllers


import com.itgenius.organizationservice.models.Organization
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/organizations")
class OrganizationController {

    @GetMapping
    fun getOrganizations(): List<Organization> {
        return listOf(
            Organization(1, "IT", "Bangkok", "IT-001"),
            Organization(2, "HR", "Bangkok", "HR-001"),
            Organization(3, "Accounting", "Bangkok", "ACC-001")
        )
    }

    @GetMapping("/{id}")
    fun getOrganization(@PathVariable id: Int): Organization {
        return Organization(1, "IT", "Bangkok", "IT-001")
    }

    @PostMapping
    fun saveOrganization(@RequestBody organization: Organization): Organization {
        return organization
    }

    @PutMapping("/{id}")
    fun updateOrganization(@PathVariable id: Int, @RequestBody organization: Organization): Organization {
        return organization.copy(organizationId = id)
    }

    @DeleteMapping("/{id}")
    fun deleteOrganization(@PathVariable id: Int): String {
        return "Delete organization with id: $id"
    }

}