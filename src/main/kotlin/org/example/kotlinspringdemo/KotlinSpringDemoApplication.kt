package org.example.kotlinspringdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlinSpringDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringDemoApplication>(*args)
}
