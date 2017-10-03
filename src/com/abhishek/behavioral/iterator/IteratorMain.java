package com.abhishek.behavioral.iterator;

import java.util.BitSet;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class IteratorMain {
    public static void main(String[] args) {
        MyCollection myListCollection = new MyListCollection();
        myListCollection.addElement("Abhishek");
        myListCollection.addElement("Patel");
        myListCollection.addElement("Iterator");

        ListIterator iterator = (ListIterator) myListCollection.iterator();
        System.out.println("ListIterator First :"+ iterator.first());
        System.out.println("ListIterator Last :"+ iterator.last());

        while (iterator.hasNext()) {
            System.out.println("next() :" + iterator.next());
        }
    }
}
