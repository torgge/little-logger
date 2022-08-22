package com.bonespirito.littlelog

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LittleLogApplication

fun main(args: Array<String>) {
    val logger = LoggerFactory.getLogger(LittleLogApplication::class.java)

    runApplication<LittleLogApplication>(*args)
    logger.info("WE ARE STARTED!")
}
