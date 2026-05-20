package org.example.kotlinspringdemo.utils

import jakarta.servlet.http.HttpServletRequest
import org.example.kotlinspringdemo.controller.GeneralErrorResponse
import org.example.kotlinspringdemo.utils.ThrowableExtension.Companion.stackTraceAsString
import org.springframework.http.HttpRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(Throwable::class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody()
    fun handleException(request: HttpServletRequest, exception: Exception): GeneralErrorResponse {
        return GeneralErrorResponse("Error occurred",  exception.stackTraceAsString(), request.requestURL.toString())
    }
}