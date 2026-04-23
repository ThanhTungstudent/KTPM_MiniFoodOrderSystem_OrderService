package com.food.order.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse <T>{
    private String timestamp;
    private boolean success;
    private int code;
    private String message;
    private T data;
    private List<Object> errors;
}
