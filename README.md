# mapstruct-kotlin-interface-mapper-issue

`This is a short demo of an issue I detected in one of my projects. It is stripped down to portray the issue at hand.`

While playing around with [mapstruct] in [kotlin] and more concretely the of mapping of classes extending from either an abstract class or implementing an interface I noticed that mapstruct reimplements "default" implementations in kotlin interfaces. 

The actual mapper implementation can be found [here](src/main/kotlin/de/jotb/playground/kotlinmapstruct/car/CarConverter.kt)

[mapstruct]: http://mapstruct.org/
[kotlin]: https://kotlinlang.org/