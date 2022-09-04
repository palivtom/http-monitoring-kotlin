package cz.palivtom.httpmonitoringkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HttpMonitoringApplication

fun main(args: Array<String>) {
	runApplication<HttpMonitoringApplication>(*args)
}
