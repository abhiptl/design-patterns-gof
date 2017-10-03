package com.abhishek.behavioral.template;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public abstract class Worker {
    public void dailyRoutine() {
        getUp();
        eatBreakfast();
        goToWork();
        doWork();
        returnToHome();
        relax();
        sleep();
    }

    protected void getUp() {
        System.out.println("Default : getUp");
    }

    protected void eatBreakfast() {
        System.out.println("Default: eatBreakfast");
    }
    protected  void goToWork() {
        System.out.println("Default: goToWork");
    }
    protected abstract void doWork();

    protected  void returnToHome() {
        System.out.println("Default: returnToHome");
    }
    protected void relax() {
        System.out.println("Default: relax");
    }

    protected void sleep() {
        System.out.println("Default: sleep");
    }
}
