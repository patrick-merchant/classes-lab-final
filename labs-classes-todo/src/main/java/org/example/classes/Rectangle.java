package org.example.classes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle (float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double getArea() {
        return width * length;
    }

    public double getDiagonal() {
        return Math.sqrt((width * width) + (length * length));
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }
}
