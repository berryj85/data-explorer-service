package com.ascendcorp.dataexplorer.controller

import com.ascendcorp.dataexplorer.service.AccountService
import com.ascendcorp.dataexplorer.data.entity.AccountEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/account")
class AccountController(val accountService: AccountService) {

    @PostMapping
    fun saveAccount(@RequestBody accountEntity: AccountEntity): Mono<AccountEntity> {
        return accountService.saveAccount(accountEntity)
    }
}