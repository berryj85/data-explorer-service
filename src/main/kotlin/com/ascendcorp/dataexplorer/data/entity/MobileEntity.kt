package com.ascendcorp.dataexplorer.data.entity

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node("mobile")
data class MobileEntity(
    @Id
    val name: String? = null
)