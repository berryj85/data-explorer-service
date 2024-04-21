package com.ascendcorp.dataexplorer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataExplorerServiceApplication

fun main(args: Array<String>) {
    runApplication<DataExplorerServiceApplication>(*args)
}