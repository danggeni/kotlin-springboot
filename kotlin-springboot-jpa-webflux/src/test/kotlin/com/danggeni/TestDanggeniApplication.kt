package com.danggeni

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<DanggeniApplication>().with(TestcontainersConfiguration::class).run(*args)
}
