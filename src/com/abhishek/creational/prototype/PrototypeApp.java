package com.abhishek.creational.prototype;

/**
 * Created by AbhishekPatel on 9/12/2017.
 */
public class PrototypeApp {
    public static void main(String[] args) throws Exception {
        PrototypeManager pe = new PrototypeManager();
        pe.loadCache();
        Book clonedBook = (Book)pe.getProduct("B1");
        System.out.println("SKU = " + clonedBook.getSKU());
        System.out.println("SKU = " +
                clonedBook.getDescription());
        System.out.println("SKU = " +
                clonedBook.getNumberOfPages());
        DVD clonedDVD = (DVD)pe.getProduct("D1");
        System.out.println("SKU = " + clonedDVD.getSKU());
        System.out.println("SKU = " + clonedDVD.getDescription());
        System.out.println("SKU = " + clonedDVD.getDuration());
    }
}
