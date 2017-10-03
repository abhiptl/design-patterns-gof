package com.abhishek.structural.bridge;

/**
 * Created by AbhishekPatel on 9/14/2017.
 */

// Abstraction
public interface Shape {
    void draw();
    void resizeByPer(float f);
}

class CircleShape implements Shape {
    float aFloat;
    DrawingAPI drawingAPI;

    public CircleShape(float aFloat, DrawingAPI drawingAPI) {
        this.aFloat = aFloat;
        this.drawingAPI = drawingAPI;
    }

    // Abstraction Specific
    @Override
    public void draw() {
        System.out.println("Drawing Circle Shape");
        drawingAPI.draw();
    }

    // Simple implementation
    @Override
    public void resizeByPer(float f) {
        this.aFloat = f;
    }
}

interface DrawingAPI {
    void draw();
}

class DrawingAPI1 implements DrawingAPI {

    @Override
    public void draw() {
        System.out.println("DrawingAPI1 draw");
    }
}

class DrawingAPI2 implements DrawingAPI {

    @Override
    public void draw() {
        System.out.println("DrawingAPI2 draw");
    }
}
