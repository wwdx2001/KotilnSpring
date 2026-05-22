package org.example.kotlinspringdemo.controller

import org.example.kotlinspringdemo.entity.FoodMenuEntity
import org.example.kotlinspringdemo.model.GeneralMessageResponse
import org.example.kotlinspringdemo.service.FoodMenuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Logger

@RestController
class FoodMenuController(@Autowired private val foodMenuService: FoodMenuService) {

    @GetMapping("/food/foodMenu")
    fun getFoods() = foodMenuService.getFoods();

    @PostMapping("/food/addFood")
    fun setFoods(@RequestBody foodMenu: FoodMenuEntity): GeneralMessageResponse {
        Logger.getLogger(FoodMenuService::class.java.name).info(foodMenu.foodName);
        foodMenuService.setFoods(foodMenu)
        return  GeneralMessageResponse("添加成功");
    }

    @PostMapping("/food/getFood")
    fun getFood(@RequestParam foodName: String) = foodMenuService.getFood(foodName)

}