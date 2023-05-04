/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat080423;

/**
 *
 * @author Rifa Febria
 */
public class Circle extends Shape{
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "Circle";
    }
    
    public double getRadius() {
        return radius;
    }
}
