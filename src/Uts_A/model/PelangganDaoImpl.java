/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts_A.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public class PelangganDaoImpl {
    List<Pelanggan> data = new ArrayList<>();
    
    public PelangganDaoImpl() {
        data.add(new Pelanggan("1111", "Ali", "Padang"));
        data.add(new Pelanggan("1112", "Deni", "Padang Panjang"));
        data.add(new Pelanggan("1113", "Ani", "Padang"));
    }
    
    public void save(Pelanggan pelanggan){
        data.add(pelanggan);
    }
    
    public void update(int index, Pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pelanggan getAnggota(int index){
        return data.get(index);
    }
    
    public List<Pelanggan> getAll(){
        return data;
    }
}