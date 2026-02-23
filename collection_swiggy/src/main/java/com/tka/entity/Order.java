package com.tka.entity;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private Restaurant restaurant;
    private List<FoodItem> items;
    private int totalBill;

    public Order(int orderId, Customer customer, Restaurant restaurant, List<FoodItem> items, int totalBill) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = items;
        this.totalBill = totalBill;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public int getTotalBill() {
        return totalBill;
    }
}
