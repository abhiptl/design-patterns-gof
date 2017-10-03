package com.abhishek.behavioral.template;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class TemplateMain {
    public static void main(String[] args) {
        System.out.println("Firefighter daily routine");
        Worker fireFighter = new FireFighter();
        fireFighter.dailyRoutine();

        System.out.println("Manager daily routine");
        Worker manager = new Manager();
        manager.dailyRoutine();

    }
}
