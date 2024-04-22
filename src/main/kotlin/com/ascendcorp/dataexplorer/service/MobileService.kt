package com.ascendcorp.dataexplorer.service

import com.ascendcorp.dataexplorer.data.entity.MobileEntity
import com.ascendcorp.dataexplorer.repository.MobileRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class MobileService(val mobileRepository: MobileRepository) {
    fun saveMobile(mobileEntity: MobileEntity): Mono<MobileEntity> {
        return mobileRepository.save(mobileEntity)
    }
}