package org.example.kotlinspringdemo.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.data.annotation.Version
import org.springframework.data.relational.core.mapping.Table

@Entity
@Table("food_type")
class FoodTypeEntity(
    @Id var id: Int?,
    var typeName: String,
    var typeImg: String,
) {

    constructor(): this(0,"", "") {}

    @Version
    var version : Int = 0
}