package com.ascendcorp.dataexplorer.data.relation

import com.ascendcorp.dataexplorer.data.entity.MobileEntity
import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.RelationshipId
import org.springframework.data.neo4j.core.schema.RelationshipProperties
import org.springframework.data.neo4j.core.schema.TargetNode
import java.math.BigDecimal

@RelationshipProperties
data class IsMobileType(
    @RelationshipId
    @GeneratedValue
    val id: Long? = null,
    @TargetNode
    val mobile:MobileEntity? = null,
    val mobileType: String? = null,
    val status: String? = null,
    val balance: BigDecimal? = null,
    val env:String? = null
)