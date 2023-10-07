package views.admin;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.RumahSakit;
import services.DatabaseService;
import services.ValidationService;
import views.MainFrame;

public class DokterTable extends javax.swing.JPanel {

    private final MainFrame mainFrame;
    private final RumahSakit rumahSakit;
    private DefaultTableModel tableModel;
    private boolean isRowSelected = false;

    public DokterTable(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
        this.rumahSakit = DatabaseService.getRumahSakit();
        this.tableModel = (DefaultTableModel) tableDokter.getModel();
        this.tableModel.setRowCount(0);

        if (rumahSakit.getAllDokter() != null) {
            updateTable();
        }

        tableDokter.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isRowSelected = tableDokter.getSelectedRow() != -1;
                    updateButtonVisibility();
                }
            }
        });
        updateButtonVisibility();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNama = new javax.swing.JTextField();
        labelNomorTelepon = new javax.swing.JLabel();
        inputNomorTelepon = new javax.swing.JTextField();
        btnDokterAction = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDokter = new javax.swing.JTable();
        btnHapusDokter = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        formTitle = new javax.swing.JLabel();
        labelSpesialisasi = new javax.swing.JLabel();
        inputSpesialisasi = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        labelNomorTelepon.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNomorTelepon.setText("No. Telepon");

        btnDokterAction.setText("Tambah");
        btnDokterAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokterActionActionPerformed(evt);
            }
        });

        tableDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "No. Telepon", "Username", "Password", "Spesialisasi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDokter);
        if (tableDokter.getColumnModel().getColumnCount() > 0) {
            tableDokter.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnHapusDokter.setText("Hapus");
        btnHapusDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusDokterActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelUsername.setText("Username");

        labelPassword.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelPassword.setText("Password");

        btnCancel.setText("Batal");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNama.setText("Nama");

        formTitle.setFont(new java.awt.Font("Inter ExtraBold", 1, 20)); // NOI18N
        formTitle.setText("Data Dokter");

        labelSpesialisasi.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelSpesialisasi.setText("Spesialisasi");

        inputSpesialisasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Umum", "Penyakit Dalam", "Anak", "Saraf", "Kandungan dan Ginekologi", "Kulit dan Kelamin", "THT", "Mata", "Psikiater", "Gigi", " " }));

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
                .addGap(251, 251, 251)
                .addComponent(formTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername)
                            .addComponent(labelPassword)
                            .addComponent(labelNama)
                            .addComponent(labelNomorTelepon)
                            .addComponent(labelSpesialisasi))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNomorTelepon)
                            .addComponent(inputPassword)
                            .addComponent(inputUsername)
                            .addComponent(inputNama)
                            .addComponent(inputSpesialisasi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDokterAction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapusDokter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(formTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomorTelepon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSpesialisasi)
                    .addComponent(inputSpesialisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDokterAction)
                    .addComponent(btnHapusDokter)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDokterActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionActionPerformed
        String nama = inputNama.getText();
        String nomorTelepon = inputNomorTelepon.getText();
        String username = inputUsername.getText();
        String password = inputPassword.getText();
        String spesialisasi = inputSpesialisasi.getSelectedItem().toString();

        if (nama.equals("") && nomorTelepon.equals("")
                && username.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data!");
            return;
        }

        if (!isRowSelected && ValidationService.validateUsername(username) != null) {
            JOptionPane.showMessageDialog(this, ValidationService.validateUsername(username));
            return;
        }

        if (isRowSelected) {
            rumahSakit.updateDokter(tableDokter.getSelectedRow(),
                    username, password, nama, nomorTelepon, spesialisasi);
            JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
        } else {
            rumahSakit.tambahDokter(username, password, nama, nomorTelepon, spesialisasi);
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
        }

        updateTable();
        clearTextField();
    }//GEN-LAST:event_btnDokterActionActionPerformed

    private void btnHapusDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusDokterActionPerformed
        if (isRowSelected) {
            rumahSakit.hapusDokter(tableDokter.getSelectedRow());
            updateTable();
            clearTextField();
        } else {
            if (tableDokter.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Data masih kosong!");
            } else {
                JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus terlebih dahulu!");
            }
        }
        updateButtonVisibility();
    }//GEN-LAST:event_btnHapusDokterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        updateButtonVisibility();
        tableDokter.getSelectionModel().clearSelection();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new HomeAdmin(mainFrame));
    }//GEN-LAST:event_btnBackActionPerformed

    public void updateTable() {
        tableModel.setRowCount(0);

        for (int i = 0; i < rumahSakit.getJumlahDokter(); i++) {
            String nama = rumahSakit.getDokter(i).getNama();
            String nomorTelepon = rumahSakit.getDokter(i).getNomorTelepon();
            String username = rumahSakit.getDokter(i).getUsername();
            String password = rumahSakit.getDokter(i).getPassword();
            String spesialisasi = rumahSakit.getDokter(i).getSpesialisasi();

            tableModel.addRow(new Object[]{i + 1, nama, nomorTelepon, username,
                password, spesialisasi});
        }
    }

    private void updateButtonVisibility() {
        isRowSelected = tableDokter.getSelectedRow() != -1;

        if (isRowSelected) {
            int selectedRow = tableDokter.getSelectedRow();
            int dokterIndex = selectedRow;
            inputNama.setText(rumahSakit.getDokter(dokterIndex).getNama());
            inputNomorTelepon.setText(rumahSakit.getDokter(dokterIndex).getNomorTelepon());
            inputUsername.setText(rumahSakit.getDokter(dokterIndex).getUsername());
            inputUsername.setEnabled(false);
            inputPassword.setText(rumahSakit.getDokter(dokterIndex).getPassword());
            inputSpesialisasi.setSelectedItem(rumahSakit.getDokter(dokterIndex).getSpesialisasi());
            btnDokterAction.setText("Ubah");
            btnHapusDokter.setVisible(true);
            btnCancel.setVisible(true);
        } else {
            clearTextField();
            inputUsername.setEnabled(true);
            btnDokterAction.setText("Tambah");
            btnHapusDokter.setVisible(false);
            btnCancel.setVisible(false);
        }
    }

    private void clearTextField() {
        inputNama.setText("");
        inputNomorTelepon.setText("");
        inputUsername.setText("");
        inputPassword.setText("");
        inputSpesialisasi.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDokterAction;
    private javax.swing.JButton btnHapusDokter;
    private javax.swing.JLabel formTitle;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNomorTelepon;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JComboBox<String> inputSpesialisasi;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNomorTelepon;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSpesialisasi;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTable tableDokter;
    // End of variables declaration//GEN-END:variables
}
