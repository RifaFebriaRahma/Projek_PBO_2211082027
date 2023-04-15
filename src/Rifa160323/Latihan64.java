/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rifa160323;
import java.util.Scanner;
/**
 *
 * @author LABP1KOMP
 */
public class Latihan64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;
        int pangkat;
        int hasil = 1;
        int i = 0;
        
        System.out.print("masukkan angka : ");
        angka = in.nextInt();
        System.out.print("masukkan pangkat : ");
        pangkat = in.nextInt();
        while (i < pangkat){
            hasil *= angka;
            i++;
        }
        System.out.println("hasil pangkat dari " + angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}