/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat080423;

/**
 *
 * @author LABP1KOMP
 */
public class StudentRecordExample3 {
    public static void main(String[] args) {
        StudentRecordExtends rifa = new StudentRecordExtends("Rifa", "Padang");
        rifa.NilaiHuruf();
        rifa.getAverage();
        
        
        System.out.println("Student Record:");
        
        rifa.setAge(19);
        rifa.setMathGrade(90);
        rifa.setenglishGrade(90);
        rifa.setscienceGrade(70);
        rifa.setComputer(100);
        System.out.println();
        
        //menampilkan data
        System.out.println("Biodata Rifa");
        System.out.println("Nama                :" +rifa.getName());
        System.out.println("Alamat              :" +rifa.getAddress());
        System.out.println("Umur                :" +rifa.getAge());
        System.out.println("Nilai rata-rata     :" +rifa.getAverage());
        System.out.println("nilai huruf         :" +rifa.NilaiHuruf());
        
        
        System.out.println();
    }
}