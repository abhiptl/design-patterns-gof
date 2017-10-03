package com.abhishek.creational.factory;

/**
 * Created by AbhishekPatel on 9/10/2017.
 */
public class ProductFactory {
    public Product createProduct(String type) {
        Product product = null;

        if(type.equals("A")) {
            product = new ProductA();
        }

        if(type.equals("B")) {
            product = new ProductB();
        }

        return product;
    }
}
