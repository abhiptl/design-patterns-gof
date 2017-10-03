package com.abhishek.creational.factory;

/**
 * Created by AbhishekPatel on 9/10/2017.
 */
public abstract class Product {
    public void writeName(String name) {
        System.out.println("My Name is : " + name);
    }
}


class ProductA extends Product {

}

class ProductB extends Product {
    public void writeName(String name) {
        StringBuilder tempName = new StringBuilder().append(name);
        System.out.println("My reversed name is : " +
                tempName.reverse());
    }
}
