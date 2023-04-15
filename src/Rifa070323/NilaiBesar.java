/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rifa070323;

/**
 *
 * @author LABSIKOMP03
 */
public class NilaiBesar 
{
     public static void main(String[] args){
        int a = 10;
        int b = 23;
        int c = 5;
        int max;
        
        max = (b>=a)? b:a;
        max = (c>=max)? c:max;
        
        System.out.println ("number1 ="+a);
        System.out.println ("number2 ="+b);
        System.out.println ("number3 ="+c);
        System.out.print ("nilai tertinggi adalah angka = "+max);
     }
}
