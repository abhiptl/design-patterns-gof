package com.abhishek.structural.bridge;

/**
 * Created by AbhishekPatel on 9/14/2017.
 */
public class BridgeApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new CircleShape(1, new DrawingAPI1());
        shapes[1] = new CircleShape(5,  new DrawingAPI2());
        for (Shape shape : shapes) {
            shape.resizeByPer(2.5f);
            shape.draw();
        }
    }
}
