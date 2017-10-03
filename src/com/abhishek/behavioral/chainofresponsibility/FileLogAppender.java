package com.abhishek.behavioral.chainofresponsibility;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class FileLogAppender implements LogAppenderChain {

    LogAppenderChain logAppenderChain;

    @Override
    public boolean appendLog(String logMessage) {
        System.out.println("Adding Logs to File");
        if(logAppenderChain != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setNextChain(LogAppenderChain logAppenderChain) {
        this.logAppenderChain = logAppenderChain;
    }

    @Override
    public LogAppenderChain getNextChain() {
        return logAppenderChain;
    }
}
