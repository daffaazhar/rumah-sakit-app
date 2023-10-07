package views.pasien;

import views.MainFrame;
import models.Pasien;
import views.LoginView;

public class HomePasien extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private Pasien pasien;
    
    public HomePasien(MainFrame mainFrame, Pasien pasien) {
        initComponents();
        this.pasien = pasien;
        this.mainFrame = mainFrame;
        valueNamaLengkap.setText(": " + pasien.getNama());
        valueNomorTelepon.setText(": " + pasien.getNomorTelepon());
        valueNomorRiwayatMedis.setText(": "+ pasien.getNomorRiwayatMedis());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueNamaLengkap = new javax.swing.JLabel();
        labelNomorTelepon = new javax.swing.JLabel();
        valueNomorTelepon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDaftarJanjiMedis = new javax.swing.JButton();
        btnRiwayatMedis = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        formTitle = new javax.swing.JLabel();
        labelNamaLengkap = new javax.swing.JLabel();
        labelNomorRiwayatMedis = new javax.swing.JLabel();
        valueNomorRiwayatMedis = new javax.swing.JLabel();

        valueNamaLengkap.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueNamaLengkap.setText(": jLabel3");

        labelNomorTelepon.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNomorTelepon.setText("Nomor Telepon");

        valueNomorTelepon.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueNomorTelepon.setText(": jLabel3");

        jLabel1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel1.setText("Silakan pilih menu berikut");

        btnDaftarJanjiMedis.setText("Daftar Janji Medis");
        btnDaftarJanjiMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarJanjiMedisActionPerformed(evt);
            }
        });

        btnRiwayatMedis.setText("Riwayat Medis");
        btnRiwayatMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatMedisActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Informasi Pasien");

        labelNamaLengkap.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNamaLengkap.setText("Nama Lengkap");

        labelNomorRiwayatMedis.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNomorRiwayatMedis.setText("Nomor Riwayat Medis");

        valueNomorRiwayatMedis.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueNomorRiwayatMedis.setText(": jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(formTitle)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNamaLengkap)
                                .addComponent(labelNomorTelepon)
                                .addComponent(jLabel1)
                                .addComponent(btnDaftarJanjiMedis, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addComponent(btnRiwayatMedis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomorRiwayatMedis)
                                .addGap(14, 14, 14)
                                .addComponent(valueNomorRiwayatMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valueNamaLengkap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueNomorTelepon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaLengkap)
                    .addComponent(valueNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomorTelepon)
                    .addComponent(valueNomorTelepon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomorRiwayatMedis)
                    .addComponent(valueNomorRiwayatMedis))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(btnDaftarJanjiMedis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRiwayatMedis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarJanjiMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarJanjiMedisActionPerformed
        mainFrame.showView(new JanjiMedisTablePasien(mainFrame, pasien));
    }//GEN-LAST:event_btnDaftarJanjiMedisActionPerformed

    private void btnRiwayatMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatMedisActionPerformed
        mainFrame.showView(new RiwayatMedisTablePasien(mainFrame, pasien));
    }//GEN-LAST:event_btnRiwayatMedisActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        mainFrame.showView(new LoginView(mainFrame));
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftarJanjiMedis;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRiwayatMedis;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelNamaLengkap;
    private javax.swing.JLabel labelNomorRiwayatMedis;
    private javax.swing.JLabel labelNomorTelepon;
    private javax.swing.JLabel valueNamaLengkap;
    private javax.swing.JLabel valueNomorRiwayatMedis;
    private javax.swing.JLabel valueNomorTelepon;
    // End of variables declaration//GEN-END:variables
}
