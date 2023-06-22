/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa.dao;

import Rifa.model.Buku2;
import java.sql.*;
import java.util.*;
/**
 *
 * @author User
 */
public class BukuDaoImpl implements BukuDao{
    private Connection connection;
    
    public BukuDaoImpl(Connection connection){
        this.connection = connection;   
    }
    
    public void insert(Buku2 buku) throws Exception{
        String sql = "insert into buku2 values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update(Buku2 buku) throws Exception {
        String sql = "UPDATE buku2 SET kodebuku = ?, judulbuku=?, pengarang=?, penerbit=? WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getKodebuku());
        
        ps.executeUpdate();
        //ps.close(); 
    }
    
    public void delete(Buku2 buku) throws Exception {
        String sql = "DELETE FROM buku2 WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.executeUpdate();
        ps.close(); 
    }
    
    public Buku2 getBuku(String kodebuku) throws Exception {
        String sql = "SELECT * FROM buku2 WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ResultSet rs = ps.executeQuery();
        Buku2 buku = null;
        if(rs.next()){
            buku = new Buku2();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    }
    
    public List<Buku2> getAll() throws Exception {
        String sql = "Select * FROM buku2";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Buku2 buku;
        List<Buku2> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku2();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}
