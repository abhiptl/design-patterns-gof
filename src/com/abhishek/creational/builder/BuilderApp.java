package com.abhishek.creational.builder;

/**
 * Created by AbhishekPatel on 9/11/2017.
 */
public class BuilderApp {
    public static void main(String[] args) {
        HomeBuilder woodenHomeBuilder = new WoodenHomeBuilder();
        woodenHomeBuilder.createFloor();

        HomeContractor homeContractor = new HomeContractor();
        homeContractor.createHome(woodenHomeBuilder);

    }
}
