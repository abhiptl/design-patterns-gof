package com.abhishek.structural.proxy;

/**
 * Created by AbhishekPatel on 9/20/2017.
 */
public class ProxyApp {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.doIt();
    }
}
