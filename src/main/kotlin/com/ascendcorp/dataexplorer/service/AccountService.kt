package com.ascendcorp.dataexplorer.service

import com.ascendcorp.dataexplorer.repository.AccountRepository
import com.ascendcorp.dataexplorer.data.entity.AccountEntity
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class AccountService(val repository: AccountRepository) {

    fun saveAccount(accountEntity: AccountEntity): Mono<AccountEntity> {
        return repository.save(accountEntity)
    }
}