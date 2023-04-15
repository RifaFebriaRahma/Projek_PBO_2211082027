/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa160323;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Latihan61_1 {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan tiga nilai ujian
        String nilai1 = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
        String nilai2 = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
        String nilai3 = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");

        // Mengonversi string ke double
        double n1 = Double.parseDouble(nilai1);
        double n2 = Double.parseDouble(nilai2);
        double n3 = Double.parseDouble(nilai3);

        // Menghitung nilai rata-rata
        double rata = (n1 + n2 + n3) / 3;

        // Membuat string output
        String output = "Rata-rata nilai ujian adalah " + rata;
        if (rata >= 60) {
            output += " :)"; // menambahkan smiley face jika nilai rata-rata >= 60
        } else {
            output += " :("; // menambahkan :( jika nilai rata-rata < 60
        }

        // Menampilkan output menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, output);
    }
}