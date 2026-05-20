package org.example.kotlinspringdemo

import org.example.kotlinspringdemo.controller.MessageRepository
import org.example.kotlinspringdemo.entity.UserEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MessageService(@Autowired private val db: MessageRepository) {
//    fun findUser(): List<UserEntity> = db.query("select * from user") {response, _ ->
//        UserEntity(response.getInt("id"),
//            response.getString("userName"),
//            response.getString("password"))
//    }

    fun findUser() = db.findAll();

//    fun save(user: UserEntity): UserEntity {
//        val id = user.id
//        db.update(
//            "insert into user values(?, ?, ?)",
//            user.id, user.userName, user.password
//        )
//        return user
//    }

    fun save(user: UserEntity) = db.save(user);

//    fun login(username: String, password: String): List<UserEntity> =
//        db.query("select * from user where username = $username and password = $password") { response, _ ->
//            UserEntity(response.getInt("id"),
//                response.getString("userName"),
//                response.getString("password"))
//
//    }

    fun login(userName: String, password: String): UserEntity? {
        val hashCode = (userName + password).hashCode()
        val user: UserEntity? = db.findByUserName(userName)
        return user
    }
}