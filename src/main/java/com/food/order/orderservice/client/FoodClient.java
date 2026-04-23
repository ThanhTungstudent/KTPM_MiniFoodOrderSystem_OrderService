package com.food.order.orderservice.client;

import com.food.order.orderservice.dto.ApiResponse;
import com.food.order.orderservice.dto.FoodDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "food-service", url = "http://localhost:8082")
public interface FoodClient {

    @GetMapping("/api/foods/{id}")
    ApiResponse<FoodDTO>  getFoodById(@PathVariable("id") Long id);
}
