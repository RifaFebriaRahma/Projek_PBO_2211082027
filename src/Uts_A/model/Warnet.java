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
public class Warnet {
    private String tglmasuk;
    private String jammasuk;
    private String jamkeluar;
    private String tarif;
    
    public Warnet(){
    }
    
    public Warnet(String pelanggan, String tglmasuk, String jammasuk, String jamkeluar, String tarif){
        this.tglmasuk = tglmasuk;
        this.jammasuk = jammasuk;
        this.jamkeluar = jamkeluar;
        this.tarif = tarif;
    }
    
    public String getTglMasuk(){
        return tglmasuk;
    }
    
    public void setTglMasuk(String tglmasuk){
        this.tglmasuk = tglmasuk;
    }
    
    public String getJamMasuk(){
        return jammasuk;
    }
    
    public void setJamMasuk(String jammasuk){
        this.jammasuk = jammasuk;
    }
        
    public String getJamKeluar(){
        return jamkeluar;
    }
    
    public void setJamKeluar(String jamkeluar){
        this.jamkeluar = jamkeluar;
    }
        
    public String getTarif(){
        return tarif;
    }
    
    public void setTarif(String tarif){
        this.tarif = tarif;
    }
}