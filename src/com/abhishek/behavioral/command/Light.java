package com.abhishek.behavioral.command;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */

// Target/ Receiver Object
public class Light {
    public void turnOn() {
        System.out.println("Turning On Light");
    }

    public void turnOff() {
        System.out.println("Turning Off Light");
    }

}
