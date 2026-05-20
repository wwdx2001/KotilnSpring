package org.example.kotlinspringdemo.controller

import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyErrorController : ErrorController {
    fun getErrorPath() = "/error"

    @RequestMapping("/error")
    fun handleError() = GeneralErrorResponse("404 Error")
}