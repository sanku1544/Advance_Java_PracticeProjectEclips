package com.tka.entity;

public class FoodItem {
    private int id;
    private String name;
    private String category;
    private int price;
    private int restaurantId;

    public FoodItem(int id, String name, String category, int price, int restaurantId) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.restaurantId = restaurantId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + category + ") → ₹" + price;
    }
}
