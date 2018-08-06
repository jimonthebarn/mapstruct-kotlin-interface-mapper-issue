package de.jotb.playground.kotlinmapstruct.car.entity

import java.math.BigDecimal

data class SuvCar(var manufacturer : String = "", var price : BigDecimal = BigDecimal.ZERO) : Car {

    override fun drive() {
        TODO("not implemented")
    }
}