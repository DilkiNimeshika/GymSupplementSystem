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
public class ProductFactory {

    public static Product getProduct(String type) {

        if (type.equalsIgnoreCase("protein")) {
            return new Protein();

        } else if (type.equalsIgnoreCase("vitamin")) {
            return new Vitamin();

        } else if (type.equalsIgnoreCase("creatine")) {
            return new Creatine();
        }

        // Improved error handling
        throw new IllegalArgumentException("Invalid product type: " + type);
    }
}