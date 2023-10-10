package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JanjiMedis {
    private Date tanggal;   
    private final Dokter dokter;
    private final List<Pasien> pasien;
    private final Map<Pasien, String> pasienStatus;
    private boolean isActive;

    public JanjiMedis(Date tanggal, Dokter dokter) {
        this.tanggal = tanggal;
        this.dokter = dokter;
        this.pasien = new ArrayList<>();
        this.pasienStatus = new HashMap<>();
        this.isActive = true;
    }
    
    public boolean isPasienRegistered(Pasien pasien) {
        return this.pasien.contains(pasien);
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    public Dokter getDokter() {
        return dokter;
    }
    
    public void tambahPasien(Pasien pasien) {
        this.pasien.add(pasien);
        this.pasienStatus.put(pasien, "Belum Ditangani");
    }
    
    public Pasien getPasien(int index) {
        return pasien.get(index);
    }
    
    public int getJumlahPasien() {
        return pasien.size();
    }
    
    public List<Pasien> getAllPasien() {
        return pasien;
    }
    
    public String getPasienStatus(Pasien pasien) {
        return pasienStatus.get(pasien);
    }
    
    public void setPasienStatus(Pasien pasien, String status) {
        if (pasienStatus.containsKey(pasien)) {
            pasienStatus.put(pasien, status);
        }
    }
    
    public void setIsActive(boolean status) {
        this.isActive = status;
    }
    
    public boolean getIsActive() {
        return this.isActive;
    }
}
