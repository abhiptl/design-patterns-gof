package com.abhishek.creational.singleton;

/**
 * Created by AbhishekPatel on 9/12/2017.
 */
public class SingletonApp {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        System.out.println("singletonClass1 : "+singletonClass1);
        System.out.println("singletonClass2 : "+singletonClass2);
    }
}
