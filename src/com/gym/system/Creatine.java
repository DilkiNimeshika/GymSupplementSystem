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


public class Creatine implements Product {

    @Override
    public void showProduct() {
        System.out.println("Creatine Supplement Created");
    }

    @Override
    public String getName() {
        return "Creatine Supplement";
    }
}