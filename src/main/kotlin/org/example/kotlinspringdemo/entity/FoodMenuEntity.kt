package org.example.kotlinspringdemo.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.data.annotation.Version
import org.springframework.data.relational.core.mapping.Table

@Entity
@Table("food_menu")
class FoodMenuEntity(
    @Id var foodId: Int?,
    var foodName: String,
    var foodDetail: String,
    var foodImg: String,
) {

    constructor(): this(0,"", "", "") {}

    @Version
    var version : Int = 0
}