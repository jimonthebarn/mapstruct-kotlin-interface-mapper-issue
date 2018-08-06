package de.jotb.playground.kotlinmapstruct

import de.jotb.playground.kotlinmapstruct.car.CarConverter
import de.jotb.playground.kotlinmapstruct.car.dto.CarDto
import de.jotb.playground.kotlinmapstruct.car.dto.SportsCarDto
import org.mapstruct.factory.Mappers
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.math.BigDecimal

@SpringBootApplication
class KotlinMapstructApplication {

    private val log = LoggerFactory.getLogger(KotlinMapstructApplication::class.java)

    @Bean
    fun init() = CommandLineRunner {

        val converter = Mappers.getMapper(CarConverter::class.java)

        log.info("Mapping cars:")
        log.info("-------------------------------")

        val apiObj = SportsCarDto("Porsche", BigDecimal(250_000))

        log.info("Before conversion: $apiObj")

        val entity = converter.convertToModel(apiObj)

        log.info("After conversion: $entity")

    }
}

fun main(args: Array<String>) {
    runApplication<KotlinMapstructApplication>(*args)
}
