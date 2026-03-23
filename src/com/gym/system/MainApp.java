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

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OrderManager manager = OrderManager.getInstance();

        System.out.println("===== Welcome to Gym Supplement System =====");

        while (true) {

            try {
                System.out.println("\nEnter product type (protein / vitamin / creatine)");
                System.out.println("Type 'exit' to quit:");
                
                String type = sc.nextLine();

                if (type.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting system... Thank you!");
                    break;
                }

                Product product = ProductFactory.getProduct(type);

                manager.placeOrder(product);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}