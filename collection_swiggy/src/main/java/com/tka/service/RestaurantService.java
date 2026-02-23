package com.tka.service;

import java.util.HashMap;
import java.util.Map;

import com.tka.entity.Restaurant;

public class RestaurantService {

    private Map<Integer, Restaurant> restaurantMap = new HashMap<>();

    public RestaurantService() {
        restaurantMap.put(1, new Restaurant(1, "Domino's", "Pune"));
        restaurantMap.put(2, new Restaurant(2, "KFC", "Pune"));
        restaurantMap.put(3, new Restaurant(3, "Burger King", "Mumbai"));
        restaurantMap.put(4, new Restaurant(4, "Biryani House", "Nashik"));
    }

    public Map<Integer, Restaurant> getAllRestaurants() {
        return restaurantMap;
    }

    public Restaurant getRestaurantById(int id) {
        return restaurantMap.get(id);
    }
}
