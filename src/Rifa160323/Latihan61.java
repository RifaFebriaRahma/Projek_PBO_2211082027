/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rifa160323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author LABP1KOMP
 */
public class Latihan61 {
    public static void main(String[]args){
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String n1 = "";
        String n2 = "";
        String n3 = "";
        
        try{
            System.out.print("Masukkan nilai pertama Anda : ");
            n1 = nilai.readLine();
            System.out.print("Masukkan nilai kedua Anda : ");
            n2 = nilai.readLine();
            System.out.print("Masukkan nilai ketiga Anda : ");
            n3 = nilai.readLine();
        } catch (Exception ex){
            System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
        }
        int pertama;
        int kedua;
        int ketiga;
        
        pertama = Integer.parseInt(n1);
        kedua = Integer.parseInt(n2);
        ketiga = Integer.parseInt(n3);
        
        int rata_rata = (pertama+kedua+ketiga)/3;
        
        System.out.println("Rata-rata nilai Anda: "+rata_rata);
        
        if (rata_rata<=60){System.out.println(":-(");
        
        }
        else {
            System.out.println(":-)");
        }
    }
}