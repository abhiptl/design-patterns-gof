package com.abhishek.behavioral.observer;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class ObserverMain {
    public static void main(String[] args) {
        IObserver iObserver1 = new Observer1();
        IObserver iObserver2 = new Observer2();
        IObserver iObserver3 = new Observer3();

        Subject subject = new Subject();
        subject.attach(iObserver1);
        subject.attach(iObserver2);
        subject.attach(iObserver3);

        subject.setState("State1");

        subject.detach(iObserver2);

        subject.setState("State2");
    }
}
