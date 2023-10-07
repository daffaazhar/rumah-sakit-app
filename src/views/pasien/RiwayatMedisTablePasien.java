package views.pasien;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.Pasien;
import models.RiwayatMedis;
import services.FormatterService;
import views.MainFrame;

public class RiwayatMedisTablePasien extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private final Pasien pasien;
    private final DefaultTableModel tableModel;
    private boolean isRowSelected = false;
    
    public RiwayatMedisTablePasien(MainFrame mainFrame, Pasien pasien) {
        initComponents();
        this.mainFrame = mainFrame;
        this.pasien = pasien;
        this.tableModel = (DefaultTableModel) tableRiwayatMedis.getModel();
        
        if (pasien.getAllRiwayatMedis() != null) {
            updateTable();
        }
        
        tableRiwayatMedis.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isRowSelected = tableRiwayatMedis.getSelectedRow() != -1;
                }
            }
        });       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRiwayatMedis = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Daftar Riwayat Medis");

        tableRiwayatMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Tanggal", "Dokter", "Catatan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRiwayatMedis);
        if (tableRiwayatMedis.getColumnModel().getColumnCount() > 0) {
            tableRiwayatMedis.getColumnModel().getColumn(0).setMaxWidth(40);
            tableRiwayatMedis.getColumnModel().getColumn(1).setMinWidth(100);
            tableRiwayatMedis.getColumnModel().getColumn(1).setMaxWidth(100);
            tableRiwayatMedis.getColumnModel().getColumn(2).setMinWidth(100);
            tableRiwayatMedis.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formTitle)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new HomePasien(mainFrame, pasien));
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void updateTable() {
        this.tableModel.setRowCount(0);
        for (int i = 0; i < pasien.getJumlahRiwayatMedis(); i++) {
            RiwayatMedis riwayatMedis = pasien.getRiwayatMedis(i);
            String date = FormatterService.formatDate(riwayatMedis.getTanggal());
            
            tableModel.addRow(new Object[] {
                i + 1,
                date,
                riwayatMedis.getDokter().getNama(),
                riwayatMedis.getCatatan()
            });
        }
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel formTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRiwayatMedis;
    // End of variables declaration//GEN-END:variables
}
