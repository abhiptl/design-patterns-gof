package com.abhishek.creational.abstractfactory;

/**
 * Created by AbhishekPatel on 9/10/2017.
 */
public abstract class InsuranceCreator {

    public static InsuranceCreator createInsurance(String type) {
        InsuranceCreator insuranceCreator = null;
        if(type.equals("Cheap")) {
            insuranceCreator = new CheapInsuranceCreator();
        }

        if(type.equals("Expensive")) {
            insuranceCreator = new ExpensiveInsuranceCreator();
        }



        return insuranceCreator;
    }

    public abstract CarInsurance createCarInsurance();

    public abstract HomeInsurance createHomeInsurance();

    public abstract PersonalInsurance createPersonalInsurance();

}

class CheapInsuranceCreator extends InsuranceCreator {

    @Override
    public CarInsurance createCarInsurance() {
        return new CheapCarInsurance();
    }

    @Override
    public HomeInsurance createHomeInsurance() {
        return new CheapHomeInsurance();
    }

    @Override
    public PersonalInsurance createPersonalInsurance() {
        return new CheapPersonalInsurance();
    }
}

class ExpensiveInsuranceCreator extends InsuranceCreator{

    @Override
    public CarInsurance createCarInsurance() {
        return new ExpensiveCarInsurance();
    }

    @Override
    public HomeInsurance createHomeInsurance() {
        return new ExpensiveHomeInsurance();
    }

    @Override
    public PersonalInsurance createPersonalInsurance() {
        return new ExpensivePersonalInsurance();
    }
}

interface Insurance {
    void writeInsuranceName();
}

abstract  class CarInsurance implements Insurance {}

abstract class HomeInsurance implements Insurance {}

abstract class  PersonalInsurance implements Insurance {}

class CheapCarInsurance extends CarInsurance {
    public void writeInsuranceName() {
        System.out.println("CheapCarInsurance");
    }
}

class ExpensiveCarInsurance extends CarInsurance {
    public void writeInsuranceName() {
        System.out.println("CheapCarInsurance");
    }

}

class CheapHomeInsurance extends HomeInsurance {
    public void writeInsuranceName() {
        System.out.println("CheapHomeInsurance");
    }
}

class ExpensiveHomeInsurance extends HomeInsurance {
    public void writeInsuranceName() {
        System.out.println("ExpensiveHomeInsurance");
    }

}

class CheapPersonalInsurance extends PersonalInsurance {
    public void writeInsuranceName() {
        System.out.println("CheapPersonalInsurance");
    }

}

class ExpensivePersonalInsurance extends PersonalInsurance {
    public void writeInsuranceName() {
        System.out.println("ExpensivePersonalInsurance");
    }

}
