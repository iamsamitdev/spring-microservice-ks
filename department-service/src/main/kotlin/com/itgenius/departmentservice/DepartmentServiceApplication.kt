package com.itgenius.departmentservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class DepartmentServiceApplication

fun main(args: Array<String>) {
    runApplication<DepartmentServiceApplication>(*args)
}
