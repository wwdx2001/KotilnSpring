package org.example.kotlinspringdemo.controller

import org.example.kotlinspringdemo.entity.UserEntity
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : JpaRepository<UserEntity, Int> {
    @Query("select user_name from UserEntity")
    fun findByUserName(userName: String): UserEntity?
}