package com.abhishek.behavioral.memento;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveCheckPoint() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento m) {
        if(m instanceof Memento) {
            state = m.getState();
            System.out.println("Originator: State after restoring from Memento: " + state);
        }
    }
}
