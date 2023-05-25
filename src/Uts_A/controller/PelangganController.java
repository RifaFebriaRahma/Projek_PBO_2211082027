/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts_A.controller;
import Rifa.view.FormPelanggan;
import Rifa.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LABP1KOMP
 */
public class PelangganController {
    private FormPelanggan formPelanggan;
    private PelangganDao pelangganDao;
    private Pelanggan pelanggan;
    
    public PelangganController(FormPelanggan formPelanggan){
        this.formPelanggan = formPelanggan;
        pelangganDao = new PelangganDaoImpl();
    }
    
    public void bersihForm(){
        formPelanggan.getTxtkodepealanggan().setText("");
        formPelanggan.getTxtNamapelanggan().setText("");
        formPelanggan.getTxtjenispelanggan().setText("");
    }
    
    public void savePelanggan(){
        pelanggan = new Pelanggan();
        pelanggan.setkodePelanggan(formPelanggan.getTxtKodePelanggan().getText());
        pelanggan.setNamaPelanggan(formPelanggan.getTxtNamaPelanggan().getText());
        pelanggan.setJenisPelanggan(formPelanggan.getTxtJenisPelanggan().getText());
        pelangganDao.save(pelanggan);
        javax.swing.JOptionPane.showMessageDialog(formPelanggan,
                "Entri Ok");
    }
    
    public void getPelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan = pelangganDao.getPelanggan(index);
        if(pelanggan != null){
            formPelanggan.getTxtNobp().setText(pelanggan.getNobp());
            formPelanggan.getTxtNama().setText(pelanggan.getNama());
            formPelanggan.getTxtAlamat().setText(pelanggan.getAlamat());
        }
    }
    
    public void updatePelanggan(){
        int index = formPelanggan.getTblAnggota().getSelectedRow();
        pelanggan.setNobp(formPelanggan.getTxtNobp().getText());
        pelanggan.setNama(formPelanggan.getTxtNama().getText());
        pelanggan.setAlamat(formPelanggan.getTxtAlamat().getText());
        pelangganDao.update(index, pelanggan);
        javax.swing.JOptionPane.showMessageDialog(formPelanggan,
                "Update Ok");
    }
    
    public void deletePelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelangganDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPelanggan, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPelanggan.getTblPelanggan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pelanggan> list = pelangganDao.getAll();
        for(Pelanggan pelanggan : list){
            Object[] data = {
                pelanggan.getKodePelanggan(),
                pelanggan.getNamaPelanggan(),
                pelanggan.getJenisPelanggan()
        };
        tabelModel.addRow(data);
        }
    }

    private static class Pelanggan {

        public Pelanggan() {
        }
    }
}