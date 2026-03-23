/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.system;

/**
 *
 * @author Dilki Nimeshika
 */

public class OrderManager {

    private static OrderManager instance;
    private int orderCount = 0;

    // Private constructor
    private OrderManager() {}

    public static OrderManager getInstance() {

        if (instance == null) {
            instance = new OrderManager();
        }

        return instance;
    }

    public void placeOrder(Product product) {

        orderCount++;

        System.out.println("\n===== GYM SUPPLEMENT ORDER SYSTEM =====");
        System.out.println("Order ID: " + orderCount);
        System.out.println("Product: " + product.getName());

        product.showProduct();

        System.out.println("Status: Order Successfull");
        System.out.println("=======================================");
    }
}