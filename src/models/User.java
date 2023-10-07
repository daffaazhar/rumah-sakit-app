package models;

import java.util.List;

public class User {
    private String username;
    private String password;
    private String nama;
    private String nomorTelepon;
    
    public User(String username, String password, String nama, String nomorTelepon) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }
    
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    public static String validateUsername(String username, List<User> users, int currentIndex) {
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
            if (i != currentIndex && username.equals(users.get(i).getUsername())) {
                return "Username '" + username + "' telah dipakai oleh pengguna lain!";
            }
        }
        return null;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
}
