/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rifa080423;

/**
 *
 * @author Rifa Febria
 */
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    
    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
    
    public double getSide() {
        return side;
    }
}
