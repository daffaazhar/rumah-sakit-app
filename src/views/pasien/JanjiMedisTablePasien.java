package views.pasien;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.JanjiMedis;
import models.Pasien;
import models.RumahSakit;
import services.*;
import views.MainFrame;

public class JanjiMedisTablePasien extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private final RumahSakit rumahSakit;
    private final Pasien pasien;
    private final DefaultTableModel tableModel;
    private boolean isRowSelected = false;

    public JanjiMedisTablePasien(MainFrame mainFrame, Pasien pasien) {
        initComponents();
        this.mainFrame = mainFrame;
        this.rumahSakit = DatabaseService.getRumahSakit();
        this.pasien = pasien;
        this.tableModel = (DefaultTableModel) tableJanjiMedis.getModel();

        if (rumahSakit.getAllJanjiMedis() != null) {
            updateTable();
        }

        tableJanjiMedis.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isRowSelected = tableJanjiMedis.getSelectedRow() != -1;
                    updateButtonVisibility();
                }
            }
        });
        updateButtonVisibility();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJanjiMedis = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JButton();

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Daftar Janji Medis");

        tableJanjiMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Dokter", "Spesialis", "Tanggal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableJanjiMedis);
        if (tableJanjiMedis.getColumnModel().getColumnCount() > 0) {
            tableJanjiMedis.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Pilih janji medis yang tersedia berikut:");

        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(formTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnDaftar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new HomePasien(mainFrame, pasien));
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        int selectedRow = tableJanjiMedis.getSelectedRow();
        rumahSakit.getJanjiMedis(selectedRow).tambahPasien(pasien);
        JOptionPane.showMessageDialog(this, "Pendaftaran janji medis berhasil!");
        updateTable();
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void updateTable() {
        this.tableModel.setRowCount(0);
        for (int i = 0; i < rumahSakit.getJumlahJanjiMedis(); i++) {
            JanjiMedis janjiMedis = rumahSakit.getJanjiMedis(i);
            boolean isRegistered = janjiMedis.isPasienRegistered(this.pasien);
            String status = isRegistered ? "Sudah Terdaftar" : "Tidak Terdaftar";

            String date = FormatterService.formatDate(janjiMedis.getTanggal());
            tableModel.addRow(new Object[]{
                i + 1,
                janjiMedis.getDokter().getNama(),
                janjiMedis.getDokter().getSpesialisasi(),
                date,
                status
            });
        }
    }

    private void updateButtonVisibility() {
        this.isRowSelected = tableJanjiMedis.getSelectedRow() != -1;

        if (isRowSelected) {
            int selectedRow = tableJanjiMedis.getSelectedRow();
            JanjiMedis janjiMedis = rumahSakit.getJanjiMedis(selectedRow);
            boolean isRegistered = janjiMedis.isPasienRegistered(this.pasien);
            
            if(!isRegistered)
                btnDaftar.setEnabled(true);
        } else {
            btnDaftar.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableJanjiMedis;
    // End of variables declaration//GEN-END:variables
}
