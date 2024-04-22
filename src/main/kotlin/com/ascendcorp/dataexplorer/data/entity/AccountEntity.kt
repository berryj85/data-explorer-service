package com.ascendcorp.dataexplorer.data.entity

import com.ascendcorp.dataexplorer.data.relation.IsMobileType
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Property
import org.springframework.data.neo4j.core.schema.Relationship

@Node("account")
data class AccountEntity(
    @Id
    val mobileNumber: String? = null,
    @Property("remark")
    val remark:String? = null,
    @Relationship(type="IS_MOBILE_TYPE" , direction = Relationship.Direction.INCOMING)
    val mobileType:IsMobileType? = null
)

