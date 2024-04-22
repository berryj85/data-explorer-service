package com.ascendcorp.dataexplorer.domain.response

import com.ascendcorp.dataexplorer.constant.ResponseCode

interface ServiceResponse {
    val status: Status
}

data class Status(val code: String, val message: String)
open class CommonResponse(override val status: Status) : ServiceResponse
data class ErrorResponse(val responseStatus: ResponseCode) :
    CommonResponse(Status(responseStatus.code, responseStatus.message))