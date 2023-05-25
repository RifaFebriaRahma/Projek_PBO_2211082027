/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts_A.model;

/**
 *
 * @author LABP1KOMP
 */
public class Pelanggan {
    private String kodepelanggan;
    private String namapelanggan;
    private String jenispelanggan;
    
    public Pelanggan(){
    }
    
    public Pelanggan(String kodepelanggan, String namapelanggan, String jenispelanggan){
        this.kodepelanggan = kodepelanggan;
        this.namapelanggan = namapelanggan;
        this.jenispelanggan = jenispelanggan;
    }
    
    public String getKodePelanggan(){
        return kodepelanggan;
    }
    
    public void setKodePelanggan(String kodepelanggan){
        this.kodepelanggan = kodepelanggan;
    }
    
    public String getNamaPelanggan(){
        return namapelanggan;
    }
    
    public void setNamaPelanggan(String namapelanggan){
        this.namapelanggan = namapelanggan;
    }
    
    public String getJenisPelanggan(){
        return jenispelanggan;
    }
    
   public void setJenisPelanggan(String jenispelanggan){
        this.jenispelanggan = jenispelanggan;
    }
}