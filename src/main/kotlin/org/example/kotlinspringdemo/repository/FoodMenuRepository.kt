package org.example.kotlinspringdemo.repository

import org.example.kotlinspringdemo.entity.FoodMenuEntity
import org.example.kotlinspringdemo.entity.UserEntity
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FoodMenuRepository : JpaRepository<FoodMenuEntity, Int> {
    @Query("select food_name from FoodMenuEntity")
    fun findByFoodName(foodName: String): FoodMenuEntity?
}