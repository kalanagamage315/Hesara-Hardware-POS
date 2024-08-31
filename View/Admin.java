/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Item;
import Controller.DateTime;
import Model.ConnectionProvider;
import Model.GetFromDatabase;
import Model.InsertUpdateDelete;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.ValidateEmployee;
import Controller.ValidateStockBill;
import Controller.ValidateBilling;
import Model.SalesCostProfit;
import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import javax.swing.JFileChooser;
import javax.swing.table.TableModel;

/**
 *
 * @author kalan
 */
public class Admin extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Admin = new javax.swing.JTabbedPane();
        AdminEmployee = new javax.swing.JTabbedPane();
        AdminAddEmployee = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtadEmpAddname = new javax.swing.JTextField();
        txtadEmpAdduname = new javax.swing.JTextField();
        txtadEmpAddmobile = new javax.swing.JTextField();
        txtadEmpAddtele = new javax.swing.JTextField();
        btnaddEmployee = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtadEmpAddpswd = new javax.swing.JPasswordField();
        Utype = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        AdminDeleteEmployee = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtadEmpDelete = new javax.swing.JTextField();
        btnadEmpDelete = new javax.swing.JButton();
        AdminUpdateEmployee = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtadEmpUpname = new javax.swing.JTextField();
        txtadEmpUpmobile = new javax.swing.JTextField();
        txtadEmpUptele = new javax.swing.JTextField();
        btnadEmpUpdate = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtadEmpUpnameprev = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        txtadEmpDataName = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtadEmpDataMob = new javax.swing.JTextField();
        txtadEmpDataTele = new javax.swing.JTextField();
        GetEmpData = new javax.swing.JButton();
        AdminReports = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        ItemRepGen = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        repItem = new javax.swing.JTable();
        ItmRptClearbtn = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        txtRptFletter = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TotItemCost = new javax.swing.JTextField();
        itmRepGen = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        StockItemCount = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        btnweeklysale = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Dailysales = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TOTinLastWeek = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        SalesID = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        totCostofsalesday = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        dailyProfit = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        btnMonthlysale = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        TOTinMonth = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        Year = new javax.swing.JTextField();
        Month = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        SalesID1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        Dailysales2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        ProfitofSale = new javax.swing.JTextField();
        totCostOfsales = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        DeleSTDate = new javax.swing.JTextField();
        AdminBilling = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adBillTB = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtadBillIcode = new javax.swing.JTextField();
        btnadBillRemove = new javax.swing.JButton();
        txtadBillRemove = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtadBillIcount = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtadBillTotal = new javax.swing.JTextField();
        txtadBillTotalDisc = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtadBillPay = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtadBillBalance = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        btnadBillClear = new javax.swing.JButton();
        btnadBill2 = new javax.swing.JButton();
        CalFinalPayable = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        txtadTotalPayableAmount = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        billShowStock = new javax.swing.JTable();
        CheckStkBill = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BillID = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        CancelBill = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        btnadAddItm = new javax.swing.JButton();
        aditmGivenPrice = new javax.swing.JTextField();
        aditmDisc = new javax.swing.JTextField();
        aditmQuant = new javax.swing.JTextField();
        btnCancelAfterBill = new javax.swing.JButton();
        AdminStock = new javax.swing.JTabbedPane();
        AdminAddStock = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtadAddIcode = new javax.swing.JTextField();
        txtadAddIname = new javax.swing.JTextField();
        txtadAddIbuy = new javax.swing.JTextField();
        txtadAddIuni = new javax.swing.JTextField();
        txtadAddIquant = new javax.swing.JTextField();
        btnadAdd = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        comboadAddunit = new javax.swing.JComboBox<>();
        btnAddSTclear = new javax.swing.JButton();
        txtadStDisc = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        AdminViewStock = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnCheckSTK = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtcaViewStk = new javax.swing.JTextField();
        ClearCheckstk = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        caCheckStTb = new javax.swing.JTable();
        AdminUpdateStock = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtadStUpIcode = new javax.swing.JTextField();
        txtadStUpIname = new javax.swing.JTextField();
        txtUpbyprice = new javax.swing.JTextField();
        txtUpuniprice = new javax.swing.JTextField();
        txtUpIquant = new javax.swing.JTextField();
        btnUpdateItem = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        comboadUpunit = new javax.swing.JComboBox<>();
        StUpdateClear = new javax.swing.JButton();
        Setvalbtn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        caCheckStTb1 = new javax.swing.JTable();
        ClearCheckstk1 = new javax.swing.JButton();
        btnCheckSTK1 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        newItmCode = new javax.swing.JTextField();
        txtUpdisc = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AdminDeleteStock = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtDeleteItm = new javax.swing.JTextField();
        btnDeleteCheck = new javax.swing.JButton();
        btnDeleteClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        DeleteStTable = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hesara Hardware");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        Admin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AdminEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AdminAddEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Name");
        jPanel18.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("User Name");
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Password");
        jPanel18.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Mobile Number");
        jPanel18.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Telephone");
        jPanel18.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        txtadEmpAddname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel18.add(txtadEmpAddname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, -1));

        txtadEmpAdduname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel18.add(txtadEmpAdduname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 260, -1));

        txtadEmpAddmobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel18.add(txtadEmpAddmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 260, -1));

        txtadEmpAddtele.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel18.add(txtadEmpAddtele, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 260, -1));

        btnaddEmployee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnaddEmployee.setText("Add");
        btnaddEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddEmployeeActionPerformed(evt);
            }
        });
        jPanel18.add(btnaddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 100, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("User Type");
        jPanel18.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        txtadEmpAddpswd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel18.add(txtadEmpAddpswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 260, -1));

        Utype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cashier" }));
        jPanel18.add(Utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 150, 110, -1));

        AdminAddEmployee.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 740, 480));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setText("Add Employee");
        AdminAddEmployee.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        AdminEmployee.addTab("Add Employee", AdminAddEmployee);

        AdminDeleteEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setText("Delete Employee");
        AdminDeleteEmployee.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Name");
        jPanel19.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 78, -1, -1));

        txtadEmpDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel19.add(txtadEmpDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 260, -1));

        btnadEmpDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnadEmpDelete.setText("Delete");
        btnadEmpDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadEmpDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadEmpDeleteActionPerformed(evt);
            }
        });
        jPanel19.add(btnadEmpDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 100, -1));

        AdminDeleteEmployee.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 740, 320));

        AdminEmployee.addTab("Delete Employee", AdminDeleteEmployee);

        AdminUpdateEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("updated name");
        jPanel20.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Mobile Number");
        jPanel20.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Telephone");
        jPanel20.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        txtadEmpUpname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel20.add(txtadEmpUpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 260, -1));

        txtadEmpUpmobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel20.add(txtadEmpUpmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 260, -1));

        txtadEmpUptele.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel20.add(txtadEmpUptele, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 260, -1));

        btnadEmpUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnadEmpUpdate.setText("Update");
        btnadEmpUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadEmpUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadEmpUpdateActionPerformed(evt);
            }
        });
        jPanel20.add(btnadEmpUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 100, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Name");
        jPanel20.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        txtadEmpUpnameprev.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel20.add(txtadEmpUpnameprev, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 260, -1));

        AdminUpdateEmployee.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 740, 440));

        AdminEmployee.addTab("Update Employee", AdminUpdateEmployee);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Name");
        jPanel3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        txtadEmpDataName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtadEmpDataName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 260, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("Telephone");
        jPanel3.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("Mobile");
        jPanel3.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        txtadEmpDataMob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtadEmpDataMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 260, -1));

        txtadEmpDataTele.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtadEmpDataTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 260, -1));

        GetEmpData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GetEmpData.setText("Get Details");
        GetEmpData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GetEmpData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetEmpDataActionPerformed(evt);
            }
        });
        jPanel3.add(GetEmpData, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 164, 80, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 730, 420));

        AdminEmployee.addTab("View Contacts", jPanel2);

        Admin.addTab("Employee", AdminEmployee);

        AdminReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminReports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ItemRepGen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ItemRepGen.setText("Generate");
        ItemRepGen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ItemRepGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRepGenActionPerformed(evt);
            }
        });
        jPanel12.add(ItemRepGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 30));

        repItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemNum.", "ItemCode", "ItemName", "Buying Price", "Selling Price", "Quantity", "Discount", "Unit"
            }
        ));
        jScrollPane4.setViewportView(repItem);
        if (repItem.getColumnModel().getColumnCount() > 0) {
            repItem.getColumnModel().getColumn(1).setPreferredWidth(20);
            repItem.getColumnModel().getColumn(2).setPreferredWidth(50);
            repItem.getColumnModel().getColumn(3).setPreferredWidth(25);
            repItem.getColumnModel().getColumn(4).setPreferredWidth(25);
            repItem.getColumnModel().getColumn(5).setPreferredWidth(25);
            repItem.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 810, 500));

        ItmRptClearbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ItmRptClearbtn.setText("Clear");
        ItmRptClearbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ItmRptClearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmRptClearbtnActionPerformed(evt);
            }
        });
        jPanel12.add(ItmRptClearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 80, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Select Item Code");
        jPanel12.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel12.add(txtRptFletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Total Item Cost");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        TotItemCost.setText("0");
        jPanel12.add(TotItemCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        itmRepGen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itmRepGen.setText("GetTotal");
        itmRepGen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itmRepGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRepGenActionPerformed(evt);
            }
        });
        jPanel12.add(itmRepGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Item Count");
        jPanel12.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));
        jPanel12.add(StockItemCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, 30));

        AdminReports.addTab("Item Reports and Backup", jPanel12);

        jTabbedPane3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnweeklysale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnweeklysale.setText("Generate");
        btnweeklysale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnweeklysale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnweeklysaleActionPerformed(evt);
            }
        });
        jPanel17.add(btnweeklysale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 69, 28));

        Dailysales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales_ID", "EmployeeName", "Amount", "Date", "time"
            }
        ));
        Dailysales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DailysalesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Dailysales);

        jPanel17.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 520, 420));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Total profit of Sales today");
        jPanel17.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 70, 30));
        jPanel17.add(TOTinLastWeek, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales_ID", "Item_Code", "Quantity", "UnitPrice"
            }
        ));
        jScrollPane9.setViewportView(jTable1);

        jPanel17.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Get_Sales_Bill");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 30));
        jPanel17.add(SalesID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 190, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Sales_ID");
        jPanel17.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Clear");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Total Amount of Sales today");
        jPanel17.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel17.add(totCostofsalesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Total cost of Sales today");
        jPanel17.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel17.add(dailyProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, -1));

        jTabbedPane3.addTab("Daily", jPanel17);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMonthlysale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMonthlysale.setText("Generate");
        btnMonthlysale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMonthlysale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlysaleActionPerformed(evt);
            }
        });
        jPanel21.add(btnMonthlysale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 30));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Total Amount of Sales ");
        jPanel21.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel21.add(TOTinMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Year");
        jPanel21.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Date");
        jPanel21.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        jPanel21.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, -1));
        jPanel21.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 80, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Sales_ID");
        jPanel21.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));
        jPanel21.add(SalesID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 190, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Get_Sales_Bill");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales_ID", "Item_Code", "Quantity", "UnitPrice"
            }
        ));
        jScrollPane10.setViewportView(jTable2);

        jPanel21.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, -1));

        Dailysales2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales_ID", "EmployeeName", "Amount", "Date", "time"
            }
        ));
        Dailysales2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dailysales2MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(Dailysales2);

        jPanel21.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 490, 420));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Clear");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, 30));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Total cost of Sales ");
        jPanel21.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 20));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Total profit of Sales");
        jPanel21.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        jPanel21.add(ProfitofSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, -1));
        jPanel21.add(totCostOfsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 230, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("Month");
        jPanel21.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jPanel21.add(DeleSTDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 150, -1));

        jTabbedPane3.addTab("Monthly ", jPanel21);

        AdminReports.addTab("Sales Reports", jTabbedPane3);

        Admin.addTab("Reports", AdminReports);

        AdminBilling.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adBillTB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adBillTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItmNum", "Item_Code", "Item", "Qty", "Discount", "Price"
            }
        ));
        jScrollPane1.setViewportView(adBillTB);
        if (adBillTB.getColumnModel().getColumnCount() > 0) {
            adBillTB.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        AdminBilling.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 540, 360));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Item Code");
        AdminBilling.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Quantity");
        AdminBilling.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Discount");
        AdminBilling.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtadBillIcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdminBilling.add(txtadBillIcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, -1));

        btnadBillRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadBillRemove.setText("Remove");
        btnadBillRemove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadBillRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadBillRemoveActionPerformed(evt);
            }
        });
        AdminBilling.add(btnadBillRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 90, 30));

        txtadBillRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdminBilling.add(txtadBillRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 150, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Row");
        AdminBilling.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        txtadBillIcount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtadBillIcount.setText("0");
        AdminBilling.add(txtadBillIcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 150, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Item Count");
        AdminBilling.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Total");
        AdminBilling.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtadBillTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtadBillTotal.setText("0.00");
        txtadBillTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadBillTotalActionPerformed(evt);
            }
        });
        AdminBilling.add(txtadBillTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, -1));

        txtadBillTotalDisc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtadBillTotalDisc.setText("0");
        AdminBilling.add(txtadBillTotalDisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 150, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Total Discount");
        AdminBilling.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txtadBillPay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtadBillPay.setText("0");
        AdminBilling.add(txtadBillPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 150, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Pay");
        AdminBilling.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        txtadBillBalance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtadBillBalance.setText("0");
        txtadBillBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadBillBalanceActionPerformed(evt);
            }
        });
        AdminBilling.add(txtadBillBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 150, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("SalesID");
        AdminBilling.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        btnadBillClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadBillClear.setText("Bill");
        btnadBillClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadBillClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadBillClearActionPerformed(evt);
            }
        });
        AdminBilling.add(btnadBillClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 70, 30));

        btnadBill2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadBill2.setText("Clear");
        btnadBill2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadBill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadBill2ActionPerformed(evt);
            }
        });
        AdminBilling.add(btnadBill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 70, 30));

        CalFinalPayable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CalFinalPayable.setText("CalFinal");
        CalFinalPayable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CalFinalPayable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalFinalPayableActionPerformed(evt);
            }
        });
        AdminBilling.add(CalFinalPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 70, 30));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Payable amount");
        AdminBilling.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        txtadTotalPayableAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtadTotalPayableAmount.setText("0");
        AdminBilling.add(txtadTotalPayableAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 150, -1));

        billShowStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item", "Quantity", "Price", "Discount"
            }
        ));
        billShowStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billShowStockMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(billShowStock);
        if (billShowStock.getColumnModel().getColumnCount() > 0) {
            billShowStock.getColumnModel().getColumn(0).setPreferredWidth(7);
            billShowStock.getColumnModel().getColumn(1).setPreferredWidth(11);
            billShowStock.getColumnModel().getColumn(2).setPreferredWidth(7);
            billShowStock.getColumnModel().getColumn(3).setPreferredWidth(9);
            billShowStock.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        AdminBilling.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 470, 360));

        CheckStkBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckStkBill.setText("Check");
        CheckStkBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CheckStkBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStkBillActionPerformed(evt);
            }
        });
        AdminBilling.add(CheckStkBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 90, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AdminBilling.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 90, 30));

        BillID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BillID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillIDActionPerformed(evt);
            }
        });
        AdminBilling.add(BillID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 150, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Balance");
        AdminBilling.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        CancelBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancelBill.setText("Cancel");
        CancelBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBillActionPerformed(evt);
            }
        });
        AdminBilling.add(CancelBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 70, 30));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("Given Price");
        AdminBilling.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 20));

        btnadAddItm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadAddItm.setText("Add");
        btnadAddItm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadAddItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadAddItmActionPerformed(evt);
            }
        });
        AdminBilling.add(btnadAddItm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 80, 30));

        aditmGivenPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aditmGivenPrice.setText("0");
        AdminBilling.add(aditmGivenPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        aditmDisc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aditmDisc.setText("0");
        AdminBilling.add(aditmDisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));

        aditmQuant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aditmQuant.setText("0");
        AdminBilling.add(aditmQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));

        btnCancelAfterBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelAfterBill.setText("Bill Cancel");
        btnCancelAfterBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelAfterBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAfterBillActionPerformed(evt);
            }
        });
        AdminBilling.add(btnCancelAfterBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 80, 30));

        Admin.addTab("Billing", AdminBilling);

        AdminStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AdminAddStock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Add Stock");
        AdminAddStock.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Item Code");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 78, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Item Name");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buying Price");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Unit Price");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantity");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        txtadAddIcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(txtadAddIcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 260, -1));

        txtadAddIname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(txtadAddIname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 260, -1));

        txtadAddIbuy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(txtadAddIbuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, -1));

        txtadAddIuni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(txtadAddIuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 260, -1));

        txtadAddIquant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(txtadAddIquant, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 260, -1));

        btnadAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnadAdd.setText("Add");
        btnadAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnadAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 100, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Unit");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        comboadAddunit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboadAddunit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Unit", "m", "ft", "kg", "L", "u", "" }));
        jPanel5.add(comboadAddunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        btnAddSTclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddSTclear.setText("Clear");
        btnAddSTclear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddSTclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSTclearActionPerformed(evt);
            }
        });
        jPanel5.add(btnAddSTclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 80, 30));

        txtadStDisc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(txtadStDisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 260, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Discount");
        jPanel5.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        AdminAddStock.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 740, 480));

        AdminStock.addTab("Add Stock", AdminAddStock);

        AdminViewStock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Check Stock");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -60, -1, -1));

        btnCheckSTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCheckSTK.setText("Check");
        btnCheckSTK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckSTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckSTKActionPerformed(evt);
            }
        });
        jPanel7.add(btnCheckSTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Item Code");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        txtcaViewStk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcaViewStk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(txtcaViewStk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, -1));

        ClearCheckstk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearCheckstk.setText("Clear");
        ClearCheckstk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClearCheckstk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCheckstkActionPerformed(evt);
            }
        });
        jPanel7.add(ClearCheckstk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 90, 30));

        caCheckStTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Quantity", "Price", "StockPrice"
            }
        ));
        jScrollPane6.setViewportView(caCheckStTb);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 380));

        AdminViewStock.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 910, 480));

        AdminStock.addTab("View Stock", AdminViewStock);

        AdminUpdateStock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Item Code");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Item Name");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buying Price");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Unit Price");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Quantity");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txtadStUpIcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtadStUpIcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 260, -1));

        txtadStUpIname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtadStUpIname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 260, -1));

        txtUpbyprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtUpbyprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, -1));

        txtUpuniprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtUpuniprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 260, -1));

        txtUpIquant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtUpIquant, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 260, -1));

        btnUpdateItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateItem.setText("Update");
        btnUpdateItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });
        jPanel6.add(btnUpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 100, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Unit");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        comboadUpunit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboadUpunit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Unit", "m", "ft", "kg", "L", "u", " " }));
        jPanel6.add(comboadUpunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        StUpdateClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StUpdateClear.setText("Clear");
        StUpdateClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StUpdateClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StUpdateClearActionPerformed(evt);
            }
        });
        jPanel6.add(StUpdateClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 100, 30));

        Setvalbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Setvalbtn.setText("SetVal");
        Setvalbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Setvalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetvalbtnActionPerformed(evt);
            }
        });
        jPanel6.add(Setvalbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 90, -1));

        caCheckStTb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Quantity", "Price", "Discount"
            }
        ));
        caCheckStTb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caCheckStTb1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(caCheckStTb1);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 380));

        ClearCheckstk1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearCheckstk1.setText("Clear");
        ClearCheckstk1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClearCheckstk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCheckstk1ActionPerformed(evt);
            }
        });
        jPanel6.add(ClearCheckstk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 90, -1));

        btnCheckSTK1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckSTK1.setText("Check");
        btnCheckSTK1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckSTK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckSTK1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnCheckSTK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 90, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Item Code");
        jPanel6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        newItmCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(newItmCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 260, -1));

        txtUpdisc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtUpdisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 260, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Discount");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        AdminUpdateStock.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1250, 510));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Update Stock");
        AdminUpdateStock.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        AdminStock.addTab("Update Stock", AdminUpdateStock);

        AdminDeleteStock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Item Code");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jPanel9.add(txtDeleteItm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, -1));

        btnDeleteCheck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteCheck.setText("Check");
        btnDeleteCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCheckActionPerformed(evt);
            }
        });
        jPanel9.add(btnDeleteCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 90, 30));

        btnDeleteClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteClear.setText("Clear");
        btnDeleteClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClearActionPerformed(evt);
            }
        });
        jPanel9.add(btnDeleteClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 80, 30));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel9.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 90, 30));

        DeleteStTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "Item Name"
            }
        ));
        DeleteStTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(DeleteStTable);

        jPanel9.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        AdminDeleteStock.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 1130, 470));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Delete Item");
        AdminDeleteStock.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1346, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AdminDeleteStock, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AdminDeleteStock, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        AdminStock.addTab("Delete Stock", jPanel1);

        Admin.addTab("Stock", AdminStock);

        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1350, 640));

        Home.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Home.setText("Home");
        Home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddEmployeeActionPerformed
       
        String name=txtadEmpAddname.getText();
        String Uname=txtadEmpAdduname.getText();
        String PSWD=txtadEmpAddpswd.getText();
        String utype=Utype.getSelectedItem().toString();
        String mobile=txtadEmpAddmobile.getText();
        String Telephone=txtadEmpAddtele.getText();
        
        
        if(!"".equals(name) && !"".equals(Uname) && !"".equals(PSWD) && !"".equals(mobile) && !"".equals(Telephone)){
            if(ValidateEmployee.isVaildEmployee(name, Uname, PSWD, mobile, Telephone)==true){
                ConnectionProvider.getcon();
                InsertUpdateDelete.setData("insert into employee values ('"+name+"','"+Uname+"','"+PSWD+"','"+utype+"','"+mobile+"','"+Telephone+"')", "Data Insearted Successfully");
            
                txtadEmpAddname.setText("");
                txtadEmpAdduname.setText("");
                txtadEmpAddpswd.setText("");
                txtadEmpAddmobile.setText("");
                txtadEmpAddtele.setText("");
                
            }else{
                JOptionPane.showMessageDialog(null, "Check entered data again,Password(Minimum 8 characters) , Username and others");
            }
                
                
            
        }else{
            JOptionPane.showMessageDialog(null, "All Fields are Recuired");
        }
        
    }//GEN-LAST:event_btnaddEmployeeActionPerformed

    private void btnadEmpDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadEmpDeleteActionPerformed
        String name=txtadEmpDelete.getText();
        
        InsertUpdateDelete.setData("delete from employee where Name='"+name+"'", "Deleted Employee successfully");
    }//GEN-LAST:event_btnadEmpDeleteActionPerformed

    private void btnadEmpUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadEmpUpdateActionPerformed
       
        
        String name=txtadEmpUpname.getText();
        String mobile=txtadEmpUpmobile.getText();
        String tele=txtadEmpUptele.getText();
        String prevname=txtadEmpUpnameprev.getText();
        if(!"".equals(name) && !"".equals(mobile) && !"".equals(tele) && !"".equals(prevname) ){
            if(ValidateEmployee.isVaildEmployeeUpdate(name, mobile, tele)==true){    
              
              InsertUpdateDelete.setData("update employee set Name='"+name+"',Mobile='"+mobile+"',Telephone='"+tele+"' where Name='"+prevname+"'", "Updated Employee contacts Successfully");            
 
            }else{
              JOptionPane.showMessageDialog(null, "Check entered data again");
            }
        }else{
            JOptionPane.showMessageDialog(null, "All the fields are required");
        }        
               
        
    }//GEN-LAST:event_btnadEmpUpdateActionPerformed

    private void btnadAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadAddActionPerformed
        String Icode=txtadAddIcode.getText();
        String Iname=txtadAddIname.getText();
        String buyingPrice=txtadAddIbuy.getText();
        String unitPrice=txtadAddIuni.getText();
        String quant=txtadAddIquant.getText();
        String disc=txtadStDisc.getText();
        String unit=(String)comboadAddunit.getSelectedItem();
        if(!"".equals(disc) && !"".equals(Icode) && !"".equals(Iname) && !"".equals(buyingPrice) && !"".equals(unitPrice) && !"".equals(quant)){
            if(ValidateStockBill.isValidStockAdd(Icode, Iname, buyingPrice, unitPrice, quant)){
              
              InsertUpdateDelete.setData("insert into Stock values ('"+Icode+"','"+Iname+"','"+buyingPrice+"','"+unitPrice+"','"+disc+"','"+quant+"','"+unit+"')", "Data Insearted Successfully");
            }else{
              JOptionPane.showMessageDialog(null, "Check entered data again");
            }
        }else{
            JOptionPane.showMessageDialog(null, "All Fields are Required");
        }
        
        
    }//GEN-LAST:event_btnadAddActionPerformed

    private void btnadBillRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadBillRemoveActionPerformed
       String Inum=txtadBillRemove.getText();
       
       int row=Integer.parseInt(Inum)-1;
       
       DefaultTableModel df=(DefaultTableModel)adBillTB.getModel();
       
       double quant=Double.parseDouble((String)df.getValueAt(row, 3));
       double price=Double.parseDouble((String)df.getValueAt(row, 5));
       double total=Double.parseDouble(txtadBillTotal.getText());
       
       String itmcode=String.valueOf(df.getValueAt(row, 1));
       
       double tot=total-price;
       double quantSt=Double.parseDouble(GetFromDatabase.getQuant(itmcode));
       double remain_Quant=quantSt+quant; 
       String newQuant=String.valueOf(remain_Quant);
       
       InsertUpdateDelete.setData("update stock set Quantity ='"+newQuant+"' where Item_Code='"+itmcode+"'", "Removed Item");
       
       
       txtadBillTotal.setText(String.valueOf(tot));
       txtadBillBalance.setText("0.00"); 
       
       df.removeRow(row); 
    }//GEN-LAST:event_btnadBillRemoveActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Hardware d= new Hardware();
        d.show();
        dispose();
                
    }//GEN-LAST:event_HomeActionPerformed

    private void txtadBillTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadBillTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadBillTotalActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        String Icode=txtadStUpIcode.getText();
        String Iname=txtadStUpIname.getText();
        String bypr=txtUpbyprice.getText();
        String selpr=txtUpuniprice.getText();
        String iquant=txtUpIquant.getText();
        String newitmCode=newItmCode.getText();
        String itmDisc=txtUpdisc.getText();
        String unit=(String)comboadUpunit.getSelectedItem();
        
        int disc=Integer.parseInt(itmDisc);
        double buyingPri=Double.parseDouble(bypr);
        double sellingPri=Double.parseDouble(selpr);
        double quant=Double.parseDouble(iquant);
        
        if(!"".equals(itmDisc) && !"".equals(newitmCode) && !"".equals(Icode) && !"".equals(Iname) && !"".equals(bypr) && !"".equals(selpr) && !"".equals(iquant)){
            
                String quer="Update stock set Item_Code='"+newitmCode+"',Item='"+Iname+"',Retail_price='"+buyingPri+"',Unit_Price='"+sellingPri+"',Discount='"+disc+"',Quantity='"+quant+"',Unit='"+unit+"' where Item_Code='"+Icode+"'";
                String msg="Data Updated Successfully";
                InsertUpdateDelete.setData(quer, msg);
            
        }else{
            JOptionPane.showMessageDialog(null, "All Fields are required");
        }
        
        
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void ItemRepGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRepGenActionPerformed
        Connection con=null;
        Statement st=null;
        
        DefaultTableModel df=(DefaultTableModel)repItem.getModel();
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            
            if("".equals(txtRptFletter.getText())){
                
           
                String query ="SELECT * FROM stock ORDER BY Item_Code ASC";
            
                ResultSet resultSet = st.executeQuery(query);
            
                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));
                    String buypri=String.valueOf(resultSet.getBigDecimal("Retail_price"));
                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));
                    String unit=String.valueOf(resultSet.getString("Unit"));
                    String quant=String.valueOf(df3.format(resultSet.getDouble("Quantity")));
                    String disc=String.valueOf(df3.format(resultSet.getDouble("Discount")));
                    String itmnum=String.valueOf(df.getRowCount()+1);
                
                    String data[]={itmnum,ICode,IName,buypri,selpri,quant,disc,unit};
                
                    
                    df.addRow(data);
                
                }
            }else{
                String letter=txtRptFletter.getText();
                
                String query ="SELECT * FROM stock WHERE Item_Code LIKE '%"+letter+"%'";
            
                ResultSet resultSet = st.executeQuery(query);
            
                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));
                    String buypri=String.valueOf(resultSet.getBigDecimal("Retail_price"));
                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));
                    String unit=String.valueOf(resultSet.getString("Unit"));
                    String quant=String.valueOf(df3.format(resultSet.getDouble("Quantity")));
                    String disc=String.valueOf(df3.format(resultSet.getDouble("Discount")));
                    String itmnum=String.valueOf(df.getRowCount()+1);
                
                    String data[]={itmnum,ICode,IName,buypri,selpri,quant,disc,unit};
                
                    
                    df.addRow(data);
                
                }
                
            }
            con.close();
            
            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_ItemRepGenActionPerformed

    private void btnadBill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadBill2ActionPerformed
        txtadBillBalance.setText("0");
        txtadBillPay.setText("0");
        txtadBillTotal.setText("0");
        txtadBillTotalDisc.setText("0");
        txtadBillIcount.setText("0");
        txtadTotalPayableAmount.setText("0");
        aditmGivenPrice.setText("0");
        DefaultTableModel df=(DefaultTableModel)adBillTB.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
    }//GEN-LAST:event_btnadBill2ActionPerformed

    private void btnadBillClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadBillClearActionPerformed

        String Bill_Amount=txtadTotalPayableAmount.getText();
        String logU_name=GetFromDatabase.getlastLogIn();
        int rcBill=adBillTB.getRowCount();
        
        if(!"0".equals(Bill_Amount) && !"0".equals(txtadBillPay.getText())){
            LocalDate date=DateTime.getDate();
            LocalTime time=DateTime.getTime();
            String salesID=ValidateStockBill.generateSalesID();
            String quer="insert into sales values('"+salesID+"','"+Bill_Amount+"','"+logU_name+"','"+date+"','"+time+"')";
            String msg="";
            InsertUpdateDelete.setData(quer, msg);
            BillID.setText(salesID);
        
            DefaultTableModel dt=(DefaultTableModel)adBillTB.getModel();
            for(int i=0;i<rcBill;i++){
                String itmCode=(String)adBillTB.getValueAt(i, 1);
                double quant=Double.parseDouble((String)adBillTB.getValueAt(i, 3));
                double Price=Double.parseDouble((String)adBillTB.getValueAt(i, 5));
                String uPrice=String.valueOf(Price/quant);
                String itmName=(String)adBillTB.getValueAt(i, 2);
            
                String query="insert into sales_item values('"+salesID+"','"+itmCode+"','"+itmName+"','"+quant+"','"+uPrice+"')";
                String msgs="";
                InsertUpdateDelete.setData(query, msgs);
            }

            createItemList();
            Float change = Float.parseFloat(txtadBillPay.getText()) - Float.parseFloat(txtadTotalPayableAmount.getText());
            txtadBillBalance.setText(df.format(change));
        

            PrinterJob pj = PrinterJob.getPrinterJob();
            pj.setPrintable( this, getPageFormat(pj));

            //      there's dialog
            pj.setPrintable( this);
            boolean ok = pj.printDialog();
            if (ok) {
                try {
                    pj.print();
                } catch (PrinterException ex) {
                }
            }
            txtadBillTotal.setText("0");
            txtadBillTotalDisc.setText("0");
            txtadBillBalance.setText("0");
            txtadBillPay.setText("0");
            BillID.setText("");
            txtadTotalPayableAmount.setText("0");
            DefaultTableModel df=(DefaultTableModel)adBillTB.getModel();
            while(df.getRowCount()!=0){
                df.removeRow(0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Check 'Payable' amount and 'Pay' fields");
        }

    }//GEN-LAST:event_btnadBillClearActionPerformed

    private void CalFinalPayableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalFinalPayableActionPerformed
        double total=Double.parseDouble(txtadBillTotal.getText());
        double discount=Double.parseDouble(txtadBillTotalDisc.getText());
        double totalPayable= total-(total*discount/100);
        String Finalpay=String.valueOf(totalPayable);
        
        txtadTotalPayableAmount.setText(Finalpay);
    }//GEN-LAST:event_CalFinalPayableActionPerformed

    private void btnweeklysaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnweeklysaleActionPerformed
        Connection con=null;
        Statement st=null;
        Connection con2=null;
        Statement st2=null;
        LocalDate date=LocalDate.now();
        double totSales=0;
        double totCost=0;
        
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
           
            String query ="SELECT * FROM sales where Date = '"+date+"' ";
            
            ResultSet resultSet = st.executeQuery(query);
            
            while(resultSet.next()){
                String SalID=String.valueOf(resultSet.getString("SalesNum"));
                String Employee=String.valueOf(resultSet.getString("User"));
                String dat=String.valueOf(resultSet.getString("Date"));
                String time=String.valueOf(resultSet.getString("Time"));
                String Bill=String.valueOf(resultSet.getBigDecimal("Bill_Amount"));
                
                
                String data[]={SalID,Employee,Bill,dat,time};
                
                DefaultTableModel df=(DefaultTableModel)Dailysales.getModel();
                df.addRow(data);
                
                
            }
            for(int i=0;i<Dailysales.getRowCount();i++){
                totSales=totSales+Double.parseDouble((String) Dailysales.getValueAt(i, 2));
                totCost=totCost+SalesCostProfit.getItmCost((String) Dailysales.getValueAt(i, 0));
            }
            double profit=totSales-totCost;
            String prof=String.valueOf(profit);
            String daily_cost=String.valueOf(totCost);
            String daily_Sales=String.valueOf(totSales);
            TOTinLastWeek.setText(daily_Sales);
            totCostofsalesday.setText(daily_cost);
            dailyProfit.setText(prof);
            
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_btnweeklysaleActionPerformed

    private void btnMonthlysaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlysaleActionPerformed
        Connection con=null;
        Statement st=null;
        String month=Month.getText();
        String year=Year.getText();
        String Date=DeleSTDate.getText();
        double totSales=0;
        double totCost=0;
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
           
            String query ="SELECT * FROM sales where Day(Date)= '"+Date+"' And Month(Date) = '"+month+"' And Year(Date)= '"+year+"'";
            
            ResultSet resultSet = st.executeQuery(query);
            
            while(resultSet.next()){
                String salID=String.valueOf(resultSet.getString("SalesNum"));
                String Employee=String.valueOf(resultSet.getString("User"));
                String dat=String.valueOf(resultSet.getString("Date"));
                String time=String.valueOf(resultSet.getString("Time"));
                String Bill=String.valueOf(resultSet.getBigDecimal("Bill_Amount"));
                
                
                String data[]={salID,Employee,Bill,dat,time};
                
                DefaultTableModel df2=(DefaultTableModel)Dailysales2.getModel();
                df2.addRow(data);
                
                
            }
            for(int i=0;i<Dailysales2.getRowCount();i++){
                totSales=totSales+Double.parseDouble((String) Dailysales2.getValueAt(i, 2));
                totCost=totCost+SalesCostProfit.getItmCost((String) Dailysales2.getValueAt(i, 0));
            }
            
            double profit=totSales-totCost;
            String prof=String.valueOf(profit);
            String daily_cost=String.valueOf(totCost);
            String daily_Sales=String.valueOf(totSales);
            TOTinMonth.setText(daily_Sales);
            totCostOfsales.setText(daily_cost);
            ProfitofSale.setText(prof);
            
            con.close();
        }    
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_btnMonthlysaleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Year.setText("");
        Month.setText("");
        TOTinMonth.setText("0.00");
        DefaultTableModel df=(DefaultTableModel)jTable2.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TOTinLastWeek.setText("0.00");
        DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddSTclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSTclearActionPerformed
        txtadAddIcode.setText("");
        txtadAddIname.setText("");
        txtadAddIbuy.setText("");
        txtadAddIuni.setText("");
        txtadAddIquant.setText("");
        txtadStDisc.setText("");
        
    }//GEN-LAST:event_btnAddSTclearActionPerformed

    private void StUpdateClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StUpdateClearActionPerformed
        txtadStUpIcode.setText("");
        txtadStUpIname.setText("");
        txtUpbyprice.setText("");
        txtUpuniprice.setText("");
        txtUpIquant.setText("");
        newItmCode.setText("");
        txtUpdisc.setText("");
    }//GEN-LAST:event_StUpdateClearActionPerformed

    private void ItmRptClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmRptClearbtnActionPerformed
        
        DefaultTableModel df=(DefaultTableModel)repItem.getModel();
        int rowCount=repItem.getRowCount();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
        StockItemCount.setText("0");
        txtRptFletter.setText("");
        TotItemCost.setText("0");
    }//GEN-LAST:event_ItmRptClearbtnActionPerformed

    private void SetvalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetvalbtnActionPerformed
        String icode=txtadStUpIcode.getText();
        String itmName=GetFromDatabase.getItemName(icode);
        String buypri=GetFromDatabase.getBuyingPrice(icode);
        String uniPri=GetFromDatabase.getItemUniPrice(icode);
        String quant=GetFromDatabase.getQuant(icode);
        String disc=GetFromDatabase.getDisc(icode);
        
        
        txtadStUpIname.setText(itmName);
        txtUpbyprice.setText(buypri);
        txtUpuniprice.setText(uniPri);
        txtUpIquant.setText(quant);
        txtUpdisc.setText(disc);
        
    }//GEN-LAST:event_SetvalbtnActionPerformed

    private void CheckStkBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStkBillActionPerformed
        String Itm_Code=txtadBillIcode.getText();
        Connection con=null;
        Statement st=null;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            
            if("".equals(txtadBillIcode.getText())){
                
           
                String query ="SELECT * FROM stock ORDER BY Item_Code ASC";
            
                ResultSet resultSet = st.executeQuery(query);
            
                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    
                    
                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));
                    
                    String quant=String.valueOf(df3.format(resultSet.getDouble("Quantity")));
                    String itmName=String.valueOf(resultSet.getString("Item"));
                    String disc=String.valueOf(resultSet.getInt("Discount"));
                
                    String data[]={ICode,itmName,quant,selpri,disc};
                
                    DefaultTableModel df=(DefaultTableModel)billShowStock.getModel();
                    df.addRow(data);
                
                }
            }else{
                
                
                String query ="SELECT * FROM stock WHERE Item_Code LIKE '%"+Itm_Code+"%'";
            
                ResultSet resultSet = st.executeQuery(query);
            
                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    
                    
                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));
                    
                    String quant=String.valueOf(resultSet.getInt("Quantity"));
                    String itmName=String.valueOf(resultSet.getString("Item"));
                    String disc=String.valueOf(resultSet.getInt("Discount"));
                
                    String data[]={ICode,itmName,quant,selpri,disc};
                
                    DefaultTableModel df=(DefaultTableModel)billShowStock.getModel();
                    df.addRow(data);
                
                }
                
            }
            
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_CheckStkBillActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel df=(DefaultTableModel)billShowStock.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
                
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private DecimalFormat df4 = new DecimalFormat("#,##0.00");
    
    private void btnCheckSTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckSTKActionPerformed
        String Itm_Code=txtcaViewStk.getText();
        Connection con=null;
        Statement st=null;

        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();

            if("".equals(txtcaViewStk.getText())){

                String query ="SELECT * FROM stock ORDER BY Item_Code ASC";

                ResultSet resultSet = st.executeQuery(query);

                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));

                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));
                    String STpri=String.valueOf(resultSet.getBigDecimal("Retail_price"));

                    String quant=String.valueOf(df3.format(resultSet.getDouble("Quantity")));

                    String data[]={ICode,IName,quant,selpri,STpri};

                    DefaultTableModel df=(DefaultTableModel)caCheckStTb.getModel();
                    df.addRow(data);

                }
            }else{

                String query ="SELECT * FROM stock WHERE Item_Code LIKE '%"+Itm_Code+"%'";

                ResultSet resultSet = st.executeQuery(query);

                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));

                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));
                    String STpri=String.valueOf(resultSet.getDouble("Retail_price"));
                    

                    String quant=String.valueOf(df3.format(resultSet.getDouble("Quantity")));

                    String data[]={ICode,IName,quant,selpri,STpri};

                    DefaultTableModel df=(DefaultTableModel)caCheckStTb.getModel();
                    df.addRow(data);

                }

            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnCheckSTKActionPerformed

    private void ClearCheckstkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCheckstkActionPerformed
        txtcaViewStk.setText("");
        DefaultTableModel df=(DefaultTableModel)caCheckStTb.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }

    }//GEN-LAST:event_ClearCheckstkActionPerformed

    private void ClearCheckstk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCheckstk1ActionPerformed
        DefaultTableModel df=(DefaultTableModel)caCheckStTb1.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
    }//GEN-LAST:event_ClearCheckstk1ActionPerformed

    private void btnCheckSTK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckSTK1ActionPerformed
        String Itm_Code=txtadStUpIcode.getText();
        Connection con=null;
        Statement st=null;

        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();

            if("".equals(txtadStUpIcode.getText())){

                String query ="SELECT * FROM stock ORDER BY Item_Code ASC";

                ResultSet resultSet = st.executeQuery(query);

                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));

                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));

                    String quant=String.valueOf(resultSet.getDouble("Quantity"));
                    String disc=String.valueOf(resultSet.getInt("Discount"));

                    String data[]={ICode,IName,quant,selpri,disc};

                    DefaultTableModel df=(DefaultTableModel)caCheckStTb1.getModel();
                    df.addRow(data);

                }
            }else{

                String query ="SELECT * FROM stock WHERE Item_Code LIKE '%"+Itm_Code+"%'";

                ResultSet resultSet = st.executeQuery(query);

                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));

                    String selpri=String.valueOf(resultSet.getBigDecimal("Unit_Price"));

                    String quant=String.valueOf(resultSet.getInt("Quantity"));
                    String disc=String.valueOf(resultSet.getInt("Discount"));

                    String data[]={ICode,IName,quant,selpri,disc};

                    DefaultTableModel df=(DefaultTableModel)caCheckStTb1.getModel();
                    df.addRow(data);

                }

            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnCheckSTK1ActionPerformed

    private void btnDeleteCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCheckActionPerformed
        String Itm_Code=txtDeleteItm.getText();
        Connection con=null;
        Statement st=null;

        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();

            if("".equals(txtDeleteItm.getText())){

                String query ="SELECT * FROM stock ORDER BY Item_Code ASC";

                ResultSet resultSet = st.executeQuery(query);

                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));

                    

                    String data[]={ICode,IName};

                    DefaultTableModel df=(DefaultTableModel)DeleteStTable.getModel();
                    df.addRow(data);

                }
            }else{

                String query ="SELECT * FROM stock WHERE Item_Code LIKE '%"+Itm_Code+"%'";

                ResultSet resultSet = st.executeQuery(query);

                while(resultSet.next()){
                    String ICode=String.valueOf(resultSet.getString("Item_Code"));
                    String IName=String.valueOf(resultSet.getString("Item"));

                    

                    String data[]={ICode,IName};

                    DefaultTableModel df=(DefaultTableModel)DeleteStTable.getModel();
                    df.addRow(data);

                }

            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnDeleteCheckActionPerformed

    private void btnDeleteClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClearActionPerformed
        DefaultTableModel df=(DefaultTableModel)DeleteStTable.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
    }//GEN-LAST:event_btnDeleteClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String Icode=txtDeleteItm.getText();
        
        InsertUpdateDelete.setData("delete from stock where Item_Code='"+Icode+"'", "Deleted Item successfully");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void itmRepGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRepGenActionPerformed
        DefaultTableModel df=(DefaultTableModel)repItem.getModel();
        
        double finalPri=0.00;
        
        
        DecimalFormat dfor=new DecimalFormat("#.####");
        if(txtRptFletter.getText()!=""){
            for(int i=0;i<repItem.getRowCount();i++){
            String itmCode=(String)df.getValueAt(i, 1);
            double quant=Double.parseDouble(GetFromDatabase.getQuant(itmCode));
            double Buyingpri=Double.parseDouble(GetFromDatabase.getBuyingPrice(itmCode));
            double cost=quant*Buyingpri;
            finalPri=finalPri+cost;
            }            
        }else{
            finalPri=SalesCostProfit.getStockItmCost();
        }
        
        String formattedCost = df4.format(finalPri);
        
        
        
        String itmCount=String.valueOf(repItem.getRowCount());
        StockItemCount.setText(itmCount);
        TotItemCost.setText(formattedCost);
        
    }//GEN-LAST:event_itmRepGenActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Connection con=null;
        Statement st=null;
        String salesID=SalesID.getText();
        double totSales=0;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
           
            String query ="SELECT * FROM sales_item where SalesNum = '"+salesID+"' ";
            
            ResultSet resultSet = st.executeQuery(query);
            
            while(resultSet.next()){
                String SaleID=String.valueOf(resultSet.getString("SalesNum"));
                String itmCode=String.valueOf(resultSet.getString("ItemCode"));
                String quant=String.valueOf(df2.format(resultSet.getDouble("Quantity")));
                String unitPr=String.valueOf(resultSet.getBigDecimal("UnitPrice"));
                
                
                String data[]={SaleID,itmCode,quant,unitPr};
                
                DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
                df.addRow(data);
                
                
            }
            con.close();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private DecimalFormat df2 = new DecimalFormat("#,##0.00");
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Connection con=null;
        Statement st=null;
        String salesID=SalesID1.getText();
        double totSales=0;
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
           
            String query ="SELECT * FROM sales_item where SalesNum = '"+salesID+"' ";
            
            ResultSet resultSet = st.executeQuery(query);
            
            while(resultSet.next()){
                String SaleID=String.valueOf(resultSet.getString("SalesNum"));
                String itmCode=String.valueOf(resultSet.getString("ItemCode"));
                String quant=String.valueOf(df2.format(resultSet.getDouble("Quantity")));
                String unitPr=String.valueOf(resultSet.getBigDecimal("UnitPrice"));
                
                
                String data[]={SaleID,itmCode,quant,unitPr};
                
                DefaultTableModel df=(DefaultTableModel)jTable2.getModel();
                df.addRow(data);
                
                
            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Year.setText("");
        Month.setText("");
        TOTinMonth.setText("0.00");
        totCostOfsales.setText("0.00");
        ProfitofSale.setText("0.00");
        DefaultTableModel df=(DefaultTableModel)Dailysales2.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TOTinLastWeek.setText("0.00");
        totCostofsalesday.setText("0.00");
        dailyProfit.setText("0.00");
        DefaultTableModel df=(DefaultTableModel)Dailysales.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void CancelBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBillActionPerformed
        int rcBill=adBillTB.getRowCount();
        for(int i=0;i<rcBill;i++){
            String icode=(String)adBillTB.getValueAt(i, 1);
            double quant=Double.parseDouble((String)adBillTB.getValueAt(i, 3));
            double DBquant=Double.parseDouble(GetFromDatabase.getQuant(icode));
            double totQuant=quant+DBquant;
            String query="Update stock set Quantity='"+totQuant+"' where Item_Code='"+icode+"'";
            String msg="Bill Cancelled";
            InsertUpdateDelete.setData(query, msg);
        }
        DefaultTableModel df=(DefaultTableModel)adBillTB.getModel();
        while(df.getRowCount()!=0){
            df.removeRow(0);
        }
        txtadBillIcode.setText("");
        aditmGivenPrice.setText("0");
        aditmQuant.setText("");
        aditmDisc.setText("0");
        txtadBillRemove.setText("");
        txtadBillIcount.setText("0");
        txtadBillTotal.setText("0.00");
        txtadBillTotalDisc.setText("0");
        txtadTotalPayableAmount.setText("0");
        txtadBillPay.setText("0.00");
        txtadBillBalance.setText("0.00");
    }//GEN-LAST:event_CancelBillActionPerformed

    private void BillIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIDActionPerformed

    private void billShowStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billShowStockMouseClicked
        int i=billShowStock.getSelectedRow();
        TableModel model=billShowStock.getModel();
        txtadBillIcode.setText((String) model.getValueAt(i, 0));
        aditmDisc.setText((String) model.getValueAt(i, 4));
    }//GEN-LAST:event_billShowStockMouseClicked

    private void caCheckStTb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caCheckStTb1MouseClicked
        int i=caCheckStTb1.getSelectedRow();
        TableModel model=caCheckStTb1.getModel();
        txtadStUpIcode.setText((String) model.getValueAt(i, 0));
    }//GEN-LAST:event_caCheckStTb1MouseClicked

    private DecimalFormat df3 = new DecimalFormat("#,##0.00");
    
    private void btnadAddItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadAddItmActionPerformed
        String itmcode=txtadBillIcode.getText();
        String itquant=(aditmQuant.getText());
        String itmdisc=aditmDisc.getText();
        String givenPri=aditmGivenPrice.getText();
        
        double iquant=Double.parseDouble(itquant);
        double idisc=Double.parseDouble(itmdisc);
        
        double givenVal=Double.parseDouble(givenPri);
        double unitpri= Double.parseDouble((String)GetFromDatabase.getItemUniPrice(itmcode));
        double finalpr=0;
        double DBitmQuant=Double.parseDouble(GetFromDatabase.getQuant(itmcode));
        String remain_Quant=String.valueOf(DBitmQuant-iquant);
        
        DefaultTableModel df=(DefaultTableModel)adBillTB.getModel();
        if(DBitmQuant>=iquant){
            if(givenVal==0){
                finalpr=(iquant*unitpri)-((iquant*unitpri)*idisc/100);  
            }else{
                finalpr=givenVal*iquant;
            }
            String totprice=String.valueOf(finalpr);
            String itmnum=String.valueOf(df.getRowCount()+1);
            String itmName=GetFromDatabase.getItemName(itmcode);
            String bilTot=String.valueOf(Double.parseDouble(txtadBillTotal.getText())+finalpr);
        
            String data[]={itmnum,itmcode,itmName,itquant,itmdisc,totprice};
            df.addRow(data);
        
            String quer="Update stock set Quantity='"+remain_Quant+"' where Item_Code='"+itmcode+"'";
            String msg="";
            InsertUpdateDelete.setData(quer, msg);
        
            txtadBillTotal.setText(bilTot);
            txtadBillIcode.setText("");
            aditmQuant.setText("0");
            aditmDisc.setText("0");
            aditmGivenPrice.setText("0");
        }else{
            JOptionPane.showMessageDialog(null, "Available stock is not sufficient, Avalabe stock : "+DBitmQuant);
        }
        
    }//GEN-LAST:event_btnadAddItmActionPerformed

    private void DailysalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DailysalesMouseClicked
        int i=Dailysales.getSelectedRow();
        TableModel model=Dailysales.getModel();
        SalesID.setText((String) model.getValueAt(i, 0));
    }//GEN-LAST:event_DailysalesMouseClicked

    private void Dailysales2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dailysales2MouseClicked
        int i=Dailysales2.getSelectedRow();
        TableModel model=Dailysales2.getModel();
        SalesID1.setText((String) model.getValueAt(i, 0));
    }//GEN-LAST:event_Dailysales2MouseClicked

    private void GetEmpDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetEmpDataActionPerformed
        String name=txtadEmpDataName.getText();
        String tele=GetFromDatabase.EmpTele(name);
        String mob=GetFromDatabase.EmpMob(name);
        
        txtadEmpDataTele.setText(tele);
        txtadEmpDataMob.setText(mob);
        
    }//GEN-LAST:event_GetEmpDataActionPerformed

    private void txtadBillBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadBillBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadBillBalanceActionPerformed

    private void btnCancelAfterBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAfterBillActionPerformed
        String SaleID=GetFromDatabase.getlastSaleID();
        Connection con=null;
        Statement st=null;
        String salesID=BillID.getText();
        
        
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            
            if("".equals(salesID)){
                String query ="SELECT * FROM sales_item where SalesNum = '"+SaleID+"' ";
            
                ResultSet resultSet = st.executeQuery(query);
            
                while(resultSet.next()){
                    String itmCode=String.valueOf(resultSet.getString("ItemCode"));
                    double quant=resultSet.getDouble("Quantity");
                    double DBquant=Double.parseDouble(GetFromDatabase.getQuant(itmCode));
                    double newQuant=quant+DBquant;
                    InsertUpdateDelete.setData("Delete FROM sales_item where SalesNum='"+SaleID+"'", "");
                    InsertUpdateDelete.setData("DELETE FROM sales where salesNum='"+SaleID+"'", "");
                    InsertUpdateDelete.setData("Update stock set Quantity='"+newQuant+"' where Item_Code='"+itmCode+"'", "");
                }
                JOptionPane.showMessageDialog(null, "Bill Cancelled");
                
            }else{
                String query ="SELECT * FROM sales_item where SalesNum = '"+salesID+"' ";
            
                ResultSet resultSet = st.executeQuery(query);
            
                while(resultSet.next()){
                    String itmCode=String.valueOf(resultSet.getString("ItemCode"));
                    double quant=resultSet.getDouble("Quantity");
                    double DBquant=Double.parseDouble(GetFromDatabase.getQuant(itmCode));
                    double newQuant=quant+DBquant;
                    InsertUpdateDelete.setData("Delete FROM sales_item where SalesNum='"+salesID+"'", "");
                    InsertUpdateDelete.setData("DELETE FROM sales where salesNum='"+salesID+"'", "");
                    InsertUpdateDelete.setData("Update stock set Quantity='"+newQuant+"' where Item_Code='"+itmCode+"'", "Bill Cancelled");
                
                }
                JOptionPane.showMessageDialog(null, "Bill Cancelled");
            }
           
            
            con.close();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
    }//GEN-LAST:event_btnCancelAfterBillActionPerformed

    private void DeleteStTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStTableMouseClicked
        int i=DeleteStTable.getSelectedRow();
        TableModel model=DeleteStTable.getModel();
        txtDeleteItm.setText((String) model.getValueAt(i, 0));
        
    }//GEN-LAST:event_DeleteStTableMouseClicked
    private java.util.ArrayList<Item> itemList = new java.util.ArrayList<>();//creating data list to print in bill row

    private java.util.ArrayList<Item> createItemList() {
        java.util.ArrayList<Item> iL = new java.util.ArrayList<Item>();
        Item itm = null;
        for (int i = 0; i < adBillTB.getRowCount(); i++) {
            String icode=adBillTB.getValueAt(i, 1).toString();
            String item = adBillTB.getValueAt(i, 2).toString();
            String qty = adBillTB.getValueAt(i, 3).toString();
            String itmNum=adBillTB.getValueAt(i,0).toString();
            
            String disc=adBillTB.getValueAt(i, 4).toString();
            String price=null;
            String unit=GetFromDatabase.GetItmUnit(adBillTB.getValueAt(i, 1).toString());
            double dbpri=Double.parseDouble(GetFromDatabase.getItemUniPrice(icode));
            double addedPri= (Double.valueOf((String) adBillTB.getValueAt(i, 5))/Double.valueOf(qty));
            /*if(dbpri!=addedPri && "0".equals(disc)){
                double Pri= (Double.valueOf((String) adBillTB.getValueAt(i, 5))/Double.valueOf(qty));
                price=String.valueOf(Pri);
            }else{
                double Pri=Double.parseDouble(GetFromDatabase.getItemUniPrice(icode));
                price=String.valueOf(Pri);
            }*/
            itm = new Item(itmNum,item, qty, String.valueOf(addedPri),String.valueOf(dbpri),disc,unit);
            iL.add(itm);
        }
        return iL;
    }
    private DecimalFormat df = new DecimalFormat("#,##0.00");
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        Float totalAmount = 0.0F;
        Float change = 0.0F;
        String readFile = System.getProperty("user.dir") + "/src/main/resources/images/my pic.png";
        
        ImageIcon icon = new ImageIcon(readFile);
        int result = NO_SUCH_PAGE;
        if (pageIndex == 0) {

            Graphics2D g2d = (Graphics2D) graphics;
            double width = pageFormat.getImageableWidth();
            g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

            FontMetrics metrics = g2d.getFontMetrics(new Font("Arial", Font.BOLD, 7));
            try {
                LocalDate date=LocalDate.now();
                LocalTime time= LocalTime.now();
                String user=GetFromDatabase.getlastLogIn();
                int y = 15;
                int x=6;
                int yShift = 10;
                int headerRectHeight = 15;
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                double wh = pageFormat.getImageableWidth();
                double ht = pageFormat.getImageableHeight();
                g2d.drawImage(null, 0, 0, (int) wh, (int) ht, null);

                g2d.setFont(new Font("Monospaced", Font.BOLD, 9));
                g2d.drawImage(icon.getImage(), 75, 20, 30, 30, rootPane);
                y += yShift + 30;
                g2d.drawString("------------------------------", x, y);
                y += yShift;
                g2d.drawString("       Hesara Hardware  ", x, y);
                y += yShift;
                y += yShift;
                g2d.drawString("Hesara Hardware , ", x, y);
                y += yShift;
                g2d.drawString("NO:06,Janajaya MiniCity, ", x, y);
                y += yShift;
                g2d.drawString("Ground floor,Obesekarapura, ", x, y);
                y += yShift;
                g2d.drawString("Rajagiriya ", x, y);
                y += yShift;
                g2d.drawString("contact : 0770157566 ", x, y);
                y += yShift;
                g2d.drawString("          0711057566, ", x, y);
                y += yShift;
                g2d.drawString("(Whatsapp)0776077295 ", x, y);
                y += yShift;
                g2d.drawString("Bill_ID :"+BillID.getText(), x, y);
                y += yShift;
                g2d.drawString("Time :"+time, x, y);
                y += yShift;
                g2d.drawString("Date :"+date, x, y);
                y += yShift;
                g2d.drawString("Cashier :"+user, x, y);
                y += yShift;                
                y += yShift;
                g2d.drawString("------------------------------", x, y);
                y += headerRectHeight;

                g2d.drawString(" Item            Price  ", x, y);
                y += yShift;
                g2d.drawString("------------------------------", x, y);
                y += headerRectHeight;

                for (Item item : createItemList()) {
                    g2d.drawString(item.getItmNum()+". " + item.getItem() + "                    ", 10, y);
                    y += yShift;
                    g2d.drawString(" " +item.getQty()+""+item.getItemUnit()+"x"+ item.getRealPrice()+"x"+item.getDiscount()+"%", 5, y);
                    g2d.drawString(String.valueOf(df.format((Float.parseFloat(item.getQty())) * (Float.parseFloat(item.getgivenPrice())))), 100, y);
                    y += yShift;
                    y += yShift;
                    totalAmount = totalAmount + (Float.parseFloat(item.getQty())) * (Float.parseFloat(item.getgivenPrice()));

                }
                Float cash = Float.valueOf(txtadBillPay.getText());//payed amount
                Float totdisc=Float.valueOf(txtadBillTotalDisc.getText());
                Float finalBill=Float.valueOf(txtadTotalPayableAmount.getText());

                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Total   : " + String.valueOf(df.format(totalAmount)) + "   ", 10, y);
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" TotalDiscount   : " + String.valueOf(df.format(totdisc)) + "%   ", 10, y);
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Final Bill   : " + String.valueOf(df.format(finalBill)) + "   ", 10, y);
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Cash    : " + String.valueOf(df.format(cash)) + "   ", 10, y);
                y += yShift;
                g2d.drawString("------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Change  : " + String.valueOf(df.format(Float.valueOf(txtadBillPay.getText()) - finalBill)) + "   ", 10, y);
                y += yShift;
                y += yShift;
                y += yShift;

                g2d.drawString("******************************", 10, y);
                y += yShift;
                g2d.drawString("  THANK YOU, COME AGAIN!! ", 10, y);
                y += yShift;
                g2d.drawString("******************************", 10, y);
                y += yShift;

            } catch (Exception e) {
                e.printStackTrace();
            }
            result = PAGE_EXISTS;
        }
        return result;
    }

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double width = pf.getImageableWidth();
        double height = pf.getImageableHeight();
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cm_to_pp(1));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        return pf;
    }

    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 58d;
    }
    
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Admin;
    private javax.swing.JPanel AdminAddEmployee;
    private javax.swing.JPanel AdminAddStock;
    private javax.swing.JPanel AdminBilling;
    private javax.swing.JPanel AdminDeleteEmployee;
    private javax.swing.JPanel AdminDeleteStock;
    private javax.swing.JTabbedPane AdminEmployee;
    private javax.swing.JTabbedPane AdminReports;
    private javax.swing.JTabbedPane AdminStock;
    private javax.swing.JPanel AdminUpdateEmployee;
    private javax.swing.JPanel AdminUpdateStock;
    private javax.swing.JPanel AdminViewStock;
    private javax.swing.JTextField BillID;
    private javax.swing.JButton CalFinalPayable;
    private javax.swing.JButton CancelBill;
    private javax.swing.JButton CheckStkBill;
    private javax.swing.JButton ClearCheckstk;
    private javax.swing.JButton ClearCheckstk1;
    private javax.swing.JTable Dailysales;
    private javax.swing.JTable Dailysales2;
    private javax.swing.JTextField DeleSTDate;
    private javax.swing.JTable DeleteStTable;
    private javax.swing.JButton GetEmpData;
    private javax.swing.JButton Home;
    private javax.swing.JButton ItemRepGen;
    private javax.swing.JButton ItmRptClearbtn;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField ProfitofSale;
    private javax.swing.JTextField SalesID;
    private javax.swing.JTextField SalesID1;
    private javax.swing.JButton Setvalbtn;
    private javax.swing.JButton StUpdateClear;
    private javax.swing.JTextField StockItemCount;
    private javax.swing.JTextField TOTinLastWeek;
    private javax.swing.JTextField TOTinMonth;
    private javax.swing.JTextField TotItemCost;
    private javax.swing.JComboBox<String> Utype;
    private javax.swing.JTextField Year;
    private javax.swing.JTable adBillTB;
    private javax.swing.JTextField aditmDisc;
    private javax.swing.JTextField aditmGivenPrice;
    private javax.swing.JTextField aditmQuant;
    private javax.swing.JTable billShowStock;
    private javax.swing.JButton btnAddSTclear;
    private javax.swing.JButton btnCancelAfterBill;
    private javax.swing.JButton btnCheckSTK;
    private javax.swing.JButton btnCheckSTK1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteCheck;
    private javax.swing.JButton btnDeleteClear;
    private javax.swing.JButton btnMonthlysale;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JButton btnadAdd;
    private javax.swing.JButton btnadAddItm;
    private javax.swing.JButton btnadBill2;
    private javax.swing.JButton btnadBillClear;
    private javax.swing.JButton btnadBillRemove;
    private javax.swing.JButton btnadEmpDelete;
    private javax.swing.JButton btnadEmpUpdate;
    private javax.swing.JButton btnaddEmployee;
    private javax.swing.JButton btnweeklysale;
    private javax.swing.JTable caCheckStTb;
    private javax.swing.JTable caCheckStTb1;
    private javax.swing.JComboBox<String> comboadAddunit;
    private javax.swing.JComboBox<String> comboadUpunit;
    private javax.swing.JTextField dailyProfit;
    private javax.swing.JButton itmRepGen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField newItmCode;
    private javax.swing.JTable repItem;
    private javax.swing.JTextField totCostOfsales;
    private javax.swing.JTextField totCostofsalesday;
    private javax.swing.JTextField txtDeleteItm;
    private javax.swing.JTextField txtRptFletter;
    private javax.swing.JTextField txtUpIquant;
    private javax.swing.JTextField txtUpbyprice;
    private javax.swing.JTextField txtUpdisc;
    private javax.swing.JTextField txtUpuniprice;
    private javax.swing.JTextField txtadAddIbuy;
    private javax.swing.JTextField txtadAddIcode;
    private javax.swing.JTextField txtadAddIname;
    private javax.swing.JTextField txtadAddIquant;
    private javax.swing.JTextField txtadAddIuni;
    private javax.swing.JTextField txtadBillBalance;
    private javax.swing.JTextField txtadBillIcode;
    private javax.swing.JTextField txtadBillIcount;
    private javax.swing.JTextField txtadBillPay;
    private javax.swing.JTextField txtadBillRemove;
    private javax.swing.JTextField txtadBillTotal;
    private javax.swing.JTextField txtadBillTotalDisc;
    private javax.swing.JTextField txtadEmpAddmobile;
    private javax.swing.JTextField txtadEmpAddname;
    private javax.swing.JPasswordField txtadEmpAddpswd;
    private javax.swing.JTextField txtadEmpAddtele;
    private javax.swing.JTextField txtadEmpAdduname;
    private javax.swing.JTextField txtadEmpDataMob;
    private javax.swing.JTextField txtadEmpDataName;
    private javax.swing.JTextField txtadEmpDataTele;
    private javax.swing.JTextField txtadEmpDelete;
    private javax.swing.JTextField txtadEmpUpmobile;
    private javax.swing.JTextField txtadEmpUpname;
    private javax.swing.JTextField txtadEmpUpnameprev;
    private javax.swing.JTextField txtadEmpUptele;
    private javax.swing.JTextField txtadStDisc;
    private javax.swing.JTextField txtadStUpIcode;
    private javax.swing.JTextField txtadStUpIname;
    private javax.swing.JTextField txtadTotalPayableAmount;
    private javax.swing.JTextField txtcaViewStk;
    // End of variables declaration//GEN-END:variables
}
