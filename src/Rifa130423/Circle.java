/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa130423;

/**
 *
 * @author LAB-MM
 */
import java.util.Scanner;
public class Circle implements Relation{
    private Double Jari;
    public Circle(double Jari){ 
        this.Jari = Jari;
    } 
    public double getLength(){ 
        double length = 3.14 * Jari * Jari; 
        return length; 
    } 

    public boolean isGreater( Object a, Object b){ 
        double aLen = ((Circle)a).getLength(); 
        double bLen = ((Circle)b).getLength(); 
        return (aLen > bLen); 
    } 

    public boolean isLess( Object a, Object b){ 
        double aLen = ((Circle)a).getLength(); 
        double bLen = ((Circle)b).getLength(); 
        return (aLen < bLen); 

    } 

    public boolean isEqual( Object a, Object b){ 
        double aLen = ((Circle)a).getLength(); 
        double bLen = ((Circle)b).getLength(); 
        return (aLen == bLen); 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari Lingkaran 1 : ");int L1 = in.nextInt();
        System.out.print("Masukkan Jari-Jari Lingkaran 2 : ");int L2 = in.nextInt();
        Circle ling = new Circle(L1);
        Circle ling2 = new Circle(L2);
        System.out.println();

        System.out.println(ling.isEqual(ling, ling2));
        System.out.println(ling.isGreater(ling, ling2));
        System.out.println(ling.isLess(ling, ling2));
        System.out.println();
        
        System.out.println("Luas Circle A = " + ling.getLength());
        System.out.println("Luas Circle b = " + ling2.getLength());
        System.out.println();

        System.out.println("Circle A > Circle B = " + ling.isGreater(ling, ling2));
        System.out.println("Circle A < Circle B = " + ling.isLess(ling, ling2));
        System.out.println("Circle A = Circle B = " + ling.isEqual(ling, ling2));
    }
}