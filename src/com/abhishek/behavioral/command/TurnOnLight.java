package com.abhishek.behavioral.command;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class TurnOnLight implements Command {

    private Light light;
    public TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
