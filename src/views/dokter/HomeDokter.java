package views.dokter;

import models.Dokter;
import views.MainFrame;
import views.LoginView;

public class HomeDokter extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private Dokter dokter;

    public HomeDokter(MainFrame mainFrame, Dokter dokter) {
        initComponents();
        this.mainFrame = mainFrame;
        this.dokter = dokter;
        valueNamaLengkap.setText(": " + dokter.getNama());
        valueNomorTelepon.setText(": " + dokter.getNomorTelepon());
        valueSpesialisasi.setText(": "+ dokter.getSpesialisasi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSpesialisasi = new javax.swing.JLabel();
        btnRiwayatJanjiMedis = new javax.swing.JButton();
        valueSpesialisasi = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        formTitle = new javax.swing.JLabel();
        labelNamaLengkap = new javax.swing.JLabel();
        valueNamaLengkap = new javax.swing.JLabel();
        labelNomorTelepon = new javax.swing.JLabel();
        valueNomorTelepon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnJadwalJanjiMedis = new javax.swing.JButton();

        labelSpesialisasi.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelSpesialisasi.setText("Spesialisasi");

        btnRiwayatJanjiMedis.setText("Riwayat Janji Medis");
        btnRiwayatJanjiMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatJanjiMedisActionPerformed(evt);
            }
        });

        valueSpesialisasi.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueSpesialisasi.setText(": jLabel3");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Informasi Dokter");

        labelNamaLengkap.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNamaLengkap.setText("Nama Lengkap");

        valueNamaLengkap.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueNamaLengkap.setText(": jLabel3");

        labelNomorTelepon.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNomorTelepon.setText("Nomor Telepon");

        valueNomorTelepon.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueNomorTelepon.setText(": jLabel3");

        jLabel1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel1.setText("Silakan pilih menu berikut");

        btnJadwalJanjiMedis.setText("Jadwal Janji Medis");
        btnJadwalJanjiMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalJanjiMedisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnJadwalJanjiMedis, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(btnRiwayatJanjiMedis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelSpesialisasi)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNamaLengkap)
                                    .addComponent(labelNomorTelepon))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valueSpesialisasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valueNomorTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valueNamaLengkap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(formTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(labelSpesialisasi)
                    .addComponent(valueSpesialisasi))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(btnJadwalJanjiMedis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRiwayatJanjiMedis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRiwayatJanjiMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatJanjiMedisActionPerformed
        mainFrame.showView(new RiwayatJanjiMedisTableDokter(mainFrame, dokter));
    }//GEN-LAST:event_btnRiwayatJanjiMedisActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        mainFrame.showView(new LoginView(mainFrame));
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnJadwalJanjiMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalJanjiMedisActionPerformed
        mainFrame.showView(new JanjiMedisTableDokter(mainFrame, dokter));
    }//GEN-LAST:event_btnJadwalJanjiMedisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJadwalJanjiMedis;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRiwayatJanjiMedis;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelNamaLengkap;
    private javax.swing.JLabel labelNomorTelepon;
    private javax.swing.JLabel labelSpesialisasi;
    private javax.swing.JLabel valueNamaLengkap;
    private javax.swing.JLabel valueNomorTelepon;
    private javax.swing.JLabel valueSpesialisasi;
    // End of variables declaration//GEN-END:variables
}
