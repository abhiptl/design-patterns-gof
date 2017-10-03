package com.abhishek.behavioral.memento;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
