package com.ascendcorp.dataexplorer.config

import org.neo4j.cypherdsl.core.renderer.Dialect
import org.neo4j.driver.Driver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.neo4j.core.ReactiveDatabaseSelectionProvider
import org.springframework.data.neo4j.core.transaction.ReactiveNeo4jTransactionManager
import org.springframework.data.neo4j.repository.config.ReactiveNeo4jRepositoryConfigurationExtension
import org.springframework.transaction.ReactiveTransactionManager


@Configuration
class Neo4jConfig {
    @Bean
    fun cypherDslConfiguration():org.neo4j.cypherdsl.core.renderer.Configuration{
        return org.neo4j.cypherdsl.core.renderer.Configuration.newConfig().withDialect(Dialect.NEO4J_5).build()
    }
    @Bean(ReactiveNeo4jRepositoryConfigurationExtension.DEFAULT_TRANSACTION_MANAGER_BEAN_NAME)
    fun reactiveTransactionManager(
        driver: Driver,
        databaseNameProvider: ReactiveDatabaseSelectionProvider?
    ): ReactiveTransactionManager {
        return ReactiveNeo4jTransactionManager(driver, databaseNameProvider!!)
    }
}