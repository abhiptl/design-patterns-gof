package com.abhishek.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class Caretaker {
    List<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento memento) {
        savedStates.add(memento);
    }

    public Memento getMemento(int index) {
        return savedStates.get(index);
    }

}
