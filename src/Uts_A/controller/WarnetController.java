/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts_A.controller;
import Rifa.view.FormWarnet;
import Rifa.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LABP1KOMP
 */
public class WarnetController {
    private FormWarnet formWarnet;
    private WarnetDao warnetDao;
    private Warnet warnet;
    
    public WarnetController(FormWarnet formWarnet){
        this.formWarnet = formWarnet;
        warnetDao = new WarnetDaoImpl();
    }
    
    public void bersihForm(){
        formWarnet.getTxtNobp().setText("");
        formWarnet.getTxtNama().setText("");
        formWarnet.getTxtAlamat().setText("");
    }
    
    public void saveWarnet(){
        warnet = new Warnet();
        warnet.setNobp(formWarnet.getTxtNobp().getText());
        warnet.setNama(formWarnet.getTxtNama().getText());
        warnet.setAlamat(formWarnet.getTxtAlamat().getText());
        warnetDao.save(warnet);
        javax.swing.JOptionPane.showMessageDialog(formWarnet,
                "Entri Ok");
    }
    
    public void getWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);
        if(warnet != null){
            formWarnet.getTxtNobp().setText(warnet.getNobp());
            formWarnet.getTxtNama().setText(warnet.getNama());
            formWarnet.getTxtAlamat().setText(warnet.getAlamat());
        }
    }
    
    public void updateWarnet(){
        int index = formWarnet.getTblAnggota().getSelectedRow();
        warnet.setNobp(formWarnet.getTxtNobp().getText());
        warnet.setNama(formWarnet.getTxtNama().getText());
        warnet.setAlamat(formWarnet.getTxtAlamat().getText());
        warnetDao.update(index, warnet);
        javax.swing.JOptionPane.showMessageDialog(formWarnet,
                "Update Ok");
    }
    
    public void deleteWarnet(){
        int index = formWarnet.getTblAnggota().getSelectedRow();
        warnetDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formWarnet, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Warnet> list = warnetDao.getAll();
        for(warnet anggota : list){
            Object[] data = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat()
        };
        tabelModel.addRow(data);
        }
    }
}