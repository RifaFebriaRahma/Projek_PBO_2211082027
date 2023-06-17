/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package rifafebria.dao;

import rifafebria.model.Buku;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LAB-MM
 */
public class BukuDaoImpl implements BukuDao {
    private Connection connection;
    
    public BukuDaoImpl (Connection connection){
        this.connection = connection;
    }
    
    public void insert(buku buku) throws Exception{
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
        ps.close(); 
    }
    
    public void update(buku buku) throws Exception{
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
        ps.close(); 
    }
    }
}