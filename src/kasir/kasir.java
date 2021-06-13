package kasir;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import menu.menu;

public class kasir extends javax.swing.JFrame {
    String idKategori = null;
    String tampungIdTransaksi = null;
    int statTransaksi = 0;
    int statCetak = 0;

    
    ArrayList<String> idMeja = new ArrayList<String>();
    ArrayList<String> meja = new ArrayList<String>();
    ArrayList<String> idMenu = new ArrayList<String>();
    ArrayList<String> menu = new ArrayList<String>();
    
    int no = 0;
    
    public kasir() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        tampilkanMeja();
        tampilkanKategori();
        idTransaksi();
        
    }
    
    
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
        bayarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarTextActionPerformed(evt);
            }
        });
        bayarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bayarTextKeyTyped(evt);
            }
        });

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
        mejaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejaComboBoxActionPerformed(evt);
            }
        });
        mejaComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mejaComboBoxKeyPressed(evt);
            }
        });

        kategoriComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kategoriComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriComboBoxActionPerformed(evt);
            }
        });

        menuComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                    .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(judulPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daftarSroll, javax.swing.GroupLayout.Alignment.LEADING))
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
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

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
        
        try{
            File file = new File("transaksi_"+tampungIdTransaksi+".txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("============================================================");
            bw.newLine(); 
            bw.write("                          TAGIHAN                           ");
            bw.newLine();
            bw.write("============================================================");
            bw.newLine();
            
            for(int i=0; i<daftarTable.getRowCount();i++){
                String menuTagihan = (String)daftarTable.getValueAt(i, 2);
                String hargaTagihan = (String)daftarTable.getValueAt(i, 4);
                String subtotalTagihan = (String)daftarTable.getValueAt(i, 5);
                String jumlahTagihan = (String)daftarTable.getValueAt(i, 3);

                bw.write(" " + jumlahTagihan + " " + menuTagihan + "\t\t\t" + "Rp" + hargaTagihan + "\t\t" + "Rp" + subtotalTagihan);
                bw.newLine();
            }
            
            bw.write("============================================================\n");
            bw.newLine();
            bw.write("\t\t\t\t" + "Total   :\t" + "Rp" + totalTagihan);
            bw.newLine();
            bw.write("\t\t\t\t" + "Bayar   :\t" + "Rp" + bayarTagihan);
            bw.newLine();
            bw.write("\t\t\t\t" + "Kembali :\t" + "Rp" + kembaliTagihan);
            bw.newLine();
            bw.write("============================================================");
            
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
     
    private void kategoriComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriComboBoxActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM tb_kategori"); 
            String pilihanKategori = kategoriComboBox.getSelectedItem().toString();
            while(rs.next()){
                if(pilihanKategori.equals(rs.getString(2))){
                    idKategori = rs.getString(1);
                }
            }
            cn.close();
        } catch (Exception ex) {
            Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        menuComboBox.removeAllItems();
        tampilkanMenu();
    }//GEN-LAST:event_kategoriComboBoxActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        int Jumlah = Integer.parseInt(jumlahSpinner.getValue().toString());
        if(Jumlah==0){
            JOptionPane.showMessageDialog(null, "Jumlah Menu Tidak Boleh 0","Peringatan", JOptionPane.ERROR_MESSAGE);
        }else{
            
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
            
            detailTransaksi();
            
            int sum = 0;
            for(int i=0;i<daftarTable.getRowCount();i++){
                sum = sum + Integer.parseInt(daftarTable.getValueAt(i, 5).toString());
            }
            totalText.setText(Integer.toString(sum));
            jumlahSpinner.setValue(0);
 
        }
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void mejaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejaComboBoxActionPerformed

    }//GEN-LAST:event_mejaComboBoxActionPerformed

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        String Bayar1 = bayarText.getText();
        String Total1 = totalText.getText();

        if(statCetak==1){
            JOptionPane.showMessageDialog(null, "Cetak tagihan hanya diperbolehkan sekali","Peringatan", JOptionPane.ERROR_MESSAGE);
        }else if(Total1.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Total tidak boleh kosong","Peringatan", JOptionPane.ERROR_MESSAGE);
        }else if(Bayar1.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Bayar tidak boleh kosong","Peringatan", JOptionPane.ERROR_MESSAGE);
        }else{
            int Bayar = Integer.parseInt(bayarText.getText());
            int Total = Integer.parseInt(totalText.getText());
            
            if(Bayar<Total){
                JOptionPane.showMessageDialog(null, "Bayar tidak boleh kurang dari total","Peringatan", JOptionPane.ERROR_MESSAGE);
            }else{
                bayar();
                tagihan();
                no=0;
                transaksi();
                statCetak=1;
                statTransaksi=0;
            }
        }     
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
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM tb_menu"); 
            rs.beforeFirst();
            String pilihanMenu = menuComboBox.getSelectedItem().toString();
            
            while(rs.next()){
                if(pilihanMenu.equals(rs.getString(4))){
                    kodeText.setText(rs.getString(3));
                    hargaText.setText(rs.getString(5));
                    int Jumlah = Integer.parseInt(jumlahSpinner.getValue().toString());
                    int Harga = Integer.parseInt(hargaText.getText());
        
                    int Subtotal = Jumlah*Harga;
        
                    subtotalText.setText(String.valueOf(Subtotal));
                }
            }
            cn.close();
        } catch (Exception ex) {
            //Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuComboBoxActionPerformed

    private void jumlahSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumlahSpinnerStateChanged
        int spinnerJumlah = Integer.parseInt(jumlahSpinner.getValue().toString());
        int spinnerHarga = Integer.parseInt(hargaText.getText());
        
        int spinnerSubtotal = spinnerJumlah*spinnerHarga;
        
        subtotalText.setText(String.valueOf(spinnerSubtotal));
    }//GEN-LAST:event_jumlahSpinnerStateChanged

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        
        if(statTransaksi==0){
            idTransaksi();
        }
        DefaultTableModel tableDaftar = (DefaultTableModel)daftarTable.getModel();
        tableDaftar.setRowCount(0);
        
        totalText.setText("");
        bayarText.setText("");
        kembaliText.setText("");
        tagihanText.setText("");
        statCetak=0;
        
    }//GEN-LAST:event_cButtonActionPerformed

    private void kembaliTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliTextActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void mejaComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mejaComboBoxKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mejaComboBoxKeyPressed

    private void bayarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarTextActionPerformed

    private void bayarTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(((Character.isDigit(c))) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE){
            
        }else{
            JOptionPane.showMessageDialog(this, "Input hanya angka");
            evt.consume();
        }
    }//GEN-LAST:event_bayarTextKeyTyped

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

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

    private void tampilkanMeja() {
       
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM tb_meja");
            int j=0;
            while(rs.next()){
                idMeja.add(rs.getString(1));
                meja.add(rs.getString(2));
                mejaComboBox.addItem(rs.getString(2));
            }
            cn.close();
        } catch (Exception ex) {
            Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Koneksi Ke Database MySql Tidak Berhasil","Peringatan tampilkanMeja()", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void tampilkanKategori() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM tb_kategori"); 
            while(rs.next()){
                kategoriComboBox.addItem(rs.getString(2));
            }
            rs.beforeFirst();
            String pilihanKategori = kategoriComboBox.getSelectedItem().toString();
            
            while(rs.next()){
                if(pilihanKategori.equals(rs.getString(2))){
                    idKategori = rs.getString(1);
                }
            }
            cn.close();
        } catch (Exception ex) {
            Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void tampilkanMenu() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM tb_menu"); 
            while(rs.next()){
                if(idKategori.equals(rs.getString(2))){
                    idMenu.add(rs.getString(1));
                    menu.add(rs.getString(4));
                    menuComboBox.addItem(rs.getString(4));
                }
            }
            rs.beforeFirst();
            String pilihanMenu = menuComboBox.getSelectedItem().toString();
            
            while(rs.next()){
                if(pilihanMenu.equals(rs.getString(4))){
                    kodeText.setText(rs.getString(3));
                    hargaText.setText(rs.getString(5));
                }
            }
            cn.close();
        } catch (Exception ex) {
            Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void idTransaksi(){
        String insertMeja = mejaComboBox.getSelectedItem().toString();
        int indeksMeja = meja.indexOf(insertMeja);
        int insertIDMeja = Integer.parseInt(idMeja.get(indeksMeja));
        int rowTransaksi = 0;
        
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
                PreparedStatement ps = cn.prepareStatement("insert into tb_transaksi (id_transaksi, id_meja, total, bayar, kembali, tanggal, status) values (?, ?, ?, ?, ?, ?, ?)");
                ps.setNull(1, Types.NULL);
                ps.setInt(2, insertIDMeja);
                ps.setNull(3, Types.NULL);
                ps.setNull(4, Types.NULL);
                ps.setNull(5, Types.NULL);
                ps.setNull(6, Types.NULL);
                ps.setString(7, "Belum Berhasil");
                ps.execute();
                cn.close();
                statTransaksi=1;
            } catch (Exception ex) {
                Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Koneksi Ke Database MySql Tidak Berhasil","Peringatan", JOptionPane.ERROR_MESSAGE);
            }
            
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
                ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM tb_transaksi"); 
                while(rs.next()){
                    tampungIdTransaksi = String.valueOf(rs.getInt(1)).toString();
                }
                cn.close();
            } catch (Exception ex) {
                Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Koneksi Ke Database MySql Tidak Berhasil","Peringatan", JOptionPane.ERROR_MESSAGE);
            }  
    }
    
    private void detailTransaksi(){
        int IDTransaksi = Integer.parseInt(tampungIdTransaksi);
        
        String menuString = menuComboBox.getSelectedItem().toString();
        int menuIndeks = menu.indexOf(menuString);
        int idmenu = Integer.parseInt(idMenu.get(menuIndeks));
        
        int jumlahMenu = Integer.parseInt(jumlahSpinner.getValue().toString());
     
        long subtotalMenu = Long.parseLong(subtotalText.getText());
        
        try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
                PreparedStatement ps = cn.prepareStatement("insert into tb_transaksidetail (id_transaksidetail, id_transaksi, id_menu, jumlah, subtotal) values (?, ?, ?, ?, ?)");
                ps.setNull(1, Types.NULL);
                ps.setInt(2, IDTransaksi);
                ps.setInt(3, idmenu);
                ps.setInt(4, jumlahMenu);
                ps.setLong(5, subtotalMenu);
                ps.execute();
                cn.close();
            } catch (Exception ex) {
                Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Koneksi Ke Database MySql Tidak Berhasil","Peringatan", JOptionPane.ERROR_MESSAGE);
            }
    }

    private void transaksi(){
        String insertMeja = mejaComboBox.getSelectedItem().toString();
        int indeksMeja = meja.indexOf(insertMeja);
        int insertIDMeja = Integer.parseInt(idMeja.get(indeksMeja));
        long totalLong = Long.parseLong(totalText.getText());
        long bayarLong = Long.parseLong(bayarText.getText());
        long kembaliLong = Long.parseLong(kembaliText.getText());
        int idtransaksiInt = Integer.parseInt(tampungIdTransaksi);
        try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_kasirrestoranswing", "root", "");
                PreparedStatement ps = cn.prepareStatement("update tb_transaksi set id_meja=?, total=?, bayar=?, kembali=?, tanggal=?, status=? where id_transaksi=?");
                ps.setInt(1, insertIDMeja);
                ps.setLong(2, totalLong);
                ps.setLong(3, bayarLong);
                ps.setLong(4, kembaliLong);
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); 
                Calendar kalender = Calendar.getInstance();  
                java.sql.Timestamp datetime = new java.sql.Timestamp(kalender.getTimeInMillis());
                ps.setTimestamp(5, datetime);
                ps.setString(6, "Berhasil");
                ps.setInt(7, idtransaksiInt); 
                ps.executeUpdate();
                cn.close();
            } catch (Exception ex) {
                Logger.getLogger(kasir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Koneksi Ke Database MySql Tidak Berhasil","Peringatan transaksi()", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    /*private void fileTransaksi(){
        try{
            String content = "This is the content to write into a file";
            File file = new File("transaksi"+tampungIdTransaksi+".txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }*/
    
}
