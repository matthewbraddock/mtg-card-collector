package com.braddock.mtgcardcollector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BffApplication

fun main(args: Array<String>) {
	runApplication<BffApplication>(*args)
}
