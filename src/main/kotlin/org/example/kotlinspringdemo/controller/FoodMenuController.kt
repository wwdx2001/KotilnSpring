package org.example.kotlinspringdemo.controller

import org.example.kotlinspringdemo.service.FoodMenuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FoodMenuController(@Autowired private val foodMenuService: FoodMenuService) {

    @GetMapping("/food/foodMenu")
    fun getFoods() = foodMenuService.getFoods();

}