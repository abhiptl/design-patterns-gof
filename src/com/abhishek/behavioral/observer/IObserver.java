package com.abhishek.behavioral.observer;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public interface IObserver {
    void update(String state);
}

class Observer1 implements IObserver {
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void update(String state) {
        setState(state);
        System.out.println("Observer1 has received update signal with new state: " + getState());
    }
}

class Observer2 implements IObserver {
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void update(String state) {
        setState(state);
        System.out.println("Observer2 has received update signal with new state: " + getState());
    }
}

class Observer3 implements IObserver {
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void update(String state) {
        setState(state);
        System.out.println("Observer3 has received update signal with new state: " + getState());
    }
}

