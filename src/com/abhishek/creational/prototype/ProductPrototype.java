package com.abhishek.creational.prototype;

/**
 * Created by AbhishekPatel on 9/12/2017.
 */
public abstract class ProductPrototype implements Cloneable {
    private String SKU;
    private String description;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Book extends ProductPrototype {
    private int numberOfPages;
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int i) {
        numberOfPages = i;
    }
}

class DVD extends ProductPrototype {
    private int duration;
    public int getDuration() {
        return duration;
    }
    public void setDuration(int i) {
        duration = i;
    }
}
