import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proiect.Client;
import proiect.Index;

public class MainFrame extends javax.swing.JFrame {
    
    DefaultTableModel modelC; // clients table model
    DefaultTableModel modelI; // indexes table model
    static Connection DBConnection; // connection to the database
    
    public MainFrame() {
        initComponents();   
        modelC = (DefaultTableModel)clientsTable.getModel();
        modelI = (DefaultTableModel)indexesTable.getModel();
        
        DBConnection = getConnection();  
        showClientsInTable("");
        loadPrices();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        MenuPanel = new javax.swing.JPanel();
        clientsButton = new javax.swing.JButton();
        pricesButton = new javax.swing.JButton();
        addIndexButton = new javax.swing.JButton();
        billButton = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();
        ClientsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        deleteClientButton = new javax.swing.JButton();
        updateClientButton = new javax.swing.JButton();
        addClientButton = new javax.swing.JButton();
        lastNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addIndexForClientButton = new javax.swing.JButton();
        PricesPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        simplePrice1 = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        morningPrice1 = new javax.swing.JFormattedTextField();
        nightPrice1 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        dayPrice1 = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        periodName1 = new javax.swing.JTextField();
        dayPrice2 = new javax.swing.JFormattedTextField();
        simplePrice2 = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        periodName2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        morningPrice2 = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        nightPrice2 = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        startDate1 = new com.toedter.calendar.JMonthChooser();
        endDate1 = new com.toedter.calendar.JMonthChooser();
        startDate2 = new com.toedter.calendar.JMonthChooser();
        endDate2 = new com.toedter.calendar.JMonthChooser();
        AddIndexPanel = new javax.swing.JPanel();
        simpleIndexRadio = new javax.swing.JRadioButton();
        compositeIndexRadio = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        enterClientIdField = new javax.swing.JTextField();
        okSelectClientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        indexesTable = new javax.swing.JTable();
        forMonthField = new com.toedter.calendar.JMonthChooser();
        forYearField = new com.toedter.calendar.JYearChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        indexSaveButton = new javax.swing.JButton();
        dayIndexField = new javax.swing.JFormattedTextField();
        simpleIndexField = new javax.swing.JFormattedTextField();
        morningIndexField = new javax.swing.JFormattedTextField();
        nightIndexField = new javax.swing.JFormattedTextField();
        handoverDateField = new javax.swing.JFormattedTextField();
        BillPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        invoiceClientIdField = new javax.swing.JTextField();
        invoiceButton = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        invoiceForMonthField = new com.toedter.calendar.JMonthChooser();
        invoiceForYearField = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(2000, 1600));
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(1200, 650));

        MenuPanel.setLayout(new java.awt.GridBagLayout());

        clientsButton.setText("Clients");
        clientsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientsButton.setMargin(new java.awt.Insets(10, 5, 10, 5));
        clientsButton.setPreferredSize(new java.awt.Dimension(100, 40));
        clientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        MenuPanel.add(clientsButton, gridBagConstraints);

        pricesButton.setText("Prices");
        pricesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pricesButton.setMargin(new java.awt.Insets(10, 5, 10, 5));
        pricesButton.setPreferredSize(new java.awt.Dimension(100, 40));
        pricesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        MenuPanel.add(pricesButton, gridBagConstraints);

        addIndexButton.setText("Add Index");
        addIndexButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addIndexButton.setMargin(new java.awt.Insets(10, 5, 10, 5));
        addIndexButton.setPreferredSize(new java.awt.Dimension(100, 40));
        addIndexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIndexButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        MenuPanel.add(addIndexButton, gridBagConstraints);

        billButton.setText("Invoice");
        billButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billButton.setMargin(new java.awt.Insets(10, 5, 10, 5));
        billButton.setPreferredSize(new java.awt.Dimension(100, 40));
        billButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        MenuPanel.add(billButton, gridBagConstraints);

        getContentPane().add(MenuPanel, java.awt.BorderLayout.PAGE_START);

        ContentPanel.setLayout(new java.awt.CardLayout());

        ClientsPanel.setBackground(new java.awt.Color(204, 255, 204));
        ClientsPanel.setMaximumSize(new java.awt.Dimension(68, 17));
        ClientsPanel.setPreferredSize(new java.awt.Dimension(894, 500));
        ClientsPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        ClientsPanel.add(jPanel1, gridBagConstraints);

        clientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last name", "Address", "Phone number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientsTable);
        if (clientsTable.getColumnModel().getColumnCount() > 0) {
            clientsTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 499;
        gridBagConstraints.ipady = 400;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        ClientsPanel.add(jScrollPane1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("First name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(67, 79, 0, 0);
        ClientsPanel.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address:");
        jLabel3.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(22, 94, 0, 0);
        ClientsPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone number:");
        jLabel4.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(22, 51, 0, 0);
        ClientsPanel.add(jLabel4, gridBagConstraints);

        firstNameTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(63, 18, 0, 0);
        ClientsPanel.add(firstNameTextField, gridBagConstraints);

        addressTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        ClientsPanel.add(addressTextField, gridBagConstraints);

        phoneTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        ClientsPanel.add(phoneTextField, gridBagConstraints);

        deleteClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteClientButton.setText("Delete");
        deleteClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteClientButton.setMaximumSize(new java.awt.Dimension(68, 17));
        deleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.insets = new java.awt.Insets(41, 2, 0, 41);
        ClientsPanel.add(deleteClientButton, gridBagConstraints);
        deleteClientButton.getAccessibleContext().setAccessibleDescription("30");

        updateClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateClientButton.setText("Update");
        updateClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateClientButton.setMaximumSize(new java.awt.Dimension(68, 17));
        updateClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateClientButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.insets = new java.awt.Insets(41, 9, 0, 0);
        ClientsPanel.add(updateClientButton, gridBagConstraints);
        updateClientButton.getAccessibleContext().setAccessibleDescription("30");

        addClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addClientButton.setText("Add");
        addClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addClientButton.setMaximumSize(new java.awt.Dimension(68, 17));
        addClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.insets = new java.awt.Insets(41, 51, 0, 0);
        ClientsPanel.add(addClientButton, gridBagConstraints);
        addClientButton.getAccessibleContext().setAccessibleDescription("30");

        lastNameTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        ClientsPanel.add(lastNameTextField, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Last name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(22, 79, 0, 0);
        ClientsPanel.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Search:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 78, 0, 0);
        ClientsPanel.add(jLabel6, gridBagConstraints);

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 253;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 171, 0);
        ClientsPanel.add(searchTextField, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\FMI\\AN2\\Sem2\\PAO\\Proiect\\Design\\Cancel_32px.png")); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setIconTextGap(0);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -4;
        gridBagConstraints.ipady = -9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 171, 0);
        ClientsPanel.add(jButton1, gridBagConstraints);

        addIndexForClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addIndexForClientButton.setText("Add Index");
        addIndexForClientButton.setToolTipText("Go to Add Index page for the selected client");
        addIndexForClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addIndexForClientButton.setMaximumSize(new java.awt.Dimension(68, 17));
        addIndexForClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIndexForClientButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(38, 9, 0, 0);
        ClientsPanel.add(addIndexForClientButton, gridBagConstraints);
        addIndexForClientButton.getAccessibleContext().setAccessibleDescription("30");

        ContentPanel.add(ClientsPanel, "card5");

        PricesPanel.setBackground(new java.awt.Color(255, 204, 204));

        jLabel17.setText("From:");

        jLabel18.setText("-");

        jLabel19.setText("To:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Simple index:");

        jLabel21.setText("/kWh");

        simplePrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel22.setText("Day:");

        jLabel23.setText("/kWh");

        jLabel24.setText("Night:");

        morningPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        nightPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel25.setText("/kWh");

        jLabel26.setText("/kWh");

        jLabel27.setText("Morning:");

        dayPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Composite index:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("List of prices");

        periodName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        periodName1.setText("Period 1");
        periodName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodName1ActionPerformed(evt);
            }
        });

        dayPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        simplePrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Composite index:");

        jLabel31.setText("Day:");

        jLabel32.setText("/kWh");

        periodName2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        periodName2.setText("Period 2");
        periodName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodName2ActionPerformed(evt);
            }
        });

        jLabel33.setText("Night:");

        jLabel34.setText("From:");

        morningPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel35.setText("-");

        nightPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel36.setText("To:");

        jLabel37.setText("/kWh");

        jLabel38.setText("/kWh");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Simple index:");

        jLabel40.setText("Morning:");

        jLabel41.setText("/kWh");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Save changes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Cancel changes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PricesPanelLayout = new javax.swing.GroupLayout(PricesPanel);
        PricesPanel.setLayout(PricesPanelLayout);
        PricesPanelLayout.setHorizontalGroup(
            PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PricesPanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PricesPanelLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel33)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nightPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jLabel37))
                        .addGroup(PricesPanelLayout.createSequentialGroup()
                            .addComponent(jLabel40)
                            .addGap(5, 5, 5)
                            .addComponent(morningPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel38))
                        .addGroup(PricesPanelLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel31)
                            .addGap(5, 5, 5)
                            .addComponent(dayPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel32)))
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addComponent(simplePrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41))
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel20)
                            .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PricesPanelLayout.createSequentialGroup()
                                    .addGap(433, 433, 433)
                                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel30)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PricesPanelLayout.createSequentialGroup()
                                    .addComponent(periodName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PricesPanelLayout.createSequentialGroup()
                                            .addGap(102, 102, 102)
                                            .addComponent(jLabel34))
                                        .addGroup(PricesPanelLayout.createSequentialGroup()
                                            .addGap(84, 84, 84)
                                            .addComponent(startDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(8, 8, 8)
                                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PricesPanelLayout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel36))
                                        .addGroup(PricesPanelLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel35)
                                            .addGap(12, 12, 12)
                                            .addComponent(endDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(82, 82, 82)
                        .addComponent(jLabel22)
                        .addGap(5, 5, 5)
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addComponent(simplePrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21))
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addComponent(dayPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23))))
                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PricesPanelLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nightPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jLabel25))
                        .addGroup(PricesPanelLayout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addGap(5, 5, 5)
                            .addComponent(morningPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel26))))
                .addGap(158, 158, 158))
            .addGroup(PricesPanelLayout.createSequentialGroup()
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(periodName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel17))
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(startDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel19))
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel18)
                                .addGap(12, 12, 12)
                                .addComponent(endDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel29))
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PricesPanelLayout.setVerticalGroup(
            PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PricesPanelLayout.createSequentialGroup()
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(simplePrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(38, 38, 38))
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(periodName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))))
                        .addGap(35, 35, 35)))
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PricesPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel28)))
                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(dayPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(nightPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(11, 11, 11)
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(morningPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PricesPanelLayout.createSequentialGroup()
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simplePrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(40, 40, 40)
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel31))
                            .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32)
                                .addComponent(dayPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PricesPanelLayout.createSequentialGroup()
                        .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PricesPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(startDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PricesPanelLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(periodName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)))
                            .addGroup(PricesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel39))))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel30)))
                .addGap(11, 11, 11)
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(nightPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(11, 11, 11)
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(morningPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(PricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(143, 143, 143))
        );

        ContentPanel.add(PricesPanel, "card4");

        AddIndexPanel.setBackground(new java.awt.Color(204, 204, 255));
        AddIndexPanel.setPreferredSize(new java.awt.Dimension(894, 500));

        buttonGroup1.add(simpleIndexRadio);
        simpleIndexRadio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        simpleIndexRadio.setText("Simple index:");
        simpleIndexRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleIndexRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(compositeIndexRadio);
        compositeIndexRadio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        compositeIndexRadio.setText("Composite index:");
        compositeIndexRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositeIndexRadioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Enter client ID:");

        okSelectClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        okSelectClientButton.setText("Ok");
        okSelectClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okSelectClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okSelectClientButtonActionPerformed(evt);
            }
        });

        indexesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "For month", "Index type", "Day index", "Night index", "Morning index"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(indexesTable);
        if (indexesTable.getColumnModel().getColumnCount() > 0) {
            indexesTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("For:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Handover date:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Index type:");

        jLabel1.setText("kWh");

        jLabel11.setText("Day:");

        jLabel12.setText("kWh");

        jLabel13.setText("Night:");

        jLabel14.setText("kWh");

        jLabel15.setText("kWh");

        jLabel16.setText("Morning:");

        indexSaveButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        indexSaveButton.setText("Save data");
        indexSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indexSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexSaveButtonActionPerformed(evt);
            }
        });

        dayIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        dayIndexField.setEnabled(false);

        simpleIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        simpleIndexField.setEnabled(false);

        morningIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        morningIndexField.setEnabled(false);

        nightIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        nightIndexField.setEnabled(false);

        try {
            handoverDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout AddIndexPanelLayout = new javax.swing.GroupLayout(AddIndexPanel);
        AddIndexPanel.setLayout(AddIndexPanelLayout);
        AddIndexPanelLayout.setHorizontalGroup(
            AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddIndexPanelLayout.createSequentialGroup()
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(enterClientIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(okSelectClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel10)
                        .addGap(39, 39, 39)
                        .addComponent(simpleIndexRadio)
                        .addGap(31, 31, 31)
                        .addComponent(simpleIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddIndexPanelLayout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nightIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel14))
                            .addGroup(AddIndexPanelLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel16)
                                .addGap(5, 5, 5)
                                .addComponent(morningIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(AddIndexPanelLayout.createSequentialGroup()
                                .addComponent(compositeIndexRadio)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel11)
                                .addGap(5, 5, 5)
                                .addComponent(dayIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(indexSaveButton)))
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddIndexPanelLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddIndexPanelLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel9)
                                .addGap(35, 35, 35)))
                        .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(handoverDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddIndexPanelLayout.setVerticalGroup(
            AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddIndexPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(enterClientIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(okSelectClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(handoverDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forYearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(forMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simpleIndexRadio)
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(simpleIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(8, 8, 8)
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compositeIndexRadio)
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11))
                    .addGroup(AddIndexPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(dayIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(nightIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(AddIndexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(morningIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(indexSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        ContentPanel.add(AddIndexPanel, "card3");

        BillPanel.setBackground(new java.awt.Color(204, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Enter client ID:");

        invoiceButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invoiceButton.setText("Invoice");
        invoiceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceButtonActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("For:");

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel42)
                        .addGap(10, 10, 10)
                        .addComponent(invoiceClientIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BillPanelLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(invoiceForMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceForYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(538, Short.MAX_VALUE))
        );
        BillPanelLayout.setVerticalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel42))
                    .addComponent(invoiceClientIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(invoiceForYearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoiceForMonthField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel43))
                .addGap(54, 54, 54)
                .addComponent(invoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        ContentPanel.add(BillPanel, "card2");

        getContentPane().add(ContentPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // loads prices from DB
    private void loadPrices() {
        String query = "SELECT * FROM prices;";
        
        Statement st;
        ResultSet rs;
        
        try {
            st = DBConnection.createStatement();
            rs = st.executeQuery(query);
            // we move to the first period
            rs.next(); 
            periodName1.setText(rs.getString("period_name"));
            startDate1.setMonth(rs.getInt("start_date"));
            endDate1.setMonth(rs.getInt("end_date"));
            simplePrice1.setValue(rs.getDouble("simple_price"));
            dayPrice1.setValue(rs.getDouble("day_price"));
            nightPrice1.setValue(rs.getDouble("night_price"));
            morningPrice1.setValue(rs.getDouble("morning_price"));
            // second period
            rs.next();
            periodName2.setText(rs.getString("period_name"));
            startDate2.setMonth(rs.getInt("start_date"));
            endDate2.setMonth(rs.getInt("end_date"));
            simplePrice2.setValue(rs.getDouble("simple_price"));
            dayPrice2.setValue(rs.getDouble("day_price"));
            nightPrice2.setValue(rs.getDouble("night_price"));
            morningPrice2.setValue(rs.getDouble("morning_price"));
        }
        catch(Exception e) {
            System.out.println("error at getting prices list");
            e.printStackTrace();
        }
    }
    
    // get clients list from database
    private ArrayList<Client> getClientsList(String search) {
        ArrayList<Client> clientsList = new ArrayList<>();
        
        String query = "SELECT * FROM client WHERE first_name LIKE '%" + search + "%' or last_name LIKE '%" + search + "%' or address LIKE '%" + search + "%';";
        Statement st;
        ResultSet rs;
        
        try {
            st = DBConnection.createStatement();
            rs = st.executeQuery(query);
            Client client = null;
            while(rs.next()) {
                client = new Client(rs.getInt("id_client"), rs.getString("last_name"), rs.getString("first_name"), rs.getString("address"), rs.getString("phone_number"));
                clientsList.add(client);
            }         
        }
        catch(Exception e) {
            System.out.println("error at getting clients list");
            e.printStackTrace();
        }
        
        return clientsList;
    }
    
    //Display data in table
    private void showClientsInTable(String search) {
        ArrayList<Client> list = getClientsList(search);
        Object[] row = new Object[clientsTable.getColumnCount()];
        int rowCount = modelC.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            modelC.removeRow(i);
        }
        for(int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getFirstName();
            row[2] = list.get(i).getLastName();
            row[3] = list.get(i).getAddress();
            row[4] = list.get(i).getPhone();
            
            modelC.addRow(row);
        }
    }
    
    // get indexes list from database
    private ArrayList<Index> getIndexesList(int id) {
        ArrayList<Index> indexesList = new ArrayList<>();
        
        String query = "SELECT * FROM idx WHERE id_client = " + id + " ORDER BY for_month;";
        Statement st;
        ResultSet rs;
        
        try {
            st = DBConnection.createStatement();
            rs = st.executeQuery(query);
            Index index = null;
            while(rs.next()) {
                index = new Index(rs.getInt("id_index"), rs.getInt("id_client"), rs.getDate("date"), rs.getDate("for_month"), rs.getInt("index_type"), rs.getDouble("day_index"), rs.getDouble("night_index"), rs.getDouble("morning_index"));
                indexesList.add(index);
            }         
        }
        catch(Exception e) {
            System.out.println("error at getting indexes list");
            e.printStackTrace();
        }
        
        return indexesList;
    }
    
    //Display indexes in table for client with id as parameter
    private void showIndexesInTable(int id) {
        ArrayList<Index> list = getIndexesList(id);
        Object[] row = new Object[indexesTable.getColumnCount()];
        int rowCount = modelI.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            modelI.removeRow(i);
        }
        for(int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getDate();
            row[2] = list.get(i).getFor_month();
            row[3] = list.get(i).getIndex_type();
            row[4] = list.get(i).getDay_index();
            row[5] = list.get(i).getNight_index();
            row[6] = list.get(i).getMorning_index();
            
            modelI.addRow(row);
        }
    }
    
    private void executeSQLQuery(String query, String message) {
        Statement st;
        
        try {
            st = DBConnection.createStatement();
            if((st.executeUpdate(query)) == 1) {
                // when we add/update a client we load the database again with the changes
                modelC.setRowCount(0);
                showClientsInTable("");
                
                JOptionPane.showMessageDialog(null, "Data " + message + " successfully");          
            }              
            else
                JOptionPane.showMessageDialog(null, "Data not " + message);
        }
        catch(Exception e) {
            System.out.println("error at " + message);
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturare_contoare?useSSL=false", "root", "Andibun337");
            if(con != null)
                System.out.println("connected to db successfully");
            return con;
        }
        catch (Exception e) {
            System.out.println("NOT connected to db successfully");
            e.printStackTrace();
            return null;
        }
    }
    
    private void clientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsButtonActionPerformed
        ContentPanel.removeAll();
        ContentPanel.add(ClientsPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_clientsButtonActionPerformed

    private void pricesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricesButtonActionPerformed
        ContentPanel.removeAll();
        ContentPanel.add(PricesPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_pricesButtonActionPerformed

    private void addIndexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIndexButtonActionPerformed
        ContentPanel.removeAll();
        ContentPanel.add(AddIndexPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_addIndexButtonActionPerformed

    private void billButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billButtonActionPerformed
        ContentPanel.removeAll();
        ContentPanel.add(BillPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_billButtonActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void addClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientButtonActionPerformed
        String fname = firstNameTextField.getText();
        String lname = lastNameTextField.getText();
        String addr = addressTextField.getText();
        String phone = phoneTextField.getText();
        
        String query = "INSERT INTO client (first_name, last_name, address, phone_number) VALUES ('" + fname + "','" + lname + "','" + addr + "','" + phone + "');" ;
        
        executeSQLQuery(query, "added");
    }//GEN-LAST:event_addClientButtonActionPerformed
    
    private void deleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButtonActionPerformed
        int row = clientsTable.getSelectedRow();
        int id = (int)modelC.getValueAt(row, 0);
        
        String query = "DELETE FROM client WHERE id_client = " + id ;
        
        executeSQLQuery(query, "deleted");             
    }//GEN-LAST:event_deleteClientButtonActionPerformed

    private void clientsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsTableMouseClicked
        int row = clientsTable.getSelectedRow();
        
        firstNameTextField.setText(modelC.getValueAt(row, 1).toString());
        lastNameTextField.setText(modelC.getValueAt(row, 2).toString());
        addressTextField.setText(modelC.getValueAt(row, 3).toString());
        phoneTextField.setText(modelC.getValueAt(row, 4).toString());
    }//GEN-LAST:event_clientsTableMouseClicked

    private void updateClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateClientButtonActionPerformed
        String fname = firstNameTextField.getText();
        String lname = lastNameTextField.getText();
        String addr = addressTextField.getText();
        String phone = phoneTextField.getText();
        
        int row = clientsTable.getSelectedRow();
        int id = (int)modelC.getValueAt(row, 0);
        
        String query = "UPDATE client SET first_name = '" + fname + "', last_name = '" + lname +"', address = '" + addr + "', phone_number = '" + phone + "' WHERE id_client = " + id ;
        
        executeSQLQuery(query, "updated"); 
    }//GEN-LAST:event_updateClientButtonActionPerformed

    private void simpleIndexRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleIndexRadioActionPerformed
        dayIndexField.setEnabled(false);
        nightIndexField.setEnabled(false);
        morningIndexField.setEnabled(false);
        
        simpleIndexField.setEnabled(true);
    }//GEN-LAST:event_simpleIndexRadioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchTextField.setText("");
        showClientsInTable("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        String query = searchTextField.getText();
        showClientsInTable(query);
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void addIndexForClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIndexForClientButtonActionPerformed
        // we go to Add Index page
        ContentPanel.removeAll();
        ContentPanel.add(AddIndexPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        // we already have the selected ID
        int row = clientsTable.getSelectedRow();
        int id = (int)modelC.getValueAt(row, 0);
        enterClientIdField.setText(((Integer)id).toString());
        
    }//GEN-LAST:event_addIndexForClientButtonActionPerformed

    private void okSelectClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okSelectClientButtonActionPerformed
        int id = Integer.parseInt(enterClientIdField.getText());
  
        showIndexesInTable(id);       
    }//GEN-LAST:event_okSelectClientButtonActionPerformed

    private void compositeIndexRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositeIndexRadioActionPerformed
        simpleIndexField.setEnabled(false);
        
        dayIndexField.setEnabled(true);
        nightIndexField.setEnabled(true);
        morningIndexField.setEnabled(true);       
    }//GEN-LAST:event_compositeIndexRadioActionPerformed

    // queries for idx table
    private void executeSQLQuery2(String query, int id) {
        Statement st;
        
        try {
            st = DBConnection.createStatement();
            if((st.executeUpdate(query)) == 1) {
                // when we add/update an index we load the database again with the changes
                modelI.setRowCount(0);
                showIndexesInTable(id);
                
                JOptionPane.showMessageDialog(null, "Data added successfully");          
            }              
            else
                JOptionPane.showMessageDialog(null, "Data not added");
        }
        catch(Exception e) {
            System.out.println("error at adding index");
            e.printStackTrace();
        }
    }
    
    private String getMonthFormat(String m) {
        if(m.length() == 1) 
            return "0" +  m;
        return m;
    } 
    
    private void indexSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexSaveButtonActionPerformed
        // if all data is entered properly
        if(handoverDateField.getText().length() != 10 || 
            (simpleIndexField.getValue() == null && dayIndexField.getValue() == null 
            && nightIndexField.getValue() == null && morningIndexField.getValue() == null))
                JOptionPane.showMessageDialog(null, "Please enter all necessary data. ");
        else { // add the new index in the database
            int id = Integer.parseInt(enterClientIdField.getText());
            String dt = handoverDateField.getText();
            String for_m_y = getMonthFormat(((Integer)forMonthField.getMonth()).toString()) + "-" + ((Integer)forYearField.getYear()).toString();System.out.println(for_m_y);
            int index_type;
            double dayIndex;
            double nightIndex;
            double morningIndex;
            if(simpleIndexRadio.isSelected()) {
                index_type = 1;
                dayIndex = ((Number)simpleIndexField.getValue()).doubleValue();
                nightIndex = 0;
                morningIndex = 0;
            }
            else {
                index_type = 2;
                dayIndex = ((Number)dayIndexField.getValue()).doubleValue();
                nightIndex = ((Number)nightIndexField.getValue()).doubleValue();
                morningIndex = ((Number)morningIndexField.getValue()).doubleValue();
            }

            String query = "INSERT INTO idx (id_client, date, for_month, index_type, day_index, night_index, morning_index) VALUES (" 
                    + id + ", STR_TO_DATE('" + dt + "', '%d-%m-%Y'), STR_TO_DATE('" + for_m_y + "', '%m-%Y'), " + index_type + 
                    "," + dayIndex + "," + nightIndex + "," + morningIndex + ");" ;
            
            executeSQLQuery2(query, id);
        }
    }//GEN-LAST:event_indexSaveButtonActionPerformed

    private void periodName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodName1ActionPerformed

    private void periodName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodName2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // we load the original unmodified data from the DB
        loadPrices();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // we save the new price in the database
        String query1, query2;
        query1 = "UPDATE prices SET period_name = '" + periodName1.getText() + 
            "', start_date = STR_TO_DATE('" + startDate1.getMonth()+ "', '%m'), end_date = STR_TO_DATE('"
            + endDate1.getMonth()+ "', '%m'), simple_price = " + simplePrice1.getValue() + 
            ", day_price = " + dayPrice1.getValue() + ", night_price = " + nightPrice1.getValue() +
            ", morning_price = " + morningPrice1.getValue() + " WHERE id_price = 1";
        
        query2 = "UPDATE prices SET period_name = '" + periodName2.getText() + 
            "', start_date = STR_TO_DATE('" + startDate2.getMonth()+ "', '%m'), end_date = STR_TO_DATE('"
            + endDate2.getMonth()+ "', '%m'), simple_price = " + simplePrice2.getValue() + 
            ", day_price = " + dayPrice2.getValue() + ", night_price = " + nightPrice2.getValue() +
            ", morning_price = " + morningPrice2.getValue() + " WHERE id_price = 2";
        
        Statement st;
        
        try {
            st = DBConnection.createStatement();
            if((st.executeUpdate(query1)) == 1 && (st.executeUpdate(query2)) == 1) {
                JOptionPane.showMessageDialog(null, "Price updated successfully");          
            }              
            else
                JOptionPane.showMessageDialog(null, "Prices not updated");
        }
        catch(Exception e) {
            System.out.println("error at updating prices");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void invoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddIndexPanel;
    private javax.swing.JPanel BillPanel;
    private javax.swing.JPanel ClientsPanel;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PricesPanel;
    private javax.swing.JButton addClientButton;
    private javax.swing.JButton addIndexButton;
    private javax.swing.JButton addIndexForClientButton;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton billButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clientsButton;
    private javax.swing.JTable clientsTable;
    private javax.swing.JRadioButton compositeIndexRadio;
    private javax.swing.JFormattedTextField dayIndexField;
    private javax.swing.JFormattedTextField dayPrice1;
    private javax.swing.JFormattedTextField dayPrice2;
    private javax.swing.JButton deleteClientButton;
    private com.toedter.calendar.JMonthChooser endDate1;
    private com.toedter.calendar.JMonthChooser endDate2;
    private javax.swing.JTextField enterClientIdField;
    private javax.swing.JTextField firstNameTextField;
    private com.toedter.calendar.JMonthChooser forMonthField;
    private com.toedter.calendar.JYearChooser forYearField;
    private javax.swing.JFormattedTextField handoverDateField;
    private javax.swing.JButton indexSaveButton;
    private javax.swing.JTable indexesTable;
    private javax.swing.JButton invoiceButton;
    private javax.swing.JTextField invoiceClientIdField;
    private com.toedter.calendar.JMonthChooser invoiceForMonthField;
    private com.toedter.calendar.JYearChooser invoiceForYearField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JFormattedTextField morningIndexField;
    private javax.swing.JFormattedTextField morningPrice1;
    private javax.swing.JFormattedTextField morningPrice2;
    private javax.swing.JFormattedTextField nightIndexField;
    private javax.swing.JFormattedTextField nightPrice1;
    private javax.swing.JFormattedTextField nightPrice2;
    private javax.swing.JButton okSelectClientButton;
    private javax.swing.JTextField periodName1;
    private javax.swing.JTextField periodName2;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton pricesButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JFormattedTextField simpleIndexField;
    private javax.swing.JRadioButton simpleIndexRadio;
    private javax.swing.JFormattedTextField simplePrice1;
    private javax.swing.JFormattedTextField simplePrice2;
    private com.toedter.calendar.JMonthChooser startDate1;
    private com.toedter.calendar.JMonthChooser startDate2;
    private javax.swing.JButton updateClientButton;
    // End of variables declaration//GEN-END:variables
}
