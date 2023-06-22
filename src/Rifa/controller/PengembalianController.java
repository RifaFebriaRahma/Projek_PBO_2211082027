/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rifa.controller;
import Rifa.view.FormPeminjaman;
import Rifa.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author User
 */
public class PengembalianController {
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman  form;
    
    private Peminjaman peminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PengembalianController(FormPeminjaman form){
        this.form = form;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        form.getTxtTglpinjam().setText("");
        form.getTxtTglkembali().setText("");
        form.getTxtTglDikembalikan().setText("");
    }
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        form.getCboAnggota().removeAllItems();
        form.getCboBuku().removeAllItems();
        
        //isi
        for(Anggota anggota : listAnggota){
            form.getCboAnggota().addItem(anggota.getNobp());
        }
        for(Buku buku : listBuku){
            form.getCboBuku().addItem(buku.getKode());
        }
    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglKembali(form.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        
        pengembalian = new Pengembalian();
        pengembalian.setDikembalikan("");
        pengembalian.setTerlambat("");
        pengembalian.setDenda();
        pengembalianDao.save(pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Saved");
        
    }
    public void savePengembalian(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        pengembalian.setDikembalikan(form.getTxtTglDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Saved");
        
    }
    public void getPeminjaman(){
        int index = form.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            form.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            form.getCboBuku().setSelectedItem(peminjaman.getBuku().getKode());
            form.getTxtTglpinjam().setText(peminjaman.getTglPinjam());
            form.getTxtTglkembali().setText(peminjaman.getTglKembali());
        }
        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            form.getTxtTglDikembalikan().setText(pengembalian.getDikembalikan());
        }
    }
    
    public void updatePeminjaman(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglKembali(form.getTxtTglkembali().getText());
        peminjamanDao.update(idx,peminjaman);
        
        pengembalian.setDikembalikan(form.getTxtTglDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Updated");
    }
    
    public void Kembalikan(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        pengembalian.setDikembalikan(form.getTxtTglDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx, pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "kembalikan");
    }
    
    public void deletePeminjaman(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        pengembalianDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);

        // Mengambil data dari dua tabel
        java.util.List<Pengembalian> listPengembalian = pengembalianDao.getAll();
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAll();

        // Menambahkan data dari kedua tabel ke dalam satu list
        List<Object[]> dataGabungan = new ArrayList<>();
        for (int i = 0; i < listPeminjaman.size(); i++) {
            Peminjaman peminjaman = listPeminjaman.get(i);
            Pengembalian pengembalian = null;
            if (i < listPengembalian.size()) {
                pengembalian = listPengembalian.get(i);
            }
            Object[] data = {
                peminjaman.getAnggota().getNobp(),
                peminjaman.getAnggota().getNama(),
                peminjaman.getBuku().getKode(),
                peminjaman.getTglPinjam(),
                peminjaman.getTglKembali(),
                (pengembalian == null) ? "" : pengembalian.getDikembalikan(),
                (pengembalian == null) ? "" : pengembalian.getTerlambat(),
                (pengembalian == null) ? "" : pengembalian.getDenda()
            };
            dataGabungan.add(data);
        }

        // Menambahkan data ke dalam tabel
        for (Object[] data : dataGabungan) {
            tabelModel.addRow(data);
        }
    }
}
