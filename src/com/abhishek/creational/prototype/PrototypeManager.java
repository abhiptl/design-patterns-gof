package com.abhishek.creational.prototype;

import java.util.HashMap;

/**
 * Created by AbhishekPatel on 9/12/2017.
 */
public class PrototypeManager {
    HashMap<String, ProductPrototype> productMap = new HashMap<>();

    public void loadCache() {
        Book b1 = new Book();
        b1.setDescription("Oliver Twist");
        b1.setSKU("B1");
        b1.setNumberOfPages(100);
        productMap.put(b1.getSKU(), b1);
        DVD d1 = new DVD();
        d1.setDescription("Superman");
        d1.setSKU("D1");
        d1.setDuration(180);
        productMap.put(d1.getSKU(), d1);
    }

    public ProductPrototype getProduct(String sku) throws CloneNotSupportedException {
        ProductPrototype productPrototype = productMap.get(sku);
        return (ProductPrototype) productPrototype.clone();
    }
}
