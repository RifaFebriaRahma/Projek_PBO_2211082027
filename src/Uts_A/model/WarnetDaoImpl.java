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
public class WarnetDaoImpl {
    List<Warnet> data = new ArrayList<>();
    
    public WarnetDaoImpl() {
        data.add(new Warnet("1111","Ali", "Padang","Boy","2022"));
        data.add(new Warnet("1112", "Deni", "Padang Panjang","Boy","2022"));
        data.add(new Warnet("1113", "Ani", "Padang","Boy","2022"));
    }
    
    public void save(Warnet buku){
        data.add(buku);
    }
    
    public void update(int index, Warnet buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Warnet getBuku(int index){
        return data.get(index);
    }
    
    public List<Warnet> getAll(){
        return data;
    }
}