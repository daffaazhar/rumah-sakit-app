package views.dokter;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.Dokter;
import models.JanjiMedis;
import services.FormatterService;
import views.MainFrame;

public class RiwayatJanjiMedisTableDokter extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private final Dokter dokter;
    private final DefaultTableModel tableModel;
    private boolean isRowSelected = false;

    public RiwayatJanjiMedisTableDokter(MainFrame mainFrame, Dokter dokter) {
        initComponents();
        this.mainFrame = mainFrame;
        this.dokter = dokter;
        this.tableModel = (DefaultTableModel) tableRiwayatJanjiMedis.getModel();

        if (dokter.getAllRiwayatJanjiMedis() != null) {
            updateTable();
        }

        tableRiwayatJanjiMedis.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isRowSelected = tableRiwayatJanjiMedis.getSelectedRow() != -1;
                    updateButtonVisibility();
                }
            }
        });
        updateButtonVisibility();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRiwayatJanjiMedis = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        formTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();

        tableRiwayatJanjiMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Tanggal", "Jumlah Pasien"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRiwayatJanjiMedis);
        if (tableRiwayatJanjiMedis.getColumnModel().getColumnCount() > 0) {
            tableRiwayatJanjiMedis.getColumnModel().getColumn(0).setMaxWidth(40);
            tableRiwayatJanjiMedis.getColumnModel().getColumn(2).setMinWidth(125);
            tableRiwayatJanjiMedis.getColumnModel().getColumn(2).setMaxWidth(125);
        }

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Riwayat Janji Medis");

        jLabel1.setText("Pilih riwayat janji medis yang tersedia berikut:");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formTitle)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(332, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new HomeDokter(mainFrame, dokter));
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        int selectedRow = tableRiwayatJanjiMedis.getSelectedRow();
        JanjiMedis riwayatJanjiMedis = dokter.getRiwayatJanjiMedis(selectedRow);
        mainFrame.showView(new DetailJanjiMedisDokter(mainFrame, dokter, riwayatJanjiMedis));
    }//GEN-LAST:event_btnDetailActionPerformed

    private void updateTable() {
        this.tableModel.setRowCount(0);

        for (int i = 0; i < dokter.getJumlahRiwayatJanjiMedis(); i++) {
            JanjiMedis janjiMedis = dokter.getRiwayatJanjiMedis(i);
            String date = FormatterService.formatDate(janjiMedis.getTanggal());

            tableModel.addRow(new Object[]{
                i + 1,
                date,
                janjiMedis.getJumlahPasien()
            });
        }
    }
    
    private void updateButtonVisibility() {
        isRowSelected = tableRiwayatJanjiMedis.getSelectedRow() != -1;
        
        if (isRowSelected) {
            btnDetail.setEnabled(true);
        } else {
            btnDetail.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetail;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRiwayatJanjiMedis;
    // End of variables declaration//GEN-END:variables
}
