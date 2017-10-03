package com.abhishek.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/15/2017.
 */
public class Composite implements Component {

    private List<Component> list = new ArrayList<Component>();

    @Override
    public void doThis() {
        System.out.println("Composite doThis");
    }

    public void addElements(Component c) {
        list.add(c);
    }

    public void listAll() {
        for(Component c : list) {
            c.doThis();
        }
    }
}
