/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa.db;

import Rifa.dao.BukuDao;
import Rifa.dao.BukuDaoImpl;
import Rifa.model.Buku2;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class DbHelper2 {
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
            BukuDao dao = new BukuDaoImpl(connection);
            Buku2 buku = new Buku2("B002", "Malin Kundang", "Rifa","Marzah");
            dao.insert(buku);
            JOptionPane.showMessageDialog(null, "koneksi ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
