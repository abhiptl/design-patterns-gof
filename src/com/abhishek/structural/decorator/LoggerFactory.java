package com.abhishek.structural.decorator;

/**
 * Created by AbhishekPatel on 9/17/2017.
 */
public class LoggerFactory {

    public static Logger getLogger(String type) {
        Logger logger = null;
        if(type.equals("Console")) {
            logger =  new ConsoleLogger();
        }

        if(type.equals("Console")) {
            logger =  new FileLogger();
        }

        return logger;
    }
}
