package kasir;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import menu.menu;

public class kasir extends javax.swing.JFrame {

    String meja[] = {"Pilih Meja", "Meja 1", "Meja 2", "Meja 3", "Meja 4", "Meja 5", "Meja 6",
                     "Meja 7", "Meja 8", "Meja 9", "Meja 10", "Meja 11", "Meja 12"};
    
    String kategori[] = {"Pilih Kategori", "Nasi", "Ayam", "Burger", "Teh", "Kopi"};
    
    String menu[];
    
    int no = 0;
    
    public kasir() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        DefaultComboBoxModel modelMeja = new DefaultComboBoxModel(meja);
        mejaComboBox.setModel(modelMeja);
        
    }

    Connection koneksi;
    PreparedStatement pst;
    ResultSet rs;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utamaPanel = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        kodeLabel = new javax.swing.JLabel();
        jumlahLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        kodeText = new javax.swing.JTextField();
        hargaText = new javax.swing.JTextField();
        subtotalText = new javax.swing.JTextField();
        jumlahSpinner = new javax.swing.JSpinner();
        tambahButton = new javax.swing.JButton();
        cetakButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();
        outputPanel = new javax.swing.JPanel();
        bayarLabel = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        bayarText = new javax.swing.JTextField();
        kembaliLabel = new javax.swing.JLabel();
        kembaliText = new javax.swing.JTextField();
        panelComboBox = new javax.swing.JPanel();
        mejaComboBox = new javax.swing.JComboBox<>();
        kategoriComboBox = new javax.swing.JComboBox<>();
        menuComboBox = new javax.swing.JComboBox<>();
        daftarSroll = new javax.swing.JScrollPane();
        daftarTable = new javax.swing.JTable();
        tagihanScroll = new javax.swing.JScrollPane();
        tagihanText = new javax.swing.JTextArea();
        judulPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        utamaPanel.setBackground(new java.awt.Color(10, 4, 60));

        inputPanel.setBackground(new java.awt.Color(10, 4, 60));

        kodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        kodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kodeLabel.setText("Kode Menu");

        jumlahLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jumlahLabel.setForeground(new java.awt.Color(255, 255, 255));
        jumlahLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlahLabel.setText("Jumlah");

        hargaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hargaLabel.setForeground(new java.awt.Color(255, 255, 255));
        hargaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hargaLabel.setText("Harga");

        subtotalLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        subtotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtotalLabel.setText("Subtotal");

        kodeText.setEditable(false);
        kodeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kodeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTextActionPerformed(evt);
            }
        });
        kodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kodeTextKeyPressed(evt);
            }
        });

        hargaText.setEditable(false);
        hargaText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hargaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subtotalText.setEditable(false);
        subtotalText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtotalText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jumlahSpinner.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jumlahSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        jumlahSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumlahSpinnerStateChanged(evt);
            }
        });

        tambahButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tambahButton.setText("Tambahkan");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        cetakButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cetakButton.setText("Cetak Tagihan");
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });

        cButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        kembaliButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(kodeText)
                    .addComponent(kembaliButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cetakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(hargaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(hargaText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(subtotalText))))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeLabel)
                    .addComponent(jumlahLabel)
                    .addComponent(hargaLabel)
                    .addComponent(subtotalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subtotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jumlahSpinner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cetakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        outputPanel.setBackground(new java.awt.Color(128, 255, 219));

        bayarLabel.setBackground(new java.awt.Color(255, 255, 255));
        bayarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bayarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bayarLabel.setText("Bayar");

        totalText.setEditable(false);
        totalText.setBackground(new java.awt.Color(255, 255, 255));
        totalText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextActionPerformed(evt);
            }
        });

        totalLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("Total");

        bayarText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bayarText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        kembaliLabel.setBackground(new java.awt.Color(255, 255, 255));
        kembaliLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kembaliLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kembaliLabel.setText("Kembali");

        kembaliText.setEditable(false);
        kembaliText.setBackground(new java.awt.Color(255, 255, 255));
        kembaliText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kembaliText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kembaliText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalText)
                    .addComponent(bayarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(bayarText)
                    .addComponent(kembaliLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(kembaliText))
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bayarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bayarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembaliLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembaliText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelComboBox.setBackground(new java.awt.Color(10, 4, 60));

        mejaComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mejaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mejaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejaComboBoxActionPerformed(evt);
            }
        });

        kategoriComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kategoriComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori" }));
        kategoriComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriComboBoxActionPerformed(evt);
            }
        });

        menuComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu" }));
        menuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelComboBoxLayout = new javax.swing.GroupLayout(panelComboBox);
        panelComboBox.setLayout(panelComboBoxLayout);
        panelComboBoxLayout.setHorizontalGroup(
            panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mejaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kategoriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelComboBoxLayout.setVerticalGroup(
            panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mejaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategoriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        daftarSroll.setBackground(new java.awt.Color(255, 255, 255));
        daftarSroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        daftarTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daftarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode", "Menu", "Jumlah", "Harga", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        daftarSroll.setViewportView(daftarTable);
        if (daftarTable.getColumnModel().getColumnCount() > 0) {
            daftarTable.getColumnModel().getColumn(0).setResizable(false);
            daftarTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            daftarTable.getColumnModel().getColumn(1).setResizable(false);
            daftarTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            daftarTable.getColumnModel().getColumn(2).setResizable(false);
            daftarTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            daftarTable.getColumnModel().getColumn(3).setResizable(false);
            daftarTable.getColumnModel().getColumn(3).setPreferredWidth(40);
            daftarTable.getColumnModel().getColumn(4).setResizable(false);
            daftarTable.getColumnModel().getColumn(5).setResizable(false);
        }

        tagihanScroll.setBackground(new java.awt.Color(255, 255, 255));

        tagihanText.setEditable(false);
        tagihanText.setColumns(20);
        tagihanText.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tagihanText.setRows(5);
        tagihanScroll.setViewportView(tagihanText);

        judulPanel.setBackground(new java.awt.Color(255, 255, 255));

        judulLabel.setBackground(new java.awt.Color(255, 255, 255));
        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(10, 4, 60));
        judulLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulLabel.setText("PROGRAM KASIR RESTORAN");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout utamaPanelLayout = new javax.swing.GroupLayout(utamaPanel);
        utamaPanel.setLayout(utamaPanelLayout);
        utamaPanelLayout.setHorizontalGroup(
            utamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utamaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(utamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(daftarSroll)
                    .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(judulPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(utamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tagihanScroll))
                .addContainerGap())
        );
        utamaPanelLayout.setVerticalGroup(
            utamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utamaPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(utamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(utamaPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(judulPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(utamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(daftarSroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tagihanScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(utamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(utamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bayar(){
        int totalBayar = Integer.parseInt(totalText.getText());
        int bayarBayar = Integer.parseInt(bayarText.getText());
        
        int kembali = bayarBayar - totalBayar;
        
        kembaliText.setText(String.valueOf(kembali));
    }
    
    public void tagihan(){
        String totalTagihan = totalText.getText();
        String bayarTagihan = bayarText.getText();
        String kembaliTagihan = kembaliText.getText();
        
        DefaultTableModel tableDaftar = new DefaultTableModel();
        tableDaftar = (DefaultTableModel)daftarTable.getModel();
        
        tagihanText.setText(tagihanText.getText() + "============================================================\n");
        tagihanText.setText(tagihanText.getText() + "                          TAGIHAN                           \n");
        tagihanText.setText(tagihanText.getText() + "============================================================\n");
        
        tagihanText.setText(tagihanText.getText() + " Menu" + "\t\t\t\t" + "Harga" + "\t\t" + "Subtotal" + "\n");
        tagihanText.setText(tagihanText.getText() + "============================================================\n");
        for(int i=0; i<daftarTable.getRowCount();i++){
            String menuTagihan = (String)daftarTable.getValueAt(i, 2);
            String hargaTagihan = (String)daftarTable.getValueAt(i, 4);
            String subtotalTagihan = (String)daftarTable.getValueAt(i, 5);
            String jumlahTagihan = (String)daftarTable.getValueAt(i, 3);
            
            tagihanText.setText(tagihanText.getText() + " " + jumlahTagihan + " " + menuTagihan + "\t\t\t" + "Rp" + hargaTagihan + "\t\t" + "Rp" + subtotalTagihan + "\n");
        }
        tagihanText.setText(tagihanText.getText() + "============================================================\n");
        tagihanText.setText(tagihanText.getText() + "\t\t\t\t" + "Total   :\t" + "Rp" + totalTagihan + "\n");
        tagihanText.setText(tagihanText.getText() + "\t\t\t\t" + "Bayar   :\t" + "Rp" + bayarTagihan + "\n");
        tagihanText.setText(tagihanText.getText() + "\t\t\t\t" + "Kembali :\t" + "Rp" + kembaliTagihan + "\n");
        tagihanText.setText(tagihanText.getText() + "============================================================\n");
        
    }
     
    private void kategoriComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriComboBoxActionPerformed
        
        String kategoriModel = kategoriComboBox.getSelectedItem().toString();
        
        if(kategoriModel.equals(kategori[1])){
            menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu", "Nasi Goreng", "Nasi Kuning", "Nasi Putih"
            }));
        }else if(kategoriModel.equals(kategori[2])){
            menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu", "Ayam Goreng", "Ayam Geprek"
            }));
        }else if(kategoriModel.equals(kategori[3])){
            menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu", "Burger Keju", "Burger Sapi"
            }));
        }else if(kategoriModel.equals(kategori[4])){
            menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu", "Teh Manis", "Teh Tawar"
            }));
        }else if(kategoriModel.equals(kategori[5])){
            menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu", "Kopi Cappucino", "Kopi Latte"
            }));
        }
        
    }//GEN-LAST:event_kategoriComboBoxActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        no++;
        DefaultTableModel tableDaftar = new DefaultTableModel();
        
        tableDaftar = (DefaultTableModel)daftarTable.getModel();
        tableDaftar.addRow(new Object[]{
            no,
            kodeText.getText(),
            menuComboBox.getSelectedItem().toString(),
            jumlahSpinner.getValue().toString(),
            hargaText.getText(),
            subtotalText.getText()
        });

        int sum = 0;
        
        for(int i=0;i<daftarTable.getRowCount();i++){
            sum = sum + Integer.parseInt(daftarTable.getValueAt(i, 5).toString());
        }
        
        totalText.setText(Integer.toString(sum));
        
        DefaultComboBoxModel modelKategori = new DefaultComboBoxModel(kategori);
        kategoriComboBox.setModel(modelKategori);
        menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu"
        }));
        kodeText.setText("");
        jumlahSpinner.setValue(0);
        hargaText.setText("");
        subtotalText.setText("");
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void mejaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejaComboBoxActionPerformed
        
        DefaultComboBoxModel modelKategori = new DefaultComboBoxModel(kategori);
        kategoriComboBox.setModel(modelKategori);
        menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu"
        }));
    }//GEN-LAST:event_mejaComboBoxActionPerformed

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed

        bayar();
        tagihan();
        
        no=0;
    }//GEN-LAST:event_cetakButtonActionPerformed

    private void totalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextActionPerformed

    private void kodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeTextActionPerformed

    private void kodeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeTextKeyPressed

    private void menuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComboBoxActionPerformed
        String comboBoxMenu = menuComboBox.getSelectedItem().toString();
        
        try {

                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
                pst = koneksi.prepareStatement("select * from tb_menu where menu = ?");
                pst.setString(1, comboBoxMenu);
                //System.out.println(pst);
                rs = pst.executeQuery();
                //System.out.println(rs);
                
                rs.next();
                String mKode = rs.getString("kode");
                String mHarga = rs.getString("harga");
                
                kodeText.setText(mKode.trim());
                hargaText.setText(mHarga.trim());
                
            }catch (SQLException ex) {
                Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }//GEN-LAST:event_menuComboBoxActionPerformed

    private void jumlahSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumlahSpinnerStateChanged
        int spinnerJumlah = Integer.parseInt(jumlahSpinner.getValue().toString());
        int spinnerHarga = Integer.parseInt(hargaText.getText());
        
        int spinnerSubtotal = spinnerJumlah*spinnerHarga;
        
        subtotalText.setText(String.valueOf(spinnerSubtotal));
    }//GEN-LAST:event_jumlahSpinnerStateChanged

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultComboBoxModel modelMeja = new DefaultComboBoxModel(meja);
        mejaComboBox.setModel(modelMeja);
        DefaultComboBoxModel modelKategori = new DefaultComboBoxModel(kategori);
        kategoriComboBox.setModel(modelKategori);
        menuComboBox.setModel(new DefaultComboBoxModel<> (new String[] {
                "Pilih Menu"
        }));
        DefaultTableModel tableDaftar = (DefaultTableModel)daftarTable.getModel();
        tableDaftar.setRowCount(0);
        
        totalText.setText("");
        bayarText.setText("");
        kembaliText.setText("");
        tagihanText.setText("");
        
    }//GEN-LAST:event_cButtonActionPerformed

    private void kembaliTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliTextActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_kembaliButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bayarLabel;
    private javax.swing.JTextField bayarText;
    private javax.swing.JButton cButton;
    private javax.swing.JButton cetakButton;
    private javax.swing.JScrollPane daftarSroll;
    private javax.swing.JTable daftarTable;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaText;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JSpinner jumlahSpinner;
    private javax.swing.JComboBox<String> kategoriComboBox;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JLabel kembaliLabel;
    private javax.swing.JTextField kembaliText;
    private javax.swing.JLabel kodeLabel;
    private javax.swing.JTextField kodeText;
    private javax.swing.JComboBox<String> mejaComboBox;
    private javax.swing.JComboBox<String> menuComboBox;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JPanel panelComboBox;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JTextField subtotalText;
    private javax.swing.JScrollPane tagihanScroll;
    private javax.swing.JTextArea tagihanText;
    private javax.swing.JButton tambahButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalText;
    private javax.swing.JPanel utamaPanel;
    // End of variables declaration//GEN-END:variables
}
