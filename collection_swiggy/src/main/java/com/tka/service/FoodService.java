package com.tka.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tka.entity.FoodItem;

public class FoodService {

    private Map<Integer, FoodItem> foodMap = new HashMap<>();

    public FoodService() {

        // Domino's
        foodMap.put(1, new FoodItem(1, "Margherita Pizza", "Veg", 250, 1));
        foodMap.put(2, new FoodItem(2, "Farmhouse Pizza", "Veg", 350, 1));

        // KFC
        foodMap.put(3, new FoodItem(3, "Zinger Burger", "Non-Veg", 150, 2));
        foodMap.put(4, new FoodItem(4, "Chicken Popcorn", "Non-Veg", 200, 2));

        // Burger King
        foodMap.put(5, new FoodItem(5, "Veg Whopper", "Veg", 180, 3));
        foodMap.put(6, new FoodItem(6, "Crispy Fries", "Veg", 90, 3));

        // Biryani House
        foodMap.put(7, new FoodItem(7, "Chicken Biryani", "Non-Veg", 220, 4));
        foodMap.put(8, new FoodItem(8, "Veg Biryani", "Veg", 180, 4));
    }

    public Map<Integer, FoodItem> getAllFood() {
        return foodMap;
    }

    public List<FoodItem> getMenuByRestaurant(int restId) {
        List<FoodItem> menu = new ArrayList<>();
        for (FoodItem f : foodMap.values()) {
            if (f.getRestaurantId() == restId) {
                menu.add(f);
            }
        }
        return menu;
    }

    public FoodItem getFoodById(int id) {
        return foodMap.get(id);
    }
}
