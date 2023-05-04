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
public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman (){
    }
    
    public Peminjaman(Anggota anggota, Buku buku, String tglpinjam, String tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    Peminjaman(String string, String ali, String padang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Anggota getAnggota(){
        return anggota;
    }
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    
    public Buku getBuku(){
        return buku;
    }
    
    public void setBuku(Buku buku){
        this.buku = buku;
    }
    
    public String getTglPinjam(){
        return tglpinjam;
    }
    
    public void setTglPinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    
    public String getTglKembali(){
        return tglkembali;
    }
    
    public void setTglKembali(String tglkembali){
        this.tglkembali = tglkembali;
    }

    public Object getKodeBuku() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getNobp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
