package de.jotb.playground.kotlinmapstruct.car

import de.jotb.playground.kotlinmapstruct.car.dto.CarDto
import de.jotb.playground.kotlinmapstruct.car.dto.SportsCarDto
import de.jotb.playground.kotlinmapstruct.car.dto.SuvCarDto
import de.jotb.playground.kotlinmapstruct.car.entity.Car
import de.jotb.playground.kotlinmapstruct.car.entity.SportsCar
import de.jotb.playground.kotlinmapstruct.car.entity.SuvCar
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.ObjectFactory

@Mapper
interface CarConverter {

    @JvmDefault
    @ObjectFactory
    fun convertToDto(car: Car) : CarDto {

        return when(car) {
            is SportsCar -> convertSportsCarToDto(car)
            is SuvCar -> convertSuvCarToDto(car)
            else -> throw RuntimeException("Unhandled entity type ${car.javaClass}")
        }
    }

    fun convertSportsCarToDto(car : SportsCar) : SportsCarDto
    fun convertSuvCarToDto(car : SuvCar) : SuvCarDto

    @JvmDefault
    @ObjectFactory
    fun convertToModel(carDto: CarDto) : Car {
        return when(carDto) {
            is SportsCarDto -> convertToSportsCarModel(carDto)
            is SuvCarDto -> convertToSuvCarModel(carDto)
            else -> throw RuntimeException("Unhandled DTO type ${carDto.javaClass}")
        }
    }

    fun convertToSportsCarModel(sportsCarDto: SportsCarDto) : SportsCar
    fun convertToSuvCarModel(suvCarDto: SuvCarDto) : SuvCar

}