package com.sandeep.request;

import com.sandeep.domain.OrderType;

import lombok.Data;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
