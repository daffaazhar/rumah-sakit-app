package services;

import java.util.ArrayList;
import java.util.List;
import models.*;

public class ValidationService {    
    public static String validateUsername(String username) {
        List<Admin> admin = DatabaseService.getRumahSakit().getAllAdmin();
        List<Dokter> dokter = DatabaseService.getRumahSakit().getAllDokter();
        List<Pasien> pasien = DatabaseService.getRumahSakit().getAllPasien();
        List<User> users = new ArrayList<>();
        users.addAll(admin);
        users.addAll(dokter);
        users.addAll(pasien);
        
        // Validasi panjang username
        if (username.length() < 8) {
            return "Username harus memiliki minimal 8 karakter!";
        }
        // Validasi karakter yang diperbolehkan: huruf kecil, angka, dan underscore
        if (!username.matches("^[a-z0-9_]+$")) {
            return "Username hanya boleh terdiri dari huruf kecil, angka, dan underscore!";
        }
        // Validasi tidak mengandung spasi
        if (username.contains(" ")) {
            return "Username tidak boleh mengandung spasi!";
        }
        // Validasi username unik
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername()))
                return "Username '" + username + "' telah dipakai oleh pengguna lain!";
        }
        
        return null;
    }
}
