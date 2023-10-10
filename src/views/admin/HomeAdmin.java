package views.admin;

import views.LoginView;
import views.MainFrame;

public class HomeAdmin extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    
    public HomeAdmin(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appTitle = new javax.swing.JLabel();
        btnDataDokter = new javax.swing.JButton();
        btnDataPasien = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        appTitle.setFont(new java.awt.Font("Inter ExtraBold", 0, 20)); // NOI18N
        appTitle.setText("Selamat Datang, Admin!");

        btnDataDokter.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        btnDataDokter.setText("Data Dokter");
        btnDataDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataDokterActionPerformed(evt);
            }
        });

        btnDataPasien.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        btnDataPasien.setText("Data Pasien");
        btnDataPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPasienActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDataDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(appTitle)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(appTitle)
                .addGap(28, 28, 28)
                .addComponent(btnDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDataDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataDokterActionPerformed
        mainFrame.showView(new DokterTable(mainFrame));
    }//GEN-LAST:event_btnDataDokterActionPerformed

    private void btnDataPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPasienActionPerformed
        mainFrame.showView(new PasienTable(mainFrame));
    }//GEN-LAST:event_btnDataPasienActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        mainFrame.showView(new LoginView(mainFrame));
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton btnDataDokter;
    private javax.swing.JButton btnDataPasien;
    private javax.swing.JButton btnLogout;
    // End of variables declaration//GEN-END:variables
}
