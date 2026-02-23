package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Customer;
import com.tka.entity.FoodItem;
import com.tka.entity.Order;
import com.tka.entity.Restaurant;

public class OrderService {

    public Order createOrder(int orderId, Customer customer, Restaurant restaurant, 
                             List<Integer> ids, FoodService foodService) {

        List<FoodItem> selectedItems = new ArrayList<>();
        int total = 0;

        for (int id : ids) {
            FoodItem f = foodService.getFoodById(id);
            if (f != null) {
                selectedItems.add(f);
                total += f.getPrice();
            }
        }

        return new Order(orderId, customer, restaurant, selectedItems, total);
    }
}
