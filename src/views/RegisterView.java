package views;

import javax.swing.JOptionPane;
import services.DatabaseService;
import services.ValidationService;

public class RegisterView extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    
    public RegisterView(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        btnToLogin = new javax.swing.JButton();
        registerTitle = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        labelNomorTelepon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputNomorTelepon = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();

        btnToLogin.setText("Login");
        btnToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToLoginActionPerformed(evt);
            }
        });

        registerTitle.setFont(new java.awt.Font("Inter ExtraBold", 0, 20)); // NOI18N
        registerTitle.setText("Pendaftaran Pasien");

        labelNama.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNama.setText("Nama Lengkap");

        labelNomorTelepon.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNomorTelepon.setText("No. Telepon");

        jLabel1.setText("Sudah punya akun?");

        btnRegister.setText("Daftar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelUsername.setText("Username");

        labelPassword.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelPassword.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomorTelepon)
                                    .addComponent(labelNama))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputNama)
                                    .addComponent(inputNomorTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnToLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(registerTitle)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(registerTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomorTelepon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToLogin)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToLoginActionPerformed
        mainFrame.showView(new LoginView(mainFrame));
    }//GEN-LAST:event_btnToLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String username = this.inputUsername.getText();
        String password = this.inputPassword.getText();
        String nama = this.inputNama.getText();
        String nomorTelepon = this.inputNomorTelepon.getText();
        
        if (!nama.equals("") && !nomorTelepon.equals("") &&
            !username.equals("") && !password.equals("")) {
            String usernameErrorMessage = ValidationService.validateUsername(username);
            
            if (usernameErrorMessage != null) {
                JOptionPane.showMessageDialog(this, usernameErrorMessage);
                return;
            }
            
            DatabaseService.getRumahSakit().tambahPasien(username, password, nama, nomorTelepon);
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!\nAnda dapat login.");
            clearTextField();
        } else {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data!");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed
    
    private void clearTextField() {
        inputNama.setText("");
        inputNomorTelepon.setText("");
        inputUsername.setText("");
        inputPassword.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnToLogin;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNomorTelepon;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNomorTelepon;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel registerTitle;
    // End of variables declaration//GEN-END:variables
}
