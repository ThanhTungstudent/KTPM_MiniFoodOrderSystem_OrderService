package com.food.order.orderservice.client;

import com.food.order.orderservice.dto.ApiResponse;
import com.food.order.orderservice.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UserClient {

    @GetMapping("/api/users/{id}")
    ApiResponse<UserDTO> getUserById(@PathVariable("id") Long id);
}
