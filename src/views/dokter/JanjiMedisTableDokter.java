package views.dokter;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.Dokter;
import models.JanjiMedis;
import models.Pasien;
import services.DatabaseService;
import services.FormatterService;
import views.MainFrame;

public class JanjiMedisTableDokter extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private final Dokter dokter;
    private final DefaultTableModel tableModel;
    private boolean isRowSelected = false;

    public JanjiMedisTableDokter(MainFrame mainFrame, Dokter dokter) {
        initComponents();
        this.mainFrame = mainFrame;
        this.dokter = dokter;
        this.tableModel = (DefaultTableModel) tableJanjiMedis.getModel();

        if (dokter.getAllJanjiMedis()!= null) {
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
        btnTambahJanjiMedis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJanjiMedis = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnTutupJanjiMedis = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        btnDetail = new javax.swing.JButton();

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Jadwal Janji Medis");

        btnTambahJanjiMedis.setText("Tambah Jadwal");
        btnTambahJanjiMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahJanjiMedisActionPerformed(evt);
            }
        });

        tableJanjiMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableJanjiMedis);
        if (tableJanjiMedis.getColumnModel().getColumnCount() > 0) {
            tableJanjiMedis.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnTutupJanjiMedis.setText("Tutup Jadwal");
        btnTutupJanjiMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupJanjiMedisActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelUsername.setText("Tanggal");

        btnCancel.setText("Batal");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        inputTanggal.setDateFormatString("dd-MM-yyyy");

        btnDetail.setText("Lihat Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDetail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTambahJanjiMedis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTutupJanjiMedis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUsername)
                                .addGap(18, 18, 18)
                                .addComponent(inputTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formTitle)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsername)
                    .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahJanjiMedis)
                    .addComponent(btnTutupJanjiMedis)
                    .addComponent(btnCancel)
                    .addComponent(btnDetail))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahJanjiMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahJanjiMedisActionPerformed
        Date tanggal = inputTanggal.getDate();
        Date today = new Date();

        if (tanggal == null) {
            JOptionPane.showMessageDialog(this, "Mohon pilih tanggal!");
            return;
        }

        if (tanggal.compareTo(today) < 0) {
            JOptionPane.showMessageDialog(this, "Tanggal yang dipilih tidak boleh sebelum hari ini!");
            return;
        } else {
            DatabaseService.getRumahSakit().tambahJanjiMedis(tanggal, dokter);
            JOptionPane.showMessageDialog(this, "Berhasil membuat janji medis!");

            updateTable();
            inputTanggal.setCalendar(null);
        }

        inputTanggal.setCalendar(null);
    }//GEN-LAST:event_btnTambahJanjiMedisActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new HomeDokter(mainFrame, dokter));
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTutupJanjiMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupJanjiMedisActionPerformed
        if (isRowSelected) {
            int selectedRow = tableJanjiMedis.getSelectedRow();
            JanjiMedis selectedJanjiMedis = dokter.getJanjiMedis(selectedRow);
            
            boolean hasUntreatedPasien = false;
            for (Pasien pasien : selectedJanjiMedis.getAllPasien()) {
                if ("Belum Ditangani".equals(selectedJanjiMedis.getPasienStatus(pasien))) {
                    hasUntreatedPasien = true;
                    break;
                }
            }
            
            if(!hasUntreatedPasien) {
                DatabaseService.getRumahSakit().tutupJanjiMedis(selectedJanjiMedis);
                JOptionPane.showMessageDialog(this, "Jadwal janji medis berhasil ditutup!");
            } else {
                JOptionPane.showMessageDialog(this, "Tidak dapat menutup jadwal janji medis!\nMasih ada pasien yang belum ditangani.");
            }
            
            updateTable();
            inputTanggal.setCalendar(null);
        } else {
            if (tableJanjiMedis.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this,
                        "Data masih kosong!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Pilih data yang ingin dihapus terlebih dahulu!");
            }
        }
        updateButtonVisibility();
    }//GEN-LAST:event_btnTutupJanjiMedisActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        updateButtonVisibility();
        tableJanjiMedis.getSelectionModel().clearSelection();
        inputTanggal.setCalendar(null);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        int selectedRow = tableJanjiMedis.getSelectedRow();
        mainFrame.showView(new DetailJanjiMedisDokter(mainFrame, dokter, dokter.getJanjiMedis(selectedRow)));
    }//GEN-LAST:event_btnDetailActionPerformed

    private void updateTable() {
        this.tableModel.setRowCount(0);

        for (int i = 0; i < dokter.getAllJanjiMedis().size(); i++) {
            JanjiMedis janjiMedis = dokter.getJanjiMedis(i);
            
            if(janjiMedis.getIsActive() == true) {
                String date = FormatterService.formatDate(janjiMedis.getTanggal());

                tableModel.addRow(new Object[]{
                    i + 1,
                    date
                });
            }
        }
    }

    private void updateButtonVisibility() {
        this.isRowSelected = tableJanjiMedis.getSelectedRow() != -1;

        if (isRowSelected) {
            btnTambahJanjiMedis.setVisible(false);
            btnTutupJanjiMedis.setVisible(true);
            btnCancel.setVisible(true);
            btnDetail.setVisible(true);
        } else {
            btnTambahJanjiMedis.setVisible(true);
            btnTutupJanjiMedis.setVisible(false);
            btnCancel.setVisible(false);
            btnDetail.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnTambahJanjiMedis;
    private javax.swing.JButton btnTutupJanjiMedis;
    private javax.swing.JLabel formTitle;
    private com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTable tableJanjiMedis;
    // End of variables declaration//GEN-END:variables
}
