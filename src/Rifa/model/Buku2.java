/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa.model;

/**
 *
 * @author User
 */
public class Buku2 {
    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String Penerbit;
    
    public Buku2(){}

    public Buku2(String kodebuku, String judulbuku, String pengarang, String Penerbit) {
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.Penerbit = Penerbit;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getJudulbuku() {
        return judulbuku;
    }

    public void setJudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }
}
