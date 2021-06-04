/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_final_gas_ordering;

import java.awt.HeadlessException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2ndyrGroupB
 */
public final class customerDashboard extends javax.swing.JFrame {

    String fullName = login.fullName;

    public customerDashboard() {
        initComponents();
        displayGas();
        displayTransaction();
        transactionPannel.setVisible(true);
        productPannel.setVisible(false);
        orderPannel.setVisible(false);
    }

    public void displayGas() {
        DefaultTableModel petronTableModel = (DefaultTableModel) gasListTable.getModel();
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt = con.createStatement();

                ResultSet datas = stmt.executeQuery("SELECT * FROM `gasdb`");
                while (datas.next()) {
                    count = 1;
                    petronTableModel.addRow(new Object[]{datas.getString("Type"), datas.getString("Quantity") + " pc(s)", "Php " + datas.getString("Price") + ".00"});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayTransaction() {
        DefaultTableModel orderTableModel = (DefaultTableModel) transactionTable.getModel();

        int orderCount;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt2 = con.createStatement();
                ResultSet orderData = stmt2.executeQuery("SELECT * FROM `order` WHERE `orderFormFullName`='" + fullName + "'");

                while (orderData.next()) {
                    orderCount = 0;
                    orderTableModel.addRow(new Object[]{orderData.getString("orderFormFullName"), orderData.getString("orderFormAddress"), orderData.getString("orderFormDate"), orderData.getString("orderFormTankType"),
                        orderData.getString("orderFormQuantity") + " pc(s)", "Php " + orderData.getString("orderFormTotal") + ".00", "Php " + orderData.getString("orderFormCash") + ".00", "Php " + orderData.getString("orderFormChange") + ".00"});
                }
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        transactionTab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        exitTab = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        orderTab = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        productsTab = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panels = new javax.swing.JPanel();
        orderPannel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        receiptThanks = new javax.swing.JLabel();
        receiptFullName = new javax.swing.JLabel();
        receiptContact = new javax.swing.JLabel();
        receiptAddress = new javax.swing.JLabel();
        receiptDate = new javax.swing.JLabel();
        receiptTankType = new javax.swing.JLabel();
        receiptQuantity = new javax.swing.JLabel();
        receiptTotal = new javax.swing.JLabel();
        receiptCash = new javax.swing.JLabel();
        receiptChange = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        orderFullName = new javax.swing.JTextField();
        orderContact = new javax.swing.JTextField();
        orderAddress = new javax.swing.JTextField();
        orderQuantity = new javax.swing.JTextField();
        orderTypeTank = new javax.swing.JComboBox<>();
        orderTotal = new javax.swing.JTextField();
        orderCash = new javax.swing.JTextField();
        orderChange = new javax.swing.JTextField();
        orderResetBtn = new javax.swing.JButton();
        orderCheckoutBtn = new javax.swing.JButton();
        productPannel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gasListTable = new javax.swing.JTable();
        transactionPannel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 20, true));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupB\\Desktop\\documents & drivers\\lpg.png")); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        transactionTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionTabMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Transactions");

        javax.swing.GroupLayout transactionTabLayout = new javax.swing.GroupLayout(transactionTab);
        transactionTab.setLayout(transactionTabLayout);
        transactionTabLayout.setHorizontalGroup(
            transactionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        transactionTabLayout.setVerticalGroup(
            transactionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        exitTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTabMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Exit");

        javax.swing.GroupLayout exitTabLayout = new javax.swing.GroupLayout(exitTab);
        exitTab.setLayout(exitTabLayout);
        exitTabLayout.setHorizontalGroup(
            exitTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        exitTabLayout.setVerticalGroup(
            exitTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        orderTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTabMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Order");

        javax.swing.GroupLayout orderTabLayout = new javax.swing.GroupLayout(orderTab);
        orderTab.setLayout(orderTabLayout);
        orderTabLayout.setHorizontalGroup(
            orderTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        orderTabLayout.setVerticalGroup(
            orderTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        productsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTabMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Products");

        javax.swing.GroupLayout productsTabLayout = new javax.swing.GroupLayout(productsTab);
        productsTab.setLayout(productsTabLayout);
        productsTabLayout.setHorizontalGroup(
            productsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsTabLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productsTabLayout.setVerticalGroup(
            productsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productsTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transactionTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productsTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panels.setBackground(new java.awt.Color(0, 0, 0));

        orderPannel.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Order your Gas Now!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        jLabel12.setText("Official Receipt");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel12)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        receiptThanks.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptFullName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptContact.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptAddress.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptDate.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptTankType.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptQuantity.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptTotal.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptCash.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        receiptChange.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receiptThanks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptTankType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(receiptDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptThanks)
                .addGap(24, 24, 24)
                .addComponent(receiptFullName)
                .addGap(18, 18, 18)
                .addComponent(receiptContact)
                .addGap(21, 21, 21)
                .addComponent(receiptAddress)
                .addGap(21, 21, 21)
                .addComponent(receiptDate)
                .addGap(18, 18, 18)
                .addComponent(receiptTankType)
                .addGap(18, 18, 18)
                .addComponent(receiptQuantity)
                .addGap(18, 18, 18)
                .addComponent(receiptTotal)
                .addGap(18, 18, 18)
                .addComponent(receiptCash)
                .addGap(18, 18, 18)
                .addComponent(receiptChange)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        jLabel13.setText("Order Form");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel13)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("Full Name: ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setText("Contact No.:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setText("Address: ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel17.setText("Cylinder Qnty: ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel18.setText("Quantity: ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel19.setText("Total:     Php");

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel20.setText("Cash:     Php");

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel21.setText("Change: Php");

        orderFullName.setEditable(false);
        orderFullName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderFullName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        orderFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderFullNameKeyReleased(evt);
            }
        });

        orderContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderContact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        orderContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderContactKeyReleased(evt);
            }
        });

        orderAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        orderQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderQuantity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        orderQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderQuantityKeyReleased(evt);
            }
        });

        orderTypeTank.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderTypeTank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "How many kilos", "50 kilos", "22 kilos", "11 kilos", "7 kilos", "2.7 kilos" }));
        orderTypeTank.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        orderTotal.setEditable(false);
        orderTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        orderCash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderCash.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        orderCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderCashKeyReleased(evt);
            }
        });

        orderChange.setEditable(false);
        orderChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderChange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        orderResetBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        orderResetBtn.setText("Reset");
        orderResetBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        orderResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderResetBtnMouseClicked(evt);
            }
        });

        orderCheckoutBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        orderCheckoutBtn.setText("Checkout");
        orderCheckoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        orderCheckoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderCheckoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderContact, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orderFullName)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(orderAddress))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orderTypeTank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(orderQuantity))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(orderResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderCheckoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orderChange)
                            .addComponent(orderCash)
                            .addComponent(orderTotal))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(orderFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(orderContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(orderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(orderTypeTank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(orderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(orderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(orderCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderCheckoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout orderPannelLayout = new javax.swing.GroupLayout(orderPannel);
        orderPannel.setLayout(orderPannelLayout);
        orderPannelLayout.setHorizontalGroup(
            orderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(orderPannelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        orderPannelLayout.setVerticalGroup(
            orderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPannelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        productPannel.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setText("Available Products");

        gasListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        gasListTable.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        gasListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type/Level Quantity", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gasListTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout productPannelLayout = new javax.swing.GroupLayout(productPannel);
        productPannel.setLayout(productPannelLayout);
        productPannelLayout.setHorizontalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
            .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productPannelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        productPannelLayout.setVerticalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productPannelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        transactionPannel.setBackground(new java.awt.Color(153, 153, 153));
        transactionPannel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("My Transactions");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Date", "Tank Type", "Quantity ", "Total", "Cash", "Change"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(transactionTable);

        javax.swing.GroupLayout transactionPannelLayout = new javax.swing.GroupLayout(transactionPannel);
        transactionPannel.setLayout(transactionPannelLayout);
        transactionPannelLayout.setHorizontalGroup(
            transactionPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        transactionPannelLayout.setVerticalGroup(
            transactionPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPannelLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelsLayout = new javax.swing.GroupLayout(panels);
        panels.setLayout(panelsLayout);
        panelsLayout.setHorizontalGroup(
            panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(orderPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(productPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(transactionPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelsLayout.setVerticalGroup(
            panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(orderPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(productPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(transactionPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionTabMouseClicked
        transactionPannel.setVisible(true);
        productPannel.setVisible(false);
        orderPannel.setVisible(false);

        DefaultTableModel transactionTableModel = (DefaultTableModel) transactionTable.getModel();

        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt = con.createStatement();

                ResultSet orderData = stmt.executeQuery("SELECT * FROM `order` WHERE `orderFormFullName`='" + fullName + "'");
                while (orderData.next()) {
                    count = 1;
                    transactionTableModel.removeRow(count);
                    transactionTableModel.addRow(new Object[]{orderData.getString("orderFormFullName"), orderData.getString("orderFormAddress"), orderData.getString("orderFormDate"), orderData.getString("orderFormTankType"),
                        orderData.getString("orderFormQuantity") + " pc(s)", "Php " + orderData.getString("orderFormTotal") + ".00", "Php " + orderData.getString("orderFormCash") + ".00", "Php " + orderData.getString("orderFormChange") + ".00"});
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "No data found!.", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_transactionTabMouseClicked

    private void orderTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTabMouseClicked
        orderFullName.setText(fullName);
        orderPannel.setVisible(true);
        productPannel.setVisible(false);
        transactionPannel.setVisible(false);
    }//GEN-LAST:event_orderTabMouseClicked

    private void orderResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderResetBtnMouseClicked

        this.orderContact.setText(null);
        this.orderAddress.setText(null);
        this.orderTypeTank.setSelectedIndex(0);
        this.orderQuantity.setText(null);
        this.orderTotal.setText(null);
        this.orderCash.setText(null);
        this.orderChange.setText(null);
    }//GEN-LAST:event_orderResetBtnMouseClicked

    private void exitTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTabMouseClicked
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitTabMouseClicked

    private void orderCheckoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderCheckoutBtnMouseClicked
        if ("".equals(orderFullName.getText()) || "".equals(orderContact.getText()) || "".equals(orderAddress.getText()) || "".equals(orderQuantity.getText()) || "".equals(orderTotal.getText()) || "".equals(orderCash.getText()) || "".equals(orderChange.getText())) {
            JOptionPane.showMessageDialog(null, "No Order Yet!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter orderDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String newOrderDate = myDateObj.format(orderDate);
            System.out.println("After formatting: " + newOrderDate);

            this.receiptThanks.setText("Thanks For Ordering!");
            this.receiptFullName.setText("Full Name: " + this.orderFullName.getText());
            this.receiptContact.setText("Contact Number: " + this.orderContact.getText());
            this.receiptAddress.setText("Address: " + this.orderAddress.getText());
            this.receiptDate.setText("Date: " + myDateObj.format(orderDate));
            this.receiptTankType.setText("Type/Quality Level: " + (String) this.orderTypeTank.getSelectedItem());
            this.receiptQuantity.setText("Quantity: " + Integer.parseInt(this.orderQuantity.getText()) + " pc(s)");
            this.receiptTotal.setText("Total: Php " + Integer.parseInt(this.orderTotal.getText()) + ".00");
            this.receiptCash.setText("Cash: Php " + Integer.parseInt(this.orderCash.getText()) + ".00");
            this.receiptChange.setText("Change: Php " + Integer.parseInt(this.orderChange.getText()) + ".00");

            try {
                DefaultTableModel petronTableModel = (DefaultTableModel) gasListTable.getModel();
                Class.forName("com.mysql.jdbc.Driver");
                String typeTank = (String) this.orderTypeTank.getSelectedItem();
                try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                    Statement stmt = con.createStatement();
                    String query1 = "INSERT INTO `order`(`orderFormFullName`,`orderFormContact`,`orderFormAddress`,`orderFormDate`,`orderFormTankType`, "
                            + "`orderFormQuantity`,`orderFormTotal`,`orderFormCash`,`orderFormChange`) "
                            + "VALUES ('" + this.orderFullName.getText() + "','" + this.orderContact.getText() + "',"
                            + "'" + this.orderAddress.getText() + "','" + myDateObj.format(orderDate) + "','" + this.orderTypeTank.getSelectedItem() + "',"
                            + "'" + this.orderQuantity.getText() + "','" + this.orderTotal.getText() + "',"
                            + "'" + this.orderCash.getText() + "','" + this.orderChange.getText() + "')";
                    stmt.executeUpdate(query1);

                    int count;
                    ResultSet data = stmt.executeQuery("SELECT * FROM `gasdb`  WHERE Type = '" + typeTank + "'");
                    if (data.next()) {
                        int qnty = Integer.parseInt(data.getString("Quantity")) - Integer.parseInt(this.orderQuantity.getText());
                        System.out.println(typeTank);
                        System.out.println(data.getString("Quantity"));
                        System.out.println(qnty);
                        String newQnty = Integer.toString(qnty);
                        String query2 = "UPDATE `gasdb` SET `Quantity`='" + newQnty + "' WHERE Type = '" + typeTank + "'";
                        stmt.executeUpdate(query2);
                    }

                    ResultSet newData = stmt.executeQuery("SELECT * FROM `gasdb`");
                    while (newData.next()) {
                        count = 0;
                        petronTableModel.removeRow(count);
                        petronTableModel.addRow(new Object[]{newData.getString("Type"), newData.getString("Quantity") + " pc(s)", "Php " + newData.getString("Price") + ".00"});
                    }
                    con.close();
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            this.orderContact.setText(null);
            this.orderAddress.setText(null);
            this.orderTypeTank.setSelectedIndex(0);
            this.orderQuantity.setText(null);
            this.orderTotal.setText(null);
            this.orderCash.setText(null);
            this.orderChange.setText(null);
        }
    }//GEN-LAST:event_orderCheckoutBtnMouseClicked

    private void orderQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderQuantityKeyReleased

        if (this.orderQuantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid Quantity!", "Alert", JOptionPane.ERROR_MESSAGE);
            this.orderTotal.setText("");
        } else {
            if (this.orderTypeTank.getSelectedItem() == "50 kilos") {
                int price = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                        Statement stmt = con.createStatement();

                        ResultSet datas = stmt.executeQuery("SELECT * FROM `gasdb` WHERE `Type` = '50 kilos'");
                        if (datas.next()) {
                            price = datas.getInt("Price");
                        }
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
                }
                this.orderTotal.setText(Integer.toString(price * Integer.parseInt(this.orderQuantity.getText())));
            } else if (this.orderTypeTank.getSelectedItem() == "22 kilos") {
                int price = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                        Statement stmt = con.createStatement();

                        ResultSet datas = stmt.executeQuery("SELECT * FROM `gasdb` WHERE `Type` = '22 kilos'");
                        if (datas.next()) {

                            price = datas.getInt("Price");
                        }
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
                }
                this.orderTotal.setText(Integer.toString(price * Integer.parseInt(this.orderQuantity.getText())));
            } else if (this.orderTypeTank.getSelectedItem() == "11 kilos") {
                int price = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                        Statement stmt = con.createStatement();

                        ResultSet datas = stmt.executeQuery("SELECT * FROM `gasdb` WHERE `Type` = '11 kilos'");
                        if (datas.next()) {

                            price = datas.getInt("Price");
                        }
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
                }
                this.orderTotal.setText(Integer.toString(price * Integer.parseInt(this.orderQuantity.getText())));
            } else if (this.orderTypeTank.getSelectedItem() == "7 kilos") {
                int price = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                        Statement stmt = con.createStatement();

                        ResultSet datas = stmt.executeQuery("SELECT * FROM `gasdb` WHERE `Type` = '7 kilos'");
                        if (datas.next()) {

                            price = datas.getInt("Price");
                        }
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
                }
                this.orderTotal.setText(Integer.toString(price * Integer.parseInt(this.orderQuantity.getText())));
            } else if (this.orderTypeTank.getSelectedItem() == "2.7 kilos") {
                int price = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                        Statement stmt = con.createStatement();

                        ResultSet datas = stmt.executeQuery("SELECT * FROM `gasdb` WHERE `Type` = '2.7 kilos'");
                        if (datas.next()) {

                            price = datas.getInt("Price");
                        }
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
                }
                this.orderTotal.setText(Integer.toString(price * Integer.parseInt(this.orderQuantity.getText())));
            }
        }
    }//GEN-LAST:event_orderQuantityKeyReleased

    private void orderCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderCashKeyReleased
        if (this.orderCash.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Cash!", "Alert", JOptionPane.ERROR_MESSAGE);
            this.orderChange.setText("");
        } else {
            if (Integer.parseInt(this.orderCash.getText()) < Integer.parseInt(this.orderTotal.getText())) {
                this.orderChange.setText("");
            } else {
                this.orderChange.setText(Integer.toString(Integer.parseInt(this.orderCash.getText()) - Integer.parseInt(this.orderTotal.getText())));
            }
        }
    }//GEN-LAST:event_orderCashKeyReleased

    private void orderFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderFullNameKeyReleased
        this.receiptThanks.setText("Thanks For Ordering!");
        this.receiptFullName.setText("");
        this.receiptContact.setText("");
        this.receiptAddress.setText("");
        this.receiptDate.setText("");
        this.receiptTankType.setText("");
        this.receiptQuantity.setText("");
        this.receiptTotal.setText("");
        this.receiptCash.setText("");
        this.receiptChange.setText("");

    }//GEN-LAST:event_orderFullNameKeyReleased

    private void orderContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderContactKeyReleased
        this.receiptThanks.setText("Thanks For Ordering!");
        this.receiptFullName.setText("");
        this.receiptContact.setText("");
        this.receiptAddress.setText("");
        this.receiptDate.setText("");
        this.receiptTankType.setText("");
        this.receiptQuantity.setText("");
        this.receiptTotal.setText("");
        this.receiptCash.setText("");
        this.receiptChange.setText("");
    }//GEN-LAST:event_orderContactKeyReleased

    private void productsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsTabMouseClicked
        productPannel.setVisible(true);
        transactionPannel.setVisible(false);
        orderPannel.setVisible(false);
    }//GEN-LAST:event_productsTabMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerDashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new customerDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exitTab;
    private javax.swing.JTable gasListTable;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField orderAddress;
    private javax.swing.JTextField orderCash;
    private javax.swing.JTextField orderChange;
    private javax.swing.JButton orderCheckoutBtn;
    private javax.swing.JTextField orderContact;
    private javax.swing.JTextField orderFullName;
    private javax.swing.JPanel orderPannel;
    private javax.swing.JTextField orderQuantity;
    private javax.swing.JButton orderResetBtn;
    private javax.swing.JPanel orderTab;
    private javax.swing.JTextField orderTotal;
    private javax.swing.JComboBox<String> orderTypeTank;
    private javax.swing.JPanel panels;
    private javax.swing.JPanel productPannel;
    private javax.swing.JPanel productsTab;
    private javax.swing.JLabel receiptAddress;
    private javax.swing.JLabel receiptCash;
    private javax.swing.JLabel receiptChange;
    private javax.swing.JLabel receiptContact;
    private javax.swing.JLabel receiptDate;
    private javax.swing.JLabel receiptFullName;
    private javax.swing.JLabel receiptQuantity;
    private javax.swing.JLabel receiptTankType;
    private javax.swing.JLabel receiptThanks;
    private javax.swing.JLabel receiptTotal;
    private javax.swing.JPanel transactionPannel;
    private javax.swing.JPanel transactionTab;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables
}
