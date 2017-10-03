package com.abhishek.structural.composite;

/**
 * Created by AbhishekPatel on 9/15/2017.
 */
public class CompositeApp {
    public static void main(String[] args) {
        Composite c = new Composite();
        c.addElements(new Leaf());
        c.addElements(new Leaf());

        c.doThis();
        c.listAll();
    }


}
