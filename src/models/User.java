package models;

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
