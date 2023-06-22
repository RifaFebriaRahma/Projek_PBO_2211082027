/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Rifa.dao;

import java.util.List;
import Rifa.model.*;

/**
 *
 * @author User
 */
public interface BukuDao {
    void insert(Buku2 buku) throws Exception;
    void update(Buku2 buku) throws Exception;
    void delete(Buku2 buku) throws Exception;
    Buku2 getBuku(String kodebuku) throws Exception;
    List<Buku2> getAll() throws Exception;
}
