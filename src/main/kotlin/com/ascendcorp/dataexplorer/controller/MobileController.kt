package com.ascendcorp.dataexplorer.controller

import com.ascendcorp.dataexplorer.data.entity.MobileEntity
import com.ascendcorp.dataexplorer.service.MobileService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/mobile")
class MobileController(val mobileService: MobileService) {
    @PostMapping
    fun saveMobile(@RequestBody mobileEntity: MobileEntity): Mono<MobileEntity> {
        return mobileService.saveMobile(mobileEntity)
    }
}