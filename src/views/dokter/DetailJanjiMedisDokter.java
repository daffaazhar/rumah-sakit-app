package views.dokter;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.Dokter;
import models.JanjiMedis;
import models.Pasien;
import models.RiwayatMedis;
import services.FormatterService;
import views.MainFrame;

public class DetailJanjiMedisDokter extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private final Dokter dokter;
    private final JanjiMedis janjiMedis;
    private final DefaultTableModel tableModel;
    private boolean isRowSelected = false;

    public DetailJanjiMedisDokter(MainFrame mainFrame, Dokter dokter, JanjiMedis janjiMedis) {
        initComponents();
        this.mainFrame = mainFrame;
        this.dokter = dokter;
        this.janjiMedis = janjiMedis;
        this.tableModel = (DefaultTableModel) tableAntrianJanjiMedis.getModel();
        this.valueTanggal.setText(": " + FormatterService.formatDate(janjiMedis.getTanggal()));
        this.valueJumlahPasien.setText(": " + janjiMedis.getAllPasien().size());

        if (janjiMedis.getAllPasien() != null) {
            updateTable();
        }
        
        tableAntrianJanjiMedis.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isRowSelected = tableAntrianJanjiMedis.getSelectedRow() != -1;
                    updateButtonVisibility();
                }
            }
        });
        updateButtonVisibility();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTanganiPasien = new javax.swing.JButton();
        formTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAntrianJanjiMedis = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        labelTanggal = new javax.swing.JLabel();
        valueTanggal = new javax.swing.JLabel();
        labelJumlahPasien = new javax.swing.JLabel();
        valueJumlahPasien = new javax.swing.JLabel();

        jLabel1.setText("Pilih pasien yang tersedia berikut:");

        btnTanganiPasien.setText("Tangani");
        btnTanganiPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanganiPasienActionPerformed(evt);
            }
        });

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Detail Janji Medis");

        tableAntrianJanjiMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Pasien", "No. Riwayat Medis", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAntrianJanjiMedis);
        if (tableAntrianJanjiMedis.getColumnModel().getColumnCount() > 0) {
            tableAntrianJanjiMedis.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelTanggal.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelTanggal.setText("Tanggal");

        valueTanggal.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueTanggal.setText(": jLabel3");

        labelJumlahPasien.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelJumlahPasien.setText("Jumlah Pasien");

        valueJumlahPasien.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        valueJumlahPasien.setText(": jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTanganiPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelJumlahPasien)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueJumlahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTanggal)
                                        .addGap(55, 55, 55)
                                        .addComponent(valueTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(formTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(formTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTanggal)
                    .addComponent(valueTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJumlahPasien)
                    .addComponent(valueJumlahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnTanganiPasien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTanganiPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanganiPasienActionPerformed
        String input = JOptionPane.showInputDialog(this,
            "Masukkan catatan medis:");
        
        if (input != null) {
            RiwayatMedis riwayatMedis = new RiwayatMedis(janjiMedis.getTanggal(), this.dokter, input);
            int selectedRow = tableAntrianJanjiMedis.getSelectedRow();
            Pasien pasien = janjiMedis.getPasien(selectedRow);
            
            pasien.tambahRiwayatMedis(riwayatMedis);
            janjiMedis.setPasienStatus(pasien, "Sudah Ditangani");
            JOptionPane.showMessageDialog(this, "Berhasil mencatat riwayat medis!");
        } else {
            JOptionPane.showMessageDialog(this, "Catatan medis tidak valid!");
        }
        
        updateTable();
        tableAntrianJanjiMedis.getSelectionModel().clearSelection();
    }//GEN-LAST:event_btnTanganiPasienActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new JanjiMedisTableDokter(mainFrame, dokter));
    }//GEN-LAST:event_btnBackActionPerformed

    private void updateTable() {
        this.tableModel.setRowCount(0);
        
        for (int i = 0; i < janjiMedis.getJumlahPasien(); i++) {
            Pasien pasien = janjiMedis.getPasien(i);
            String nama = pasien.getNama();
            String nomorRiwayatMedis = pasien.getNomorRiwayatMedis();
            String status = janjiMedis.getPasienStatus(pasien);

            tableModel.addRow(new Object[]{i + 1, nama, nomorRiwayatMedis, status});
        }
    }
    
    private void updateButtonVisibility() {
        isRowSelected = tableAntrianJanjiMedis.getSelectedRow() != -1;
        
        if (isRowSelected) {
            int selectedRow = tableAntrianJanjiMedis.getSelectedRow();
            Pasien pasien = janjiMedis.getPasien(selectedRow);
            String status = janjiMedis.getPasienStatus(pasien);
            
            if (status == "Belum Ditangani")
                btnTanganiPasien.setEnabled(true);
        } else {
            btnTanganiPasien.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTanganiPasien;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelJumlahPasien;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JTable tableAntrianJanjiMedis;
    private javax.swing.JLabel valueJumlahPasien;
    private javax.swing.JLabel valueTanggal;
    // End of variables declaration//GEN-END:variables
}
