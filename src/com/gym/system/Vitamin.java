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

public class Vitamin implements Product {

    @Override
    public void showProduct() {
        System.out.println("Vitamin Supplement Created");
    }

    @Override
    public String getName() {
        return "Vitamin Supplement";
    }
}