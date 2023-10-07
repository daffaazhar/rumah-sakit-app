package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RumahSakit {
    private final List<Admin> admin;
    private final List<Pasien> pasien;
    private final List<Dokter> dokter;
    private final List<JanjiMedis> janjiMedis;
    
    public RumahSakit() {
        admin = new ArrayList<>();
        admin.add(new Admin("admin", "admin123", "Admin RS", "087757453838"));
        
        pasien = new ArrayList<>();
        pasien.add(new Pasien("pasien", "pasien123", "Pasien", "087757453838"));
        
        dokter = new ArrayList<>();
        dokter.add(new Dokter("dokter", "dokter123", "Dokter", "087757453838", "Umum"));
        dokter.add(new Dokter("daffaazhar", "daffa123", "Daffa Azhar", "082131115406", "Anak"));
        
        janjiMedis = new ArrayList<>();
    }
    
    public void tambahPasien(String username, String password, String nama, 
            String nomorTelepon) {
        this.pasien.add(new Pasien(username, password, nama, nomorTelepon));
    }
    
    public void hapusPasien(int index) {
        pasien.remove(index);
    }
    
    public void updatePasien(int index, String username, 
            String password, String nama, String nomorTelepon) {
        Pasien data = pasien.get(index);
        data.setUsername(username);
        data.setPassword(password);
        data.setNama(nama);
        data.setNomorTelepon(nomorTelepon);
        pasien.set(index, data);
    }
    
    public void tambahDokter(String username, String password, String nama, 
            String nomorTelepon, String spesialisasi) {
        this.dokter.add(new Dokter(username, password, nama, nomorTelepon, spesialisasi));
    }
    
    public void hapusDokter(int index) {
        dokter.remove(index);
    }
    
    public void updateDokter(int index, String username, 
            String password, String nama, String nomorTelepon, String spesialisasi) {
        Dokter data = dokter.get(index);
        data.setUsername(username);
        data.setPassword(password);
        data.setNama(nama);
        data.setNomorTelepon(nomorTelepon);
        data.setSpesialisasi(spesialisasi);
        dokter.set(index, data);
    }
    
    public void tambahJanjiMedis(Date tanggal, Dokter dokter) {
        JanjiMedis janjiMedis = new JanjiMedis(tanggal, dokter);
        this.janjiMedis.add(janjiMedis);
        dokter.getAllJanjiMedis().add(janjiMedis);
    }
    
    public void tutupJanjiMedis(JanjiMedis janjiMedis) {        
        janjiMedis.setIsActive(false);
        this.janjiMedis.remove(janjiMedis);
        janjiMedis.getDokter().getAllJanjiMedis().remove(janjiMedis);
        janjiMedis.getDokter().getAllRiwayatJanjiMedis().add(janjiMedis);
    }
    
    public Pasien getPasien(int index) {
        return pasien.get(index);
    }
    
    public Dokter getDokter(int index) {
        return dokter.get(index);
    }
    
    public JanjiMedis getJanjiMedis(int index) {
        return janjiMedis.get(index);
    }
    
    public int getJumlahPasien() {
        return pasien.size();
    }
    
    public int getJumlahDokter() {
        return dokter.size();
    }
    
    public int getJumlahAdmin() {
        return admin.size();
    }
    
    public int getJumlahJanjiMedis() {
        return janjiMedis.size();
    }
    
    public List<Pasien> getAllPasien() {
        return pasien;
    }
    
    public List<Dokter> getAllDokter() {
        return dokter;
    }
    
    public List<Admin> getAllAdmin() {
        return admin;
    }

    public List<JanjiMedis> getAllJanjiMedis() {
        return janjiMedis;
    }
}
