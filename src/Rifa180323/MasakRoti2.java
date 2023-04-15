/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa180323;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MasakRoti2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah roti yang ingin dimasak
        System.out.print("Berapa banyak roti yang ingin dimasak? ");
        int jumlahRoti = input.nextInt();

        // Persiapkan bahan-bahan yang dibutuhkan
        double tepung = 500 * jumlahRoti;   // gram
        double ragi = 10 * jumlahRoti;      // gram
        double gula = 50 * jumlahRoti;      // gram
        double garam = 10 * jumlahRoti;     // gram
        double telur = 2 * jumlahRoti;
        double susu = 200 * jumlahRoti;     // ml
        double mentega = 50 * jumlahRoti;   // gram
        double air = 250 * jumlahRoti;      // ml

        // Campurkan tepung, ragi, gula, dan garam dalam wadah dan aduk rata
        double campuranKering = tepung + ragi + gula + garam;

        // Tambahkan telur dan susu ke dalam campuran tepung dan aduk rata
        double campuranBasah = telur + susu;

        // Tambahkan mentega ke dalam campuran kering dan uleni adonan hingga kalis dan elastis
        double adonan = campuranKering + mentega;
        int pengembangan1 = 60; // menit
        int pengembangan2 = 30; // menit

        for(int i = 1; i <= jumlahRoti; i++) {
            System.out.println("Memasak roti ke-" + i + "...");

            // Diamkan adonan selama sekitar 1 jam hingga mengembang dua kali lipat
            System.out.println("Diamkan adonan selama " + pengembangan1 + " menit...");
            try {
                Thread.sleep(pengembangan1 * 1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Uleni adonan lagi sebentar hingga adonan halus
            System.out.println("Uleni adonan lagi sebentar hingga halus...");
            adonan = 0;
            while (adonan < campuranKering + campuranBasah) {
                adonan += 10;
            }

            // Bentuk adonan menjadi bola-bola kecil dan letakkan di atas loyang
            System.out.println("Bentuk adonan menjadi bola-bola kecil...");
            double ukuranBola = adonan / 10;
            for(int j = 1; j <= ukuranBola; j++) {
                System.out.println("Letakkan bola adonan ke-" + j + " di atas loyang...");
            }

            // Diamkan bola-bola adonan selama sekitar 30 menit hingga mengembang
            System.out.println("Diamkan bola-bola adonan selama " + pengembangan2 + " menit...");
            try {
                Thread.sleep(pengembangan2 * 1000 * 60);
            } catch (InterruptedException e) {
            }
        }
    }
}
