package com.abhishek.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class MyListCollection implements MyCollection {

    private List<String> list = new ArrayList<>();

    @Override
    public void addElement(String element) {
        list.add(element);
    }

    @Override
    public MyIterator iterator() {
        return new ListIterator(list);
    }
}


class ListIterator implements MyIterator{
    private List<String> list;
    private int currentIndex = 0;

    ListIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public String first() {
        return list.get(0);
    }

    @Override
    public String last() {
        return list.get(list.size() - 1);
    }

    @Override
    public String next() {
        String s = list.get(currentIndex);
        currentIndex++;
        return s;
    }

    @Override
    public boolean hasNext() {
        return currentIndex <= (list.size() - 1);
    }
}

