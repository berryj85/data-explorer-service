package com.ascendcorp.dataexplorer.exception

import com.ascendcorp.dataexplorer.constant.ResponseCode
import com.ascendcorp.dataexplorer.domain.response.ErrorResponse
import com.ascendcorp.dataexplorer.domain.response.ServiceResponse
import org.neo4j.driver.exceptions.ServiceUnavailableException
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.*
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler
import reactor.core.publisher.Mono
import java.net.ConnectException

@ControllerAdvice
@ResponseBody
class GlobalExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(ConnectException::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleServiceUnavailableException(exception: ConnectException): ServiceResponse {
        println(">>>>>>")
        return ErrorResponse(ResponseCode.GRAPH_DATABASE_UNAVAILABLE)
    }
}