package com.abhishek.creational.singleton;

/**
 * Created by AbhishekPatel on 9/12/2017.
 */
public class SingletonClass {
    private static SingletonClass INSTANCE;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }

        return INSTANCE;
    }
}
