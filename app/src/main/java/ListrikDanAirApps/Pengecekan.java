/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ListrikDanAirApps;

import config.Confirm_isAccounting;
import config.Connection_db;
import config.See_Profile;
import dataTable.PengecekanNeeds.ModelProgres;
import dataTable.PengecekanNeeds.ControllerPengecekan;
import static dataTable.PengecekanNeeds.ControllerPengecekan.CekAll;
import static dataTable.PengecekanNeeds.ControllerPengecekan.ProsesCek;
import dataTable.PengecekanNeeds.ModelPengecekan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Pengecekan extends javax.swing.JFrame {
    //create objek controller
    ControllerPengecekan cek = new ControllerPengecekan();
    //create model proses
    ArrayList<ModelProgres> progresModel = ProsesCek();
    //create model pengecekan
    ArrayList<ModelPengecekan> cekModel = CekAll();
    //create object class login section
    App app;
    static private Connection conn = new Connection_db().Connect();
    java.sql.Statement stm = conn.createStatement();
    //create byte objek for photo 


    //get data form database and put in table model
    public Pengecekan()throws SQLException, ClassNotFoundException {
        initComponents();
        Toolkit kit = getToolkit();
        Dimension size = kit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_app.png")));
        
        //call show data in table pengecekan
        tablePengecekan.setModel(cek.showData());
        
        statusProgres();
        //focuse
        progres.requestFocus();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popAcc = new javax.swing.JPopupMenu();
        profile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        background = new javax.swing.JPanel();
        topBar = new javax.swing.JPanel();
        homeLogo = new javax.swing.JLabel();
        pengecekan = new javax.swing.JLabel();
        komplain = new javax.swing.JLabel();
        valid = new javax.swing.JLabel();
        biaya = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        komplain1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        statusPanelCek = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        createNewProgres = new javax.swing.JLabel();
        updateProgres = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        progres = new javax.swing.JTextArea();
        id_stafCek = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        id_monthly = new javax.swing.JTextField();
        no_unit = new javax.swing.JTextField();
        tanggal = new com.toedter.calendar.JDateChooser();
        fotoListrik = new javax.swing.JPanel();
        btnLihatListrik = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        imgListrik = new javax.swing.JLabel();
        fotoAir = new javax.swing.JPanel();
        btnLihatAir = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        imgAir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nama_staf = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id_staf = new javax.swing.JLabel();
        set_staf = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        akhirPemakaianAir = new javax.swing.JTextField();
        awalPemakaianAir = new javax.swing.JTextField();
        akhirPemakaianListrik = new javax.swing.JTextField();
        awalPemakaianListrik = new javax.swing.JTextField();
        totalPemakaianListrik = new javax.swing.JTextField();
        totalPemakaianAir = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        set = new javax.swing.JButton();
        update = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        popAcc.setBackground(new java.awt.Color(146, 180, 236));
        popAcc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        popAcc.setForeground(new java.awt.Color(255, 255, 255));
        popAcc.setBorder(null);
        popAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popAcc.setRequestFocusEnabled(false);

        profile.setBackground(new java.awt.Color(146, 180, 236));
        profile.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("PROFILE");
        profile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profile.setIconTextGap(10);
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        popAcc.add(profile);
        popAcc.add(jSeparator1);

        logout.setBackground(new java.awt.Color(146, 180, 236));
        logout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LOGOUT");
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setIconTextGap(10);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        popAcc.add(logout);

        popAcc.getAccessibleContext().setAccessibleName("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENGECEKAN");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 700));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(255, 210, 76));
        background.setAlignmentX(0.0F);
        background.setAlignmentY(0.0F);
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));

        topBar.setBackground(new java.awt.Color(146, 180, 236));
        topBar.setAlignmentX(0.0F);
        topBar.setAlignmentY(0.0F);
        topBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        homeLogo.setBackground(new java.awt.Color(255, 255, 255));
        homeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-button-logo.png"))); // NOI18N
        homeLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLogoMouseClicked(evt);
            }
        });

        pengecekan.setBackground(new java.awt.Color(255, 255, 255));
        pengecekan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pengecekan.setForeground(new java.awt.Color(255, 210, 76));
        pengecekan.setText("PENGECEKAN");
        pengecekan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        komplain.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        komplain.setForeground(new java.awt.Color(255, 255, 255));
        komplain.setText("KOMPLAIN");
        komplain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        komplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                komplainMouseClicked(evt);
            }
        });

        valid.setBackground(new java.awt.Color(146, 180, 236));
        valid.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        valid.setForeground(new java.awt.Color(255, 255, 255));
        valid.setText("VALIDATION");
        valid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validMouseClicked(evt);
            }
        });

        biaya.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        biaya.setForeground(new java.awt.Color(255, 255, 255));
        biaya.setText("BIAYA");
        biaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biaya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                biayaMouseClicked(evt);
            }
        });

        data.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setText("DATA");
        data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });

        users.setBackground(new java.awt.Color(146, 180, 236));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/drop.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nama.setName(""); // NOI18N
        nama.setNextFocusableComponent(popAcc);

        komplain1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        komplain1.setForeground(new java.awt.Color(255, 255, 255));
        komplain1.setText("HAI !");
        komplain1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout usersLayout = new javax.swing.GroupLayout(users);
        users.setLayout(usersLayout);
        usersLayout.setHorizontalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(komplain1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        usersLayout.setVerticalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersLayout.createSequentialGroup()
                .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(komplain1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-button-logo.png"))); // NOI18N

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(pengecekan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(biaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(komplain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(509, 509, 509)
                .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pengecekan)
                                .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(komplain))))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(homeLogo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setToolTipText("");

        statusPanelCek.setBackground(new java.awt.Color(255, 255, 255));
        statusPanelCek.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 4, true));
        statusPanelCek.setForeground(new java.awt.Color(204, 255, 204));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PROGRES CEK");

        createNewProgres.setBackground(new java.awt.Color(255, 255, 255));
        createNewProgres.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        createNewProgres.setForeground(new java.awt.Color(146, 180, 236));
        createNewProgres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reEdit.gif"))); // NOI18N
        createNewProgres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createNewProgres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewProgresMouseClicked(evt);
            }
        });

        updateProgres.setBackground(new java.awt.Color(204, 204, 204));
        updateProgres.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        updateProgres.setForeground(new java.awt.Color(255, 255, 255));
        updateProgres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report-card.png"))); // NOI18N
        updateProgres.setText("UPDATE");
        updateProgres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateProgres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProgresActionPerformed(evt);
            }
        });

        progres.setColumns(20);
        progres.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        progres.setForeground(new java.awt.Color(146, 180, 236));
        progres.setRows(5);
        jScrollPane2.setViewportView(progres);

        id_stafCek.setForeground(new java.awt.Color(102, 102, 102));
        id_stafCek.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username Staf", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        javax.swing.GroupLayout statusPanelCekLayout = new javax.swing.GroupLayout(statusPanelCek);
        statusPanelCek.setLayout(statusPanelCekLayout);
        statusPanelCekLayout.setHorizontalGroup(
            statusPanelCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelCekLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(createNewProgres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(statusPanelCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusPanelCekLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(232, 232, 232))
                    .addGroup(statusPanelCekLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(33, 33, 33)))
                .addGroup(statusPanelCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_stafCek)
                    .addComponent(updateProgres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        statusPanelCekLayout.setVerticalGroup(
            statusPanelCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelCekLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(statusPanelCekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createNewProgres, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(statusPanelCekLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
            .addGroup(statusPanelCekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateProgres, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_stafCek)
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("UNIT");

        id_monthly.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        id_monthly.setForeground(new java.awt.Color(102, 102, 102));
        id_monthly.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "id_monthl and id_cek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        id_monthly.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_monthlyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_monthlyKeyTyped(evt);
            }
        });

        no_unit.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        no_unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(no_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4)))
                .addGap(36, 36, 36)
                .addComponent(statusPanelCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_monthly)
                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_monthly))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(no_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusPanelCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        fotoListrik.setBackground(new java.awt.Color(255, 255, 255));
        fotoListrik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 210, 76)));
        fotoListrik.setPreferredSize(new java.awt.Dimension(300, 36));

        btnLihatListrik.setBackground(new java.awt.Color(255, 210, 76));
        btnLihatListrik.setForeground(new java.awt.Color(255, 255, 255));
        btnLihatListrik.setSelected(true);
        btnLihatListrik.setText("view");
        btnLihatListrik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLihatListrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatListrikActionPerformed(evt);
            }
        });

        imgListrik.setMaximumSize(new java.awt.Dimension(300, 250));
        imgListrik.setMinimumSize(new java.awt.Dimension(300, 250));
        imgListrik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgListrikMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(imgListrik);

        javax.swing.GroupLayout fotoListrikLayout = new javax.swing.GroupLayout(fotoListrik);
        fotoListrik.setLayout(fotoListrikLayout);
        fotoListrikLayout.setHorizontalGroup(
            fotoListrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoListrikLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(fotoListrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fotoListrikLayout.createSequentialGroup()
                        .addComponent(btnLihatListrik, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        fotoListrikLayout.setVerticalGroup(
            fotoListrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoListrikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLihatListrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        fotoAir.setBackground(new java.awt.Color(255, 255, 255));
        fotoAir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 180, 236)));
        fotoAir.setPreferredSize(new java.awt.Dimension(300, 36));

        btnLihatAir.setBackground(new java.awt.Color(146, 180, 236));
        btnLihatAir.setForeground(new java.awt.Color(255, 255, 255));
        btnLihatAir.setSelected(true);
        btnLihatAir.setText("view");
        btnLihatAir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLihatAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatAirActionPerformed(evt);
            }
        });

        imgAir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAirMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(imgAir);

        javax.swing.GroupLayout fotoAirLayout = new javax.swing.GroupLayout(fotoAir);
        fotoAir.setLayout(fotoAirLayout);
        fotoAirLayout.setHorizontalGroup(
            fotoAirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoAirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fotoAirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fotoAirLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3))
                    .addGroup(fotoAirLayout.createSequentialGroup()
                        .addComponent(btnLihatAir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fotoAirLayout.setVerticalGroup(
            fotoAirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoAirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLihatAir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        nama_staf.setBackground(new java.awt.Color(255, 255, 255));
        nama_staf.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nama_staf.setForeground(new java.awt.Color(146, 180, 236));
        nama_staf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("TEKNISI :");

        id_staf.setBackground(new java.awt.Color(255, 255, 255));
        id_staf.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        id_staf.setForeground(new java.awt.Color(146, 180, 236));
        id_staf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        set_staf.setBackground(new java.awt.Color(204, 204, 204));
        set_staf.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        set_staf.setForeground(new java.awt.Color(255, 255, 255));
        set_staf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        set_staf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        set_staf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_stafActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(42, 42, 42)
                .addComponent(nama_staf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(160, 160, 160)
                .addComponent(set_staf, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id_staf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(set_staf)
                    .addComponent(id_staf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama_staf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 210, 76));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablePengecekan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tablePengecekan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UNIT", "TANGGAL", "ID STAF", "FASILITAS", "ANGKA METERAN", "TOTAL PAKAI"
            }
        ));
        tablePengecekan.setAlignmentX(1.0F);
        tablePengecekan.setAlignmentY(1.0F);
        tablePengecekan.setSelectionBackground(new java.awt.Color(146, 180, 236));
        tablePengecekan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePengecekanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePengecekan);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        akhirPemakaianAir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        akhirPemakaianAir.setForeground(new java.awt.Color(51, 51, 51));
        akhirPemakaianAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        akhirPemakaianAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Akhir Pemakaian Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N

        awalPemakaianAir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        awalPemakaianAir.setForeground(new java.awt.Color(51, 51, 51));
        awalPemakaianAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        awalPemakaianAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Awal Pemakaian Air", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        awalPemakaianAir.setMinimumSize(new java.awt.Dimension(150, 40));

        akhirPemakaianListrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        akhirPemakaianListrik.setForeground(new java.awt.Color(51, 51, 51));
        akhirPemakaianListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        akhirPemakaianListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Akhir Pemakaian Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N

        awalPemakaianListrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        awalPemakaianListrik.setForeground(new java.awt.Color(51, 51, 51));
        awalPemakaianListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        awalPemakaianListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Awal Pemakaian Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N
        awalPemakaianListrik.setMinimumSize(new java.awt.Dimension(150, 40));

        totalPemakaianListrik.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        totalPemakaianListrik.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N
        totalPemakaianListrik.setMinimumSize(new java.awt.Dimension(150, 50));
        totalPemakaianListrik.setPreferredSize(new java.awt.Dimension(150, 50));
        totalPemakaianListrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPemakaianListrikActionPerformed(evt);
            }
        });

        totalPemakaianAir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        totalPemakaianAir.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        totalPemakaianAir.setMinimumSize(new java.awt.Dimension(150, 50));

        jButton3.setBackground(new java.awt.Color(255, 210, 76));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(akhirPemakaianListrik)
                            .addComponent(awalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPemakaianAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(akhirPemakaianAir)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(awalPemakaianAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(awalPemakaianAir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(awalPemakaianListrik, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(akhirPemakaianAir, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(akhirPemakaianListrik))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(totalPemakaianAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(146, 180, 236));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        listFasilitas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        listFasilitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Listrik", "Air", "Others" }));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SET PREVIOUS");

        set.setBackground(new java.awt.Color(204, 204, 204));
        set.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        set.setForeground(new java.awt.Color(255, 255, 255));
        set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        set.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listFasilitas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(set)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        update.setBackground(new java.awt.Color(204, 204, 204));
        update.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        update.setText("UPDATE");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cari.setBackground(new java.awt.Color(204, 204, 204));
        cari.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        cari.setText("SEARCH");
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(cari)
                                .addGap(52, 52, 52)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(fotoListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fotoAir, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jSeparator4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fotoAir, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(fotoListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cari)
                            .addComponent(update))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
          popAcc.show(users,evt.getX(),evt.getY());
    }//GEN-LAST:event_usersMouseClicked

    private void totalPemakaianListrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPemakaianListrikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPemakaianListrikActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLogoMouseClicked
            Home home = null;
        try {
            home = new Home();
        } catch (SQLException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        String account = nama.getText();
        home.setVisible(true);
                   home.pack();
                   this.dispose();
                   home.Home_nama.setText(account);
    }//GEN-LAST:event_homeLogoMouseClicked

    private void validMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validMouseClicked
                int YN = JOptionPane.showConfirmDialog(null, "Anda ke Validation ?", "Don't Close App When Still in Login Section", JOptionPane.YES_NO_OPTION);
//              jika yes 
                if(YN == 0){
                    try {
                         new Confirm_isAccounting(null,true).show();
                         this.dispose();
                    } catch (SQLException ex) {
                       Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                       Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
                    this.dispose();
//            jika no         
        }else
            if(YN == 1){
                this.setVisible(true);
            }

    }//GEN-LAST:event_validMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
             // TODO log out from pop up
                int YN = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin LogOut ?", "Confrim LogOut", JOptionPane.YES_NO_OPTION);
        
             if(YN == 0){
                    try {
                        app = new App();
                    } catch (SQLException ex) {
                        Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    app.setVisible(true);
                    this.dispose();
                    
        }else
            if(YN == 1){
                this.setVisible(true);
            }
    }//GEN-LAST:event_logoutActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
               // See Profile
          try {
            new See_Profile(null,true).show();
        } catch (SQLException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profileActionPerformed

    private void biayaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biayaMouseClicked
        // Open form penghitungan biaya
        
        Hitung_Biaya page = null;
        try {
            page = new Hitung_Biaya();
        } catch (SQLException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_biayaMouseClicked

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
                // Open form Data 
        Data page = null;
        try {
            page = new Data();
        } catch (SQLException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_dataMouseClicked

    private void komplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_komplainMouseClicked
                        // Open form Data 
        Komplain page = null;
        try {
            page = new Komplain();
        } catch (SQLException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_komplainMouseClicked

    private void setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setActionPerformed

       SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
       String date = String.valueOf(dateSet.format(tanggal.getDate()));
       String unit = no_unit.getText();
       String fasilitas = listFasilitas.getSelectedItem().toString();
       
       prev_numberUse(date,fasilitas,unit);

    }//GEN-LAST:event_setActionPerformed

    private void tablePengecekanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePengecekanMouseClicked
        // call get item row in table
        getRowItem();
    }//GEN-LAST:event_tablePengecekanMouseClicked

    private void set_stafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_stafActionPerformed
        // call function set staf
        setStafByUsername();
    }//GEN-LAST:event_set_stafActionPerformed

    private void createNewProgresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewProgresMouseClicked
       //  update proses cek
       String username = id_stafCek.getText();
       String proses = progres.getText();
       String id_month = id_monthly.getText();
       
       cek.insertProgres(username, proses, id_month);
    }//GEN-LAST:event_createNewProgresMouseClicked

    private void updateProgresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProgresActionPerformed
       String username = id_stafCek.getText();
       String proses = progres.getText();
       String id_cek = id_monthly.getText();
        Boolean valid = true;
       //call
       cek.updateProgres(username, proses, id_cek, valid);
       
       
    }//GEN-LAST:event_updateProgresActionPerformed

    private void id_monthlyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_monthlyKeyTyped
  
    }//GEN-LAST:event_id_monthlyKeyTyped

    private void id_monthlyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_monthlyKeyPressed
        String id = id_monthly.getText();
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            System.out.println("enter search progres by id monthly :"+id);
            searchUpdateCek(id);
        }
        
    }//GEN-LAST:event_id_monthlyKeyPressed

    private void btnLihatListrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatListrikActionPerformed
        // view image listrik by unit date and name fasilitas
        String unit = no_unit.getText();
        SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
        String date = String.valueOf(dateSet.format(tanggal.getDate()));
        String fasilitas = listFasilitas.getSelectedItem().toString();
        
        viewListrik(unit,date,fasilitas);
        
    }//GEN-LAST:event_btnLihatListrikActionPerformed

    private void btnLihatAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatAirActionPerformed
        String unit = no_unit.getText();
        SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
        String date = String.valueOf(dateSet.format(tanggal.getDate()));
        String fasilitas = listFasilitas.getSelectedItem().toString();
        
        viewAir(unit,date,fasilitas);
    }//GEN-LAST:event_btnLihatAirActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        //find data pengecekan
        String unit = no_unit.getText();
        SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
        String date = String.valueOf(dateSet.format(tanggal.getDate()));
        String fasilitas = listFasilitas.getSelectedItem().toString();
        
        
        findDataCek(unit,date,fasilitas);
    }//GEN-LAST:event_cariActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String unit = no_unit.getText();
        SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
        String date = String.valueOf(dateSet.format(tanggal.getDate()));
        String username = id_staf.getText();
        String fasilitas = listFasilitas.getSelectedItem().toString();
        
        
        if(fasilitas.equals("Listrik")){
            Integer angka = Integer.parseInt(akhirPemakaianListrik.getText());
            Integer total = Integer.parseInt(totalPemakaianListrik.getText());
            cek.updatePengecekan(unit,username,angka,total, date, imagesUpload, fasilitas);
        }else if(fasilitas.equals("Air")){
            Integer angka = Integer.parseInt(akhirPemakaianAir.getText());
            Integer total = Integer.parseInt(totalPemakaianAir.getText());
            cek.updatePengecekan(unit,username,angka,total, date, imagesUpload, fasilitas);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void imgListrikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgListrikMouseClicked
       JFileChooser choose = new JFileChooser();
       choose.showOpenDialog(null);
       File f = choose.getSelectedFile();
       //put image selected
       imgListrik.setIcon(new ImageIcon(f.toString()));
       filename = f.getAbsolutePath();
       try{
           File imageChoose = new File(filename);
           FileInputStream fis = new FileInputStream(imageChoose);
           ByteArrayOutputStream bos = new ByteArrayOutputStream();
           byte[] buf = new byte[1024];
           
                for(int readName; (readName=fis.read(buf))!=-1;){
                     bos.write(buf, 0, readName);
                }
                imagesUpload = bos.toByteArray();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       
    }//GEN-LAST:event_imgListrikMouseClicked

    private void imgAirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAirMouseClicked
       JFileChooser choose = new JFileChooser();
       choose.showOpenDialog(null);
       File f = choose.getSelectedFile();
       //put image selected
       imgAir.setIcon(new ImageIcon(f.toString()));
       filename = f.getAbsolutePath();
       try{
           File imageChoose = new File(filename);
           FileInputStream fis = new FileInputStream(imageChoose);
           ByteArrayOutputStream bos = new ByteArrayOutputStream();
           byte[] buf = new byte[1024];
           
                for(int readName; (readName=fis.read(buf))!=-1;){
                     bos.write(buf, 0, readName);
                }
                imagesUpload = bos.toByteArray();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_imgAirMouseClicked

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
            java.util.logging.Logger.getLogger(Pengecekan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengecekan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengecekan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengecekan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                try {
                    new Pengecekan().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField akhirPemakaianAir;
    private javax.swing.JTextField akhirPemakaianListrik;
    private javax.swing.JTextField awalPemakaianAir;
    private javax.swing.JTextField awalPemakaianListrik;
    private javax.swing.JPanel background;
    private javax.swing.JLabel biaya;
    private javax.swing.JToggleButton btnLihatAir;
    private javax.swing.JToggleButton btnLihatListrik;
    private javax.swing.JButton cari;
    private javax.swing.JLabel createNewProgres;
    private javax.swing.JLabel data;
    private javax.swing.JPanel fotoAir;
    private javax.swing.JPanel fotoListrik;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JTextField id_monthly;
    private javax.swing.JLabel id_staf;
    private javax.swing.JTextField id_stafCek;
    private javax.swing.JLabel imgAir;
    private javax.swing.JLabel imgListrik;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel komplain;
    private javax.swing.JLabel komplain1;
    public static final transient javax.swing.JComboBox<String> listFasilitas = new javax.swing.JComboBox<>();
    private javax.swing.JMenuItem logout;
    public static final javax.swing.JLabel nama = new javax.swing.JLabel();
    private javax.swing.JLabel nama_staf;
    private javax.swing.JTextField no_unit;
    private javax.swing.JLabel pengecekan;
    private javax.swing.JPopupMenu popAcc;
    private javax.swing.JMenuItem profile;
    private javax.swing.JTextArea progres;
    private javax.swing.JButton set;
    private javax.swing.JButton set_staf;
    private javax.swing.JPanel statusPanelCek;
    public static final transient javax.swing.JTable tablePengecekan = new javax.swing.JTable();
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JPanel topBar;
    private javax.swing.JTextField totalPemakaianAir;
    private javax.swing.JTextField totalPemakaianListrik;
    private javax.swing.JButton update;
    private javax.swing.JButton updateProgres;
    private javax.swing.JPanel users;
    private javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables

    private void prev_numberUse(String date, String fasilitas, String unit) {
        System.out.println("set number prev :"+date+fasilitas+unit);
        for(int i=0; i<cekModel.size(); i++){
                  if(cekModel.get(i).getDate().equals(date) && cekModel.get(i).getName().equals(fasilitas) && cekModel.get(i).getUnit().equals(unit)) {
                     String current = cekModel.get(i).getCurrent_number().toString();
                     if(fasilitas.equals("Listrik")){
                         awalPemakaianListrik.setText(current);
                     }else if(fasilitas.equals("Air")){
                         awalPemakaianAir.setText(current);   
                     }
                 }
         }
    }
    //get item row
    private void getRowItem() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        
        //get row
        int row = tablePengecekan.getSelectedRow();
        
         //for date , must be parse before
        Date dateView = null;
        try {
                dateView = date.parse((String) tablePengecekan.getValueAt(row, 1));
        }catch (ParseException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //put value to editable
        no_unit.setText(tablePengecekan.getModel().getValueAt(row, 0).toString());
        tanggal.setDate(dateView);
        id_staf.setText(tablePengecekan.getModel().getValueAt(row, 2).toString());
        id_monthly.setText(tablePengecekan.getModel().getValueAt(row, 3).toString());
        String a = tablePengecekan.getModel().getValueAt(row, 4).toString();
        // condition choice facility
        if(a.equals("Listrik")){
            akhirPemakaianListrik.setText(tablePengecekan.getModel().getValueAt(row, 5).toString());
            totalPemakaianListrik.setText(tablePengecekan.getModel().getValueAt(row, 6).toString());
        }else if(a.equals("Air")){
            akhirPemakaianAir.setText(tablePengecekan.getModel().getValueAt(row, 5).toString());
            totalPemakaianAir.setText(tablePengecekan.getModel().getValueAt(row, 6).toString());
        }
        
    }
        //set staf name by username not use model
    private void setStafByUsername() {
        String id = id_staf.getText();
        
        String qry = " SELECT name FROM staf WHERE id_staf = '"+id+"'";
        
        try{
            ResultSet rs = stm.executeQuery(qry);
            if(rs.next()){
                String var = rs.getString("name");
                nama_staf.setText(var);
            }
            
        }catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application by Username in Your Request");
        }
    }
    //search updated cek proses
    private void searchUpdateCek(String id_monthly) {
                   for(int i=0; i<progresModel.size(); i++){
                            if(progresModel.get(i).getId_cek().equals(id_monthly)) {
                               String proses = progresModel.get(i).getProgres();
                               String username = progresModel.get(i).getUsername();
                               
                               //put
                               progres.setText(proses);
                               id_stafCek.setText(username);
                            }
                       }
     }
    //view fun listrik image
    private void viewListrik(String unit, String date, String fasilitas) {
       System.out.println("view by : "+unit+date+fasilitas);
       
       
       //create single query to get data image
       String qry = "SELECT data.attachment FROM ((data INNER JOIN monthly ON data.id_monthly = monthly.id_monthly) "
               + "INNER JOIN facility ON data.id_facility = facility.id_facility)"
               + " WHERE monthly.unit = '"+unit+"' AND monthly.date ='"+date+"' AND facility.name = '"+fasilitas+"'";
       
       try {
           ResultSet rs = stm.executeQuery(qry);
           
            byte[] image = null;
            if(rs.next()){
                 image = rs.getBytes("attachment");
            }
        Image img = Toolkit.getDefaultToolkit().createImage(image);
        ImageIcon icon = new ImageIcon(img);
        imgListrik.setIcon(icon);
         }catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get image listrik in Your Application by unit in Your Request");
                System.out.println(e);
         }
       
       
    }
    //single query get data image
    private void viewAir(String unit, String date, String fasilitas) {
               System.out.println("view by : "+unit+date+fasilitas);
       
       
       //create single query to get data image
       String qry = "SELECT data.attachment FROM ((data INNER JOIN monthly ON data.id_monthly = monthly.id_monthly) "
               + "INNER JOIN facility ON data.id_facility = facility.id_facility)"
               + " WHERE monthly.unit = '"+unit+"' AND monthly.date ='"+date+"' AND facility.name = '"+fasilitas+"'";
       
       try {
           ResultSet rs = stm.executeQuery(qry);
           
            byte[] image = null;
            if(rs.next()){
                 image = rs.getBytes("attachment");
            }
        Image img = Toolkit.getDefaultToolkit().createImage(image);
        ImageIcon icon = new ImageIcon(img);
        imgAir.setIcon(icon);
         }catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get image listrik in Your Application by unit in Your Request");
                System.out.println(e);
         }
    }
    //find data pengecekan
    private void findDataCek(String unit, String date, String fasilitas) {
        System.out.println("set number prev :"+date+fasilitas+unit);
        for(int i=0; i<cekModel.size(); i++){
                  if(cekModel.get(i).getDate().equals(date) && cekModel.get(i).getName().equals(fasilitas) && cekModel.get(i).getUnit().equals(unit)) {
                      String current_number = cekModel.get(i).getCurrent_number().toString();
                      String amount = cekModel.get(i).getAmount().toString();
                     if(fasilitas.equals("Listrik")){
                         akhirPemakaianListrik.setText(amount);
                         totalPemakaianListrik.setText(current_number);
                     }else if(fasilitas.equals("Air")){
                         akhirPemakaianAir.setText(amount);
                         totalPemakaianAir.setText(current_number);
                     }
                 }
         }
    }
 
    private void statusProgres() {
                          for(int i=0; i<progresModel.size(); i++){
                            if(progresModel.get(i).getIsValid().equals(true)) {
                                //hijau
                               Color color = new Color(204,250,204);
                               statusPanelCek.setBackground(color);
                            }else if(progresModel.get(i).getIsValid().equals(false)){
                                //kuning
                               Color color = new Color(250,210,76);
                               statusPanelCek.setBackground(color);
                            }
                       }
    }
    byte[] imagesUpload =null;
    String filename = null;
}
