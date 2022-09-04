package cz.palivtom.httpmonitoring.mapper

import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface KotlinMapstructExample {

    @Mapping(source = "idk", target = ".")
    fun map(idk: String): String

}