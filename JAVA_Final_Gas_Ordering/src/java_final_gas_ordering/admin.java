package java_final_gas_ordering;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class admin extends javax.swing.JFrame {

    public admin() {
        initComponents();
        displayGas();
        displayUsers();
        displayTransactions();
        displayTransactionDate();
        this.userTable.setVisible(false);
        this.deleteAccountBtn.setVisible(false);
        this.gasListTable.setVisible(false);
        this.gasQuantityField.setVisible(false);
        this.updateGasBtn.setVisible(false);
        this.gasPriceField.setVisible(false);
        this.gasTypeField.setVisible(false);
        this.userTable.setVisible(false);
    }

    public void displayGas() {
        DefaultTableModel petronTableModel = (DefaultTableModel) gasListTable.getModel();
        int count;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt = con.createStatement();
                Statement stmt1 = con.createStatement();

                ResultSet gasData = stmt.executeQuery("SELECT * FROM `gasdb`");
                while (gasData.next()) {
                    count = 1;
                    petronTableModel.addRow(new Object[]{gasData.getString("Type"), gasData.getString("Quantity"), gasData.getString("Price")});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayUsers() {
        DefaultTableModel userTableModel = (DefaultTableModel) userTable.getModel();
        int userCount;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt1 = con.createStatement();
                ResultSet userDatas = stmt1.executeQuery("SELECT * FROM `user`");
                while (userDatas.next()) {
                    userCount = 1;
                    userTableModel.addRow(new Object[]{userDatas.getInt("userID"), userDatas.getString("fullName"), userDatas.getString("address"), userDatas.getString("gender"), userDatas.getString("userName")});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void displayTransactions() {
        DefaultTableModel orderTableModel = (DefaultTableModel) transactionTable.getModel();
        int orderCount;
        int quantity = 0;
        int total = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt2 = con.createStatement();
                ResultSet orderData = stmt2.executeQuery("SELECT * FROM `order`");
                while (orderData.next()) {
                    orderCount = 1;
                    orderTableModel.addRow(new Object[]{orderData.getInt("orderFormID"), orderData.getString("orderFormFullName"), orderData.getString("orderFormContact"), orderData.getString("orderFormAddress"), orderData.getString("orderFormDate"), orderData.getString("orderFormTankType"),
                        orderData.getString("orderFormQuantity") + " pc(s)", "Php " + orderData.getString("orderFormTotal") + ".00", "Php " + orderData.getString("orderFormCash") + ".00", "Php " + orderData.getString("orderFormChange") + ".00"});
                    quantity += Integer.parseInt(orderData.getString("orderFormQuantity"));
                    total += Integer.parseInt(orderData.getString("orderFormTotal"));
                }
                String totalQnty = Integer.toString(quantity);
                String totalSold = Integer.toString(total);
                this.totalQntySold.setText(totalQnty + " pc(s)");
                this.totalAmountSold.setText("Php " + totalSold + ".00");
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayTransactionDate() {
        DefaultTableModel transactionDateTableModel = (DefaultTableModel) transactionDateTable.getModel();
        int dateCount;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt = con.createStatement();
                ResultSet dateData = stmt.executeQuery("SELECT DISTINCT `orderFormDate` FROM `order`");
                while (dateData.next()) {
                    dateCount = 1;
                    transactionDateTableModel.addRow(new Object[]{dateData.getString("orderFormDate")});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        transactionTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gasListTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageAccTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        exitTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Panels = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        deleteTransactionBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalQntySold = new javax.swing.JLabel();
        totalAmountSold = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        transactionDateTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        dateQuantitySold = new javax.swing.JLabel();
        dateTotalSold = new javax.swing.JLabel();
        transactionDateTotalQntySold = new javax.swing.JLabel();
        transactionDateTotalAmountSold = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        twoSevenKilos = new javax.swing.JLabel();
        sevenKilos = new javax.swing.JLabel();
        elevenKilos = new javax.swing.JLabel();
        twentyTwoKilos = new javax.swing.JLabel();
        fiftyKilos = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        gasListPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gasListTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        gasQuantityField = new javax.swing.JTextField();
        updateGasBtn = new javax.swing.JButton();
        gasPriceField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        gasTypeField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        manageAccPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        deleteAccountBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 20, true));

        jPanel8.setBackground(new java.awt.Color(0, 153, 204));

        transactionTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionTabMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Transactions");

        javax.swing.GroupLayout transactionTabLayout = new javax.swing.GroupLayout(transactionTab);
        transactionTab.setLayout(transactionTabLayout);
        transactionTabLayout.setHorizontalGroup(
            transactionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionTabLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transactionTabLayout.setVerticalGroup(
            transactionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gasListTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gasListTabMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Gas List");

        javax.swing.GroupLayout gasListTabLayout = new javax.swing.GroupLayout(gasListTab);
        gasListTab.setLayout(gasListTabLayout);
        gasListTabLayout.setHorizontalGroup(
            gasListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gasListTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(79, 79, 79))
        );
        gasListTabLayout.setVerticalGroup(
            gasListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasListTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        manageAccTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageAccTabMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Manage Accounts");

        javax.swing.GroupLayout manageAccTabLayout = new javax.swing.GroupLayout(manageAccTab);
        manageAccTab.setLayout(manageAccTabLayout);
        manageAccTabLayout.setHorizontalGroup(
            manageAccTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageAccTabLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        manageAccTabLayout.setVerticalGroup(
            manageAccTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageAccTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        exitTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTabMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Exit");

        javax.swing.GroupLayout exitTabLayout = new javax.swing.GroupLayout(exitTab);
        exitTab.setLayout(exitTabLayout);
        exitTabLayout.setHorizontalGroup(
            exitTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitTabLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitTabLayout.setVerticalGroup(
            exitTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gasListTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageAccTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transactionTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(manageAccTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(gasListTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(exitTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        Panels.setBackground(new java.awt.Color(255, 255, 255));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Address", "Date", "Tank Type", "Quantity", "Total", "Cash", "Change"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(transactionTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Manage your Business Now!");

        deleteTransactionBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteTransactionBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        deleteTransactionBtn.setText("Delete Transaction");
        deleteTransactionBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        deleteTransactionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTransactionBtnMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total Quantity Sold: ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Total Amount: ");

        totalQntySold.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        totalQntySold.setForeground(new java.awt.Color(255, 0, 0));

        totalAmountSold.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        totalAmountSold.setForeground(new java.awt.Color(255, 0, 0));

        transactionDateTable.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        transactionDateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionDateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionDateTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(transactionDateTable);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        dateQuantitySold.setBackground(new java.awt.Color(255, 255, 255));
        dateQuantitySold.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateQuantitySold.setText("Total Quantity Sold: ");

        dateTotalSold.setBackground(new java.awt.Color(255, 255, 255));
        dateTotalSold.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateTotalSold.setText("Total Amount: ");

        transactionDateTotalQntySold.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        transactionDateTotalQntySold.setForeground(new java.awt.Color(255, 0, 0));

        transactionDateTotalAmountSold.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        transactionDateTotalAmountSold.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateTotalSold)
                    .addComponent(dateQuantitySold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionDateTotalAmountSold, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(transactionDateTotalQntySold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateQuantitySold, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transactionDateTotalQntySold, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTotalSold)
                    .addComponent(transactionDateTotalAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Tank Type");

        twoSevenKilos.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        twoSevenKilos.setForeground(new java.awt.Color(204, 0, 0));

        sevenKilos.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        sevenKilos.setForeground(new java.awt.Color(204, 0, 0));

        elevenKilos.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        elevenKilos.setForeground(new java.awt.Color(204, 0, 0));

        twentyTwoKilos.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        twentyTwoKilos.setForeground(new java.awt.Color(204, 0, 0));

        fiftyKilos.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        fiftyKilos.setForeground(new java.awt.Color(204, 0, 0));

        jLabel15.setText("2.7 kilos: ");

        jLabel16.setText("7 Kilos: ");

        jLabel17.setText("11 kilos: ");

        jLabel18.setText("22 kilos: ");

        jLabel19.setText("50 kilos: ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(twoSevenKilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(sevenKilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elevenKilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twentyTwoKilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiftyKilos, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoSevenKilos)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenKilos)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevenKilos)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twentyTwoKilos)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiftyKilos)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalQntySold, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(totalAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homePanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(totalQntySold, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(totalAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteTransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gasListPanel.setBackground(new java.awt.Color(255, 255, 255));
        gasListPanel.setPreferredSize(new java.awt.Dimension(928, 482));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel10.setText("Product List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(40, 40, 40))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        gasListTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gasListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type/Quality Level", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gasListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gasListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gasListTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setText("Quantity:");

        gasQuantityField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gasQuantityField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        updateGasBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updateGasBtn.setText("Add Stock");
        updateGasBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        updateGasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGasBtnActionPerformed(evt);
            }
        });

        gasPriceField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gasPriceField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setText("Price:");

        gasTypeField.setEditable(false);
        gasTypeField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gasTypeField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("Type:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 49, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gasTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gasQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gasPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateGasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(gasTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gasQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(gasPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateGasBtn)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout gasListPanelLayout = new javax.swing.GroupLayout(gasListPanel);
        gasListPanel.setLayout(gasListPanelLayout);
        gasListPanelLayout.setHorizontalGroup(
            gasListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gasListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gasListPanelLayout.setVerticalGroup(
            gasListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gasListPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gasListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        manageAccPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageAccPanel.setPreferredSize(new java.awt.Dimension(928, 482));

        jPanel5.setBackground(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel9.setText("Manage Accounts");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        userTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No", "Full Name", "Address", "Gender", "Username"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(userTable);

        deleteAccountBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteAccountBtn.setText("Delete");
        deleteAccountBtn.setToolTipText("");
        deleteAccountBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        deleteAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageAccPanelLayout = new javax.swing.GroupLayout(manageAccPanel);
        manageAccPanel.setLayout(manageAccPanelLayout);
        manageAccPanelLayout.setHorizontalGroup(
            manageAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAccPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(manageAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manageAccPanelLayout.setVerticalGroup(
            manageAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAccPanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(deleteAccountBtn)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelsLayout = new javax.swing.GroupLayout(Panels);
        Panels.setLayout(PanelsLayout);
        PanelsLayout.setHorizontalGroup(
            PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelsLayout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelsLayout.createSequentialGroup()
                    .addComponent(manageAccPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gasListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelsLayout.setVerticalGroup(
            PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelsLayout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelsLayout.createSequentialGroup()
                    .addComponent(manageAccPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 44, Short.MAX_VALUE)))
            .addGroup(PanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gasListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupB\\Desktop\\documents & drivers\\lpg.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(Panels, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(Panels, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountBtnActionPerformed
        DefaultTableModel userTableModel = (DefaultTableModel) userTable.getModel();
        if (userTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Unsuccessful!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {

            int userid = (int) userTableModel.getValueAt(userTable.getSelectedRow(), 0);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                    Statement stmt = con.createStatement();
                    String query = "DELETE FROM user WHERE userID= " + userid + "";
                    stmt.execute(query);
                    con.close();
                    JOptionPane.showMessageDialog(null, "Successfully Deleted.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    userTableModel.removeRow(userTable.getSelectedRow());
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Unsuccessful!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_deleteAccountBtnActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        DefaultTableModel userTableModel = (DefaultTableModel) userTable.getModel();
    }//GEN-LAST:event_userTableMouseClicked

    private void updateGasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGasBtnActionPerformed
        DefaultTableModel petronTableModel = (DefaultTableModel) gasListTable.getModel();

        if ("".equals(gasQuantityField.getText()) && "".equals(gasPriceField.getText())) {
            JOptionPane.showMessageDialog(null, "No Selected Product!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            String petronType = (String) petronTableModel.getValueAt(gasListTable.getSelectedRow(), 0);

            int count;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                    Statement stmt = con.createStatement();
                    Statement stmt1 = con.createStatement();
                    String query = "UPDATE `gasdb` SET`Quantity`='" + this.gasQuantityField.getText() + "',`Price`='" + this.gasPriceField.getText() + "' WHERE  Type = '" + petronType + "'";
                    stmt.execute(query);
                    gasQuantityField.setText(null);
                    gasPriceField.setText(null);
                    gasTypeField.setText(null);
                    ResultSet datas = stmt1.executeQuery("SELECT * FROM `gasdb`");
                    while (datas.next()) {
                        count = 0;
                        petronTableModel.removeRow(count);
                        petronTableModel.addRow(new Object[]{datas.getString("Type"), datas.getString("Quantity"), datas.getString("Price")});
                    }
                    con.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_updateGasBtnActionPerformed

    private void gasListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gasListTableMouseClicked

        DefaultTableModel petronTableModel = (DefaultTableModel) gasListTable.getModel();
        String petronType = (String) petronTableModel.getValueAt(gasListTable.getSelectedRow(), 0);
        String petronQuantity = (String) petronTableModel.getValueAt(gasListTable.getSelectedRow(), 1);
        String petronPrice = (String) petronTableModel.getValueAt(gasListTable.getSelectedRow(), 2);

        this.gasTypeField.setText(petronType);
        this.gasQuantityField.setText(petronQuantity);
        this.gasPriceField.setText(petronPrice);
    }//GEN-LAST:event_gasListTableMouseClicked

    private void deleteTransactionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTransactionBtnMouseClicked
        DefaultTableModel orderTableModel = (DefaultTableModel) transactionTable.getModel();
        DefaultTableModel transactionDateTableModel = (DefaultTableModel) transactionDateTable.getModel();

        if (transactionTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Unsuccessful!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            int quantity = 0;
            int total = 0;
            int orderCount;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                    Statement stmt = con.createStatement();
                    Statement stmt1 = con.createStatement();
                    Statement stmt2 = con.createStatement();
                    int userID = (int) orderTableModel.getValueAt(transactionTable.getSelectedRow(), 0);
                    String date = (String) orderTableModel.getValueAt(transactionTable.getSelectedRow(), 4);
                    String query = "DELETE FROM `order` WHERE orderFormID = " + userID + "";
                    stmt1.execute(query);
                    ResultSet orderData = stmt2.executeQuery("SELECT * FROM `order`");
                    while (orderData.next()) {
                        orderCount = 1;
                        quantity += Integer.parseInt(orderData.getString("orderFormQuantity"));
                        total += Integer.parseInt(orderData.getString("orderFormTotal"));
                    }
                    JOptionPane.showMessageDialog(null, "Successfully Deleted.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    String totalQnty = Integer.toString(quantity);
                    String totalSold = Integer.toString(total);
                    this.totalQntySold.setText(totalQnty + " pc(s)");
                    this.totalAmountSold.setText("Php " + totalSold + ".00");
                    orderTableModel.removeRow(transactionTable.getSelectedRow());

                    int dateCount;
                    ResultSet dateData = stmt.executeQuery("SELECT DISTINCT `orderFormDate` FROM `order`");
                    while (dateData.next()) {
                        dateCount = 0;
                        transactionDateTableModel.removeRow(dateCount);
                        transactionDateTableModel.addRow(new Object[]{dateData.getString("orderFormDate")});
                    }
                    transactionDateTotalQntySold.setText("");
                    transactionDateTotalAmountSold.setText("");
                    this.fiftyKilos.setText("");
                    this.twentyTwoKilos.setText("");
                    this.elevenKilos.setText("");
                    this.sevenKilos.setText("");
                    this.twoSevenKilos.setText("");
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteTransactionBtnMouseClicked

    private void transactionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionTableMouseClicked

    }//GEN-LAST:event_transactionTableMouseClicked

    private void exitTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTabMouseClicked
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitTabMouseClicked

    private void manageAccTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAccTabMouseClicked
        homePanel.setVisible(false);
        manageAccPanel.setVisible(true);
        gasListPanel.setVisible(false);
        this.userTable.setVisible(true);
        this.deleteAccountBtn.setVisible(true);
        this.gasListTable.setVisible(false);
        this.gasQuantityField.setVisible(false);
        this.updateGasBtn.setVisible(false);

        //        transactionPanel.setVisible(false);
    }//GEN-LAST:event_manageAccTabMouseClicked

    private void gasListTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gasListTabMouseClicked
        homePanel.setVisible(false);
        manageAccPanel.setVisible(false);
        gasListPanel.setVisible(true);

        this.userTable.setVisible(false);
        this.deleteAccountBtn.setVisible(false);
        this.gasListTable.setVisible(true);
        this.gasQuantityField.setVisible(true);
        this.updateGasBtn.setVisible(true);
        this.gasPriceField.setVisible(true);
        this.gasTypeField.setVisible(true);

        DefaultTableModel petronTableModel = (DefaultTableModel) gasListTable.getModel();

        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                Statement stmt = con.createStatement();

                ResultSet datas = stmt.executeQuery("SELECT * FROM `gasdb`");
                while (datas.next()) {
                    count = 1;
                    petronTableModel.removeRow(count);
                    petronTableModel.addRow(new Object[]{datas.getString("Type"), datas.getString("Quantity"), datas.getString("Price")});
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "No data found!.", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_gasListTabMouseClicked

    private void transactionTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionTabMouseClicked
        homePanel.setVisible(true);
        manageAccPanel.setVisible(false);
        gasListPanel.setVisible(false);
    }//GEN-LAST:event_transactionTabMouseClicked

    private void transactionDateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionDateTableMouseClicked
        this.fiftyKilos.setText("");
        this.twentyTwoKilos.setText("");
        this.elevenKilos.setText("");
        this.sevenKilos.setText("");
        this.twoSevenKilos.setText("");
        DefaultTableModel transactionDateTableModel = (DefaultTableModel) transactionDateTable.getModel();
        String transactionDate = (String) transactionDateTableModel.getValueAt(transactionDateTable.getSelectedRow(), 0);
        if (null != transactionDate) {
            int orderCount;
            int totalQuantitySold = 0;
            int totalAmountPerDay = 0;
            int twoSevenKilo = 0;
            int sevenKilo = 0;
            int elevenKilo = 0;
            int twentyTwoKilo = 0;
            int fiftyKilo = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final", "root", "")) {
                    Statement stmt2 = con.createStatement();
                    ResultSet orderData = stmt2.executeQuery("SELECT * FROM `order` WHERE `orderFormDate` = '" + transactionDate + "'");
                    while (orderData.next()) {
                        orderCount = 1;

                        totalQuantitySold += Integer.parseInt(orderData.getString("orderFormQuantity"));
                        totalAmountPerDay += Integer.parseInt(orderData.getString("orderFormTotal"));
                        this.transactionDateTotalQntySold.setText(Integer.toString(totalQuantitySold) + " pc(s)");
                        this.transactionDateTotalAmountSold.setText("Php " + (Integer.toString(totalAmountPerDay)) + ".00");
                        if (null != orderData.getString("orderFormTankType")) {
                            switch (orderData.getString("orderFormTankType")) {
                                case "50 kilos":
                                    fiftyKilo += Integer.parseInt(orderData.getString("orderFormQuantity"));
                                    if (fiftyKilo < 0) {
                                        this.fiftyKilos.setText("No Order");
                                    } else {
                                        this.fiftyKilos.setText(Integer.toString(fiftyKilo) + " pc(s)");
                                    }
                                    break;
                                case "22 kilos":
                                    twentyTwoKilo += Integer.parseInt(orderData.getString("orderFormQuantity"));
                                    if (twentyTwoKilo < 0) {
                                        this.twentyTwoKilos.setText("No Order");
                                    } else {
                                        this.twentyTwoKilos.setText(Integer.toString(twentyTwoKilo) + " pc(s)");
                                    }
                                    break;
                                case "11 kilos":
                                    elevenKilo += Integer.parseInt(orderData.getString("orderFormQuantity"));
                                    if (elevenKilo < 0) {
                                        this.elevenKilos.setText("No Order");
                                    } else {
                                        this.elevenKilos.setText(Integer.toString(elevenKilo) + " pc(s)");
                                    }
                                    break;
                                case "7 kilos":
                                    sevenKilo += Integer.parseInt(orderData.getString("orderFormQuantity"));
                                    if (sevenKilo < 0) {
                                        this.sevenKilos.setText("No Order");
                                    } else {
                                        this.sevenKilos.setText(Integer.toString(sevenKilo) + " pc(s)");
                                    }
                                    break;
                                case "2.7 kilos":
                                    twoSevenKilo += Integer.parseInt(orderData.getString("orderFormQuantity"));
                                    if (twoSevenKilo < 0) {
                                        this.twoSevenKilos.setText("No Order");
                                    } else {
                                        this.twoSevenKilos.setText(Integer.toString(twoSevenKilo) + " pc(s)");
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }

                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
        }


    }//GEN-LAST:event_transactionDateTableMouseClicked

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panels;
    private javax.swing.JLabel dateQuantitySold;
    private javax.swing.JLabel dateTotalSold;
    private javax.swing.JButton deleteAccountBtn;
    private javax.swing.JButton deleteTransactionBtn;
    private javax.swing.JLabel elevenKilos;
    private javax.swing.JPanel exitTab;
    private javax.swing.JLabel fiftyKilos;
    private javax.swing.JPanel gasListPanel;
    private javax.swing.JPanel gasListTab;
    private javax.swing.JTable gasListTable;
    private javax.swing.JTextField gasPriceField;
    private javax.swing.JTextField gasQuantityField;
    private javax.swing.JTextField gasTypeField;
    private javax.swing.JPanel homePanel;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel manageAccPanel;
    private javax.swing.JPanel manageAccTab;
    private javax.swing.JLabel sevenKilos;
    private javax.swing.JLabel totalAmountSold;
    private javax.swing.JLabel totalQntySold;
    private javax.swing.JTable transactionDateTable;
    private javax.swing.JLabel transactionDateTotalAmountSold;
    private javax.swing.JLabel transactionDateTotalQntySold;
    private javax.swing.JPanel transactionTab;
    private javax.swing.JTable transactionTable;
    private javax.swing.JLabel twentyTwoKilos;
    private javax.swing.JLabel twoSevenKilos;
    private javax.swing.JButton updateGasBtn;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
