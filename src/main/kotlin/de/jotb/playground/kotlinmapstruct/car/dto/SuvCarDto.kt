package de.jotb.playground.kotlinmapstruct.car.dto

import de.jotb.playground.kotlinmapstruct.car.dto.CarDto
import java.math.BigDecimal

data class SuvCarDto(var manufacturer : String = "", var price : BigDecimal = BigDecimal.ZERO) : CarDto