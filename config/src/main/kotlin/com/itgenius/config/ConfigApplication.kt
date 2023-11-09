package com.itgenius.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer // ต้องเปิดใช้งาน Config Server
@EnableDiscoveryClient // ต้องเปิดใช้งาน Discovery Client
@SpringBootApplication
class ConfigApplication

fun main(args: Array<String>) {
    runApplication<ConfigApplication>(*args)
}
