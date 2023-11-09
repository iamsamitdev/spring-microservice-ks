package com.itgenius.organizationservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class OrganizationServiceApplication

fun main(args: Array<String>) {
    runApplication<OrganizationServiceApplication>(*args)
}
