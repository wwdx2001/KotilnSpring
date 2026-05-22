package org.example.kotlinspringdemo.service

import org.example.kotlinspringdemo.entity.FoodMenuEntity
import org.example.kotlinspringdemo.repository.FoodMenuRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping

@Service
class FoodMenuService(@Autowired private val db: FoodMenuRepository) {

    fun getFoods() = db.findAll()

    fun setFoods(foodMenu: FoodMenuEntity) = db.save(foodMenu)

    fun getFood(foodName: String) = db.findByFoodName(foodName)

}