package com.abhishek.structural.decorator;

/**
 * Created by AbhishekPatel on 9/17/2017.
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console : " + message);
    }
}


class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("FileLogger : "+message);
    }
}
