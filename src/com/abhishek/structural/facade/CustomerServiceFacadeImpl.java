package com.abhishek.structural.facade;

/**
 * Created by AbhishekPatel on 9/17/2017.
 */
public class CustomerServiceFacadeImpl implements CustomerServiceFacade {

    @Override
    public void getCustomerPersonalInfo() {
        AccountManager accountManager = ManagerFactory.getAccountManager();
        accountManager.printBalance();
    }

    @Override
    public void getBillingInfo() {
        BillingManager billingManager = ManagerFactory.getBillingManager();
        billingManager.printBill();
    }

    @Override
    public void getShippingInfo() {
        ShippingManager shippingManager = ManagerFactory.getShippingManager();
        shippingManager.printShipping();
    }
}


class ManagerFactory {

    public static AccountManager getAccountManager() {
        return new AccountManager();
    }

    public static ShippingManager getShippingManager() {
        return new ShippingManager();
    }

    public static BillingManager getBillingManager() {
       return new BillingManager();
    }


}

class AccountManager  {
    public void printBalance() {
        System.out.println("Balance : "+ "$1000");
    }
}

class BillingManager {
    public void printBill() {
        System.out.println("Bill : "+ "$100");
    }
}

class ShippingManager  {
    public void printShipping() {
        System.out.println("Shipping : "+ "$150");
    }
}
