package me.dio.credit.application.system

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * API para sistema de avaliacao de credito em Kotlin usando Spring Framework
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 *
 * @author cami-la
 * @author cassioborgesmenezes
 */
@SpringBootApplication
class CreditApplicationSystemApplication

fun main(args: Array<String>) {
	runApplication<CreditApplicationSystemApplication>(*args)
}
