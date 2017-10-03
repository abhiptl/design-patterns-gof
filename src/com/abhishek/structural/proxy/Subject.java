package com.abhishek.structural.proxy;

/**
 * Created by AbhishekPatel on 9/20/2017.
 */
public interface Subject {
    public void doIt();
}


class Proxy implements Subject {
    private RealObject realObject;

    @Override
    public void doIt() {
        if(realObject == null)
            realObject = new RealObject();
        realObject.doIt();
    }
}

class RealObject implements Subject {
    @Override
    public void doIt() {
        System.out.println("doIt by Real Object");
    }
}
