/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa.dao;

import Rifa.model.Anggota2;
import java.sql.*;
import java.util.*;
/**
 *
 * @author User
 */
public class AnggotaDaoImpl implements Anggotadao{
    private Connection connection;
    
    
    public AnggotaDaoImpl(Connection connection){
        this.connection = connection;
    }
        
    public void insert(Anggota2 anggota) throws Exception{
        String sql = "insert into anggota2 values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.setString(2, anggota.getNamaanggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJeniskelamin());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update(Anggota2 anggota) throws Exception {
        String sql = "UPDATE  anggota2 SET namaanggota = ?, alamat=?, jeniskelamin=?, kodeanggota=? WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(4, anggota.getKodeanggota());
        ps.setString(1, anggota.getNamaanggota());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3, anggota.getJeniskelamin());
        ps.setString(5, anggota.getKodeanggota());
        
        ps.executeUpdate();
        //ps.close(); 
    }
    
    public void delete(Anggota2 anggota) throws Exception {
        String sql = "DELETE FROM anggota2 WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.executeUpdate();
        ps.close(); 
    }
    
    public Anggota2 getAnggota(String kodeanggota) throws Exception {
        String sql = "SELECT * FROM anggota2 WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ResultSet rs = ps.executeQuery();
        Anggota2 anggota = null;
        if(rs.next()){
            anggota = new Anggota2();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
        }
        return anggota;
    }
    
    public List<Anggota2> getAll() throws Exception {
        String sql = "Select * FROM anggota2";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Anggota2 anggota;
        List<Anggota2> list = new ArrayList<>();
        while(rs.next()){
            anggota = new Anggota2();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}
