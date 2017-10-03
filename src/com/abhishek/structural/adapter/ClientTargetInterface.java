package com.abhishek.structural.adapter;

/**
 * Created by AbhishekPatel on 9/14/2017.
 */
public interface ClientTargetInterface {
    public void doWhichClientTargetCanNotDo();
}




class Adaptee {
    public void iCanDoWhatClientTargetCanNot() {
        System.out.println("Adaptee : I can do things which Client Target can not");
    }
}


class Adaptor extends Adaptee implements ClientTargetInterface {

    @Override
    public void doWhichClientTargetCanNotDo() {
        iCanDoWhatClientTargetCanNot();
    }
}
