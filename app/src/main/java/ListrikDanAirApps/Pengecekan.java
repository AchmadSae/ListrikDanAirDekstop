/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ListrikDanAirApps;


import config.Confirm_isAccounting;
import config.See_Profile;
import static config.tableData.ListPengecekan;
import dataTable.ValuePengecekan;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pengecekan extends javax.swing.JFrame {
    //create object class login section
    App app;


    //get data form database and put in table model
    public Pengecekan()throws SQLException, ClassNotFoundException {
        initComponents();
        Toolkit kit = getToolkit();
        Dimension size = kit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_app.png")));
        
        //call show data in table pengecekan
        show_cek();
        
    }
    
    //function put data form arrayList into table
    public void show_cek(){
            //create objet array get data into table form tableData
            ArrayList<ValuePengecekan> list = ListPengecekan();
               //create object model table
            DefaultTableModel model = (DefaultTableModel)tablePengecekan.getModel();
            Object[] row = new Object[8];
            
            for(int i=0; i<list.size(); i++){
                row[0] = list.get(i).getUnit();
                row[1] = list.get(i).getDate();
                row[2] = list.get(i).getId_staf();
                row[3] = list.get(i).getId_monthly();
                row[4] = list.get(i).getName();
                row[5] = list.get(i).getCurrent_number();
                row[6] = list.get(i).getAmount();
                
                //add to model table
                model.addRow(row);
            }
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
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProses = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        progres = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        id_monthly = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tanggal = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        update = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        fotoListrik = new javax.swing.JPanel();
        btnLihatListrik = new javax.swing.JToggleButton();
        idListrik = new javax.swing.JTextField();
        fotoAir = new javax.swing.JPanel();
        btnLihatAir = new javax.swing.JToggleButton();
        idAir = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        no_unit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        akhirPemakaianAir = new javax.swing.JTextField();
        awalPemakaianAir = new javax.swing.JTextField();
        akhirPemakaianListrik = new javax.swing.JTextField();
        awalPemakaianListrik = new javax.swing.JTextField();
        totalPemakaianListrik = new javax.swing.JTextField();
        totalPemakaianAi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 4, true));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(146, 180, 236));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PROGRES CEK");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(146, 180, 236));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reEdit.gif"))); // NOI18N

        btnProses.setBackground(new java.awt.Color(204, 204, 204));
        btnProses.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnProses.setForeground(new java.awt.Color(255, 255, 255));
        btnProses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report-card.png"))); // NOI18N
        btnProses.setText("OK");
        btnProses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        progres.setColumns(20);
        progres.setRows(5);
        jScrollPane2.setViewportView(progres);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(208, 208, 208))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        id_monthly.setBackground(new java.awt.Color(204, 204, 204));
        id_monthly.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        id_monthly.setForeground(new java.awt.Color(255, 255, 255));
        id_monthly.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_monthly.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id Monthly", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id_monthly, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id_monthly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator3)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jSeparator2.setBackground(new java.awt.Color(146, 180, 236));

        update.setBackground(new java.awt.Color(204, 204, 204));
        update.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        update.setText("UPDATE");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cari.setBackground(new java.awt.Color(204, 204, 204));
        cari.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        cari.setText("SEARCH");
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        fotoListrik.setBackground(new java.awt.Color(255, 255, 255));
        fotoListrik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 210, 76)));
        fotoListrik.setPreferredSize(new java.awt.Dimension(300, 36));

        btnLihatListrik.setBackground(new java.awt.Color(255, 210, 76));
        btnLihatListrik.setForeground(new java.awt.Color(255, 255, 255));
        btnLihatListrik.setSelected(true);
        btnLihatListrik.setText("view");
        btnLihatListrik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        idListrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        idListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N

        javax.swing.GroupLayout fotoListrikLayout = new javax.swing.GroupLayout(fotoListrik);
        fotoListrik.setLayout(fotoListrikLayout);
        fotoListrikLayout.setHorizontalGroup(
            fotoListrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoListrikLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnLihatListrik, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idListrik)
                .addContainerGap())
        );
        fotoListrikLayout.setVerticalGroup(
            fotoListrikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoListrikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLihatListrik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fotoListrikLayout.createSequentialGroup()
                .addComponent(idListrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fotoAir.setBackground(new java.awt.Color(255, 255, 255));
        fotoAir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 180, 236)));
        fotoAir.setPreferredSize(new java.awt.Dimension(300, 36));

        btnLihatAir.setBackground(new java.awt.Color(146, 180, 236));
        btnLihatAir.setForeground(new java.awt.Color(255, 255, 255));
        btnLihatAir.setSelected(true);
        btnLihatAir.setText("view");
        btnLihatAir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        idAir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        idAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N

        javax.swing.GroupLayout fotoAirLayout = new javax.swing.GroupLayout(fotoAir);
        fotoAir.setLayout(fotoAirLayout);
        fotoAirLayout.setHorizontalGroup(
            fotoAirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoAirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLihatAir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idAir)
                .addGap(20, 20, 20))
        );
        fotoAirLayout.setVerticalGroup(
            fotoAirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoAirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLihatAir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fotoAirLayout.createSequentialGroup()
                .addComponent(idAir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("UNIT");

        no_unit.setBackground(new java.awt.Color(255, 255, 255));
        no_unit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        no_unit.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(no_unit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(no_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16))))
        );

        jButton1.setBackground(new java.awt.Color(255, 210, 76));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablePengecekan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tablePengecekan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UNIT", "TANGGAL", "ID STAF", "ID MONTHLY", "FASILITAS", "ANGKA METERAN", "TOTAL PAKAI"
            }
        ));
        tablePengecekan.setSelectionBackground(new java.awt.Color(146, 180, 236));
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

        totalPemakaianAi.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        totalPemakaianAi.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianAi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianAi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        totalPemakaianAi.setMinimumSize(new java.awt.Dimension(150, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(akhirPemakaianListrik)
                    .addComponent(awalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPemakaianAi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(akhirPemakaianAir)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(awalPemakaianAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))))
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
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(akhirPemakaianAir, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(akhirPemakaianListrik))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(totalPemakaianAi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(146, 180, 236));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(122, 122, 122))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(fotoListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fotoAir, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(update)
                                .addGap(43, 43, 43)
                                .addComponent(cari))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fotoAir, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(fotoListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
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
    private javax.swing.JButton btnProses;
    private javax.swing.JButton cari;
    private javax.swing.JLabel data;
    private javax.swing.JPanel fotoAir;
    private javax.swing.JPanel fotoListrik;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JTextField idAir;
    private javax.swing.JTextField idListrik;
    private javax.swing.JTextField id_monthly;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel komplain;
    private javax.swing.JLabel komplain1;
    private javax.swing.JMenuItem logout;
    public static final javax.swing.JLabel nama = new javax.swing.JLabel();
    private javax.swing.JLabel no_unit;
    private javax.swing.JLabel pengecekan;
    private javax.swing.JPopupMenu popAcc;
    private javax.swing.JMenuItem profile;
    private javax.swing.JTextArea progres;
    public static final transient javax.swing.JTable tablePengecekan = new javax.swing.JTable();
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JPanel topBar;
    private javax.swing.JTextField totalPemakaianAi;
    private javax.swing.JTextField totalPemakaianListrik;
    private javax.swing.JButton update;
    private javax.swing.JPanel users;
    private javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables

  
}
