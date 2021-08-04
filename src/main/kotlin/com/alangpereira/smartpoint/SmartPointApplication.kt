package com.alangpereira.smartpoint

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmartPointApplication

fun main(args: Array<String>) {
	runApplication<SmartPointApplication>(*args)
}
