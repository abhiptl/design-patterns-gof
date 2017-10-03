package com.abhishek.behavioral.template;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class Manager extends Worker {

    @Override
    protected void doWork() {
        System.out.println("Manager : doWork");
    }

    @Override
    protected void relax() {
        super.relax();
        System.out.println("Manager : relax");
    }
}
