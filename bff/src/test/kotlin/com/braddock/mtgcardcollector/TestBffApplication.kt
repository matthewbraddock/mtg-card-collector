package com.braddock.mtgcardcollector

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<BffApplication>().with(TestcontainersConfiguration::class).run(*args)
}
