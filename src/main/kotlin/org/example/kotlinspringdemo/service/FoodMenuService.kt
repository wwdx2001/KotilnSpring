package org.example.kotlinspringdemo.service

import org.example.kotlinspringdemo.repository.FoodMenuRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping

@Service
class FoodMenuService(@Autowired private val db: FoodMenuRepository) {

    fun getFoods() = db.findAll()

}