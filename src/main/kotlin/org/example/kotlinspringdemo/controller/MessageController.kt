package org.example.kotlinspringdemo.controller

import org.example.kotlinspringdemo.MessageService
import org.example.kotlinspringdemo.entity.UserEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
class MessageController(@Autowired private val messageService: MessageService) {

    @GetMapping("/user/getUsers")
    fun listUsers() = messageService.findUser()

    @PostMapping("user/register")
    fun register(@RequestParam username: String, @RequestParam password: String): ResponseEntity<UserEntity> {
        val user = UserEntity((username + password).hashCode(), username, password)
        user.version = 0
        val saveMessage = messageService.save(user)
        return ResponseEntity.created(URI.create("/users/${saveMessage.id}")).body(saveMessage)
    }

    @PostMapping("user/login")
    fun login(@RequestParam username: String, @RequestParam password: String): Boolean {

        val saveMessage : UserEntity? = messageService.login(username, password)
//        val saveMessage : List<UserEntity> = messageService.login(username, password)

        return saveMessage != null
    }
}