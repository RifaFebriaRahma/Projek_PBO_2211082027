/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rifa.controller;
import Rifa.view.FormPeminjaman;
import Rifa.model.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LABP1KOMP
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    private AnggotaDao daoAnggota;
    private BukuDao daoBuku;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        daoAnggota = new AnggotaDaoImpl();
        daoBuku = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = daoAnggota.getAll();
        List<Buku> listBuku = daoBuku.getAll();
        formPeminjaman.getCboAnggota().removeAllItems();
        formPeminjaman.getCboBuku().removeAllItems();
    
    //isi anggota
    for (Anggota anggota : listAnggota){
        formPeminjaman.getCboAnggota().addItem(anggota.getNobp());
    }
    
    for (Buku buku : listBuku){
        formPeminjaman.getCboBuku().addItem(buku.getKode());
    }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(
    daoAnggota.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(
            daoBuku.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,
                "Entri Ok");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getBuku().getKode());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.getTglPinjam());
            formPeminjaman.getTxtTglkembali().setText(peminjaman.getTglKembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(
    daoAnggota.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(
            daoBuku.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.update(index, peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,
                "Update Ok");
    }
    
    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodeBuku(),
                peminjaman.getTglPinjam(),
                peminjaman.getTglKembali()
        };
        tabelModel.addRow(data);
        }
    }
}
