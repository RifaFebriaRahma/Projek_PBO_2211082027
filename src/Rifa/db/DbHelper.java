/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import Rifa.dao.*;
import Rifa.model.Anggota2;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DbHelper {
  private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if(connection==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/PBO_2211082027");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
            }
    return connection;
    }

    public static void main(String[] args) throws Exception{
        try {
            connection = DbHelper.getConnection();
            Anggotadao dao = new AnggotaDaoImpl(connection);
            Anggota2 anggota = new Anggota2("A001", "Ali", "Padang","L");
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "koneksi ok");
        } catch (SQLException ex) {
            JOptionPane.showInputDialog(null, ex.getMessage());
        }
        }
    } 

