package com.ascendcorp.dataexplorer.data.entity

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Property

@Node("account")
data class AccountEntity(
    @Id
    val mobileNumber: String,
    @Property("remark")
    val remark:String? = null
)

