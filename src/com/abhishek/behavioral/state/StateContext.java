package com.abhishek.behavioral.state;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class StateContext {
    private AbstractState abstractState;

    public StateContext() {
        setState(new StateOne("State1"));
    }
    public void setState(AbstractState abstractState) {
        this.abstractState = abstractState;
    }
    public void writeName(String name) {
        this.abstractState.writeName(this, name);
    }
}
