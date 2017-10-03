package com.abhishek.behavioral.memento;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class MementoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2"); // State before first check point

        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.saveCheckPoint());

        originator.setState("State3"); // State before second check point
        caretaker.addMemento(originator.saveCheckPoint());

        originator.setState("State4");
        originator.setState("State5"); // State before third check point
        caretaker.addMemento(originator.saveCheckPoint());

        Memento memento = caretaker.getMemento(0);
        originator.restoreFromMemento(memento);


    }
}
