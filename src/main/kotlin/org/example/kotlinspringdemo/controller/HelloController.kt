package org.example.kotlinspringdemo.controller

import org.example.kotlinspringdemo.model.GeneralMessageResponse
import org.example.kotlinspringdemo.utils.GlobalExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/")
    fun msg() : GeneralMessageResponse {
        return GeneralMessageResponse("Hello World!")
    }

    @RequestMapping("/hello", method = [RequestMethod.GET])
    fun hello(@RequestParam(
        "name",
        defaultValue = "name"
    )name: String) : GeneralMessageResponse {
        return GeneralMessageResponse("Hello $name!")
    }

    @RequestMapping("/testErr", method = [RequestMethod.GET])
    fun error() {
        throw Exception("test Exception!")
    }

}