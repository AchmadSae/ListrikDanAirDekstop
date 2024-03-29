
package ListrikDanAirApps;


import config.Confirm_isAccounting;
import config.Connection_db;
import config.See_Profile;
import dataTable.InvoiceNeeds.ControllerInvoice;
import static dataTable.InvoiceNeeds.ControllerInvoice.CekAllInvoice;
import dataTable.InvoiceNeeds.ModelInvoice;
import dataTable.KaryawanNeeds.ControllerKaryawan;
import static dataTable.KaryawanNeeds.ControllerKaryawan.CekAllKaryawan;
import dataTable.KaryawanNeeds.ModelKaryawan;
import dataTable.KomplainNeeds.ControllerKomplain;
import static dataTable.KomplainNeeds.ControllerKomplain.CekAllKomplain;
import dataTable.KomplainNeeds.ModelKomplain;
import dataTable.PengecekanNeeds.ControllerPengecekan;
import static dataTable.PengecekanNeeds.ControllerPengecekan.CekAll;
import dataTable.PengecekanNeeds.ModelPengecekan;
import dataTable.PenghuniNeeds.ControllerPenghuni;
import static dataTable.PenghuniNeeds.ControllerPenghuni.CekAllPenghuni;
import dataTable.PenghuniNeeds.ModelPenghuni;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class Data extends javax.swing.JFrame {
    App app;
   //create objek controller invoice
    ControllerInvoice inv = new ControllerInvoice();
    //create controll penghuni
    ControllerPenghuni huni = new ControllerPenghuni();
    //create controller pengecekan
    ControllerPengecekan cek = new ControllerPengecekan();
    //cretae conroller karyawan
    ControllerKaryawan kry = new ControllerKaryawan();
    //create controller komplain
    ControllerKomplain komp = new ControllerKomplain();
    //create model pengecekan
    ArrayList<ModelPengecekan> cekModel = CekAll();
    //create model invoice
    ArrayList<ModelInvoice> invModel = CekAllInvoice();
    //create objek model penghuni
    ArrayList<ModelPenghuni> huniModel = CekAllPenghuni();
    //create model karyawan
    ArrayList<ModelKaryawan> karyModel = CekAllKaryawan();
    //creta model komplain
    ArrayList<ModelKomplain> kompModel = CekAllKomplain();
    
    
    
        static private Connection conn = new Connection_db().Connect();
    
    public Data()throws SQLException, ClassNotFoundException {
        initComponents();
        Toolkit kit = getToolkit();
        Dimension size = kit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_app.png")));
        
     
    }
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popAcc = new javax.swing.JPopupMenu();
        profile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        topBar = new javax.swing.JPanel();
        homeLogo = new javax.swing.JLabel();
        pengecekan = new javax.swing.JLabel();
        komplain = new javax.swing.JLabel();
        valid = new javax.swing.JLabel();
        biaya = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        komplain1 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        subForm = new javax.swing.JTabbedPane();
        record_penghuni = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_penghuni = new javax.swing.JTable();
        btnSave_penghuni = new javax.swing.JButton();
        btnPrint_penghuni = new javax.swing.JButton();
        btnSearch_penghuni = new javax.swing.JButton();
        update_penghuni = new javax.swing.JButton();
        unit_penghuni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phone_penghuni = new javax.swing.JTextField();
        nama_penghuni = new javax.swing.JTextField();
        email_penghuni = new javax.swing.JTextField();
        VNpayment = new javax.swing.JTextField();
        record_pemakaian = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pemakaian = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        totalPemakaianAir = new javax.swing.JTextField();
        akhirPemakaianAir = new javax.swing.JTextField();
        akhirPemakaianListrik = new javax.swing.JTextField();
        totalPemakaianListrik = new javax.swing.JTextField();
        unit_pemakaian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnPrint_pemakaianByDate = new javax.swing.JButton();
        btnSearch_pemaiakian = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnPrint_pemakaianAll = new javax.swing.JButton();
        record_karyawan = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_karyawan = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        akhirPemakaianAir2 = new javax.swing.JTextField();
        id_users = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        totalPemakaianAi1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nama_staf = new javax.swing.JTextField();
        bagian = new javax.swing.JTextField();
        btnSave_kayawan = new javax.swing.JButton();
        btnPrint_karyawan = new javax.swing.JButton();
        btnSearch_karyawan = new javax.swing.JButton();
        update_karyawan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        record_invoice = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_invoice = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnPrint_invoiceByDate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        id_invoice = new javax.swing.JTextField();
        unit_invoice = new javax.swing.JTextField();
        biaya_tagihan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dateEnd = new com.toedter.calendar.JDateChooser();
        dateStart = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        btnPrint_invoiceAll = new javax.swing.JButton();
        record_karyawan1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_komplain = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        id_komplain = new javax.swing.JTextField();
        unit_komplain = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        isi_komplain = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        selesai_komplain = new javax.swing.JTextArea();
        isDoneKomplain = new javax.swing.JPanel();
        prntAll = new javax.swing.JButton();
        btnSearch_komplain = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

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
        setTitle("ALL DATA");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1280, 700));

        topBar.setBackground(new java.awt.Color(146, 180, 236));
        topBar.setAlignmentX(0.0F);
        topBar.setAlignmentY(0.0F);
        topBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        homeLogo.setBackground(new java.awt.Color(255, 255, 255));
        homeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_app.png"))); // NOI18N
        homeLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pengecekan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pengecekan.setForeground(new java.awt.Color(255, 255, 255));
        pengecekan.setText("PENGECEKAN");
        pengecekan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengecekan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengecekanMouseClicked(evt);
            }
        });

        komplain.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        komplain.setForeground(new java.awt.Color(255, 255, 255));
        komplain.setText("KOMPLAIN");
        komplain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        komplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                komplainMouseClicked(evt);
            }
        });

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
        data.setForeground(new java.awt.Color(255, 210, 76));
        data.setText("DATA");
        data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        users.setBackground(new java.awt.Color(146, 180, 236));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });

        nama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nama.setName(""); // NOI18N
        nama.setNextFocusableComponent(popAcc);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/drop.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        komplain1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        komplain1.setForeground(new java.awt.Color(255, 255, 255));
        komplain1.setText("HAI !");
        komplain1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout usersLayout = new javax.swing.GroupLayout(users);
        users.setLayout(usersLayout);
        usersLayout.setHorizontalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(komplain1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );
        usersLayout.setVerticalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(komplain1)))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(homeLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pengecekan, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(valid, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(biaya, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(komplain, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(535, 535, 535)
                .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pengecekan)
                            .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(komplain)))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setAlignmentX(0.0F);
        background.setAlignmentY(0.0F);
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));

        subForm.setBackground(new java.awt.Color(255, 255, 255));
        subForm.setMaximumSize(new java.awt.Dimension(1200, 800));
        subForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subFormMouseClicked(evt);
            }
        });

        record_penghuni.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(146, 180, 236));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 210, 76));

        table_penghuni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 2, true));
        table_penghuni.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        table_penghuni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMOR UNIT", "NAMA PENGHUNI", "TELEPONE", "EMAIL"
            }
        ));
        table_penghuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_penghuniMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_penghuni);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(421, 421, 421)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(235, 235, 235))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        btnSave_penghuni.setBackground(new java.awt.Color(204, 204, 204));
        btnSave_penghuni.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave_penghuni.setForeground(new java.awt.Color(255, 255, 255));
        btnSave_penghuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave_penghuni.setText("SIMPAN");
        btnSave_penghuni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave_penghuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave_penghuniActionPerformed(evt);
            }
        });

        btnPrint_penghuni.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint_penghuni.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrint_penghuni.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint_penghuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnPrint_penghuni.setText("PRINT ALL");
        btnPrint_penghuni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint_penghuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint_penghuniActionPerformed(evt);
            }
        });

        btnSearch_penghuni.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch_penghuni.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSearch_penghuni.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch_penghuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch_penghuni.setText("SEARCH");
        btnSearch_penghuni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch_penghuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_penghuniActionPerformed(evt);
            }
        });

        update_penghuni.setBackground(new java.awt.Color(204, 204, 204));
        update_penghuni.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        update_penghuni.setForeground(new java.awt.Color(255, 255, 255));
        update_penghuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        update_penghuni.setText("UPDATE");
        update_penghuni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_penghuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_penghuniActionPerformed(evt);
            }
        });

        unit_penghuni.setBackground(new java.awt.Color(204, 204, 204));
        unit_penghuni.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        unit_penghuni.setForeground(new java.awt.Color(255, 255, 255));
        unit_penghuni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_penghuni.setText("1101");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(146, 180, 236));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UNIT");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(146, 180, 236));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/literature.gif"))); // NOI18N

        phone_penghuni.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        phone_penghuni.setForeground(new java.awt.Color(51, 51, 51));
        phone_penghuni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phone_penghuni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telepone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        phone_penghuni.setMinimumSize(new java.awt.Dimension(150, 50));
        phone_penghuni.setPreferredSize(new java.awt.Dimension(150, 50));

        nama_penghuni.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nama_penghuni.setForeground(new java.awt.Color(51, 51, 51));
        nama_penghuni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nama_penghuni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nama Penghuni", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N

        email_penghuni.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        email_penghuni.setForeground(new java.awt.Color(51, 51, 51));
        email_penghuni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email_penghuni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N

        VNpayment.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        VNpayment.setForeground(new java.awt.Color(51, 51, 51));
        VNpayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VNpayment.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VNpayment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        VNpayment.setMinimumSize(new java.awt.Dimension(150, 50));
        VNpayment.setPreferredSize(new java.awt.Dimension(150, 50));
        VNpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout record_penghuniLayout = new javax.swing.GroupLayout(record_penghuni);
        record_penghuni.setLayout(record_penghuniLayout);
        record_penghuniLayout.setHorizontalGroup(
            record_penghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_penghuniLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGroup(record_penghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_penghuniLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnSearch_penghuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSave_penghuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(btnPrint_penghuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(update_penghuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(435, 435, 435))
                    .addGroup(record_penghuniLayout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(unit_penghuni)
                        .addGap(525, 525, 525))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, record_penghuniLayout.createSequentialGroup()
                .addGap(639, 639, 639)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(599, 599, 599))
            .addGroup(record_penghuniLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(record_penghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_penghuniLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60))
                    .addGroup(record_penghuniLayout.createSequentialGroup()
                        .addComponent(nama_penghuni)
                        .addGap(79, 79, 79)
                        .addComponent(email_penghuni)
                        .addGap(60, 60, 60)
                        .addComponent(phone_penghuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78)
                        .addComponent(VNpayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))))
        );
        record_penghuniLayout.setVerticalGroup(
            record_penghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, record_penghuniLayout.createSequentialGroup()
                .addGroup(record_penghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_penghuniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(record_penghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave_penghuni)
                            .addComponent(btnPrint_penghuni)
                            .addComponent(btnSearch_penghuni)
                            .addComponent(update_penghuni))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unit_penghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(record_penghuniLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(record_penghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_penghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_penghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_penghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VNpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1175, 1175, 1175))
        );

        subForm.addTab("DATA PENGHUNI", record_penghuni);

        record_pemakaian.setBackground(new java.awt.Color(255, 255, 255));

        table_pemakaian.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 2, true));
        table_pemakaian.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        table_pemakaian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TANGGAL", "NOMOR UNIT", "ANGKA AKHIR LISTRIK", "TOTAL PEMAKAIAN LISTRIK", "ANGKA AKHIR AIR", "TOTAL PEMAKAIAN AIR"
            }
        ));
        table_pemakaian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pemakaianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_pemakaian);

        jButton1.setBackground(new java.awt.Color(255, 210, 76));

        jButton2.setBackground(new java.awt.Color(146, 180, 236));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        totalPemakaianAir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        totalPemakaianAir.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Pemakaian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        totalPemakaianAir.setMinimumSize(new java.awt.Dimension(150, 50));

        akhirPemakaianAir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        akhirPemakaianAir.setForeground(new java.awt.Color(51, 51, 51));
        akhirPemakaianAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        akhirPemakaianAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Akhir Pemakaian Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N

        akhirPemakaianListrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        akhirPemakaianListrik.setForeground(new java.awt.Color(51, 51, 51));
        akhirPemakaianListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        akhirPemakaianListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Akhir Pemakaian Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N

        totalPemakaianListrik.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        totalPemakaianListrik.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Pemakaian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N
        totalPemakaianListrik.setMinimumSize(new java.awt.Dimension(150, 50));
        totalPemakaianListrik.setPreferredSize(new java.awt.Dimension(150, 50));
        totalPemakaianListrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPemakaianListrikActionPerformed(evt);
            }
        });

        unit_pemakaian.setBackground(new java.awt.Color(204, 204, 204));
        unit_pemakaian.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        unit_pemakaian.setForeground(new java.awt.Color(255, 255, 255));
        unit_pemakaian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_pemakaian.setText("1101");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(146, 180, 236));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("UNIT");

        listFasilitas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        listFasilitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Listrik", "Air", "Others" }));

        tanggal_akhir.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(akhirPemakaianListrik)
                            .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPemakaianAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(akhirPemakaianAir)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tanggal_awal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listFasilitas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unit_pemakaian))
                        .addGap(18, 18, 18)
                        .addComponent(tanggal_akhir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(380, 380, 380))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(listFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unit_pemakaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal_akhir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal_awal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akhirPemakaianListrik, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akhirPemakaianAir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPemakaianAir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnPrint_pemakaianByDate.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint_pemakaianByDate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrint_pemakaianByDate.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint_pemakaianByDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnPrint_pemakaianByDate.setText("PRINT By DATE");
        btnPrint_pemakaianByDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint_pemakaianByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint_pemakaianByDateActionPerformed(evt);
            }
        });

        btnSearch_pemaiakian.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch_pemaiakian.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSearch_pemaiakian.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch_pemaiakian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch_pemaiakian.setText("SEARCH");
        btnSearch_pemaiakian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch_pemaiakian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_pemaiakianActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(146, 180, 236));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/literature.gif"))); // NOI18N

        btnPrint_pemakaianAll.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint_pemakaianAll.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrint_pemakaianAll.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint_pemakaianAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnPrint_pemakaianAll.setText("PRINT ALL");
        btnPrint_pemakaianAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint_pemakaianAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint_pemakaianAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout record_pemakaianLayout = new javax.swing.GroupLayout(record_pemakaian);
        record_pemakaian.setLayout(record_pemakaianLayout);
        record_pemakaianLayout.setHorizontalGroup(
            record_pemakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_pemakaianLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(record_pemakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_pemakaianLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1378, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(record_pemakaianLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(172, 172, 172)
                        .addGroup(record_pemakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(record_pemakaianLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(btnPrint_pemakaianAll, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch_pemaiakian, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrint_pemakaianByDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(238, 238, 238))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(311, 311, 311))))
            .addGroup(record_pemakaianLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        record_pemakaianLayout.setVerticalGroup(
            record_pemakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_pemakaianLayout.createSequentialGroup()
                .addGroup(record_pemakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_pemakaianLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8))
                    .addGroup(record_pemakaianLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(record_pemakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrint_pemakaianByDate)
                            .addComponent(btnSearch_pemaiakian)
                            .addComponent(btnPrint_pemakaianAll))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(record_pemakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addGap(104, 104, 104))
        );

        subForm.addTab("DATA PEMAKAIAN", record_pemakaian);

        record_karyawan.setBackground(new java.awt.Color(255, 255, 255));

        table_karyawan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 2, true));
        table_karyawan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        table_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID KARYAWAN", "PASSWORD", "NAMA", "BAGIAN", "TELEPONE", "EMAIL"
            }
        ));
        jScrollPane4.setViewportView(table_karyawan);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        akhirPemakaianAir2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        akhirPemakaianAir2.setForeground(new java.awt.Color(51, 51, 51));
        akhirPemakaianAir2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        akhirPemakaianAir2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telepone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        id_users.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        id_users.setForeground(new java.awt.Color(51, 51, 51));
        id_users.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_users.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id Karyawan/Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        password.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(51, 51, 51));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        password.setMinimumSize(new java.awt.Dimension(150, 50));
        password.setPreferredSize(new java.awt.Dimension(150, 50));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        totalPemakaianAi1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        totalPemakaianAi1.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianAi1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianAi1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        totalPemakaianAi1.setMinimumSize(new java.awt.Dimension(150, 50));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NAMA");

        nama_staf.setBackground(new java.awt.Color(204, 204, 204));
        nama_staf.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nama_staf.setForeground(new java.awt.Color(255, 255, 255));
        nama_staf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nama_staf.setText("FENDY");
        nama_staf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nama_staf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_stafActionPerformed(evt);
            }
        });

        bagian.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        bagian.setForeground(new java.awt.Color(146, 180, 236));
        bagian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bagian.setText("ENGGINERING");
        bagian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bagian))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nama_staf))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_users)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPemakaianAi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(akhirPemakaianAir2))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama_staf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bagian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_users, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akhirPemakaianAir2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPemakaianAi1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        btnSave_kayawan.setBackground(new java.awt.Color(204, 204, 204));
        btnSave_kayawan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave_kayawan.setForeground(new java.awt.Color(255, 255, 255));
        btnSave_kayawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave_kayawan.setText("SIMPAN");
        btnSave_kayawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave_kayawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave_kayawanActionPerformed(evt);
            }
        });

        btnPrint_karyawan.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint_karyawan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrint_karyawan.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnPrint_karyawan.setText("PRINT ALL");
        btnPrint_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint_karyawanActionPerformed(evt);
            }
        });

        btnSearch_karyawan.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch_karyawan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSearch_karyawan.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch_karyawan.setText("SEARCH");
        btnSearch_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_karyawanActionPerformed(evt);
            }
        });

        update_karyawan.setBackground(new java.awt.Color(204, 204, 204));
        update_karyawan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        update_karyawan.setForeground(new java.awt.Color(255, 255, 255));
        update_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        update_karyawan.setText("UPDATE");
        update_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_karyawanActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(146, 180, 236));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/literature.gif"))); // NOI18N

        javax.swing.GroupLayout record_karyawanLayout = new javax.swing.GroupLayout(record_karyawan);
        record_karyawan.setLayout(record_karyawanLayout);
        record_karyawanLayout.setHorizontalGroup(
            record_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_karyawanLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGroup(record_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_karyawanLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnSearch_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave_kayawan, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btnPrint_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(402, 402, 402))
                    .addGroup(record_karyawanLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(record_karyawanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        record_karyawanLayout.setVerticalGroup(
            record_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_karyawanLayout.createSequentialGroup()
                .addGroup(record_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_karyawanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(record_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave_kayawan)
                            .addComponent(btnPrint_karyawan)
                            .addComponent(btnSearch_karyawan)
                            .addComponent(update_karyawan))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(record_karyawanLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        subForm.addTab("DATA KARYAWAN", record_karyawan);

        record_invoice.setBackground(new java.awt.Color(255, 255, 255));

        table_invoice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 2, true));
        table_invoice.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        table_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "INVOICE", "UNIT", "ID STAF", "ID MONTHLY", "TANGGAL", "TOTAL BIAYA"
            }
        ));
        table_invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_invoiceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_invoice);

        jButton3.setBackground(new java.awt.Color(255, 210, 76));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(146, 180, 236));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnPrint_invoiceByDate.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint_invoiceByDate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrint_invoiceByDate.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint_invoiceByDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnPrint_invoiceByDate.setText("PRINT By DATE");
        btnPrint_invoiceByDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint_invoiceByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint_invoiceByDateActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 8, true));

        id_invoice.setBackground(new java.awt.Color(204, 204, 204));
        id_invoice.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        id_invoice.setForeground(new java.awt.Color(255, 255, 255));
        id_invoice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_invoice.setText("INV/4/1101");
        id_invoice.setBorder(null);
        id_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_invoiceActionPerformed(evt);
            }
        });

        unit_invoice.setBackground(new java.awt.Color(204, 204, 204));
        unit_invoice.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        unit_invoice.setForeground(new java.awt.Color(255, 255, 255));
        unit_invoice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_invoice.setText("1101");
        unit_invoice.setBorder(null);
        unit_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit_invoiceActionPerformed(evt);
            }
        });

        biaya_tagihan.setBackground(new java.awt.Color(204, 204, 204));
        biaya_tagihan.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        biaya_tagihan.setForeground(new java.awt.Color(255, 210, 76));
        biaya_tagihan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        biaya_tagihan.setText("10.000.000");
        biaya_tagihan.setBorder(null);
        biaya_tagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biaya_tagihanActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 210, 76));
        jLabel5.setText("Rp.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(unit_invoice)
                        .addGap(225, 225, 225))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(id_invoice)
                        .addGap(159, 159, 159)))
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biaya_tagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(biaya_tagihan)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unit_invoice)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        delete.setText("DELETE");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(146, 180, 236));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/literature.gif"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 210, 76));
        jLabel11.setText("s/d");

        btnPrint_invoiceAll.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint_invoiceAll.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrint_invoiceAll.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint_invoiceAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnPrint_invoiceAll.setText("PRINT ALL");
        btnPrint_invoiceAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint_invoiceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint_invoiceAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout record_invoiceLayout = new javax.swing.GroupLayout(record_invoice);
        record_invoice.setLayout(record_invoiceLayout);
        record_invoiceLayout.setHorizontalGroup(
            record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_invoiceLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel4)
                .addGroup(record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_invoiceLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnPrint_invoiceAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint_invoiceByDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(416, 416, 416))
                    .addGroup(record_invoiceLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(record_invoiceLayout.createSequentialGroup()
                                .addGap(802, 802, 802)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, record_invoiceLayout.createSequentialGroup()
                                .addGroup(record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                                    .addGroup(record_invoiceLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel11)
                                        .addGap(104, 104, 104)
                                        .addComponent(dateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(229, 229, 229))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, record_invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        record_invoiceLayout.setVerticalGroup(
            record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, record_invoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(record_invoiceLayout.createSequentialGroup()
                            .addGroup(record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPrint_invoiceByDate)
                                .addComponent(delete)
                                .addComponent(btnPrint_invoiceAll))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addGap(9, 9, 9)
                            .addGroup(record_invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(record_invoiceLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel11))))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        subForm.addTab("DATA INVOICE", record_invoice);

        record_karyawan1.setBackground(new java.awt.Color(255, 255, 255));

        table_komplain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 2, true));
        table_komplain.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        table_komplain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID KARYAWAN", "PASSWORD", "NAMA", "BAGIAN", "TELEPONE", "EMAIL"
            }
        ));
        jScrollPane5.setViewportView(table_komplain);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NAMA");

        id_komplain.setBackground(new java.awt.Color(204, 204, 204));
        id_komplain.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        id_komplain.setForeground(new java.awt.Color(255, 255, 255));
        id_komplain.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_komplain.setText("KP001");
        id_komplain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id_komplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_komplainActionPerformed(evt);
            }
        });

        unit_komplain.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        unit_komplain.setForeground(new java.awt.Color(146, 180, 236));
        unit_komplain.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_komplain.setText("1101");
        unit_komplain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        isi_komplain.setColumns(20);
        isi_komplain.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        isi_komplain.setForeground(new java.awt.Color(102, 102, 102));
        isi_komplain.setRows(5);
        jScrollPane6.setViewportView(isi_komplain);

        selesai_komplain.setColumns(20);
        selesai_komplain.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        selesai_komplain.setForeground(new java.awt.Color(102, 102, 102));
        selesai_komplain.setRows(5);
        jScrollPane7.setViewportView(selesai_komplain);

        javax.swing.GroupLayout isDoneKomplainLayout = new javax.swing.GroupLayout(isDoneKomplain);
        isDoneKomplain.setLayout(isDoneKomplainLayout);
        isDoneKomplainLayout.setHorizontalGroup(
            isDoneKomplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        isDoneKomplainLayout.setVerticalGroup(
            isDoneKomplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(unit_komplain)
                    .addComponent(id_komplain, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                .addGap(327, 327, 327))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(isDoneKomplain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_komplain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unit_komplain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isDoneKomplain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        prntAll.setBackground(new java.awt.Color(204, 204, 204));
        prntAll.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        prntAll.setForeground(new java.awt.Color(255, 255, 255));
        prntAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        prntAll.setText("PRINT ALL");
        prntAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prntAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printAllKomplain(evt);
            }
        });

        btnSearch_komplain.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch_komplain.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSearch_komplain.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch_komplain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch_komplain.setText("SEARCH");
        btnSearch_komplain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch_komplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_komplainActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(146, 180, 236));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/literature.gif"))); // NOI18N

        javax.swing.GroupLayout record_karyawan1Layout = new javax.swing.GroupLayout(record_karyawan1);
        record_karyawan1.setLayout(record_karyawan1Layout);
        record_karyawan1Layout.setHorizontalGroup(
            record_karyawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_karyawan1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addGroup(record_karyawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_karyawan1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(btnSearch_komplain, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(prntAll, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addGap(650, 650, 650))
                    .addGroup(record_karyawan1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(319, 319, 319))))
            .addGroup(record_karyawan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        record_karyawan1Layout.setVerticalGroup(
            record_karyawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(record_karyawan1Layout.createSequentialGroup()
                .addGroup(record_karyawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(record_karyawan1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13))
                    .addGroup(record_karyawan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(record_karyawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prntAll)
                            .addComponent(btnSearch_komplain))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        subForm.addTab("DATA KOMPLAIN", record_karyawan1);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1442, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subForm, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1417, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(987, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pengecekanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengecekanMouseClicked
           Pengecekan page = null;
        try {
            page = new Pengecekan();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_pengecekanMouseClicked

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        popAcc.show(users,evt.getX(),evt.getY());
    }//GEN-LAST:event_usersMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
     // TODO log out from pop up
                int YN = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin LogOut ?", "Confrim LogOut", JOptionPane.YES_NO_OPTION);
        
        if(YN == 0){
                    try {
                        app = new App();
                    } catch (SQLException ex) {
                        Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profileActionPerformed

    private void validMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validMouseClicked
        // Open Dialog to Open Validation Form
         JOptionPane.showMessageDialog(null, "Validation Data Section, Harus melalui Section Pengecekan terlebih dahulu !!");
//                try {
//            new Confirm_isAccounting(null,true).show();
//            this.dispose();
//        } catch (SQLException ex) {
//            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_validMouseClicked

    private void biayaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biayaMouseClicked
        // Open form penghitungan biaya
        
        Hitung_Biaya page = null;
        try {
            page = new Hitung_Biaya();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_biayaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalPemakaianListrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPemakaianListrikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPemakaianListrikActionPerformed

    private void btnPrint_pemakaianByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint_pemakaianByDateActionPerformed
         HashMap parameter = new HashMap();
       SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
       String dateA = String.valueOf(dateSet.format(tanggal_awal.getDate()));
          String dateB = String.valueOf(dateSet.format(tanggal_akhir.getDate()));
        parameter.put("unit", unit_pemakaian.getText() );
        parameter.put("dateStart", dateA);
        parameter.put("dateEnd", dateB);
        System.out.println(dateA+dateB);
        
        try{
                     String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\PemakaianByDateUnit.jrxml";

                    
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, parameter, conn);
                    JasperViewer.viewReport(jp, false);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Print Failed !");
            System.out.println(e);
    }
    }//GEN-LAST:event_btnPrint_pemakaianByDateActionPerformed

    private void btnSearch_pemaiakianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_pemaiakianActionPerformed
            //find data pengecekan
        String unit = unit_penghuni.getText();
        SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
        String date = String.valueOf(dateSet.format(tanggal_akhir.getDate()));
        String fasilitas = listFasilitas.getSelectedItem().toString();
        
        findDataCek(unit,date,fasilitas);
        
    }//GEN-LAST:event_btnSearch_pemaiakianActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void VNpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNpaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VNpaymentActionPerformed

    private void btnSave_penghuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave_penghuniActionPerformed
        String unit = unit_penghuni.getText();
        String name = nama_penghuni.getText();
        String phone = phone_penghuni.getText();
        String email = email_penghuni.getText();
        String VN = VNpayment.getText();
        
        huni.insertPenghuni(unit, name, phone, email, VN);
        
    }//GEN-LAST:event_btnSave_penghuniActionPerformed

    private void btnPrint_penghuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint_penghuniActionPerformed
               // print semua
                        try{
                    String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\AllPenghuni.jrxml";

                   // InputStream report = getClass().getResourceAsStream("");
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                                        JasperViewer.viewReport(jp, false);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Tidak Bisa Review Print" + e);
                }
    }//GEN-LAST:event_btnPrint_penghuniActionPerformed

    private void btnSearch_penghuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_penghuniActionPerformed
        String unit = unit_penghuni.getText();
        searchPenghuni(unit);
    }//GEN-LAST:event_btnSearch_penghuniActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void btnSave_kayawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave_kayawanActionPerformed
        //insert new karyawan:
        String id_staf = id_users.getText();
        String Pass = password.getText();
        String Pos = bagian.getText();
        String phone = phone_penghuni.getText();
        String name = nama_staf.getText();
        String email = email_penghuni.getText();
        
        
     kry. insertKaryawan(id_staf,  Pass,  Pos ,name,  phone,  email) ;
    }//GEN-LAST:event_btnSave_kayawanActionPerformed

    private void btnPrint_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint_karyawanActionPerformed
                      // print semua
                        try{
                    String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\AllKaryawan.jrxml";

                   // InputStream report = getClass().getResourceAsStream("");
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                                        JasperViewer.viewReport(jp, false);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Tidak Bisa Review Print" + e);
                }
    }//GEN-LAST:event_btnPrint_karyawanActionPerformed

    private void btnSearch_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_karyawanActionPerformed
        //search karyawan dari staf tabel
        String id = id_users.getText();
        
        
       searchKaryawan(id);
    }//GEN-LAST:event_btnSearch_karyawanActionPerformed

    private void nama_stafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_stafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_stafActionPerformed

    private void komplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_komplainMouseClicked
                        // Open form Data 
        Komplain page = null;
        try {
            page = new Komplain();
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_komplainMouseClicked

    private void biaya_tagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biaya_tagihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biaya_tagihanActionPerformed

    private void unit_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit_invoiceActionPerformed

    private void id_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_invoiceActionPerformed

    private void btnPrint_invoiceByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint_invoiceByDateActionPerformed
        HashMap parameter = new HashMap();
       SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
       String dateA = String.valueOf(dateSet.format(dateStart.getDate()));
          String dateB = String.valueOf(dateSet.format(dateEnd.getDate()));
        parameter.put("unit", unit_invoice.getText() );
        parameter.put("dateStart", dateA);
        parameter.put("dateEnd", dateB);
        
        try{
                     String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\invoiceByDateUnit.jrxml";

                    
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, parameter, conn);
                    JasperViewer.viewReport(jp, false);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Print Failed !");
            System.out.println(e);
    }
    }//GEN-LAST:event_btnPrint_invoiceByDateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_invoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_invoiceMouseClicked
       //call selected row table invoice 
        getRowItemInvoice();
    }//GEN-LAST:event_table_invoiceMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // deleted invoice data by id invoice
        String id = id_invoice.getText();
        
        inv.deleteInvoice(id);
    }//GEN-LAST:event_deleteActionPerformed

    private void table_penghuniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_penghuniMouseClicked
       getRowItemPenghuni();
    }//GEN-LAST:event_table_penghuniMouseClicked

    private void table_pemakaianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pemakaianMouseClicked
        getRowItemPemakaian();
    }//GEN-LAST:event_table_pemakaianMouseClicked

    private void btnPrint_invoiceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint_invoiceAllActionPerformed
        // print semua
                        try{
                    String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\All_Invoice.jrxml";

                   // InputStream report = getClass().getResourceAsStream("");
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                                        JasperViewer.viewReport(jp, false);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Tidak Bisa Review Print" );
                    System.out.println(e);
                }
    }//GEN-LAST:event_btnPrint_invoiceAllActionPerformed

    private void btnPrint_pemakaianAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint_pemakaianAllActionPerformed
                // print semua
                        try{
                    String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\AllPemakaian.jrxml";

                   // InputStream report = getClass().getResourceAsStream("");
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                                        JasperViewer.viewReport(jp, false);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Tidak Bisa Review Print" );
                    System.out.println(e);
                }
    }//GEN-LAST:event_btnPrint_pemakaianAllActionPerformed

    private void update_penghuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_penghuniActionPerformed
     //update penghuni
     String unit = unit_penghuni.getText();
     String  name = nama_penghuni.getText();
     String phone = phone_penghuni.getText();
     String email = email_penghuni.getText();
     String VN = VNpayment.getText();
     
     
     huni.updatePenghuni(unit, name, phone, email, VN);
    }//GEN-LAST:event_update_penghuniActionPerformed

    private void subFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subFormMouseClicked
      //show data tabel
      table_pemakaian.setModel(cek.showData());
      table_penghuni.setModel(huni.showData());
        table_karyawan.setModel(kry.showData());
        table_invoice.setModel(inv.showDataInvoice());
        table_komplain.setModel(komp.showData());
    }//GEN-LAST:event_subFormMouseClicked

    private void update_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_karyawanActionPerformed
       //update data karyawan by id
     
         String id_staf = id_users.getText();
        String Pass = password.getText();
        String Pos = bagian.getText();
        String phone = phone_penghuni.getText();
        String name = nama_staf.getText();
        String email = email_penghuni.getText();

     
       
       
       kry.updateKaryawan( id_staf, Pass,  Pos , name,  phone,  email); 
    }//GEN-LAST:event_update_karyawanActionPerformed

    private void id_komplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_komplainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_komplainActionPerformed

    private void printAllKomplain(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printAllKomplain
                        // print semua
                        try{
                    String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\AllKomplain.jrxml";

                   // InputStream report = getClass().getResourceAsStream("");
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                                        JasperViewer.viewReport(jp, false);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Tidak Bisa Review Print" );
                    System.out.println(e);
                }
    }//GEN-LAST:event_printAllKomplain

    private void btnSearch_komplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_komplainActionPerformed
        // search komplain
        String idkomplain = id_komplain.getText();
        
        
        searchKomplian(idkomplain);
    }//GEN-LAST:event_btnSearch_komplainActionPerformed

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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                try {
                    new Data().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VNpayment;
    private javax.swing.JTextField akhirPemakaianAir;
    private javax.swing.JTextField akhirPemakaianAir2;
    private javax.swing.JTextField akhirPemakaianListrik;
    private javax.swing.JPanel background;
    private javax.swing.JTextField bagian;
    private javax.swing.JLabel biaya;
    private javax.swing.JTextField biaya_tagihan;
    private javax.swing.JButton btnPrint_invoiceAll;
    private javax.swing.JButton btnPrint_invoiceByDate;
    private javax.swing.JButton btnPrint_karyawan;
    private javax.swing.JButton btnPrint_pemakaianAll;
    private javax.swing.JButton btnPrint_pemakaianByDate;
    private javax.swing.JButton btnPrint_penghuni;
    private javax.swing.JButton btnSave_kayawan;
    private javax.swing.JButton btnSave_penghuni;
    private javax.swing.JButton btnSearch_karyawan;
    private javax.swing.JButton btnSearch_komplain;
    private javax.swing.JButton btnSearch_pemaiakian;
    private javax.swing.JButton btnSearch_penghuni;
    private javax.swing.JLabel data;
    private com.toedter.calendar.JDateChooser dateEnd;
    private com.toedter.calendar.JDateChooser dateStart;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email_penghuni;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JTextField id_invoice;
    private javax.swing.JTextField id_komplain;
    private javax.swing.JTextField id_users;
    private javax.swing.JPanel isDoneKomplain;
    private javax.swing.JTextArea isi_komplain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel komplain;
    private javax.swing.JLabel komplain1;
    public static final transient javax.swing.JComboBox<String> listFasilitas = new javax.swing.JComboBox<>();
    private javax.swing.JMenuItem logout;
    public static final javax.swing.JLabel nama = new javax.swing.JLabel();
    private javax.swing.JTextField nama_penghuni;
    private javax.swing.JTextField nama_staf;
    private javax.swing.JTextField password;
    private javax.swing.JLabel pengecekan;
    private javax.swing.JTextField phone_penghuni;
    private javax.swing.JPopupMenu popAcc;
    private javax.swing.JButton prntAll;
    private javax.swing.JMenuItem profile;
    private javax.swing.JPanel record_invoice;
    private javax.swing.JPanel record_karyawan;
    private javax.swing.JPanel record_karyawan1;
    private javax.swing.JPanel record_pemakaian;
    private javax.swing.JPanel record_penghuni;
    private javax.swing.JTextArea selesai_komplain;
    private javax.swing.JTabbedPane subForm;
    private javax.swing.JTable table_invoice;
    private javax.swing.JTable table_karyawan;
    private javax.swing.JTable table_komplain;
    private javax.swing.JTable table_pemakaian;
    private javax.swing.JTable table_penghuni;
    public static final transient com.toedter.calendar.JDateChooser tanggal_akhir = new com.toedter.calendar.JDateChooser();
    public static final transient com.toedter.calendar.JDateChooser tanggal_awal = new com.toedter.calendar.JDateChooser();
    private javax.swing.JPanel topBar;
    private javax.swing.JTextField totalPemakaianAi1;
    private javax.swing.JTextField totalPemakaianAir;
    private javax.swing.JTextField totalPemakaianListrik;
    private javax.swing.JTextField unit_invoice;
    private javax.swing.JTextField unit_komplain;
    private javax.swing.JTextField unit_pemakaian;
    private javax.swing.JTextField unit_penghuni;
    private javax.swing.JButton update_karyawan;
    private javax.swing.JButton update_penghuni;
    private javax.swing.JPanel users;
    private javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables
    //clear 
    private void clearPegnhuni(){
        unit_penghuni.setText("");
        phone_penghuni.setText("");
        nama_penghuni.setText("");
        email_penghuni.setText("");
        VNpayment.setText("");
    }
    
    private void clearInvoice(){
        unit_invoice.setText("");
        id_invoice.setText("");
        biaya_tagihan.setText("");
    }

//section invoice data
         //get item row
    private void getRowItemInvoice() {
        
        //get row
        int row = table_invoice.getSelectedRow();
        
      
        //put value to editable
        unit_invoice.setText( table_invoice.getModel().getValueAt(row, 1).toString());
        
        id_invoice.setText( table_invoice.getModel().getValueAt(row, 0).toString());
        biaya_tagihan.setText(table_invoice.getModel().getValueAt(row, 5).toString());

        }
    
    //akhir sction data invoice
    //section dat penghuni
       
    private void searchPenghuni(String unit) {
        try{
                   for(int i=0; i<huniModel.size(); i++){
                            if(huniModel.get(i).getUnit().equals(unit)) {
                               String name = huniModel.get(i).getName();
                               String phone = huniModel.get(i).getPhone();
                               String email = huniModel.get(i).getEmail();
                               String VN = huniModel.get(i).getVNpayment();
                               
                               //put
                              nama_penghuni.setText(name);
                              phone_penghuni.setText(phone);
                              email_penghuni.setText(email);
                              VNpayment.setText(VN);
                            }
                       }
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Unit :"+unit+"is Not Available");
        }
    
    }
    
       private void getRowItemPenghuni() {
        
        //get row
        int row = table_penghuni.getSelectedRow();
        
      
        //put value to editable
        unit_penghuni.setText( table_penghuni.getModel().getValueAt(row, 0).toString());
        
         nama_penghuni.setText(table_penghuni.getModel().getValueAt(row, 1).toString());
         phone_penghuni.setText(table_penghuni.getModel().getValueAt(row, 2).toString());
        email_penghuni.setText(table_penghuni.getModel().getValueAt(row, 3).toString());
       VNpayment.setText(table_penghuni.getModel().getValueAt(row, 4).toString());

        }
        
    //akhit section penghuni
       
    //section pemakaian data   
    private void getRowItemPemakaian() {
                //get row
        int row = table_pemakaian.getSelectedRow();
        
      
        //put value to editable
        unit_pemakaian.setText( table_pemakaian.getModel().getValueAt(row, 0).toString());
        String a = table_pemakaian.getModel().getValueAt(row, 4).toString();
                // condition choice facility
        if(a.equals("Listrik")){
            akhirPemakaianListrik.setText(table_pemakaian.getModel().getValueAt(row, 5).toString());
            totalPemakaianListrik.setText(table_pemakaian.getModel().getValueAt(row, 6).toString());
        }else if(a.equals("Air")){
            akhirPemakaianAir.setText(table_pemakaian.getModel().getValueAt(row, 5).toString());
            totalPemakaianAir.setText(table_pemakaian.getModel().getValueAt(row, 6).toString());
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
//seacrh karyawan
    private void searchKaryawan(String id) {
            System.out.println(id);
            for(int i =0; i<karyModel.size(); i++){
                if(karyModel.get(i).getId_staf().equals(id)){
                    String name = karyModel.get(i).getName();
                    String posisi = karyModel.get(i).getPosition();
                    String phone = karyModel.get(i).getPhone();
                    String email = karyModel.get(i).getEmail();
                    
                    //put
                    nama_penghuni.setText(name);
                    bagian.setText(posisi);
                    phone_penghuni.setText(phone);
                    email_penghuni.setText(email);
            }
      }
    }
//cari komplain
    private void searchKomplian(String id_komplain) {  
                   for(int i=0; i<kompModel.size(); i++){
                            if(kompModel.get(i).getId_komplain().equals(id_komplain)) {
                               String proses = kompModel.get(i).getProgres();
                               String komplains = kompModel.get(i).getKomplain();
                               String unit = kompModel.get(i).getNo_unit();
                              
                            if(kompModel.get(i).getIsDone().equals(true)) {
                                //hijau
                               Color color = new Color(204,250,204);
                               isDoneKomplain.setBackground(color);
                            }else if(kompModel.get(i).getIsDone().equals(false)){
                                //kuning
                               Color color = new Color(250,210,76);
                              isDoneKomplain.setBackground(color);
                            }
               
                              
                               //put
                               selesai_komplain.setText(proses);
                              isi_komplain.setText(komplains);
                               unit_komplain.setText(unit);
                            }
                       }
     }
}

