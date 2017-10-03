package com.abhishek.structural.facade;

/**
 * Created by AbhishekPatel on 9/17/2017.
 */
public class FacadeApp {
    public static void main(String[] args) {
        CustomerServiceFacade customerServiceFacade = new CustomerServiceFacadeImpl();
        customerServiceFacade.getBillingInfo();
        customerServiceFacade.getCustomerPersonalInfo();
        customerServiceFacade.getShippingInfo();

    }
}
