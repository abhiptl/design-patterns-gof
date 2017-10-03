package com.abhishek.structural.composite;

/**
 * Created by AbhishekPatel on 9/15/2017.
 */
public class Leaf implements Component {

    @Override
    public void doThis() {
        System.out.println("Leaf doThis");
    }
}
