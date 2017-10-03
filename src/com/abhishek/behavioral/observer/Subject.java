package com.abhishek.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class Subject {
    List<IObserver> observerList = new ArrayList<>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(IObserver iObserver) {
        observerList.add(iObserver);
    }

    public void detach(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    private void notifyAllObservers() {
        for(IObserver iObserver : observerList) {
            iObserver.update(state);
        }
    }
}
