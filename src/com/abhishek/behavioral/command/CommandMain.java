package com.abhishek.behavioral.command;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        Command switchOn = new TurnOnLight(light);
        Command switchOff = new TurnOffLight(light);

        Switch s = new Switch(switchOn, switchOff);
        s.flipUp();
        s.flipDown();
    }
}
