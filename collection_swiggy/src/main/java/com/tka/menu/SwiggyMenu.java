package com.tka.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.tka.entity.Customer;
import com.tka.entity.FoodItem;
import com.tka.entity.Order;
import com.tka.entity.Restaurant;
import com.tka.service.RestaurantService;
import com.tka.service.FoodService;
import com.tka.service.OrderService;

public class SwiggyMenu {

    public static void main(String[] args) {

        RestaurantService restaurantService = new RestaurantService();
        FoodService foodService = new FoodService();
        OrderService orderService = new OrderService();

        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer(101, "Sanket", 9876543210L);

        System.out.println("============ AVAILABLE RESTAURANTS ============");
        for (Map.Entry<Integer, Restaurant> entry : restaurantService.getAllRestaurants().entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("\nEnter Restaurant ID to view menu:");
        int restId = sc.nextInt();

        Restaurant restaurant = restaurantService.getRestaurantById(restId);

        System.out.println("\n========== MENU OF " + restaurant.getName() + " ==========");
        List<FoodItem> menu = foodService.getMenuByRestaurant(restId);

        for (FoodItem f : menu) {
            System.out.println(f);
        }

        System.out.println("\nHow many items do you want?");
        int count = sc.nextInt();

        System.out.println("Enter " + count + " Food Item IDs:");
        List<Integer> selectedIds = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            selectedIds.add(sc.nextInt());
        }

        Order order = orderService.createOrder(1, customer, restaurant, selectedIds, foodService);

        System.out.println("\n============= ORDER SUMMARY =============");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Restaurant: " + order.getRestaurant().getName());

        System.out.println("\nItems Ordered:");
        for (FoodItem f : order.getItems()) {
            System.out.println(f.getName() + " → ₹" + f.getPrice());
        }

        System.out.println("\nTotal Bill: ₹" + order.getTotalBill());
    }
}
