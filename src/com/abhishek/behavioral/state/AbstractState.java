package com.abhishek.behavioral.state;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public abstract class AbstractState {
    protected String stateName;
    abstract public void writeName(StateContext stateContext, String stateName);
}

class StateOne extends AbstractState {
    public StateOne(String stateName) {
        this.stateName  = stateName;
    }

    @Override
    public void writeName(StateContext stateContext, String stateName) {
        System.out.println(stateName.toLowerCase());
        stateContext.setState(new StateTwo("State2"));
    }
}

class StateTwo extends AbstractState {

    private int count = 0;
    public StateTwo(String stateName) {
        this.stateName  = stateName;
    }

    @Override
    public void writeName(StateContext stateContext, String stateName) {
        System.out.println(stateName.toUpperCase());
        if(++count>1) {
            stateContext.setState(new StateOne("State1"));
        }
    }
}

