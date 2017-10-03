package com.abhishek.behavioral.chainofresponsibility;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class ChainOfResponsibilityMain {
    private LogAppenderChain rootChain;
    private LogAppenderChain nextAppender;


    public ChainOfResponsibilityMain() {
        LogAppenderChain log2 = new FileLogAppender();
        LogAppenderChain log3 = new DBLogAppender();
        // Root chain
        rootChain = new ConsoleLogAppender();

        // Set Chain of Responsibility
        rootChain.setNextChain(log2);
        log2.setNextChain(log3);
    }

    public void logMessage(String message) {
        if(nextAppender == null) {
            nextAppender = rootChain;
        } else {
            nextAppender = nextAppender.getNextChain();
        }

        if(nextAppender.appendLog(message)) {
            logMessage(message);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        ChainOfResponsibilityMain chainOfResponsibilityMain = new ChainOfResponsibilityMain();
        chainOfResponsibilityMain.logMessage("Message");
    }
}
