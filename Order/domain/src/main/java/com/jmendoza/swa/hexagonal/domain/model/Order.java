package com.jmendoza.swa.hexagonal.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    private String orderId;
    private String customerId;
    private Date createdAt;
    private List<OrderProduct> orderProductList;
    private Double amountOrder;

    public Double getAmountOrder() {
        return orderProductList.stream().mapToDouble(OrderProduct::getAmount).sum();
    }
}
