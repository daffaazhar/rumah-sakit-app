package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pasien extends User {    
    private String nomorRiwayatMedis;
    private List<RiwayatMedis> riwayatMedis;
    
    public Pasien(String username, String password, String nama, 
            String nomorTelepon) {
        super(username, password, nama, nomorTelepon);
        this.nomorRiwayatMedis = generateNomorRiwayatMedis();
        this.riwayatMedis = new ArrayList<>();
    }
    
    private String generateNomorRiwayatMedis() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int length = 8;
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }
        
        return sb.toString();
    }

    public String getNomorRiwayatMedis() {
        return nomorRiwayatMedis;
    }

    public void setNomorRiwayatMedis(String nomorRiwayatMedis) {
        this.nomorRiwayatMedis = nomorRiwayatMedis;
    }
    
    public int getJumlahRiwayatMedis() {
        return this.riwayatMedis.size();
    }
    
    public void tambahRiwayatMedis(RiwayatMedis riwayatMedis) {
        this.riwayatMedis.add(riwayatMedis);
    }
    
    public RiwayatMedis getRiwayatMedis(int index) {
        return this.riwayatMedis.get(index);
    }
    
    public List<RiwayatMedis> getAllRiwayatMedis() {
        return riwayatMedis;
    }

    public void setRiwayatMedis(List<RiwayatMedis> riwayatMedis) {
        this.riwayatMedis = riwayatMedis;
    }
}
