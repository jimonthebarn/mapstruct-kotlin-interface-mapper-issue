package de.jotb.playground.kotlinmapstruct.car

import de.jotb.playground.kotlinmapstruct.car.dto.SportsCarDto
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mapstruct.factory.Mappers
import java.math.BigDecimal

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CarConverterTest {

    @Test
    fun `This test will fail since the generated method convertToModel will call itself and lead to a StackOverflow`() {
        val converter = Mappers.getMapper(CarConverter::class.java)

        val dto = SportsCarDto("Porsche", BigDecimal(250_000))
        val entity = converter.convertToModel(dto)

    }
}