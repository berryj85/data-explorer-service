package com.ascendcorp.dataexplorer.repository

import com.ascendcorp.dataexplorer.data.entity.AccountEntity
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : ReactiveNeo4jRepository<AccountEntity, String>

