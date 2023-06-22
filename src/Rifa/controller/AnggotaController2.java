/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa.controller;
import Rifa.model.*;
import Rifa.dao.AnggotaDaoImpl;
import Rifa.dao.Anggotadao;
import Rifa.db.*;
import Rifa.view.FormAnggota2;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class AnggotaController2 {
    FormAnggota2 view;
    Anggota2 anggota;
    Anggotadao dao;
    Connection connection;
    
    public AnggotaController2(FormAnggota2 view) {
        try {
            this.view = view;
            connection = DbHelper.getConnection();
            dao = new AnggotaDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cls(){
        view.getTxtkode().setText("");
        view.getTxtnama().setText("");
        view.getTxtalamat().setText("");
        view.getCbojenis().removeAllItems();
        view.getCbojenis().addItem("L");
        view.getCbojenis().addItem("P");
    }
    
    public void tampil(){
        try {
             DefaultTableModel tabelModel = (DefaultTableModel) view.getTblanggota().getModel();
             tabelModel.setRowCount(0);
             List<Anggota2> list = dao.getAll();
             for(Anggota2 a : list){
                 Object[]row = {
                     a.getKodeanggota(),
                     a.getNamaanggota(),
                     a.getAlamat(),
                     a.getJeniskelamin()
                 };
                 tabelModel.addRow(row);
             }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void insert(){
        try {
            anggota = new Anggota2();
            anggota.setKodeanggota(view.getTxtkode().getText());
            anggota.setNamaanggota(view.getTxtnama().getText());
            anggota.setAlamat(view.getTxtalamat().getText());
            anggota.setJeniskelamin(view.getCbojenis().getSelectedItem().toString());
            dao.insert(anggota);
            JOptionPane.showMessageDialog(view, "tambah data ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void delete(){
        try {
            dao.delete(anggota);
            JOptionPane.showMessageDialog(view, "Delete Data Ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void tabelKlik(){
        try {
            String kodeanggota = view.getTblanggota().getValueAt(view.getTblanggota().getSelectedRow(),0).toString();
            anggota = dao.getAnggota(kodeanggota);
            view.getTxtkode().setText(anggota.getKodeanggota());
            view.getTxtnama().setText(anggota.getNamaanggota());
            view.getCbojenis().setSelectedItem(anggota.getJeniskelamin());
            view.getTxtalamat().setText(anggota.getAlamat());
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    public void update(){
        try {
            anggota.setKodeanggota(view.getTxtkode().getText());
            anggota.setNamaanggota(view.getTxtnama().getText());
            anggota.setAlamat(view.getTxtalamat().getText());
            anggota.setJeniskelamin(view.getCbojenis().getSelectedItem().toString());
            dao.update(anggota);
            JOptionPane.showMessageDialog(view,"update data ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
