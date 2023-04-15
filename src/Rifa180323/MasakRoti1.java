/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa180323;

/**
 *
 * @author User
 */
public class MasakRoti1 {
    public static void main(String[] args) {
        // persiapkan bahan-bahan
        int tepung = 500;
        int ragi = 10;
        int gula = 50;
        int garam = 10;
        int telur = 2;
        int susu = 200;
        int mentega = 50;
        
        

        // campurkan tepung, ragi, gula, dan garam
        int campuran = tepung + ragi + gula + garam;

        // tambahkan telur dan susu ke dalam campuran tepung
        campuran += telur + susu;

        // uleni adonan hingga kalis dan elastis
        int adonan = 0;
        while (adonan < campuran) {
            adonan += 10;
        }

        // diamkan adonan selama 1 jam hingga mengembang dua kali lipat
        int diamkan = 60;

        // uleni adonan lagi setelah mengembang
        adonan = 0;
        while (adonan < campuran) {
            adonan += 10;
        }

        // bentuk adonan menjadi bola-bola kecil
        int bola = adonan / 10;

        // diamkan bola-bola adonan selama 30 menit
        int diamkanBola = 30;

        // panaskan oven pada suhu 180 derajat Celsius
        int suhuOven = 180;

        // panggang bola-bola adonan selama 20-25 menit
        int waktuPanggang = 20 + (int)(Math.random() * ((25 - 20) + 1));

        // tampilkan pesan roti sudah matang
        System.out.println("Roti sudah matang! Selamat menikmati!");
    }
}