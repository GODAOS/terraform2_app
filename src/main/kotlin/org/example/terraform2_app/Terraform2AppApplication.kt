package org.example.terraform2_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class Terraform2AppApplication

fun main(args: Array<String>) {
    runApplication<Terraform2AppApplication>(*args)
}
