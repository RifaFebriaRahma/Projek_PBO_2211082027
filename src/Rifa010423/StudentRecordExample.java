/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa010423;

/**
 *
 * @author User
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord ani = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        //isi data
        ani.setName("Ani");
        ani.setAddress("Padang");
        ani.setAge(20);
        
        cris.setName("Cris");
        cris.setAddress("Bukittinggi");
        cris.setAge(20);
        
        //menampilkan data
        System.out.println("Data Objek Ani");
        System.out.println("Nama        :" +ani.getName());
        System.out.println("Alamat      :" +ani.getAddress());
        System.out.println("Umur        :" +ani.getAge());
        
        //memanggil method print
        System.out.println("Data Objek Cris");
        cris.print("");
        cris.print(70, 80, 90);
        
        System.out.println("Data Objek Ali");
        ali.print("");
        
        
        //menampilkan jumlah siswa
        System.out.println("Count = "+StudentRecord.getStudentCount());
        
    }
}
