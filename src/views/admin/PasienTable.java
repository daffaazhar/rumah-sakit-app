package views.admin;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import services.DatabaseService;
import services.ValidationService;
import views.MainFrame;

public class PasienTable extends javax.swing.JPanel {
    private final MainFrame mainFrame;
    private DefaultTableModel tableModel;
    private boolean isRowSelected = false;

    public PasienTable(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
        this.tableModel = (DefaultTableModel) tablePasien.getModel();

        if (DatabaseService.getRumahSakit().getAllPasien() != null) {
            updateTable();
        }

        tablePasien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    isRowSelected = tablePasien.getSelectedRow() != -1;
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
        btnBack = new javax.swing.JButton();
        labelNomorTelepon = new javax.swing.JLabel();
        inputNomorTelepon = new javax.swing.JTextField();
        btnPasienAction = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePasien = new javax.swing.JTable();
        btnHapusPasien = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        formTitle = new javax.swing.JLabel();

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelNomorTelepon.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        labelNomorTelepon.setText("No. Telepon");

        btnPasienAction.setText("Tambah");
        btnPasienAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionActionPerformed(evt);
            }
        });

        tablePasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "No. Telepon", "Username", "Password", "No. Riwayat Medis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePasien);
        if (tablePasien.getColumnModel().getColumnCount() > 0) {
            tablePasien.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnHapusPasien.setText("Hapus");
        btnHapusPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPasienActionPerformed(evt);
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
        formTitle.setText("Data Pasien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername)
                            .addComponent(labelPassword)
                            .addComponent(labelNama)
                            .addComponent(labelNomorTelepon))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNomorTelepon)
                            .addComponent(inputPassword)
                            .addComponent(inputUsername)
                            .addComponent(inputNama)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPasienAction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapusPasien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formTitle)
                .addGap(252, 252, 252))
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPasienAction)
                    .addComponent(btnHapusPasien)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainFrame.showView(new HomeAdmin(mainFrame));
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPasienActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionActionPerformed
        String nama = inputNama.getText();
        String nomorTelepon = inputNomorTelepon.getText();
        String username = inputUsername.getText();
        String password = inputPassword.getText();

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
            DatabaseService.getRumahSakit().updatePasien(tablePasien.getSelectedRow(),
                    username, password, nama, nomorTelepon);
            JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
        } else {
            DatabaseService.getRumahSakit().tambahPasien(username, password, nama, nomorTelepon);
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
        }

        updateTable();
        clearTextField();
    }//GEN-LAST:event_btnPasienActionActionPerformed

    private void btnHapusPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPasienActionPerformed
        if (isRowSelected) {
            DatabaseService.getRumahSakit().hapusPasien(tablePasien.getSelectedRow());
            updateTable();
            clearTextField();
        } else {
            if (tablePasien.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this,
                        "Data masih kosong!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Pilih data yang ingin dihapus terlebih dahulu!");
            }
        }
        updateButtonVisibility();
    }//GEN-LAST:event_btnHapusPasienActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        updateButtonVisibility();
        tablePasien.getSelectionModel().clearSelection();
    }//GEN-LAST:event_btnCancelActionPerformed

    public void updateTable() {
        tableModel.setRowCount(0);

        for (int i = 0; i < DatabaseService.getRumahSakit().getJumlahPasien(); i++) {
            String nama = DatabaseService.getRumahSakit().getPasien(i).getNama();
            String nomorTelepon = DatabaseService.getRumahSakit().getPasien(i).getNomorTelepon();
            String username = DatabaseService.getRumahSakit().getPasien(i).getUsername();
            String password = DatabaseService.getRumahSakit().getPasien(i).getPassword();
            String nomorRiwayatMedis = DatabaseService.getRumahSakit().getPasien(i).getNomorRiwayatMedis();

            tableModel.addRow(new Object[]{i + 1, nama, nomorTelepon, username,
                password, nomorRiwayatMedis});
        }
    }

    private void updateButtonVisibility() {
        isRowSelected = tablePasien.getSelectedRow() != -1;

        if (isRowSelected) {
            int pasienIndex = tablePasien.getSelectedRow();
            inputNama.setText(DatabaseService.getRumahSakit().getPasien(pasienIndex).getNama());
            inputNomorTelepon.setText(DatabaseService.getRumahSakit().getPasien(pasienIndex).getNomorTelepon());
            inputUsername.setEditable(false);
            inputPassword.setText(DatabaseService.getRumahSakit().getPasien(pasienIndex).getPassword());
            btnPasienAction.setText("Ubah");
            btnHapusPasien.setVisible(true);
            btnCancel.setVisible(true);
        } else {
            clearTextField();
            btnPasienAction.setText("Tambah");
            btnHapusPasien.setVisible(false);
            btnCancel.setVisible(false);
        }
    }

    private void clearTextField() {
        inputNama.setText("");
        inputNomorTelepon.setText("");
        inputUsername.setText("");
        inputPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnHapusPasien;
    private javax.swing.JButton btnPasienAction;
    private javax.swing.JLabel formTitle;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNomorTelepon;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNomorTelepon;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTable tablePasien;
    // End of variables declaration//GEN-END:variables
}
