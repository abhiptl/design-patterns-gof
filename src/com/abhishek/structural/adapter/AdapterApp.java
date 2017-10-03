package com.abhishek.structural.adapter;

/**
 * Created by AbhishekPatel on 9/13/2017.
 */
public class AdapterApp {
    public static void main(String[] args) {
        ClientTargetInterface clientTargetInterface = new  Adaptor();
        clientTargetInterface.doWhichClientTargetCanNotDo();
    }
}
