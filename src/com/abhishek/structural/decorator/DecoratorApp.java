package com.abhishek.structural.decorator;

/**
 * Created by AbhishekPatel on 9/17/2017.
 */
public class DecoratorApp {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("Console");
        logger.log("Console message");

        HTMLLogger htmlLogger = new HTMLLogger(logger);
        htmlLogger.log("Html message");
    }
}
