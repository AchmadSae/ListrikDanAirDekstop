
package ListrikDanAirApps;

import config.Connection_db;
import config.See_Profile;
import dataTable.InvoiceNeeds.ControllerInvoice;
import static dataTable.InvoiceNeeds.ControllerInvoice.CekAllInvoice;
import dataTable.InvoiceNeeds.ModelInvoice;
import dataTable.PengecekanNeeds.ControllerPengecekan;
import static dataTable.PengecekanNeeds.ControllerPengecekan.CekAll;
import dataTable.PengecekanNeeds.ModelPengecekan;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Hitung_Biaya extends javax.swing.JFrame {
    App app;
       //create objek controller
    ControllerPengecekan cek = new ControllerPengecekan();
    //create objek controller invoice
    ControllerInvoice inv = new ControllerInvoice();
    //create model pengecekan
    ArrayList<ModelPengecekan> cekModel = CekAll();
    //create model invoice
    ArrayList<ModelInvoice> invModel = CekAllInvoice();
    //create object class login section
    static private Connection conn = new Connection_db().Connect();
    java.sql.Statement stm = conn.createStatement();
    //create byte objek for photo 
    
    public Hitung_Biaya()throws SQLException, ClassNotFoundException {
        initComponents();
        Toolkit kit = getToolkit();
        Dimension size = kit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_app.png")));
        
        tablePengecekan.setModel(cek.showData());
        tableInvoice.setModel(inv.showDataInvoice());
        //request focus
        no_invoice.requestFocus();
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        no_invoice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        id_staf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        tanggal = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        biaya_air = new javax.swing.JLabel();
        biaya_listrik = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        no_unit = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        btnPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInvoice = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        totalPemakaianListrik = new javax.swing.JTextField();
        angkaListrik = new javax.swing.JTextField();
        angkaAir = new javax.swing.JTextField();
        totalPemakaianAir = new javax.swing.JTextField();
        tambahanAir = new javax.swing.JTextField();
        tambahanListrik = new javax.swing.JTextField();
        cariUnit = new javax.swing.JTextField();
        id_monthly = new javax.swing.JTextField();

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
        pengecekan.setForeground(new java.awt.Color(255, 255, 255));
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
        biaya.setForeground(new java.awt.Color(255, 210, 76));
        biaya.setText("BIAYA");
        biaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 180, 236), 4, true));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(146, 180, 236));
        jLabel4.setText("CREATE INVOICE NUMBER");

        no_invoice.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        no_invoice.setForeground(new java.awt.Color(146, 180, 236));
        no_invoice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no_invoice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(146, 180, 236));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reEdit.gif"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("format : INV/BR+bulan/+tahun/+nomor unit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(no_invoice))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_invoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(8, 8, 8))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        id_staf.setBackground(new java.awt.Color(204, 204, 204));
        id_staf.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        id_staf.setForeground(new java.awt.Color(255, 255, 255));
        id_staf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_staf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id Staf", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(id_staf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(id_staf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jSeparator2.setBackground(new java.awt.Color(146, 180, 236));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setBackground(new java.awt.Color(255, 210, 76));

        jButton2.setBackground(new java.awt.Color(146, 180, 236));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("BIAYA PEMAKAIAN AIR");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("BIAYA PEMAKAIAN LISTRIK");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("TOTAL PEMBAYARAN");

        total.setBackground(new java.awt.Color(204, 204, 204));
        total.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        total.setForeground(new java.awt.Color(255, 210, 76));
        total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total.setText("10.000.000");
        total.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMouseClicked(evt);
            }
        });

        biaya_air.setBackground(new java.awt.Color(204, 204, 204));
        biaya_air.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        biaya_air.setForeground(new java.awt.Color(255, 210, 76));
        biaya_air.setText("****");
        biaya_air.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                biaya_airMouseClicked(evt);
            }
        });

        biaya_listrik.setBackground(new java.awt.Color(204, 204, 204));
        biaya_listrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        biaya_listrik.setForeground(new java.awt.Color(255, 210, 76));
        biaya_listrik.setText("****");

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 210, 76));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Rp.");

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 210, 76));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Rp.");

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 210, 76));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Rp.");

        no_unit.setBackground(new java.awt.Color(255, 255, 255));
        no_unit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        no_unit.setForeground(new java.awt.Color(146, 180, 236));
        no_unit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no_unit.setText("1101");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(biaya_air, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(biaya_listrik, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(21, 21, 21)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(no_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(biaya_air, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biaya_listrik, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        tablePengecekan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tablePengecekan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UNIT", "TANGGAL", "ID STAF", "FASILITAS", "ANGKA METERAN", "TOTAL PAKAI"
            }
        ));
        tablePengecekan.setSelectionBackground(new java.awt.Color(146, 180, 236));
        tablePengecekan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePengecekanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePengecekan);

        btnPrint.setBackground(new java.awt.Color(204, 204, 204));
        btnPrint.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave.setText("SIMPAN");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tableInvoice.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tableInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "INVOICE", "UNIT", "ID STAF", "ID MONTHLY", "TANGGAL", "TOTAL BIAYA"
            }
        ));
        tableInvoice.setSelectionBackground(new java.awt.Color(146, 180, 236));
        tableInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInvoiceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableInvoice);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        totalPemakaianListrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        totalPemakaianListrik.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Pemakaian Listrik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N
        totalPemakaianListrik.setMinimumSize(new java.awt.Dimension(150, 40));
        totalPemakaianListrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPemakaianListrikActionPerformed(evt);
            }
        });

        angkaListrik.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        angkaListrik.setForeground(new java.awt.Color(51, 51, 51));
        angkaListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        angkaListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Angka Meteran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N

        angkaAir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        angkaAir.setForeground(new java.awt.Color(51, 51, 51));
        angkaAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        angkaAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Angka Meteran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        angkaAir.setMinimumSize(new java.awt.Dimension(150, 40));

        totalPemakaianAir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        totalPemakaianAir.setForeground(new java.awt.Color(51, 51, 51));
        totalPemakaianAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPemakaianAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Akhir Pemakaian Air", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N

        tambahanAir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tambahanAir.setForeground(new java.awt.Color(51, 51, 51));
        tambahanAir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tambahanAir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Additional Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(146, 180, 236))); // NOI18N
        tambahanAir.setMinimumSize(new java.awt.Dimension(150, 50));
        tambahanAir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tambahanAirKeyPressed(evt);
            }
        });

        tambahanListrik.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tambahanListrik.setForeground(new java.awt.Color(51, 51, 51));
        tambahanListrik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tambahanListrik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Additional Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12), new java.awt.Color(255, 210, 76))); // NOI18N
        tambahanListrik.setMinimumSize(new java.awt.Dimension(150, 50));
        tambahanListrik.setPreferredSize(new java.awt.Dimension(150, 50));
        tambahanListrik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tambahanListrikKeyPressed(evt);
            }
        });

        cariUnit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cariUnit.setForeground(new java.awt.Color(102, 102, 102));
        cariUnit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cariUnit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cari Unit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        cariUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariUnitKeyPressed(evt);
            }
        });

        listFasilitas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        listFasilitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Listrik", "Air", "Others" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(angkaListrik)
                    .addComponent(tambahanListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(listFasilitas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalPemakaianAir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(cariUnit)
                    .addComponent(angkaAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tambahanAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cariUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(listFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPemakaianListrik, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPemakaianAir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angkaListrik, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaAir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tambahanListrik, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(tambahanAir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        id_monthly.setBackground(new java.awt.Color(204, 204, 204));
        id_monthly.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        id_monthly.setForeground(new java.awt.Color(255, 255, 255));
        id_monthly.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_monthly.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id Monthly", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        id_monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_monthlyActionPerformed(evt);
            }
        });
        id_monthly.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_monthlyKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(96, 96, 96))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(id_monthly, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(253, 253, 253))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(261, 261, 261)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(id_monthly, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnPrint)
                            .addComponent(btnSearch)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        String account = nama.getText();
        home.setVisible(true);
                   home.pack();
                   this.dispose();
                   home.Home_nama.setText(account);
    }//GEN-LAST:event_homeLogoMouseClicked

    private void validMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validMouseClicked
//                int YN = JOptionPane.showConfirmDialog(null, "Anda ke Validation ?", "Don't Close App When Still in Login Section", JOptionPane.YES_NO_OPTION);
                    JOptionPane.showMessageDialog(null, "Validation Data Section, Harus melalui Section Pengecekan terlebih dahulu !!");
//        if(YN == 0){
//                    try {
//                         new Confirm_isAccounting(null,true).show();
//                         this.dispose();
//                    } catch (SQLException ex) {
//                       Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
//                    } catch (ClassNotFoundException ex) {
//                       Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                    app.setVisible(true);
//                    this.dispose();
//                    
//        }else
//            if(YN == 1){
//                this.setVisible(true);
//            }

    }//GEN-LAST:event_validMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
             // TODO log out from pop up
                int YN = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin LogOut ?", "Confrim LogOut", JOptionPane.YES_NO_OPTION);
        
        if(YN == 0){
                    try {
                        app = new App();
                    } catch (SQLException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profileActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

       SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
       String date = String.valueOf(dateSet.format(tanggal.getDate()));
       String id_mon = id_monthly.getText();
       Integer tot = Integer.parseInt(total.getText());
       String id_invoice = no_invoice.getText();
       String username = id_staf.getText();
        
        inv.insertProgres(id_invoice,username,id_mon,date,tot);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // print faktur invoice
        HashMap parameter = new HashMap();
        parameter.put("billListrik", biaya_listrik.getText() );
        parameter.put("billAir", biaya_air.getText());
        parameter.put("numberListrik", angkaListrik.getText());
        parameter.put("numberAir", angkaAir.getText());
        parameter.put("invoice", no_invoice.getText());
        parameter.put("unit", no_unit.getText());
        
        try{
                     String report = "\\temporary_project\\NetBeansProjects\\ListrikDanAirApps\\app\\src\\main\\java\\ReportPrint\\invoice.jrxml";

                    
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, parameter, conn);
                    JasperViewer.viewReport(jp, false);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Print Failed !");
            System.out.println(e);
    }
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String unit = cariUnit.getText();
        String invoice = no_invoice.getText();
      
         System.out.println("enter search progres by unit :"+invoice);
          findInvoice(unit, invoice);
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
                // Open form Data 
        Data page = null;
        try {
            page = new Data();
        } catch (SQLException ex) {
            Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_dataMouseClicked

    private void komplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_komplainMouseClicked
                       // Open form Komplain
        Komplain page = null;
        try {
            page = new Komplain();
        } catch (SQLException ex) {
            Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
        }
        String account = nama.getText();
        page.setVisible(true);
        page.setExtendedState(MAXIMIZED_BOTH);
                   page.pack();
                   this.dispose();
                   page.nama.setText(account);
    }//GEN-LAST:event_komplainMouseClicked

    private void tablePengecekanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePengecekanMouseClicked
        getRowItemPengecekan();
       
    }//GEN-LAST:event_tablePengecekanMouseClicked

    private void cariUnitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariUnitKeyPressed
       String unit = cariUnit.getText();
       SimpleDateFormat dateSet = new SimpleDateFormat("yyyy-MM-dd");
       String date = String.valueOf(dateSet.format(tanggal.getDate()));
       String fasilitas = listFasilitas.getSelectedItem().toString();
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            System.out.println("enter search progres by unit :"+unit);
             findDataPakai(unit, date, fasilitas);
        }
    }//GEN-LAST:event_cariUnitKeyPressed

    private void id_monthlyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_monthlyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_monthlyKeyPressed

    private void id_monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_monthlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_monthlyActionPerformed

    private void tambahanListrikKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahanListrikKeyPressed
        try {
        Integer a = Integer.parseInt(totalPemakaianListrik.getText());
        Integer b = Integer.parseInt(angkaListrik.getText());
        Integer c = Integer.parseInt(tambahanListrik.getText());
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            System.out.println("enter sum  :"+c);
            totLis = (a*b)+c;
            biaya_listrik.setText(totLis.toString());
        }
        }catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
        
    }//GEN-LAST:event_tambahanListrikKeyPressed

    private void totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseClicked
       Integer tot = totLis + totAir;
       
       total.setText(tot.toString());
    }//GEN-LAST:event_totalMouseClicked

    private void tableInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInvoiceMouseClicked
        getRowItemInvoice();
    }//GEN-LAST:event_tableInvoiceMouseClicked

    private void biaya_airMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biaya_airMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_biaya_airMouseClicked

    private void tambahanAirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahanAirKeyPressed
             try {   
        Integer a = Integer.parseInt(totalPemakaianAir.getText());
        Integer b = Integer.parseInt(angkaAir.getText());
        Integer c = Integer.parseInt(tambahanAir.getText());
          if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            System.out.println("enter sum  :"+c);
            totAir = (a*b)+c;}
          biaya_air.setText(totAir.toString());
        } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            }
    }//GEN-LAST:event_tambahanAirKeyPressed

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
            java.util.logging.Logger.getLogger(Hitung_Biaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hitung_Biaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hitung_Biaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hitung_Biaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                try {
                    new Hitung_Biaya().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Hitung_Biaya.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angkaAir;
    private javax.swing.JTextField angkaListrik;
    private javax.swing.JPanel background;
    private javax.swing.JLabel biaya;
    private javax.swing.JLabel biaya_air;
    private javax.swing.JLabel biaya_listrik;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField cariUnit;
    private javax.swing.JLabel data;
    private javax.swing.JPanel header;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JTextField id_monthly;
    private javax.swing.JTextField id_staf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel komplain;
    private javax.swing.JLabel komplain1;
    public static final transient javax.swing.JComboBox<String> listFasilitas = new javax.swing.JComboBox<>();
    private javax.swing.JMenuItem logout;
    public static final javax.swing.JLabel nama = new javax.swing.JLabel();
    private javax.swing.JTextField no_invoice;
    private javax.swing.JLabel no_unit;
    private javax.swing.JLabel pengecekan;
    private javax.swing.JPopupMenu popAcc;
    private javax.swing.JMenuItem profile;
    private javax.swing.JTable tableInvoice;
    public static final transient javax.swing.JTable tablePengecekan = new javax.swing.JTable();
    private javax.swing.JTextField tambahanAir;
    private javax.swing.JTextField tambahanListrik;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totalPemakaianAir;
    private javax.swing.JTextField totalPemakaianListrik;
    private javax.swing.JPanel users;
    private javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables

      //get item row table pngecekan
    private void getRowItemPengecekan() {
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
        id_staf.setText(tablePengecekan.getModel().getValueAt(row, 2).toString());
        tanggal.setDate(dateView);
        String a = tablePengecekan.getModel().getValueAt(row, 4).toString();
        // condition choice facility
        if(a.equals("Listrik")){
            angkaListrik.setText(tablePengecekan.getModel().getValueAt(row, 5).toString());
            totalPemakaianListrik.setText(tablePengecekan.getModel().getValueAt(row, 6).toString());
        }else if(a.equals("Air")){
            angkaAir.setText(tablePengecekan.getModel().getValueAt(row, 5).toString());
            totalPemakaianAir.setText(tablePengecekan.getModel().getValueAt(row, 6).toString());
        }
        
    }
        //get item row
    private void getRowItemInvoice() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        
        //get row
        int row = tableInvoice.getSelectedRow();
        
         //for date , must be parse before
        Date dateView = null;
        try {
                dateView = date.parse((String)  tableInvoice.getValueAt(row, 4));
        }catch (ParseException ex) {
            Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //put value to editable
        no_invoice.setText( tableInvoice.getModel().getValueAt(row, 0).toString());
        tanggal.setDate(dateView);
        no_unit.setText( tableInvoice.getModel().getValueAt(row, 1).toString());
        id_staf.setText(tableInvoice.getModel().getValueAt(row, 2).toString());
        id_monthly.setText(tableInvoice.getModel().getValueAt(row, 3).toString());
        // condition choice facility
            total.setText(tableInvoice.getModel().getValueAt(row, 5).toString());
        }
      //find data invoice dan pengecekan
    private void findDataPakai(String unit, String date, String fasilitas) {
        System.out.println("set number prev :"+date+fasilitas+unit);
       try {
                   for(int i=0; i<cekModel.size(); i++){
                    if(cekModel.get(i).getDate().equals(date) && cekModel.get(i).getName().equals(fasilitas) && cekModel.get(i).getUnit().equals(unit)) {
                        String current_number = cekModel.get(i).getCurrent_number().toString();
                        String amount = cekModel.get(i).getAmount().toString();
                       if(fasilitas.equals("Listrik")){
                          angkaListrik.setText(current_number);
                           totalPemakaianListrik.setText(amount);
                       }else if(fasilitas.equals("Air")){
                          angkaAir.setText(current_number);
                           totalPemakaianAir.setText(amount);
                     }
                    }
                   }         
         }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Date and Unit Empty !");
       }
       

    }
        private void findInvoice(String unit, String invoice){
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("set number prev :"+invoice+unit);
        for(int i=0; i<invModel.size(); i++){
                  if(invModel.get(i).getId_invoice().equals(invoice) && cekModel.get(i).getUnit().equals(unit)) {
                           Date dateView = null;
                             try {
                                 dateView = date.parse((String)  invModel.get(i).getDate());
                            }catch (ParseException ex) {
                                Logger.getLogger(Pengecekan.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        String units = invModel.get(i).getUnit();
                        String staf = invModel.get(i).getId_staf();
                        String tot = invModel.get(i).getTotal_cost().toString();
                             
                      no_unit.setText(units);
                      id_staf.setText(staf);
                      
                      tanggal.setDate(dateView);
                      total.setText(tot);
                 }
         }
    }
    Integer totAir = null; 
    Integer totLis = null;
}
