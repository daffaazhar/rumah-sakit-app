package models;

import java.util.ArrayList;
import java.util.List;

public class Dokter extends User {
    private String spesialisasi;
    private final List<JanjiMedis> janjiMedis;
    private final List<JanjiMedis> riwayatJanjiMedis;
    
    public Dokter(String username, String password, String nama, 
            String nomorTelepon, String spesialisasi) {
        super(username, password, nama, nomorTelepon);
        this.spesialisasi = spesialisasi;
        this.janjiMedis = new ArrayList<>();
        this.riwayatJanjiMedis = new ArrayList<>();
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
    
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
    
     public JanjiMedis getJanjiMedis(int index) {
        return janjiMedis.get(index);
    }
    
    public int getJumlahJanjiMedis() {
        return janjiMedis.size();
    }
    
    public List<JanjiMedis> getAllJanjiMedis() {
        return janjiMedis;
    }
    
    public JanjiMedis getRiwayatJanjiMedis(int index) {
        return riwayatJanjiMedis.get(index);
    }
    
    public int getJumlahRiwayatJanjiMedis() {
        return riwayatJanjiMedis.size();
    }
    
    public List<JanjiMedis> getAllRiwayatJanjiMedis() {
        return riwayatJanjiMedis;
    }
}
