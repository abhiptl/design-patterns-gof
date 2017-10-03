package com.abhishek.behavioral.chainofresponsibility;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class DBLogAppender implements LogAppenderChain {
    private LogAppenderChain logAppenderChain;
    @Override
    public void setNextChain(LogAppenderChain logAppenderChain) {
        this.logAppenderChain = logAppenderChain;
    }

    @Override
    public boolean appendLog(String logMessage) {
        System.out.println("Adding Logs to Database");

        if(logAppenderChain != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public LogAppenderChain getNextChain() {
        return logAppenderChain;
    }
}
