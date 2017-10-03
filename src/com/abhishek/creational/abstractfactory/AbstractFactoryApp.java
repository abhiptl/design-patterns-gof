package com.abhishek.creational.abstractfactory;

/**
 * Created by AbhishekPatel on 9/10/2017.
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        InsuranceCreator insuranceCreator = InsuranceCreator.createInsurance("Cheap");
        CarInsurance carInsurance = insuranceCreator.createCarInsurance();
        carInsurance.writeInsuranceName();

        HomeInsurance homeInsurance = insuranceCreator.createHomeInsurance();
        homeInsurance.writeInsuranceName();

        PersonalInsurance personalInsurance = insuranceCreator.createPersonalInsurance();
        personalInsurance.writeInsuranceName();
    }
}
