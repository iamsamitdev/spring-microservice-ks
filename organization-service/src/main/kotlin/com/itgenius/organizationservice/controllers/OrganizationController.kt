package com.itgenius.organizationservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/organizations")
class OrganizationController {

    @GetMapping
    fun getOrganizations(): String {
        return "Hello from Organization Service!"
    }

}