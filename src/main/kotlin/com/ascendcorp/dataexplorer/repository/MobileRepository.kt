package com.ascendcorp.dataexplorer.repository

import com.ascendcorp.dataexplorer.data.entity.MobileEntity
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface MobileRepository:ReactiveNeo4jRepository<MobileEntity,String>