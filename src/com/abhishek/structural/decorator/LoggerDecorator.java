package com.abhishek.structural.decorator;

/**
 * Created by AbhishekPatel on 9/17/2017.
 */
public class LoggerDecorator implements Logger {
    Logger logger;

    public LoggerDecorator(Logger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }
}

class HTMLLogger extends LoggerDecorator {

    public HTMLLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String htmlMessage = covertToHtml(message);
        logger.log(htmlMessage);
    }

    private String covertToHtml(String message) {
        return "<Html> "+ message + "</Html>";
    }
}

class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String encryptMessage = covertToEncrypt(message);
        logger.log(encryptMessage);
    }

    private String covertToEncrypt(String message) {
        return "<Encrypt> "+ message + "</Encrypt>";
    }
}
