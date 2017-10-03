package com.abhishek.behavioral.command;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class TurnOffLight implements Command {
    private Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
