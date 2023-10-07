package views;

import views.admin.PasienTable;
import javax.swing.JOptionPane;
import models.*;
import services.DatabaseService;
import views.admin.HomeAdmin;
import views.dokter.HomeDokter;
import views.pasien.HomePasien;

public class LoginView extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private final RumahSakit rumahSakit;
    
    public LoginView(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.rumahSakit = DatabaseService.getRumahSakit();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnToRegisterView = new javax.swing.JButton();
        loginTitle = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnToRegisterView.setText("Daftar");
        btnToRegisterView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToRegisterViewActionPerformed(evt);
            }
        });

        loginTitle.setFont(new java.awt.Font("Inter ExtraBold", 0, 20)); // NOI18N
        loginTitle.setText("Login");

        labelUsername.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelUsername.setText("Username");

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jLabel2.setText("Password");

        jLabel1.setText("Belum punya akun?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(loginTitle)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelUsername)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputUsername)
                            .addComponent(inputPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnToRegisterView)
                        .addGap(89, 89, 89)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToRegisterView)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = this.inputUsername.getText();
        String password = this.inputPassword.getText();
        
        User user = getUserByUsername(username);
        
        if(user != null && user.login(username, password)) {
            if(user instanceof Dokter) {
                mainFrame.showView(new HomeDokter(mainFrame, (Dokter) user));
            } else if(user instanceof Pasien) {
                mainFrame.showView(new HomePasien(mainFrame, (Pasien) user));
            } else if(user instanceof Admin) {
                mainFrame.showView(new HomeAdmin(mainFrame));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Username atau password salah!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnToRegisterViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToRegisterViewActionPerformed
        mainFrame.showView(new RegisterView(mainFrame));
    }//GEN-LAST:event_btnToRegisterViewActionPerformed
    
    public User getUserByUsername(String username) {
        for (User user : rumahSakit.getAllPasien()) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        
        for (User user : rumahSakit.getAllDokter()) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        
        for (User user : rumahSakit.getAllAdmin()) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnToRegisterView;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel loginTitle;
    // End of variables declaration//GEN-END:variables
}
