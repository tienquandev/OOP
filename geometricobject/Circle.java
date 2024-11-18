
package com.tienquan.geometricobject;


public class Circle implements GeometricObject{
    protected double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return radius + " ";
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    
    
}
