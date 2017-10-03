package com.abhishek.creational.factory;

/**
 * Created by AbhishekPatel on 9/10/2017.
 */
public class FactoryApp {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        Product productA = productFactory.createProduct("A");
        productA.writeName("Burger");

        Product productB = productFactory.createProduct("B");
        productB.writeName("Cookie");


    }
}
