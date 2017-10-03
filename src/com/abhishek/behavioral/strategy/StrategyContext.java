package com.abhishek.behavioral.strategy;

/**
 * Created by AbhishekPatel on 9/27/2017.
 */
public class StrategyContext {
    private StrategySortInterface strategySortInterface;

    public void setSorter(StrategySortInterface strategySortInterface) {
        this.strategySortInterface = strategySortInterface;
    }

    public StrategyContext() {

    }

    public void sortDouble(double[] list) {
        strategySortInterface.sort(list);
    }

}
