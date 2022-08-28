package com.ftne.absys.kafkapub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AbstractKafkaPublisherApplication

fun main(args: Array<String>) {
	runApplication<AbstractKafkaPublisherApplication>(*args)
}
