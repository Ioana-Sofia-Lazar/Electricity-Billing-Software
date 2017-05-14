import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proiect.Client;
import proiect.Index;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import proiect.Invoice;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        addClientButton = new javax.swing.JButton();
        updateClientButton = new javax.swing.JButton();
        deleteClientButton = new javax.swing.JButton();
        addIndexForClientButton = new javax.swing.JButton();
        PricesPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        enterClientIdField = new javax.swing.JTextField();
        okSelectClientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        indexesTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        handoverDateField = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        forMonthField = new com.toedter.calendar.JMonthChooser();
        forYearField = new com.toedter.calendar.JYearChooser();
        jLabel10 = new javax.swing.JLabel();
        simpleIndexRadio = new javax.swing.JRadioButton();
        simpleIndexField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        compositeIndexRadio = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        dayIndexField = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nightIndexField = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        morningIndexField = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        indexSaveButton = new javax.swing.JButton();
        BillPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        invoiceClientIdField = new javax.swing.JTextField();
        invoiceButton = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        invoiceForMonthField = new com.toedter.calendar.JMonthChooser();
        invoiceForYearField = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(1200, 690));

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
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        ClientsPanel.add(jScrollPane1, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Search:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(jLabel6, gridBagConstraints);

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 253;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel4.add(searchTextField, gridBagConstraints);

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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -4;
        gridBagConstraints.ipady = -9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 30, 0);
        ClientsPanel.add(jPanel4, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        firstNameTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(firstNameTextField, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Last name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        lastNameTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel2.add(lastNameTextField, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address:");
        jLabel3.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        addressTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel2.add(addressTextField, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone number:");
        jLabel4.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        phoneTextField.setMaximumSize(new java.awt.Dimension(68, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel2.add(phoneTextField, gridBagConstraints);

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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(41, 0, 0, 5);
        jPanel2.add(addClientButton, gridBagConstraints);
        addClientButton.getAccessibleContext().setAccessibleDescription("30");

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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.insets = new java.awt.Insets(41, 0, 0, 5);
        jPanel2.add(updateClientButton, gridBagConstraints);
        updateClientButton.getAccessibleContext().setAccessibleDescription("30");

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 2, 0, 0);
        jPanel2.add(deleteClientButton, gridBagConstraints);
        deleteClientButton.getAccessibleContext().setAccessibleDescription("30");

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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(38, 0, 0, 0);
        jPanel2.add(addIndexForClientButton, gridBagConstraints);
        addIndexForClientButton.getAccessibleContext().setAccessibleDescription("30");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        ClientsPanel.add(jPanel2, gridBagConstraints);

        ContentPanel.add(ClientsPanel, "card5");

        PricesPanel.setBackground(new java.awt.Color(255, 204, 255));
        PricesPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        PricesPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        PricesPanel.setLayout(new java.awt.GridBagLayout());

        jLabel17.setText("From:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        PricesPanel.add(jLabel17, gridBagConstraints);

        jLabel19.setText("To:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        PricesPanel.add(jLabel19, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Simple index:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        PricesPanel.add(jLabel20, gridBagConstraints);

        jLabel21.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        PricesPanel.add(jLabel21, gridBagConstraints);

        simplePrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 69;
        PricesPanel.add(simplePrice1, gridBagConstraints);

        jLabel22.setText("Day:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        PricesPanel.add(jLabel22, gridBagConstraints);

        jLabel23.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 4, 0, 0);
        PricesPanel.add(jLabel23, gridBagConstraints);

        jLabel24.setText("Night:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(jLabel24, gridBagConstraints);

        morningPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(morningPrice1, gridBagConstraints);

        nightPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(nightPrice1, gridBagConstraints);

        jLabel25.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        PricesPanel.add(jLabel25, gridBagConstraints);

        jLabel26.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        PricesPanel.add(jLabel26, gridBagConstraints);

        jLabel27.setText("Morning:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(jLabel27, gridBagConstraints);

        dayPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        PricesPanel.add(dayPrice1, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Composite index:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        PricesPanel.add(jLabel28, gridBagConstraints);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("List of prices");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 30, 0);
        PricesPanel.add(jLabel29, gridBagConstraints);

        periodName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        periodName1.setText("Period 1");
        periodName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodName1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 40);
        PricesPanel.add(periodName1, gridBagConstraints);

        dayPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        PricesPanel.add(dayPrice2, gridBagConstraints);

        simplePrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 69;
        PricesPanel.add(simplePrice2, gridBagConstraints);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Composite index:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        PricesPanel.add(jLabel30, gridBagConstraints);

        jLabel31.setText("Day:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        PricesPanel.add(jLabel31, gridBagConstraints);

        jLabel32.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 4, 0, 0);
        PricesPanel.add(jLabel32, gridBagConstraints);

        periodName2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        periodName2.setText("Period 2");
        periodName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodName2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 40);
        PricesPanel.add(periodName2, gridBagConstraints);

        jLabel33.setText("Night:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(jLabel33, gridBagConstraints);

        jLabel34.setText("From:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        PricesPanel.add(jLabel34, gridBagConstraints);

        morningPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(morningPrice2, gridBagConstraints);

        nightPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(nightPrice2, gridBagConstraints);

        jLabel36.setText("To:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        PricesPanel.add(jLabel36, gridBagConstraints);

        jLabel37.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        PricesPanel.add(jLabel37, gridBagConstraints);

        jLabel38.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        PricesPanel.add(jLabel38, gridBagConstraints);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Simple index:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        PricesPanel.add(jLabel39, gridBagConstraints);

        jLabel40.setText("Morning:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        PricesPanel.add(jLabel40, gridBagConstraints);

        jLabel41.setText("/kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        PricesPanel.add(jLabel41, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Save changes");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        PricesPanel.add(jButton2, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Cancel changes");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        PricesPanel.add(jButton4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        PricesPanel.add(startDate1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        PricesPanel.add(endDate1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        PricesPanel.add(startDate2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        PricesPanel.add(endDate2, gridBagConstraints);

        ContentPanel.add(PricesPanel, "card4");

        AddIndexPanel.setBackground(new java.awt.Color(204, 204, 255));
        AddIndexPanel.setPreferredSize(new java.awt.Dimension(1028, 654));
        AddIndexPanel.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Enter client ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 150, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        jPanel1.add(enterClientIdField, gridBagConstraints);

        okSelectClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        okSelectClientButton.setText("Ok");
        okSelectClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okSelectClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okSelectClientButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        jPanel1.add(okSelectClientButton, gridBagConstraints);

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
        indexesTable.setMaximumSize(new java.awt.Dimension(2147483647, 1000));
        indexesTable.setMinimumSize(new java.awt.Dimension(105, 150));
        indexesTable.setPreferredSize(new java.awt.Dimension(470, 150));
        jScrollPane2.setViewportView(indexesTable);
        if (indexesTable.getColumnModel().getColumnCount() > 0) {
            indexesTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 918;
        gridBagConstraints.ipady = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 30, 30);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        AddIndexPanel.add(jPanel1, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 300));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Handover date:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel3.add(jLabel9, gridBagConstraints);

        try {
            handoverDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel3.add(handoverDateField, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("For:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 30);
        jPanel3.add(jLabel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(forMonthField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(forYearField, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Index type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 30);
        jPanel3.add(jLabel10, gridBagConstraints);

        buttonGroup1.add(simpleIndexRadio);
        simpleIndexRadio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        simpleIndexRadio.setText("Simple index:");
        simpleIndexRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleIndexRadioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(simpleIndexRadio, gridBagConstraints);

        simpleIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        simpleIndexField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(simpleIndexField, gridBagConstraints);

        jLabel1.setText("kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 4, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        buttonGroup1.add(compositeIndexRadio);
        compositeIndexRadio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        compositeIndexRadio.setText("Composite index:");
        compositeIndexRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositeIndexRadioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        jPanel3.add(compositeIndexRadio, gridBagConstraints);

        jLabel11.setText("Day:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(11, 17, 0, 0);
        jPanel3.add(jLabel11, gridBagConstraints);

        dayIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        dayIndexField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 0, 0);
        jPanel3.add(dayIndexField, gridBagConstraints);

        jLabel12.setText("kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel3.add(jLabel12, gridBagConstraints);

        jLabel13.setText("Night:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(11, 17, 0, 0);
        jPanel3.add(jLabel13, gridBagConstraints);

        nightIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        nightIndexField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 4, 0, 0);
        jPanel3.add(nightIndexField, gridBagConstraints);

        jLabel14.setText("kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel3.add(jLabel14, gridBagConstraints);

        jLabel16.setText("Morning:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(11, 17, 0, 0);
        jPanel3.add(jLabel16, gridBagConstraints);

        morningIndexField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        morningIndexField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 0, 0);
        jPanel3.add(morningIndexField, gridBagConstraints);

        jLabel15.setText("kWh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel3.add(jLabel15, gridBagConstraints);

        indexSaveButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        indexSaveButton.setText("Save data");
        indexSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indexSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexSaveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(indexSaveButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        AddIndexPanel.add(jPanel3, gridBagConstraints);

        ContentPanel.add(AddIndexPanel, "card3");

        BillPanel.setBackground(new java.awt.Color(255, 255, 204));
        BillPanel.setLayout(new java.awt.GridBagLayout());

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Enter client ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(104, 128, 0, 0);
        BillPanel.add(jLabel42, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 10, 0, 0);
        BillPanel.add(invoiceClientIdField, gridBagConstraints);

        invoiceButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invoiceButton.setText("Invoice");
        invoiceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 193, 238, 538);
        BillPanel.add(invoiceButton, gridBagConstraints);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("For:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 193, 0, 0);
        BillPanel.add(jLabel43, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 9, 0, 0);
        BillPanel.add(invoiceForMonthField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 538);
        BillPanel.add(invoiceForYearField, gridBagConstraints);

        ContentPanel.add(BillPanel, "card2");

        getContentPane().add(ContentPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // loads prices from DB
    private void loadPrices() {
        String query = "SELECT * FROM prices;";
        
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            
            ResultSet rs = st.executeQuery();
            
            // we move to the first period
            if(rs.next()) {
                periodName1.setText(rs.getString("period_name"));
                startDate1.setMonth(rs.getInt("start_date"));
                endDate1.setMonth(rs.getInt("end_date"));
                simplePrice1.setValue(rs.getDouble("simple_price"));
                dayPrice1.setValue(rs.getDouble("day_price"));
                nightPrice1.setValue(rs.getDouble("night_price"));
                morningPrice1.setValue(rs.getDouble("morning_price"));
            } 
            
            // second period
            if(rs.next()){
                periodName2.setText(rs.getString("period_name"));
                startDate2.setMonth(rs.getInt("start_date"));
                endDate2.setMonth(rs.getInt("end_date"));
                simplePrice2.setValue(rs.getDouble("simple_price"));
                dayPrice2.setValue(rs.getDouble("day_price"));
                nightPrice2.setValue(rs.getDouble("night_price"));
                morningPrice2.setValue(rs.getDouble("morning_price"));
            }
            
        }
        catch(Exception e) {
            System.out.println("error at getting prices list");
            e.printStackTrace();
        }
    }
    
    // get clients list from database
    private ArrayList<Client> getClientsList(String search) {
        ArrayList<Client> clientsList = new ArrayList<>();
        
        String query = "SELECT * FROM client WHERE first_name LIKE ? or last_name LIKE ? or address LIKE ?;";
        
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setString(1, "%" + search + "%");
            st.setString(2, "%" + search + "%");
            st.setString(3, "%" + search + "%");
            ResultSet rs = st.executeQuery();

            Client client;
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
        
        String query = "SELECT *, date_format(for_month,'%Y-%m-%d') as for_m FROM idx WHERE id_client = ? ORDER BY date DESC;";
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            Index index;
            while(rs.next()) {
                index = new Index(rs.getInt("id_index"), rs.getInt("id_client"), rs.getDate("date"), rs.getDate("for_m"), rs.getInt("index_type"), rs.getDouble("day_index"), rs.getDouble("night_index"), rs.getDouble("morning_index"));
                System.out.println(index.getFor_month() + " " + rs.getDate("for_m"));
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
    
    private Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturare_contoare?useSSL=false", "root", "root");
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
        
        String query = "INSERT INTO client (first_name, last_name, address, phone_number) VALUES (?, ?, ?, ?);" ;
        
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setString(1, fname);
            st.setString(2, lname);
            st.setString(3, addr);
            st.setString(4, phone);
            
            if((st.executeUpdate()) == 1) {
                // when we add/update a client we load the database again with the changes
                modelC.setRowCount(0);
                showClientsInTable("");
                
                JOptionPane.showMessageDialog(null, "Data added successfully");          
            }              
            else
                JOptionPane.showMessageDialog(null, "Data not added");
        }
        catch(Exception e) {
            System.out.println("error at adding data");
            e.printStackTrace();
        }
    }//GEN-LAST:event_addClientButtonActionPerformed
    
    private void deleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButtonActionPerformed
        int row = clientsTable.getSelectedRow();
        int id = (int)modelC.getValueAt(row, 0);
        
        String query = "DELETE FROM client WHERE id_client = ? ";
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setInt(1, id);
        
            if((st.executeUpdate()) == 1) {
                // when we add/update a client we load the database again with the changes
                modelC.setRowCount(0);
                showClientsInTable("");
                
                JOptionPane.showMessageDialog(null, "Data deleted successfully");          
            }              
            else
                JOptionPane.showMessageDialog(null, "Data not deleted");
        }
        catch(Exception e) {
            System.out.println("error at deleting data");
            e.printStackTrace();
        }             
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
        
        String query = "UPDATE client SET first_name = ?, last_name = ?, address = ?, phone_number = ? WHERE id_client = ? ";
        
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setString(1, fname);
            st.setString(2, lname);
            st.setString(3, addr);
            st.setString(4, phone);
            st.setInt(5, id);
            
            if((st.executeUpdate()) == 1) {
                // when we add/update a client we load the database again with the changes
                modelC.setRowCount(0);
                showClientsInTable("");
                
                JOptionPane.showMessageDialog(null, "Data updated successfully");          
            }              
            else
                JOptionPane.showMessageDialog(null, "Data not updated");
        }
        catch(Exception e) {
            System.out.println("error at updating data");
            e.printStackTrace();
        } 
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
        
        int rowCount = modelI.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            modelI.removeRow(i);
}
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

    private String getMonthFormat(String m) {       
        if(m.length() == 1) 
            return "0" +  m; // months are indexed from 0 in the month picker
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
            String for_m_y = "01-" + getMonthFormat(((Integer)(forMonthField.getMonth()+1)).toString()) + "-" + ((Integer)forYearField.getYear()).toString();
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

            String query = "INSERT INTO idx (id_client, date, for_month, index_type, day_index, night_index, morning_index) VALUES (?, STR_TO_DATE(?, '%d-%m-%Y'), STR_TO_DATE(?, '%d-%m-%Y'), ?, ?, ?, ?);";
            
            try(PreparedStatement st = DBConnection.prepareStatement(query);) {
                st.setInt(1, id);
                st.setString(2, dt);
                st.setString(3, for_m_y);
                st.setInt(4, index_type);
                st.setDouble(5, dayIndex);
                st.setDouble(6, nightIndex);
                st.setDouble(7, morningIndex);
                
                if((st.executeUpdate()) == 1) {
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
    }//GEN-LAST:event_indexSaveButtonActionPerformed
    
    // verifies if input is an existing id in the clients table
    // returns id if succes, -1 if failure
    private int verifyValidId(String inp) {
        int id = 0;
        if(inp.compareTo("") != 0) 
            id = Integer.parseInt(inp);
        String query = "SELECT * FROM client WHERE id_client = ?";
               
        try (PreparedStatement st = DBConnection.prepareStatement(query);){
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            int count = 0;
            while(rs.next()) 
                count++;
            if(count == 0) { // if there is no client with the given id
                JOptionPane.showMessageDialog(null, "Invalid ID");
                return -1;
            }               
        }
        catch(Exception e) {
            System.out.println("id not ok");
            e.printStackTrace();
        }
        return id; // valid ID
    }
    
    // verifies if there already is an invoice for the clied with id id_c for month for_m_y
    // if so, returns invoice id, else -1
    private int existsInvoiceInDb(int id_c, String for_m_y) {
        String query = "SELECT * FROM invoice WHERE id_client = ? and STR_TO_DATE(?, '%d-%m-%Y') = for_month;";
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setInt(1, id_c);
            st.setString(2, for_m_y);
            ResultSet rs = st.executeQuery();
            if(rs.next()) { // there already is an invoice in the database for this client and for this month
                return rs.getInt("id_invoice");
            }    
        }
        catch(Exception e) {
            System.out.println("error at getting indexes list");
            e.printStackTrace();
        }
        return -1;
    }
    
    // calculates value of invoice for client with id for month m and year y
    private Invoice calculateInvoiceVal(int id, int m, int y) {
        Invoice inv = null;
        
        // we will also need last index for the previous month
        String for_m_y = "01-" + getMonthFormat(((Integer)(m + 1)).toString()) + "-" + ((Integer)y).toString();
        if(m == 1) {
            m = 12;
            y--;
        }
        else m--;
        String prevfor_m_y = "01-" + getMonthFormat(((Integer)(m + 1)).toString()) + "-" + ((Integer)y).toString();
        
        Index idx = getLastIndexForMonth(for_m_y, id);
        Index previdx = getLastIndexForMonth(prevfor_m_y, id);
        // if we have no index for the previous month we are about to add the first index for this client
        if(previdx == null)
            previdx = new Index(0, 0, null, null, 0, 0, 0, 0); 
        if(idx == null) {
            JOptionPane.showMessageDialog(null, "No existing Index for selected month.");
            return null;
        }System.out.println("~" + previdx.getId() + " " + idx.getId());
        double val, pDay, pNight = 0, pMorning = 0;
        System.out.println("idx: " + idx.getDay_index() + "  prev: " + previdx.getDay_index());
        
        // we get the price for the specific type of index and period
        if (m >= startDate1.getMonth() + 1 && m <= endDate1.getMonth() + 1) {
            if(idx.getIndex_type() == 1) {// first period and simple index
                pDay = (Double)simplePrice1.getValue();
            }
            else {// first period and composite index
                pDay = (Double)dayPrice1.getValue();
                pNight = (Double)nightPrice1.getValue();
                pMorning = (Double)morningPrice1.getValue();
            }
        }
        else {
            if(idx.getIndex_type() == 1) {// second period and simple index
                pDay = (Double)simplePrice2.getValue();
            }
            else {// second period and composite index
                pDay = (Double)dayPrice2.getValue();
                pNight = (Double)nightPrice2.getValue();
                pMorning = (Double)morningPrice2.getValue();
            }
        }
                
        if(idx.getIndex_type() == 1) { // simple index
            val = idx.getDay_index() - previdx.getDay_index();
            val = val * pDay;
        }
        else {
            val = (idx.getDay_index() - previdx.getDay_index()) * pDay 
                    + (idx.getNight_index()- previdx.getNight_index()) * pNight 
                    + (idx.getMorning_index()- previdx.getMorning_index()) * pMorning;           
        }
        
        if(existsInvoiceInDb(id, for_m_y) == -1) {
            // add invoice to the DB
            String query = "INSERT INTO invoice(id_client, value, date, for_month, day_cons, night_cons, morning_cons)" + 
                    "VALUES(?, ?, STR_TO_DATE(CURDATE(), '%Y-%m-%d'), STR_TO_DATE(?, '%d-%m-%Y'), ?, ?, ?)" ;        
            try(PreparedStatement st = DBConnection.prepareStatement(query);) {
                st.setInt(1, id);
                st.setDouble(2, val);
                st.setString(3, for_m_y);
                st.setDouble(4, idx.getDay_index() - previdx.getDay_index());
                st.setDouble(5, idx.getNight_index()- previdx.getNight_index());
                st.setDouble(6, idx.getMorning_index()- previdx.getMorning_index());

                if((st.executeUpdate()) == 1) {
                    System.out.println("Invoice added to DB successfully.");          
                }              
                else
                    System.out.println("Invoice not added to DB.");
            }
            catch(Exception e) {
                System.out.println("error at adding data");
                e.printStackTrace();
            }
        }        
        
        // create coresponding Invoice object 
        String query = "SELECT i.*, c.* FROM invoice i JOIN client c ON (c.id_client = i.id_client) WHERE i.id_client = ?;";
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            Index index;
            if(rs.next()) {
                inv = new Invoice(rs.getInt("i.id_invoice"), rs.getInt("i.id_client"), rs.getString("c.first_name") + " " + rs.getString("c.last_name"), 
                    rs.getString("c.address"), rs.getDate("i.date"), rs.getDate("i.for_month"), rs.getDouble("i.value"), 
                    rs.getDouble("i.day_cons"), rs.getDouble("i.night_cons"), rs.getDouble("i.morning_cons"));
            } 
            else {
                System.out.println("error at getting invoice details");
            }
        }
        catch(Exception e) {
            System.out.println("error at getting invoice details");
            e.printStackTrace();
        }
        
        return inv;
    }
    
    // creates invoice for client with id for month m and year y
    private void createInvoice(int id, int m, int y) {
        Invoice inv = calculateInvoiceVal(id, m, y);        
        
        if(inv == null) {
            JOptionPane.showMessageDialog(null, "Error at creating invoice.");
            return;
        }
        System.out.println("invoice val " + inv.getValue());
        
        String FILE = "Invoice_client" + id + "_for_" + (m+1) + "-" + y + ".pdf";
        XWPFDocument doc = new XWPFDocument();
        
        XWPFParagraph para = doc.createParagraph();
        XWPFRun run = para.createRun();
        para.setAlignment(ParagraphAlignment.CENTER);   
        run.setBold(true);
        run.setText("Electricity Invoice");
        run.addBreak(); run.addBreak();
        
        XWPFParagraph para2 = doc.createParagraph();
        XWPFRun run2 = para2.createRun();
        para2.setAlignment(ParagraphAlignment.CENTER);        
        run2.setText("Invoice number: " + inv.getId());
        run2.addBreak();
        run2.setText("Client number: " + inv.getId_client());
        run2.addBreak();
        run2.setText("Client name: " + inv.getClientName());
        run2.addBreak();
        run2.setText("Client address: " + inv.getClientAddr());
        run2.addBreak();
        run2.setText("Invoice date: " + inv.getDate());
        run2.addBreak();
        run2.setText("For month: " + inv.getFor_month());
        run2.addBreak();
        run2.setText("Day consumption: " + inv.getDayCons());
        run2.addBreak();
        run2.setText("Night consumption: " + inv.getNightCons());
        run2.addBreak();
        run2.setText("Morning consumption: " + inv.getMorningCons());
        run2.addBreak(); run2.addBreak();
        run2.setText("Total value: " + inv.getValue());
        
        try (FileOutputStream output = new FileOutputStream(FILE)) {
                doc.write(output);
        } catch (Exception e) {
            System.out.println("error at creating invoice");
            e.printStackTrace();
        }
    }
    
    // we return the last index for the desired month (for calculating bill)
    // we suppose we have indexes for all months and if we don't it means we are about to add the first one
    private Index getLastIndexForMonth(String for_m_y, int id) {
        System.out.println("getting index for " + for_m_y);
        String query = "SELECT *, max(date) maxi FROM idx where for_month = str_to_date(?, '%d-%m-%Y') and id_client = ?;";
        Index index = null;
        
        try(PreparedStatement st = DBConnection.prepareStatement(query);) {
            st.setString(1, for_m_y);
            st.setInt(2, id);
            
            ResultSet rs = st.executeQuery();
            int count = 0;
            while(rs.next()) {
                
                if(rs.getDate("maxi") != null) {
                    count++;
                    index = new Index(rs.getInt("id_index"), rs.getInt("id_client"), 
                        rs.getDate("date"), rs.getDate("for_month"), rs.getInt("index_type"), 
                        rs.getDouble("day_index"), rs.getDouble("night_index"), rs.getDouble("morning_index")); 
                }
            }
            
            if(index == null) { // if there is no index for the client for that month
                //JOptionPane.showMessageDialog(null, "No existing Index for the specified month.");
                return null;
            }  
        }
        catch(Exception e) {
            System.out.println("id not ok");
            e.printStackTrace();
        }
        return index;
    }
    
    private void invoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceButtonActionPerformed
        String inpId = invoiceClientIdField.getText();
        int for_month = invoiceForMonthField.getMonth(), for_year = invoiceForYearField.getYear(), id;
        
        // verify that the id introduced is valid and that we have index for that month
        if((id = verifyValidId(inpId)) != -1) 
            createInvoice(id, for_month, for_year);
                
    }//GEN-LAST:event_invoiceButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // we load the original unmodified data from the DB
        loadPrices();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // we save the new prices in the database
        int ok = 0;

        String query1 = "UPDATE prices SET period_name = ?, start_date = ?, end_date = ?," +
        " simple_price = ?, day_price = ?, night_price = ?, morning_price = ? WHERE id_price = 1";

        try(PreparedStatement st = DBConnection.prepareStatement(query1);) {
            st.setString(1, periodName1.getText());
            st.setInt(2, startDate1.getMonth());
            st.setInt(3, endDate1.getMonth());
            st.setDouble(4, (Double)(simplePrice1.getValue()));
            st.setDouble(5, (Double)(dayPrice1.getValue()));
            st.setDouble(6, (Double)(nightPrice1.getValue()));
            st.setDouble(7, (Double)(morningPrice1.getValue()));

            if((st.executeUpdate()) == 1) {
                ok++;
            }
        }
        catch(Exception e) {
            System.out.println("error at updating prices");
            e.printStackTrace();
        }

        String query2 = "UPDATE prices SET period_name = ?, start_date = ?, end_date = ?," +
        " simple_price = ?, day_price = ?, night_price = ?, morning_price = ? WHERE id_price = 2";

        try(PreparedStatement st = DBConnection.prepareStatement(query2);) {
            st.setString(1, periodName2.getText());
            st.setInt(2, startDate2.getMonth());
            st.setInt(3, endDate2.getMonth());
            st.setDouble(4, (Double)(simplePrice2.getValue()));
            st.setDouble(5, (Double)(dayPrice2.getValue()));
            st.setDouble(6, (Double)(nightPrice2.getValue()));
            st.setDouble(7, (Double)(morningPrice2.getValue()));

            if((st.executeUpdate()) == 1) {
                ok++;
            }
        }
        catch(Exception e) {
            System.out.println("error at updating prices");
            e.printStackTrace();
        }

        if(ok == 2) // both updates were successfull
        JOptionPane.showMessageDialog(null, "Price updated successfully");
        else
        JOptionPane.showMessageDialog(null, "Prices not updated");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void periodName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodName2ActionPerformed

    private void periodName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodName1ActionPerformed
    
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
            @Override
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
