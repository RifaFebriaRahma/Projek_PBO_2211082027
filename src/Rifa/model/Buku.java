/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rifa.model;

/**
 *
 * @author LABP1KOMP
 */
public class Buku {
    private String kode;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun;
    
    public Buku(){
    }
    
    public Buku(String kode, String judul, String pengarang, String penerbit, String tahun){
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    Buku(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public String getPengarang(){
        return pengarang;
    }
    
   public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
   
   public String getPenerbit(){
        return penerbit;
    }
    
   public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
   }
        
   public String getTahun(){
        return tahun;
   }
    
   public void setTahun(String tahun){
        this.tahun = tahun;
   }

   
}