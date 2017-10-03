package com.abhishek.behavioral.chainofresponsibility;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public interface LogAppenderChain {
    void setNextChain(LogAppenderChain logAppenderChain);
    boolean appendLog(String logMessage);
    LogAppenderChain getNextChain();

}
