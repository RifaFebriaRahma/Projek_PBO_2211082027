/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author LAB-MM
 */
public class Buku {

    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;

    public Buku(String kodebuku, String judulbuku, String pengarang, String penerbit) {
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public String getkodebuku() {
        return kodebuku;
    }

    public void setkodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getjudulbuku() {
        return judulbuku;
    }

    public void setjudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }

    public String getpengarang() {
        return pengarang;
    }

    public void setpengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJeniskelamin() {
        return penerbit;
    }

    public void setpenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}
