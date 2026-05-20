package org.example.kotlinspringdemo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Version

import org.springframework.data.relational.core.mapping.Table

@Entity
@Table("user_entity")
data class UserEntity(
    @Id var id: Int?,
    var userName: String,
    var password: String
){
    constructor() : this(null,"", "") {
    }

    @Version
    var version: Int = 0
}