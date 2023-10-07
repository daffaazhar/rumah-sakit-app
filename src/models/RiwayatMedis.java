package models;

import java.util.Date;

public class RiwayatMedis {
    private Date tanggal;
    private Dokter dokter;
    private String catatan;

    public RiwayatMedis(Date tanggal, Dokter dokter, String catatan) {
        this.tanggal = tanggal;
        this.dokter = dokter;
        this.catatan = catatan;
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

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }    
}
