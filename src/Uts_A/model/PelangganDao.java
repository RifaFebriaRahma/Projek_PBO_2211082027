/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts_A.model;
import java.util.List;
/**
 *
 * @author LABP1KOMP
 */
public interface PelangganDao {
    void save(Pelanggan pelanggan);
    void update(int index, Pelanggan pelanggan);
    void delete(int index);
    Pelanggan getPelanggan(int index);
    List<Pelanggan> getAll();
}