

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Collection1 extends javax.swing.JFrame {
    /**
     * Creates new form Collection1
     * 
     */
    static int user_rights_binary=0;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public Collection1() {

        initComponents();
        FillCombo();
        setSize(1280,755);
        //User_Rights();
    setLocation(screenSize.width/2-getWidth()/2, screenSize.height/2-getHeight()/2);
    setVisible(true);
    
        name_combo2.setRenderer(new Collection1.Demo(name_combo2.getRenderer()));
        jScrollPane2.getViewport().setBackground(new Color(116,121,180));
        TableCellRenderer alteredColorRenderer = new AlterColor();
        col_table2.setDefaultRenderer(Object.class, alteredColorRenderer);
        headerColorAndWidth();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    /*public void User_Rights(){
        //System.out.println(LoginPage.name);
        try{  
                int a=1;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
                String selQuery="SELECT * FROM login_details where  username=? and Admin=?";
                PreparedStatement pst=con.prepareStatement(selQuery);
                pst.setString(1,LoginPage.name);
                pst.setInt(2,a);
                ResultSet rs=pst.executeQuery();
                if(rs.next()){
                    user_rights_binary=1;
                }
                else{
                    user_rights_binary=0;
                }
                //System.out.println(user_rights_binary);
            }
            catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (SQLException ex) {
                //Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }*/
    public final void headerColorAndWidth(){
        DefaultTableCellRenderer headerClr = new DefaultTableCellRenderer();
        headerClr.setBackground(new Color(255, 138, 115));
       // headerClr.setForeground(Color.decode("#FCE7FC"));
       col_table2.setRowHeight(col_table2.getRowHeight()+20);
               

        col_table2.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(headerClr);
        col_table2.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(headerClr);
        col_table2.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(headerClr);
        col_table2.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(headerClr);
        col_table2.getTableHeader().getColumnModel().getColumn(4).setHeaderRenderer(headerClr);
        col_table2.getTableHeader().getColumnModel().getColumn(5).setHeaderRenderer(headerClr);
        col_table2.getTableHeader().getColumnModel().getColumn(6).setHeaderRenderer(headerClr);
        JTableHeader tableHeader = col_table2.getTableHeader();
        tableHeader.setVisible(true);
        tableHeader.setFont(new Font("Copperplate Gothic Bold",1, 18));
        tableHeader.setOpaque(false); 
        tableHeader.setForeground(new Color(255,255,255));
        TableColumn tc1=col_table2.getColumnModel().getColumn(0);
        tc1.setPreferredWidth(100);
        TableColumn tc2=col_table2.getColumnModel().getColumn(1);
        tc2.setPreferredWidth(80);
        TableColumn tc3=col_table2.getColumnModel().getColumn(2);
        tc3.setPreferredWidth(25);
        TableColumn tc4=col_table2.getColumnModel().getColumn(3);
        tc4.setPreferredWidth(60);
        TableColumn tc5=col_table2.getColumnModel().getColumn(4);
        tc5.setPreferredWidth(60);
        TableColumn tc6=col_table2.getColumnModel().getColumn(5);
        tc6.setPreferredWidth(25);
        TableColumn tc7=col_table2.getColumnModel().getColumn(6);
        tc7.setPreferredWidth(60);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        party_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        name_combobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bill_number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        recd_date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        recd_amount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        xs_days = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gr_number = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gr_date = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        gr_amount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        col_table = new javax.swing.JTable();
        button_table_name = new javax.swing.JButton();
        button_table_data = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        amount_tf = new javax.swing.JTextField();
        recd_amttf = new javax.swing.JTextField();
        gr_amttf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        update_party = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        outstanding_tf = new javax.swing.JTextField();
        days_decided = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PartyName2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        col_table2 = new javax.swing.JTable();
        name_combo2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        order_date2 = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        billNo2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        days2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        amt2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        recd_date2 = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        recd_amt2 = new javax.swing.JTextField();
        xs_days2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        gr_no2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        gr_date2 = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        gr_amt2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        days_decd2 = new javax.swing.JTextField();
        insert_name2 = new javax.swing.JButton();
        insert_data2 = new javax.swing.JButton();
        update_party_name2 = new javax.swing.JButton();
        update_details2 = new javax.swing.JButton();
        delete_party2 = new javax.swing.JButton();
        delete_details2 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        amt_total = new javax.swing.JTextField();
        recd_amt_total = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        gr_amt_total = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        outstanding = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Collection");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("Software_logo.jpeg")).getImage());
        setMaximumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(31, 35, 71));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Collection ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(551, 13, 260, 41);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Party Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 30, 174, 28);

        party_name.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        party_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                party_nameMouseClicked(evt);
            }
        });
        party_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                party_nameActionPerformed(evt);
            }
        });
        jPanel1.add(party_name);
        party_name.setBounds(250, 30, 167, 34);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 77, 28);

        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });
        jPanel1.add(date);
        date.setBounds(250, 160, 167, 20);

        name_combobox.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        name_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_comboboxActionPerformed(evt);
            }
        });
        jPanel1.add(name_combobox);
        name_combobox.setBounds(250, 100, 167, 34);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bill Number:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 220, 183, 28);

        bill_number.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        bill_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_numberActionPerformed(evt);
            }
        });
        jPanel1.add(bill_number);
        bill_number.setBounds(250, 220, 167, 34);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Days:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 280, 78, 28);

        days.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(days);
        days.setBounds(250, 280, 167, 34);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 340, 118, 28);

        amount.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(amount);
        amount.setBounds(250, 340, 167, 34);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Recd Date:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 400, 156, 28);

        recd_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                recd_datePropertyChange(evt);
            }
        });
        jPanel1.add(recd_date);
        recd_date.setBounds(250, 400, 167, 20);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Recd Amount:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 450, 197, 28);

        recd_amount.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(recd_amount);
        recd_amount.setBounds(250, 450, 167, 34);

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Excess Days:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 500, 186, 28);

        xs_days.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(xs_days);
        xs_days.setBounds(250, 510, 167, 34);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GR Number:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 570, 167, 28);

        gr_number.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(gr_number);
        gr_number.setBounds(250, 570, 167, 34);

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GR Date:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 620, 126, 28);

        gr_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                gr_datePropertyChange(evt);
            }
        });
        jPanel1.add(gr_date);
        gr_date.setBounds(250, 630, 167, 20);

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GR Amount:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 690, 167, 28);

        gr_amount.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(gr_amount);
        gr_amount.setBounds(250, 680, 167, 34);

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Days decided:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(28, 751, 197, 28);

        col_table.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        col_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order date", "Bill Number", "Days", "Amount", "Recd Amt", "XS days", "GR Amount"
            }
        ));
        col_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                col_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(col_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(480, 70, 1255, 438);

        button_table_name.setBackground(new java.awt.Color(255, 138, 115));
        button_table_name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        button_table_name.setText("INSERT PARTY NAME");
        button_table_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_table_nameActionPerformed(evt);
            }
        });
        jPanel1.add(button_table_name);
        button_table_name.setBounds(510, 540, 333, 37);

        button_table_data.setBackground(new java.awt.Color(255, 138, 115));
        button_table_data.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        button_table_data.setText("INSERT PARTY DATA ");
        button_table_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_table_dataActionPerformed(evt);
            }
        });
        jPanel1.add(button_table_data);
        button_table_data.setBounds(510, 610, 335, 37);

        update_button.setBackground(new java.awt.Color(255, 138, 115));
        update_button.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        update_button.setText("UPDATE DETAILS");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(update_button);
        update_button.setBounds(900, 540, 281, 37);

        delete.setBackground(new java.awt.Color(255, 138, 115));
        delete.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        delete.setText("DELETE DETAILS");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(900, 610, 277, 37);

        amount_tf.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(amount_tf);
        amount_tf.setBounds(1480, 600, 282, 34);

        recd_amttf.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(recd_amttf);
        recd_amttf.setBounds(1480, 670, 282, 34);

        gr_amttf.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        gr_amttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gr_amttfActionPerformed(evt);
            }
        });
        jPanel1.add(gr_amttf);
        gr_amttf.setBounds(1480, 730, 282, 34);

        jButton1.setBackground(new java.awt.Color(255, 138, 115));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jButton1.setText("RESET DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(910, 670, 257, 37);

        jButton2.setBackground(new java.awt.Color(255, 138, 115));
        jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jButton2.setText("DELETE PARTY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 670, 249, 37);

        update_party.setBackground(new java.awt.Color(255, 138, 115));
        update_party.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        update_party.setText("UPDATE PARTY");
        update_party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_partyActionPerformed(evt);
            }
        });
        jPanel1.add(update_party);
        update_party.setBounds(510, 730, 255, 37);

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Outstanding:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1250, 540, 192, 28);

        outstanding_tf.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(outstanding_tf);
        outstanding_tf.setBounds(1480, 540, 282, 34);

        days_decided.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        days_decided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                days_decidedActionPerformed(evt);
            }
        });
        jPanel1.add(days_decided);
        days_decided.setBounds(250, 740, 167, 34);

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Amount Total:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1250, 600, 208, 28);

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Recd Amt Total:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1230, 670, 232, 36);

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GR Amount Total:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1210, 730, 257, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1415, 0, 0, 850);

        jPanel2.setBackground(new java.awt.Color(31, 35, 71));
        jPanel2.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Collection");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(349, 11, 249, 41);

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Party Name:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 80, 180, 20);

        PartyName2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        PartyName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartyName2ActionPerformed(evt);
            }
        });
        jPanel2.add(PartyName2);
        PartyName2.setBounds(220, 80, 210, 30);

        col_table2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        col_table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Date", "Bill No", "Days", "Amt", "Recd Amt", "XS", "GR Amt"
            }
        ));
        col_table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                col_table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(col_table2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(450, 60, 790, 402);

        name_combo2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        name_combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_combo2ActionPerformed(evt);
            }
        });
        jPanel2.add(name_combo2);
        name_combo2.setBounds(220, 120, 210, 27);

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Bill Date:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 160, 180, 21);

        order_date2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                order_date2PropertyChange(evt);
            }
        });
        jPanel2.add(order_date2);
        order_date2.setBounds(220, 160, 210, 30);

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Bill Number:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(10, 210, 190, 21);

        billNo2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(billNo2);
        billNo2.setBounds(220, 200, 210, 30);

        jLabel22.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Days:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(10, 250, 160, 21);

        days2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(days2);
        days2.setBounds(220, 240, 210, 30);

        jLabel23.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Amount:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(10, 300, 140, 21);

        amt2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(amt2);
        amt2.setBounds(220, 300, 210, 27);

        jLabel24.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Recieved Date:");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(10, 350, 220, 21);

        recd_date2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                recd_date2PropertyChange(evt);
            }
        });
        jPanel2.add(recd_date2);
        recd_date2.setBounds(220, 340, 210, 30);

        jLabel25.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Recieved Amount:");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(10, 400, 260, 21);

        recd_amt2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(recd_amt2);
        recd_amt2.setBounds(220, 390, 210, 27);

        xs_days2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(xs_days2);
        xs_days2.setBounds(220, 440, 210, 27);

        jLabel26.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Excess Days:");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(10, 440, 210, 21);

        jLabel27.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Gr Number:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(10, 490, 190, 21);

        gr_no2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(gr_no2);
        gr_no2.setBounds(220, 490, 210, 27);

        jLabel28.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("GR Date:");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(10, 540, 160, 21);

        gr_date2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                gr_date2PropertyChange(evt);
            }
        });
        jPanel2.add(gr_date2);
        gr_date2.setBounds(220, 540, 210, 30);

        jLabel29.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("GR Amount:");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(10, 580, 200, 21);

        gr_amt2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(gr_amt2);
        gr_amt2.setBounds(220, 580, 210, 27);

        jLabel30.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Days Decided:");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(10, 640, 210, 21);

        days_decd2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(days_decd2);
        days_decd2.setBounds(220, 630, 210, 27);

        insert_name2.setBackground(new java.awt.Color(255, 138, 115));
        insert_name2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        insert_name2.setText("Insert Party Name");
        insert_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_name2ActionPerformed(evt);
            }
        });
        jPanel2.add(insert_name2);
        insert_name2.setBounds(460, 580, 190, 25);

        insert_data2.setBackground(new java.awt.Color(255, 138, 115));
        insert_data2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        insert_data2.setText("Insert Party Data");
        insert_data2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_data2ActionPerformed(evt);
            }
        });
        jPanel2.add(insert_data2);
        insert_data2.setBounds(460, 540, 190, 25);

        update_party_name2.setBackground(new java.awt.Color(255, 138, 115));
        update_party_name2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        update_party_name2.setText("Update Party Name");
        update_party_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_party_name2ActionPerformed(evt);
            }
        });
        jPanel2.add(update_party_name2);
        update_party_name2.setBounds(460, 490, 190, 25);

        update_details2.setBackground(new java.awt.Color(255, 138, 115));
        update_details2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        update_details2.setText("Update Details");
        update_details2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_details2ActionPerformed(evt);
            }
        });
        jPanel2.add(update_details2);
        update_details2.setBounds(670, 490, 160, 25);

        delete_party2.setBackground(new java.awt.Color(255, 138, 115));
        delete_party2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        delete_party2.setText("Delete Party");
        delete_party2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_party2ActionPerformed(evt);
            }
        });
        jPanel2.add(delete_party2);
        delete_party2.setBounds(670, 540, 160, 25);

        delete_details2.setBackground(new java.awt.Color(255, 138, 115));
        delete_details2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        delete_details2.setText("Delete Details");
        delete_details2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_details2ActionPerformed(evt);
            }
        });
        jPanel2.add(delete_details2);
        delete_details2.setBounds(670, 590, 160, 25);

        reset2.setBackground(new java.awt.Color(255, 138, 115));
        reset2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        jPanel2.add(reset2);
        reset2.setBounds(460, 620, 120, 25);

        jLabel31.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Amount Total:");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(870, 480, 170, 21);

        amt_total.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(amt_total);
        amt_total.setBounds(1040, 480, 180, 27);

        recd_amt_total.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(recd_amt_total);
        recd_amt_total.setBounds(1040, 520, 180, 27);

        jLabel32.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Recd Amt Total:");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(850, 520, 200, 21);

        jLabel33.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("GR Amt Total:");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(850, 560, 180, 21);

        gr_amt_total.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(gr_amt_total);
        gr_amt_total.setBounds(1040, 560, 180, 27);

        jLabel34.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Outstanding:");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(850, 600, 170, 21);

        outstanding.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(outstanding);
        outstanding.setBounds(1040, 600, 180, 27);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1420, 766);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_table_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_table_nameActionPerformed
        // TODO add your handling code here:
        /*String addValue=PartyName2.getText().toUpperCase();
        jComboBox1.addItem(addValue);
        PartyName2.setText("");
        if(PartyName2.getText().isEmpty()){
                new PartyName_FieldEmpty();
                }
        else{
             if(b.signIn.getIsAdmin()){
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/database","root","Medadmom@123");
    String nameOfParty= PartyName2.getText().trim().toUpperCase();
    String sql="select PartyName from party_table";
    PreparedStatement pst=con.prepareStatement(sql);
    ResultSet rs=pst.executeQuery();
    int count=0;
                    while(rs.next()){
                        String stringToCompare = rs.getString("PartyName"); 
                        if(nameOfParty.equals(stringToCompare)){
                           count++;
                        }
                    }
    if(count==0){
    
        String query="insert into party_table(PartyName) values(?)";
    PreparedStatement pst1=con.prepareStatement(query);
    pst1.setString(1,PartyName2.getText().toUpperCase());
        pst1.executeUpdate();
        FillCombo();
            new InsertedSuccessfully();
    
    
    }
        else{
        new PrartyName_Repeat();
    }
            
        
        /*else if(PartyName2.getText().trim().isEmpty())
        {
                JOptionPane.showMessageDialog(this,"Null values cannot be inserted");
                }
        
        
        
      //PartyName2.setText("");  
    }
  
     //PartyName2.setText("");
        
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
             }
             else{
            new Not_Admin();
        }
        }*/
        
    }//GEN-LAST:event_button_table_nameActionPerformed
private void FillCombo(){
    DefaultComboBoxModel model = new DefaultComboBoxModel(); 
    try{
         
         
        Class.forName("com.mysql.cj.jdbc.Driver");
     
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
    /*String selQuery="SELECT * FROM party_table ORDER BY PartyName";
            PreparedStatement pst=con.prepareStatement(selQuery);
            ResultSet rs=pst.executeQuery();
            DefaultComboBoxModel cbmObj=new DefaultComboBoxModel();
            cbmObj.removeAllElements();
            //cbmObj=(DefaultComboBoxModel) PartyName2_dropbox.getModel();
            String temp="";
            while(rs.next()){
                temp = (String)rs.getString("PartyName");
                cbmObj.addElement(temp);
            }
            name_combo2.setModel(cbmObj);
            //PartyName2.setText("");
        }
        catch(Exception e){
                
        }*/
    String sql="select PartyName from party_table";
    PreparedStatement pst=con.prepareStatement(sql);
    ResultSet rs=pst.executeQuery();
    while(rs.next()){
        String name=rs.getString("PartyName");
        model.addElement(name);
    }
    name_combo2.setModel(model);
    //con.close();
    //pst.close();
    
        
        
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    /*ArrayList<Items> list= Items();
    DefaultComboBoxModel model=(DefaultComboBoxModel)name_combo2.getModel();
    String[] row=new String[1];
     
    for(int i=0;i<list.size();i++){
                row[0]=list.get(i).getName();
                
        
        model.addItem(row[]);
}*/
}

    private void name_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_comboboxActionPerformed
        // TODO add your handling code here:
        //FillCombo();
        
        /*if(name_combo2.getSelectedItem().toString().isEmpty()==false){
        String selectedValue=name_combo2.getSelectedItem().toString();
        PartyName2.setText(selectedValue);
        show_user();
        }*/
        
    
    }//GEN-LAST:event_name_comboboxActionPerformed

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
/*try{
           if(recd_date2.getDate().toString().isEmpty()==false && order_date2.getDate().toString().isEmpty()==false){
                SimpleDateFormat format=new  SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
                java.util.Date orderedDate=order_date2.getDate();
                java.util.Date recievedDate=recd_date2.getDate();
                if(recievedDate.compareTo(orderedDate)!=-1){
                    Long diffTime=Math.abs(recievedDate.getTime()- orderedDate.getTime());
                    long diffDays = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
                    days2.setText(diffDays+"");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Recieved order_date2 can't be smaller than Date");
                }
           }
       }
        catch(Exception e){
           // JOptionPane.showMessageDialog(null,e.getMessage());        
        } */             // TODO add your handling code here:
        /*try{
           
           if(order_date2.getDate().toString().isEmpty()==false&&days_decd2.getText().isEmpty()==false&&recd_date.getDate().toString().isEmpty()==false){
               try{
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date orderedDate=order_date2.getDate();
                java.util.Date recievedDate=recd_date.getDate();
                
                
                    long diffTime=(recievedDate.getTime()- orderedDate.getTime());
                    //long diffTime1=(decidedDate.getTime()-orderedDate.getTime());
                    if(diffTime < 0){
                new Recd_Date();
                
            }
                    else if(diffTime1<0){
                        new Decd_Date();
                    }
            else{
                long diff1 = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
                days2.setText(diff1+"");
            }
                
            
            int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
            }
               }
               catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        } 
           
       }
        catch(Exception e){
           // JOptionPane.showMessageDialog(null,e.getMessage());        
        }    */    
    }//GEN-LAST:event_datePropertyChange
 class Demo extends DefaultListCellRenderer
    {
    // TODO add your handling code here:
    private ListCellRenderer defaultRenderer;
    public Demo(ListCellRenderer defaultRenderer){
        this.defaultRenderer=defaultRenderer;
        
    }
    public Component getListCellRendererComponent(JList list,Object value,int index,boolean isSelected,boolean cellHasFocus){
        Component c = defaultRenderer.getListCellRendererComponent(list, value,
        index, isSelected, cellHasFocus);
    if (c instanceof JLabel) {
      if (isSelected) {
        c.setBackground(new Color(239,40,83));
      } else {
        c.setBackground(Color.white);
      }
    } else {
      c.setBackground(Color.black);
      c = super.getListCellRendererComponent(list, value, index, isSelected,
          cellHasFocus);
    }
        return c;
    }
}
  void reset()
 {
     PartyName2.setText("");
        name_combo2.setSelectedIndex(0);
        order_date2.setDate(null);
        billNo2.setText("");
        days2.setText("");
        amt2.setText("");
        recd_date2.setDate(null);
        recd_amt2.setText("");
        xs_days2.setText("");
        gr_no2.setText("");
        gr_date2.setDate(null);;
        gr_amt2.setText("");
        days_decd2.setText("");
 }
    private void recd_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_recd_datePropertyChange
        // TODO add your handling code here:
       /*try{
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date orderedDate=order_date2.getDate();
                java.util.Date recievedDate=recd_date2.getDate();
                
                //java.util.Date grorder_date2=gr_date2.getDate();
                
                    long diffTime=(recievedDate.getTime()- orderedDate.getTime());
                    if(diffTime < 0){
                new Recd_Date();
                
            }
            else{
                long diff1 = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
                days2.setText(diff1+"");
            }
                
            
            int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
            }
            
               }
               catch(Exception e){
            System.out.println(e.getMessage());
        
        }*/
        
           
              
    }//GEN-LAST:event_recd_datePropertyChange

    private void party_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_party_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_party_nameActionPerformed

    private void party_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_party_nameMouseClicked
//PartyName2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_party_nameMouseClicked

    public ArrayList<DataColl> DataColl(){
    ArrayList<DataColl> ColList=new ArrayList<>();
    DefaultTableModel model=(DefaultTableModel)col_table2.getModel();
    while(model.getRowCount()>0){
        for (int i=0;i<model.getRowCount(); i++){
                model.removeRow(i);
    }
    }
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
    String SelectedBase=name_combo2.getSelectedItem().toString();
    /*String query1="SELECT partyname FROM party_table";
    PreparedStatement pst=con.prepareStatement(query1);
    ResultSet rs=pst.executeQuery();
    int count=0;
    DataColl col;
    while(rs.next()){
        String com=rs.getString("partyname");
        if(com.equals(PartyName2));
        {
            count++;*/
    DataColl col;
        String query2="SELECT * FROM collection1 WHERE PartyName=?";
        PreparedStatement pst1=con.prepareStatement(query2);
        pst1.setString(1,PartyName2.getText().toUpperCase());
        ResultSet rs1=pst1.executeQuery();
        while(rs1.next()){
        col=new DataColl(rs1.getString("OrderDate"),rs1.getString("BillNumber"),rs1.getString("Days"),rs1.getString("Amount"),rs1.getString("RecievedDate"),rs1.getString("RecievedAmount"),rs1.getString("ExcessDays"),rs1.getString("GRNumber"),rs1.getString("GRDate"),rs1.getString("GRAmount"),rs1.getString("DaysDecided"));
        ColList.add(col);
        }
        }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return ColList;     
    }
    public void show_user(){
    ArrayList<DataColl> list= DataColl();
    DefaultTableModel model=(DefaultTableModel)col_table2.getModel();
    String[] row=new String[11];
     int amttotal=0,recdtotal=0,grtotal=0,outstandingtotal=0;
    for(int i=0;i<list.size();i++){
        
        row[0]=list.get(i).getOrderDate();
        row[1]=list.get(i).getBillNumber();
        row[2]=list.get(i).getDays();
        row[3]=list.get(i).getAmount();
       // row[0]=list.get(i).getRecdDate();
        row[4]=list.get(i).getRecdAmt();
        row[5]=list.get(i).xsDays();
        //row[5]=list.get(i).getGRNumber();
       // row[0]=list.get(i).getGRDate();
        row[6]=list.get(i).getGRAmount();
        //row[0]=list.get(i).getDateDecided();
        model.addRow(row);
        amttotal=amttotal+Integer.parseInt(row[3]);
        recdtotal=recdtotal+Integer.parseInt(row[4]);
        grtotal=grtotal+Integer.parseInt(row[6]);
        outstandingtotal=amttotal-recdtotal-grtotal;
    }
   amt_total.setText(String.valueOf(amttotal));
   recd_amt_total.setText(String.valueOf(recdtotal));
   gr_amt_total.setText(String.valueOf(grtotal));
   outstanding.setText(String.valueOf(outstandingtotal));
   
}
    

    private void button_table_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_table_dataActionPerformed
/*if(PartyName2.getText().isEmpty()||order_date2.getDate()==null||billNo2.getText().isEmpty()||amt2.getText().isEmpty()||days_decd2.getText().isEmpty()){
            new AlertBox_FieldEmpty().setVisible(true);
        }
        else if(!Pattern.matches("^[0-9]+$",amt2.getText())){
            new Invalid_Format().setVisible(true);
            amt2.setText("");
            amt2.grabFocus();
        }
        else if(!Pattern.matches("^[0-9]+$",days_decd2.getText())){
            new Invalid_Format().setVisible(true);
            days_decd2.setText("");
            days_decd2.grabFocus();
        }
        
        
                else{
            if(b.signIn.getIsAdmin()){
                try{
     
  
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/database","root","Medadmom@123");
    String nameOfBill= billNo2.getText().trim().toUpperCase();
    String sqlin="select BillNumber from Collection1";
    PreparedStatement pstin=con.prepareStatement(sqlin);
    ResultSet rs=pstin.executeQuery();
    int count=0;
                    while(rs.next()){
                        String stringToCompare = rs.getString("BillNumber"); 
                        if(nameOfBill.equals(stringToCompare)){
                           count++;
                        }
                    }
                    if(count==0){
    String sql="SELECT Party_No from party_table WHERE PartyName=?";
    PreparedStatement pst0=con.prepareStatement(sql);
    pst0.setString(1,PartyName2.getText().trim().toUpperCase());
    ResultSet rs0=pst0.executeQuery();
    int partyno=0;
    if(rs0.next()){
        partyno=rs0.getInt(1);
    }
    System.out.println(partyno);
    String insertQuery="insert into collection1(PartyName,Party_No,OrderDate,BillNumber,Days,Amount,RecievedDate,RecievedAmount,ExcessDays,GRNumber,GRDate,GRAmount,DaysDecided) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement pst=con.prepareStatement(insertQuery);
    pst.setString(1,PartyName2.getText().trim().toUpperCase());
    pst.setInt(2,partyno);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    java.util.Date d1=order_date2.getDate();
    String newDate=formatter.format(d1);
    pst.setString(3,newDate);
    pst.setString(4,billNo2.getText().trim().toUpperCase());
    String empty_text="";
    String empty_text2="";
    String empty_text3="";
    String empty_text4="";
    String empty_text5="";
    if (days2.getText() == null || days2.getText().equals("")) {
                    empty_text=String.valueOf(0);
                } else {
                    empty_text=days2.getText();
                }
    pst.setString(5,empty_text);
    pst.setString(6,amt2.getText());
    java.util.Date d2= recd_date2.getDate();
                    String newDate2;
    if (recd_date2.getDate() == null || recd_date2.equals("")) {
                    newDate2=null;
                } else {
                    newDate2=formatter.format(d2);
                }
    pst.setString(7,newDate2);
    if (recd_amt2.getText() == null || recd_amt2.getText().isEmpty()) {
                    recd_amt2.setText(String.valueOf(0));
                } 
    pst.setString(8,recd_amt2.getText().trim());
    if (xs_days2.getText() == null || xs_days2.getText().equals("")) {
                    empty_text3=String.valueOf(0);
                } else {
                    empty_text3=xs_days2.getText();
                }
    pst.setString(9,empty_text3);
    if (gr_no2.getText() == null || gr_no2.getText().equals("")) {
                    empty_text4=String.valueOf(0);
                } else {
                    empty_text4=gr_no2.getText();
                }
    pst.setString(10,empty_text4);
    String newDate3;
    java.util.Date d3=gr_date2.getDate();
    if (gr_date2.getDate() == null || gr_date2.equals("")) {
                    newDate3=null;
                } else {
                     
                    newDate3=formatter.format(d3);
                }                
    pst.setString(11,newDate3);
    
                
    
    gr_amt2.setText(String.valueOf(0));
     pst.setString(12,gr_amt2.getText());
    pst.setString(13,days_decd2.getText());
    pst.executeUpdate();
    new InsertedSuccessfully().setVisible(true);
    PartyName2.setText("");
                name_combo2.setSelectedIndex(0);
                order_date2.setDate(null);
                billNo2.setText("");
                days2.setText("");
                amt2.setText("");
                recd_date2.setDate(null);
                recd_amt2.setText("");
                xs_days2.setText("");
                gr_no2.setText("");
                gr_date2.setDate(null);
                days_decd2.setText("");
                gr_amt2.setText("");
        
 
}
                     else{
                        new BillNo_Repeat().setVisible(true);
                        }
                }
               
catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        }
             else{
            new Not_Admin().setVisible(true);
        }
        }*/
        
// TODO add your handling code here:
    }//GEN-LAST:event_button_table_dataActionPerformed

    private void col_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col_tableMouseClicked
      // TODO add your handling code here:
        /*try{
            order_date2.getDateEditor().setDate(null);
            billNo2.setText("");
            days2.setText("");
            amt2.setText("");
            recd_date2.getDateEditor().setDate(null);
            recd_amt2.setText("");
            xs_days2.setText("");
            gr_no2.setText("");
            gr_date2.getDateEditor().setDate(null);;
            gr_amt2.setText("");
            days_decd2.setText("");
            int i= col_table.getSelectedRow();
            TableModel model=col_table.getModel();
            String billNo=(String) model.getValueAt(i,1);
            Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/database","root","Medadmom@123");
            String selQuery="Select RecievedDate,DaysDecided,GRNumber,GRDate from collection1 where BillNumber=?";
            PreparedStatement pst=con.prepareStatement(selQuery); 
            pst.setString(1, billNo);
            ResultSet rs=pst.executeQuery(); 
            try{
                java.util.Date orderDate= new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse((String) model.getValueAt(i,0));
                order_date2.setDate(orderDate);
            } catch (ParseException ex) {
                Logger.getLogger(Collection1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            billNo2.setText((String) model.getValueAt(i,1));
            
            if( model.getValueAt(i,2).toString()==null || "".equals(model.getValueAt(i,2).toString())){
                days2.setText("");
            }else{
                days2.setText((String) model.getValueAt(i,2));
            }
            
            amt2.setText((String) model.getValueAt(i,3));
                      if(model.getValueAt(i,4).toString()==null){
                recd_amt2.setText("");
            }else{
                recd_amt2.setText(model.getValueAt(i,4).toString());
            }  
            if(model.getValueAt(i,5).toString()==null){
                xs_days2.setText("");
            }else{
                xs_days2.setText(model.getValueAt(i,5).toString());
            }
            
            if(model.getValueAt(i,6).toString()==null){
                gr_amt2.setText("");
            }else{
                gr_amt2.setText(model.getValueAt(i,6).toString());
            }  
            String recdd1=null,grno=null,days2dec=null,grdat=null;   
            if(rs.next()){
                recdd1=rs.getString("RecievedDate");        
                days2dec=rs.getString("DaysDecided");  
                grno=rs.getString("GRNumber");  
                grdat=rs.getString("GRDate");  
            }
            
             try {
                //java.util.Date recdDate=new  SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).parse(recdd1);
                //System.out.println(recdDate);
                if (recdd1==null || "".equals(recdd1)) {
                       recd_date2.getDateEditor().setDate(null); 
                } else {
                        recd_date2.setDate(new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(recdd1));
                }       
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
                Logger.getLogger(Collection1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
           
            if (days2dec==null || "".equals(days2dec)) {
                       days_decd2.setText(""); 
                } else {
                        days_decd2.setText(rs.getString("DaysDecided"));
                }       
            
                       
              if(grno ==null || grno.equals("")){
                gr_no2.setText("");
            }else{
                gr_no2.setText(rs.getString("GRNumber"));
            }
            
            try{
                //java.util.Date grDate=new  SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).parse(grdat);
                if (grdat==null || "".equals(grdat)) {
                       gr_date2.getDateEditor().setDate(null); 
                }else {
                        gr_date2.setDate(new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(grdat));
                }       
            }catch (ParseException ex) {
                Logger.getLogger(Collection1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }*/
        
    }//GEN-LAST:event_col_tableMouseClicked

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed

    /*if(PartyName2.getText().isEmpty()||order_date2.getDate()==null||billNo2.getText().isEmpty()||days2.getText().isEmpty()||amt2.getText().isEmpty()||recd_date2.getDate()==null||recd_amt2.getText().isEmpty()||xs_days2.getText().isEmpty()||days_decd2.getText().isEmpty()==true){
   new AlertBox_FieldEmpty();
    }   
    
else if(!Pattern.matches("^[0-9]+$",amt2.getText())){
            new Invalid_Format();
            amt2.setText("");
            amt2.grabFocus();
        }
        else if(!Pattern.matches("^[0-9]+$",recd_amt2.getText())){
            new Invalid_Format();
            recd_amt2.setText("");
            recd_amt2.grabFocus();
        }
        
        
        else if (Integer.parseInt(recd_amt2.getText())>Integer.parseInt(amt2.getText())){
            new Recd_amount();
        }
       
else{// TODO add your handling code here:
            if(b.signIn.getIsAdmin()){
                try{
               
        
        Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","Medadmom@123");
    TableModel model=col_table2.getModel();
            int row=col_table2.getSelectedRow();
            
            String query="Select SrNumber from collection1 where BillNumber=?";
           PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,model.getValueAt(row,1).toString().toUpperCase());
            ResultSet rs=pst.executeQuery();
            int database_pk=0;
            if(rs.next()){
                database_pk=rs.getInt(1);
                //System.out.println(database_pk);
            }
            if(database_pk!=0){
               // System.out.println("In updation");
                
                query="UPDATE collection1 SET OrderDate=?,BillNumber=?,Days=?,Amount=?,RecievedDate=?,RecievedAmount=?,ExcessDays=?,GRNumber=?,GRDate=?,GRAmount=?,DaysDecided=? where SrNumber=?";
                pst=con.prepareStatement(query);
                //pst.setString(1,PartyName2.getText());
                SimpleDateFormat formatter=new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date d1=order_date2.getDate();
                String order_date21=formatter.format(d1);
                pst.setString(1,order_date21);
                pst.setString(2,billNo2.getText());
                pst.setString(3,days2.getText());
                pst.setString(4,amt2.getText());
                java.util.Date d2=recd_date2.getDate();
                String order_date22=formatter.format(d2);
                pst.setString(5,order_date22);
                pst.setString(6,recd_amt2.getText());
                int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              String xsdays2;
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                xsdays2="0";
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
                xsdays2=String.valueOf(x);
            }
                pst.setString(7,xsdays2);
                String empty_text="";
                if (gr_no2.getText() == null || gr_no2.getText().equals("")) {
                    empty_text=String.valueOf(0);
                } else {
                    empty_text=gr_no2.getText();
                }
                pst.setString(8,empty_text);
                String newDate3;
    java.util.Date d3=gr_date2.getDate();
                if (gr_date2.getDate() == null) {
                    newDate3=null;
                } else {
                     
                    newDate3=formatter.format(d3);
                }                
    pst.setString(9,newDate3);
                int y=Integer.parseInt(amt2.getText())-Integer.parseInt(recd_amt2.getText());
                  
                    gr_amt2.setText(String.valueOf(y));
                pst.setString(10,gr_amt2.getText());
                
                pst.setString(11,days_decd2.getText());
                pst.setString(12,String.valueOf(database_pk));
                pst.executeUpdate();
                show_user();
                //FillCombo();  
                PartyName2.setText("");
                name_combo2.setSelectedIndex(0);
                order_date2.setDate(null);
                billNo2.setText("");
                days2.setText("");
                amt2.setText("");
                recd_date2.setDate(null);
                recd_amt2.setText("");
                xs_days2.setText("");
                gr_no2.setText("");
                gr_date2.setDate(null);
                days_decd2.setText("");
                gr_amt2.setText("");
                new Update_record();  
               }
       }
                catch(Exception e){
            System.out.println(e.getMessage());

        }
            }
        
        
            else{
            new Not_Admin();
        }
        }*/
    

    }//GEN-LAST:event_update_buttonActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        /*if(PartyName2.getText().isEmpty()||order_date2.getDate()==null||billNo2.getText().isEmpty()||amt2.getText().isEmpty()||days_decd2.getText().isEmpty()){
   new AlertBox_FieldEmpty();
    }   else{
            if(b.signIn.getIsAdmin()){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","Medadmom@123");
    DefaultTableModel model = (DefaultTableModel) col_table2.getModel();
            int row = col_table2.getSelectedRow();
            PreparedStatement pst;
            ResultSet rs;
           String query="Select * from collection1 where BillNumber=?";
           pst=con.prepareStatement(query);
           pst.setString(1,billNo2.getText().trim());
           int sno=0;
           rs=pst.executeQuery();
            if(rs.next()==true){
                sno=rs.getInt(1);
                String query1="DELETE from Collection1 where BillNumber=?";
            pst = con.prepareStatement(query1);
            pst.setString(1,billNo2.getText().trim());
            pst.executeUpdate();
            PartyName2.setText("");
                name_combo2.setSelectedIndex(0);
                order_date2.setDate(null);
                billNo2.setText("");
                days2.setText("");
                amt2.setText("");
                recd_date2.setDate(null);
                recd_amt2.setText("");
                xs_days2.setText("");
                gr_no2.setText("");
                gr_date2.setDate(null);
                days_decd2.setText("");
                gr_amt2.setText("");
             new Deleted_record();
            model.removeRow(row);
           // new Deleted_record();
            
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        
        }
            }
            
            else{
            new Not_Admin();
        }
        }*/
        
    }//GEN-LAST:event_deleteActionPerformed

    private void gr_amttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gr_amttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gr_amttfActionPerformed

    private void gr_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_gr_datePropertyChange
        // TODO add your handling code here:
        /*try{
           
           if(order_date2.getDate().toString().isEmpty()==false&&days_decd2.getText().isEmpty()==false&&recd_date2.getDate().toString().isEmpty()==false&&gr_date2.getDate().toString().isEmpty()==false){
               try{
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date orderedDate=order_date2.getDate();
                java.util.Date recievedDate=recd_date2.getDate();
                
                java.util.Date grorder_date2=gr_date2.getDate();
                
                    long diffTime=(recievedDate.getTime()- orderedDate.getTime());
                    if(diffTime < 0){
                new Recd_Date();
                
            }
            else{
                long diff1 = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
                days2.setText(diff1+"");
            }
                
            
            int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
            }
            long diffInMillies2 = (grorder_date2.getTime() - orderedDate.getTime());
            if(diffInMillies2 < 0){
                new GR_date();
                
            }
            
               }
               catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        } 
           
       }
        catch(Exception e){
           // JOptionPane.showMessageDialog(null,e.getMessage());        
        } */
    }//GEN-LAST:event_gr_datePropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//reset();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
/*try{
    if(PartyName2.getText().isEmpty()){
        new AlertBox_FieldEmpty();
    }
    else{
        if(b.signIn.getIsAdmin()){
            Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/database","root","Medadmom@123");
            //String query1="Select PartyName from collection1 where PartyName=?";
            String query2="select PartyName from party_table where PartyName=?";
            //PreparedStatement pst1 = con.prepareStatement(query1);
            PreparedStatement pst2 = con.prepareStatement(query2);
            //pst1.setString(1,name_combo2.getSelectedItem().toString());
            pst2.setString(1,PartyName2.getText().trim().toUpperCase());
            Object selectedItem = name_combo2.getSelectedItem();
            //ResultSet rs1 = pst1.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
           
            if(rs2.next()){
                 
                    String sql1="DELETE from collection1 WHERE PartyName=?";
                    PreparedStatement pst1=con.prepareStatement(sql1);
                    pst1.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst1.executeUpdate();
                    String sql="DELETE from party_table WHERE PartyName=?";
                        PreparedStatement pst=con.prepareStatement(sql);
                    pst.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst.executeUpdate();
                    
            }
            
            name_combo2.removeItem(selectedItem);
            new Deleted_record();
        }
        else{
            new Not_Admin();
            }
    }
    
}
        catch(Exception e){
            System.out.println(e.getMessage());
        } */       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void update_partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_partyActionPerformed
/*if(PartyName2.getText().isEmpty()){
    new AlertBox_FieldEmpty();
}
else{
    if(b.signIn.getIsAdmin()){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/database","root","Medadmom@123");
    String nameOfParty= PartyName2.getText().trim().toUpperCase();
    String sql="select PartyName from party_table";
    PreparedStatement pst=con.prepareStatement(sql);
    ResultSet rs=pst.executeQuery();
    int count=0;
                    while(rs.next()){
                        String stringToCompare = rs.getString("PartyName"); 
                        if(nameOfParty.equals(stringToCompare)){
                           count++;
                        }
                    }
                    if(count==0){
    String selectedItem = (String) name_combo2.getSelectedItem();
    String sql1="SELECT Party_No from party_table WHERE PartyName=?";
    PreparedStatement pst1=con.prepareStatement(sql1);
    pst1.setString(1,selectedItem);
    ResultSet rs1=pst1.executeQuery();
    if (rs1.next()){
        int partyno=rs1.getInt(1);
        
                    String sql2="UPDATE party_table SET PartyName=? WHERE Party_No=? ";
                        PreparedStatement pst2=con.prepareStatement(sql2);
                    pst2.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst2.setInt(2,partyno);
                    String sql3="UPDATE Collection1 SET PartyName=? WHERE Party_No=?";
                    PreparedStatement pst3=con.prepareStatement(sql3);
                    pst3.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst3.setInt(2,partyno);
                    pst2.executeUpdate();
                    pst3.executeUpdate();
                    name_combo2.removeItem(selectedItem);
                    FillCombo();
                    new Update_record();
                    
    }
                    
    
    
}
                    else{
        new PrartyName_Repeat();
    }
    }
    catch(Exception e){
            System.out.println(e.getMessage());
        } 
}
    else{
        new Not_Admin();
    }
}*/// TODO add your handling code here:
    }//GEN-LAST:event_update_partyActionPerformed

    private void bill_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_numberActionPerformed

    private void days_decidedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_days_decidedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_days_decidedActionPerformed

    private void PartyName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartyName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PartyName2ActionPerformed

    private void col_table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col_table2MouseClicked
try{
            /*order_date2.getDateEditor().setDate(null);
            billNo2.setText("");
            days2.setText("");
            amt2.setText("");
            recd_date2.getDateEditor().setDate(null);
            recd_amt2.setText("");
            xs_days2.setText("");
            gr_no2.setText("");
            gr_date2.getDateEditor().setDate(null);
            gr_amt2.setText("");
            days_decd2.setText("");*/
            int i= col_table2.getSelectedRow();
            TableModel model=col_table2.getModel();
            String billNo=(String) model.getValueAt(i,1);
            Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection("jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
            String selQuery="Select RecievedDate,DaysDecided,GRNumber,GRDate from collection1 where BillNumber=?";
            PreparedStatement pst=con.prepareStatement(selQuery); 
            pst.setString(1, billNo);
            ResultSet rs=pst.executeQuery(); 
            try{
                java.util.Date orderDate= new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse((String) model.getValueAt(i,0));
                order_date2.setDate(orderDate);
            } catch (ParseException ex) {
                Logger.getLogger(Collection1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            billNo2.setText((String) model.getValueAt(i,1));
            
            if( model.getValueAt(i,2).toString()==null || "".equals(model.getValueAt(i,2).toString())){
                days2.setText("");
            }else{
                days2.setText((String) model.getValueAt(i,2));
            }
            
            amt2.setText((String) model.getValueAt(i,3));
                      if(model.getValueAt(i,4).toString()==null){
                recd_amt2.setText("");
            }else{
                recd_amt2.setText(model.getValueAt(i,4).toString());
            }  
            if(model.getValueAt(i,5).toString()==null){
                xs_days2.setText("");
            }else{
                xs_days2.setText(model.getValueAt(i,5).toString());
            }
            
            if(model.getValueAt(i,6).toString()==null){
                gr_amt2.setText("");
            }else{
                gr_amt2.setText(model.getValueAt(i,6).toString());
            }  
            String recdd1=null,grno=null,days2dec=null,grdat=null;   
            if(rs.next()){
                recdd1=rs.getString("RecievedDate");        
                days2dec=rs.getString("DaysDecided");  
                grno=rs.getString("GRNumber");  
                grdat=rs.getString("GRDate");  
            }
            
             try {
                //java.util.Date recdDate=new  SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).parse(recdd1);
                //System.out.println(recdDate);
                if (recdd1==null || "".equals(recdd1)) {
                       recd_date2.getDateEditor().setDate(null); 
                } else {
                        recd_date2.setDate(new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(recdd1));
                }       
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
                Logger.getLogger(Collection1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
           
            if (days2dec==null || "".equals(days2dec)) {
                       days_decd2.setText(""); 
                } else {
                        days_decd2.setText(rs.getString("DaysDecided"));
                }       
            
                       
              if(grno ==null || grno.equals("")){
                gr_no2.setText("");
            }else{
                gr_no2.setText(rs.getString("GRNumber"));
            }
            
            try{
                //java.util.Date grDate=new  SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).parse(grdat);
                if (grdat==null || "".equals(grdat)) {
                       gr_date2.getDateEditor().setDate(null); 
                }else {
                        gr_date2.setDate(new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(grdat));
                }       
            }catch (ParseException ex) {
                Logger.getLogger(Collection1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_col_table2MouseClicked

    private void insert_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_name2ActionPerformed

    if(PartyName2.getText().isEmpty()){
                new PartyName_FieldEmpty().setVisible(true);
                }
        else{
             
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
    String nameOfParty= PartyName2.getText().trim().toUpperCase();
    String sql="select PartyName from party_table";
    PreparedStatement pst=con.prepareStatement(sql);
    ResultSet rs=pst.executeQuery();
    int count=0;
                    while(rs.next()){
                        String stringToCompare = rs.getString("PartyName"); 
                        if(nameOfParty.equals(stringToCompare)){
                           count++;
                        }
                    }
    if(count==0){
    
        String query="insert into party_table(PartyName) values(?)";
    PreparedStatement pst1=con.prepareStatement(query);
    pst1.setString(1,PartyName2.getText().toUpperCase());
        pst1.executeUpdate();
        FillCombo();
            new InsertedSuccessfully().setVisible(true);
    
    
    }
        else{
        new PrartyName_Repeat().setVisible(true);
    }
            
        
        /*else if(PartyName2.getText().trim().isEmpty())
        {
                JOptionPane.showMessageDialog(this,"Null values cannot be inserted");
                }*/
        
        
        
      //PartyName2.setText("");  
    }
  
     //PartyName2.setText("");
        
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
             
            
        }
// TODO add your handling code here:
    }//GEN-LAST:event_insert_name2ActionPerformed

    private void name_combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_combo2ActionPerformed
if(name_combo2.getSelectedItem().toString().isEmpty()==false){
        String selectedValue=name_combo2.getSelectedItem().toString();
        PartyName2.setText(selectedValue);
        show_user();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_name_combo2ActionPerformed

    private void order_date2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_order_date2PropertyChange
try{
           
           if(order_date2.getDate().toString().isEmpty()==false&&days_decd2.getText().isEmpty()==false&&recd_date.getDate().toString().isEmpty()==false){
               try{
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date orderedDate=order_date2.getDate();
                java.util.Date recievedDate=recd_date.getDate();
                
                
                    long diffTime=(recievedDate.getTime()- orderedDate.getTime());
                    //long diffTime1=(decidedDate.getTime()-orderedDate.getTime());
                    if(diffTime < 0){
                new Recd_Date().setVisible(true);
                
            }
                    /*else if(diffTime1<0){
                        new Decd_Date();
                    }*/
            else{
                long diff1 = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
                days2.setText(diff1+"");
            }
                
            
            int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
            }
               }
               catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        } 
           
       }
        catch(Exception e){
           // JOptionPane.showMessageDialog(null,e.getMessage());        
        }                // TODO add your handling code here:
    }//GEN-LAST:event_order_date2PropertyChange

    private void gr_date2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_gr_date2PropertyChange
try{
           
           if(order_date2.getDate().toString().isEmpty()==false&&days_decd2.getText().isEmpty()==false&&recd_date2.getDate().toString().isEmpty()==false&&gr_date2.getDate().toString().isEmpty()==false){
               try{
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date orderedDate=order_date2.getDate();
                java.util.Date recievedDate=recd_date2.getDate();
                
                java.util.Date grorder_date2=gr_date2.getDate();
                
                    long diffTime=(recievedDate.getTime()- orderedDate.getTime());
                    if(diffTime < 0){
                new Recd_Date().setVisible(true);
                
            }
            else{
                long diff1 = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
                days2.setText(diff1+"");
            }
                
            
            int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
            }
            long diffInMillies2 = (grorder_date2.getTime() - orderedDate.getTime());
            if(diffInMillies2 < 0){
                new GR_date().setVisible(true);
                
            }
            
               }
               catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        } 
           
       }
        catch(Exception e){
           // JOptionPane.showMessageDialog(null,e.getMessage());        
        }         // TODO add your handling code here:
    }//GEN-LAST:event_gr_date2PropertyChange

    private void update_party_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_party_name2ActionPerformed
if(PartyName2.getText().isEmpty()){
    new AlertBox_FieldEmpty().setVisible(true);
}
else{
    
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
    String nameOfParty= PartyName2.getText().trim().toUpperCase();
    String sql="select PartyName from party_table";
    PreparedStatement pst=con.prepareStatement(sql);
    ResultSet rs=pst.executeQuery();
    int count=0;
                    while(rs.next()){
                        String stringToCompare = rs.getString("PartyName"); 
                        if(nameOfParty.equals(stringToCompare)){
                           count++;
                        }
                    }
                    if(count==0){
    String selectedItem = (String) name_combo2.getSelectedItem();
    String sql1="SELECT Party_No from party_table WHERE PartyName=?";
    PreparedStatement pst1=con.prepareStatement(sql1);
    pst1.setString(1,selectedItem);
    ResultSet rs1=pst1.executeQuery();
    if (rs1.next()){
        int partyno=rs1.getInt(1);
        
                    String sql2="UPDATE party_table SET PartyName=? WHERE Party_No=? ";
                        PreparedStatement pst2=con.prepareStatement(sql2);
                    pst2.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst2.setInt(2,partyno);
                    String sql3="UPDATE collection1 SET PartyName=? WHERE Party_No=?";
                    PreparedStatement pst3=con.prepareStatement(sql3);
                    pst3.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst3.setInt(2,partyno);
                    pst2.executeUpdate();
                    pst3.executeUpdate();
                    name_combo2.removeItem(selectedItem);
                    FillCombo();
                    new Update_record().setVisible(true);
                    
    }
                    
    
    
}
                    else{
        new PrartyName_Repeat().setVisible(true);
    }
    }
    catch(Exception e){
            System.out.println(e.getMessage());
        } 

}        // TODO add your handling code here:
    }//GEN-LAST:event_update_party_name2ActionPerformed

    private void delete_details2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_details2ActionPerformed
if(PartyName2.getText().isEmpty()||order_date2.getDate()==null||billNo2.getText().isEmpty()||amt2.getText().isEmpty()||days_decd2.getText().isEmpty()){
   new AlertBox_FieldEmpty().setVisible(true);
    }   else{
            
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection("jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
    DefaultTableModel model = (DefaultTableModel) col_table2.getModel();
            int row = col_table2.getSelectedRow();
            PreparedStatement pst;
            ResultSet rs;
           String query="Select * from collection1 where BillNumber=?";
           pst=con.prepareStatement(query);
           pst.setString(1,billNo2.getText().trim());
           int sno=0;
           rs=pst.executeQuery();
            if(rs.next()==true){
                sno=rs.getInt(1);
                String query1="DELETE from collection1 where BillNumber=?";
            pst = con.prepareStatement(query1);
            pst.setString(1,billNo2.getText().trim());
            pst.executeUpdate();
            PartyName2.setText("");
                name_combo2.setSelectedIndex(0);
                order_date2.setDate(null);
                billNo2.setText("");
                days2.setText("");
                amt2.setText("");
                recd_date2.setDate(null);
                recd_amt2.setText("");
                xs_days2.setText("");
                gr_no2.setText("");
                gr_date2.setDate(null);
                days_decd2.setText("");
                gr_amt2.setText("");
             new Deleted_record().setVisible(true);
            model.removeRow(row);
           // new Deleted_record();
            
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        
        }
            
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_delete_details2ActionPerformed

    private void update_details2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_details2ActionPerformed

    if(PartyName2.getText().isEmpty()||order_date2.getDate()==null||billNo2.getText().isEmpty()||days2.getText().isEmpty()||amt2.getText().isEmpty()||recd_date2.getDate()==null||recd_amt2.getText().isEmpty()||xs_days2.getText().isEmpty()||days_decd2.getText().isEmpty()==true){
   new AlertBox_FieldEmpty().setVisible(true);
    }   
    
else if(!Pattern.matches("^[0-9]+$",amt2.getText())){
            new Invalid_Format().setVisible(true);
            amt2.setText("");
            amt2.grabFocus();
        }
        else if(!Pattern.matches("^[0-9]+$",recd_amt2.getText())){
            new Invalid_Format().setVisible(true);
            recd_amt2.setText("");
            recd_amt2.grabFocus();
        }
        
        
        else if (Integer.parseInt(recd_amt2.getText())>Integer.parseInt(amt2.getText())){
            new Recd_amount().setVisible(true);
        }
       
else{// TODO add your handling code here:
            
                try{
               
        
        Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection("jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
    TableModel model=col_table2.getModel();
            int row=col_table2.getSelectedRow();
            
            String query="Select SrNumber from collection1 where BillNumber=?";
           PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,model.getValueAt(row,1).toString().toUpperCase());
            ResultSet rs=pst.executeQuery();
            int database_pk=0;
            if(rs.next()){
                database_pk=rs.getInt(1);
                //System.out.println(database_pk);
            }
            if(database_pk!=0){
               // System.out.println("In updation");
                
                query="UPDATE collection1 SET OrderDate=?,BillNumber=?,Days=?,Amount=?,RecievedDate=?,RecievedAmount=?,ExcessDays=?,GRNumber=?,GRDate=?,GRAmount=?,DaysDecided=? where SrNumber=?";
                pst=con.prepareStatement(query);
                //pst.setString(1,PartyName2.getText());
                SimpleDateFormat formatter=new  SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date d1=order_date2.getDate();
                String order_date21=formatter.format(d1);
                pst.setString(1,order_date21);
                pst.setString(2,billNo2.getText());
                pst.setString(3,days2.getText());
                pst.setString(4,amt2.getText());
                java.util.Date d2=recd_date2.getDate();
                String order_date22=formatter.format(d2);
                pst.setString(5,order_date22);
                pst.setString(6,recd_amt2.getText());
                int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              String xsdays2;
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                xsdays2="0";
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
                xsdays2=String.valueOf(x);
            }
                pst.setString(7,xsdays2);
                String empty_text="";
                if (gr_no2.getText() == null || gr_no2.getText().equals("")) {
                    empty_text=String.valueOf(0);
                } else {
                    empty_text=gr_no2.getText();
                }
                pst.setString(8,empty_text);
                String newDate3;
    java.util.Date d3=gr_date2.getDate();
                if (gr_date2.getDate() == null) {
                    newDate3=null;
                } else {
                     
                    newDate3=formatter.format(d3);
                }                
    pst.setString(9,newDate3);
                int y=Integer.parseInt(amt2.getText())-Integer.parseInt(recd_amt2.getText());
                  
                    gr_amt2.setText(String.valueOf(y));
                pst.setString(10,gr_amt2.getText());
                
                pst.setString(11,days_decd2.getText());
                pst.setString(12,String.valueOf(database_pk));
                pst.executeUpdate();
                show_user();
                //FillCombo();  
                PartyName2.setText("");
                name_combo2.setSelectedIndex(0);
                order_date2.setDate(null);
                billNo2.setText("");
                days2.setText("");
                amt2.setText("");
                recd_date2.setDate(null);
                recd_amt2.setText("");
                xs_days2.setText("");
                gr_no2.setText("");
                gr_date2.setDate(null);
                days_decd2.setText("");
                gr_amt2.setText("");
                new Update_record().setVisible(true);  
               }
       }
                catch(Exception e){
            System.out.println(e.getMessage());

        }
            
        }
        
            
       
            // TODO add your handling code here:
    }//GEN-LAST:event_update_details2ActionPerformed

    private void insert_data2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_data2ActionPerformed
if(PartyName2.getText().isEmpty()||order_date2.getDate()==null||billNo2.getText().isEmpty()||amt2.getText().isEmpty()||days_decd2.getText().isEmpty()){
            new AlertBox_FieldEmpty().setVisible(true);
        }
        else if(!Pattern.matches("^[0-9]+$",amt2.getText())){
            new Invalid_Format().setVisible(true);
            amt2.setText("");
            amt2.grabFocus();
        }
        else if(!Pattern.matches("^[0-9]+$",days_decd2.getText())){
            new Invalid_Format().setVisible(true);
            days_decd2.setText("");
            days_decd2.grabFocus();
        }
        
        
                else{
            
                try{
     
  
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
    String nameOfBill= billNo2.getText().trim().toUpperCase();
    String sqlin="select BillNumber from collection1";
    PreparedStatement pstin=con.prepareStatement(sqlin);
    ResultSet rs=pstin.executeQuery();
    int count=0;
                    while(rs.next()){
                        String stringToCompare = rs.getString("BillNumber"); 
                        if(nameOfBill.equals(stringToCompare)){
                           count++;
                        }
                    }
                    if(count==0){
    String sql="SELECT Party_No from party_table WHERE PartyName=?";
    PreparedStatement pst0=con.prepareStatement(sql);
    pst0.setString(1,PartyName2.getText().trim().toUpperCase());
    ResultSet rs0=pst0.executeQuery();
    int partyno=0;
    if(rs0.next()){
        partyno=rs0.getInt(1);
    }
    System.out.println(partyno);
    String insertQuery="insert into collection1(PartyName,Party_No,OrderDate,BillNumber,Days,Amount,RecievedDate,RecievedAmount,ExcessDays,GRNumber,GRDate,GRAmount,DaysDecided) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement pst=con.prepareStatement(insertQuery);
    pst.setString(1,PartyName2.getText().trim().toUpperCase());
    pst.setInt(2,partyno);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    java.util.Date d1=order_date2.getDate();
    String newDate=formatter.format(d1);
    pst.setString(3,newDate);
    pst.setString(4,billNo2.getText().trim().toUpperCase());
    String empty_text="";
    String empty_text2="";
    String empty_text3="";
    String empty_text4="";
    String empty_text5="";
    if (days2.getText() == null || days2.getText().equals("")) {
                    empty_text=String.valueOf(0);
                } else {
                    empty_text=days2.getText();
                }
    pst.setString(5,empty_text);
    pst.setString(6,amt2.getText());
    java.util.Date d2= recd_date2.getDate();
                    String newDate2;
    if (recd_date2.getDate() == null || recd_date2.equals("")) {
                    newDate2=null;
                } else {
                    newDate2=formatter.format(d2);
                }
    pst.setString(7,newDate2);
    if (recd_amt2.getText() == null || recd_amt2.getText().isEmpty()) {
                    recd_amt2.setText(String.valueOf(0));
                } 
    pst.setString(8,recd_amt2.getText().trim());
    if (xs_days2.getText() == null || xs_days2.getText().equals("")) {
                    empty_text3=String.valueOf(0);
                } else {
                    empty_text3=xs_days2.getText();
                }
    pst.setString(9,empty_text3);
    if (gr_no2.getText() == null || gr_no2.getText().equals("")) {
                    empty_text4=String.valueOf(0);
                } else {
                    empty_text4=gr_no2.getText();
                }
    pst.setString(10,empty_text4);
    String newDate3;
    java.util.Date d3=gr_date2.getDate();
    if (gr_date2.getDate() == null || gr_date2.equals("")) {
                    newDate3=null;
                } else {
                     
                    newDate3=formatter.format(d3);
                }                
    pst.setString(11,newDate3);
    
                
    
    gr_amt2.setText(String.valueOf(0));
     pst.setString(12,gr_amt2.getText());
    pst.setString(13,days_decd2.getText());
    pst.executeUpdate();
    new InsertedSuccessfully().setVisible(true);
    PartyName2.setText("");
                name_combo2.setSelectedIndex(0);
                order_date2.setDate(null);
                billNo2.setText("");
                days2.setText("");
                amt2.setText("");
                recd_date2.setDate(null);
                recd_amt2.setText("");
                xs_days2.setText("");
                gr_no2.setText("");
                gr_date2.setDate(null);
                days_decd2.setText("");
                gr_amt2.setText("");
        
 
}
                     else{
                        new BillNo_Repeat().setVisible(true);
                        }
                }
               
catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        
            
        }

                // TODO add your handling code here:
    }//GEN-LAST:event_insert_data2ActionPerformed

    private void delete_party2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_party2ActionPerformed

    try{
    if(PartyName2.getText().isEmpty()){
        new AlertBox_FieldEmpty().setVisible(true);
    }
    else{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_bYz4P","u159657273_9OFDL","Vaishnavi$2801");
            //String query1="Select PartyName from collection1 where PartyName=?";
            String query2="select PartyName from party_table where PartyName=?";
            //PreparedStatement pst1 = con.prepareStatement(query1);
            PreparedStatement pst2 = con.prepareStatement(query2);
            //pst1.setString(1,name_combo2.getSelectedItem().toString());
            pst2.setString(1,PartyName2.getText().trim().toUpperCase());
            Object selectedItem = name_combo2.getSelectedItem();
            //ResultSet rs1 = pst1.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            /*int PartyName2_index = 0;
            ArrayList<Integer> party_data_index = new ArrayList<>();
            while(rs1.next()){
                party_data_index.add(rs1.getInt("Sr_no"));
            }
            for(int i=0; party_data_index.size() != 0 && i < party_data_index.size(); i++){
                query1 = "delete from collections_data where `Sr_no`=?";
                pst1 = con.prepareStatement(query1);
                pst1.setString(1, String.valueOf(party_data_index.get(i)));
                pst1.executeUporder_date2();
            }*/
            if(rs2.next()){
                 
                    String sql1="DELETE from collection1 WHERE PartyName=?";
                    PreparedStatement pst1=con.prepareStatement(sql1);
                    pst1.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst1.executeUpdate();
                    String sql="DELETE from party_table WHERE PartyName=?";
                        PreparedStatement pst=con.prepareStatement(sql);
                    pst.setString(1,PartyName2.getText().trim().toUpperCase());
                    pst.executeUpdate();
                    
            }
            
            name_combo2.removeItem(selectedItem);
            PartyName2.setText("");
            new Deleted_record().setVisible(true);
        
        
    }
    
}
        catch(Exception e){
            System.out.println(e.getMessage());
        }  
// TODO add your handling code here:
    }//GEN-LAST:event_delete_party2ActionPerformed

    private void recd_date2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_recd_date2PropertyChange
try{
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                java.util.Date orderedDate=order_date2.getDate();
                java.util.Date recievedDate=recd_date2.getDate();
                
                //java.util.Date grorder_date2=gr_date2.getDate();
                
                    long diffTime=(recievedDate.getTime()- orderedDate.getTime());
                    if(diffTime < 0){
                new Recd_Date().setVisible(true);
                
            }
            else{
                long diff1 = TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
                days2.setText(diff1+"");
            }
                
            
            int x=Integer.parseInt(days2.getText())-Integer.parseInt(days_decd2.getText());
              
            if(x < 0){
                xs_days2.setText(String.valueOf(0));
                
            }
            else{
                
                xs_days2.setText(String.valueOf(x));
            }
            
               }
               catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        
                   // TODO add your handling code here:
    }//GEN-LAST:event_recd_date2PropertyChange

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
reset();        // TODO add your handling code here:
    }//GEN-LAST:event_reset2ActionPerformed

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
            java.util.logging.Logger.getLogger(Collection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Collection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Collection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Collection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Collection1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PartyName2;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount_tf;
    private javax.swing.JTextField amt2;
    private javax.swing.JTextField amt_total;
    private javax.swing.JTextField billNo2;
    private javax.swing.JTextField bill_number;
    private javax.swing.JButton button_table_data;
    private javax.swing.JButton button_table_name;
    private javax.swing.JTable col_table;
    private javax.swing.JTable col_table2;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField days;
    private javax.swing.JTextField days2;
    private javax.swing.JTextField days_decd2;
    private javax.swing.JTextField days_decided;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete_details2;
    private javax.swing.JButton delete_party2;
    private javax.swing.JTextField gr_amount;
    private javax.swing.JTextField gr_amt2;
    private javax.swing.JTextField gr_amt_total;
    private javax.swing.JTextField gr_amttf;
    private com.toedter.calendar.JDateChooser gr_date;
    private com.toedter.calendar.JDateChooser gr_date2;
    private javax.swing.JTextField gr_no2;
    private javax.swing.JTextField gr_number;
    private javax.swing.JButton insert_data2;
    private javax.swing.JButton insert_name2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> name_combo2;
    private javax.swing.JComboBox<String> name_combobox;
    private com.toedter.calendar.JDateChooser order_date2;
    private javax.swing.JTextField outstanding;
    private javax.swing.JTextField outstanding_tf;
    private javax.swing.JTextField party_name;
    private javax.swing.JTextField recd_amount;
    private javax.swing.JTextField recd_amt2;
    private javax.swing.JTextField recd_amt_total;
    private javax.swing.JTextField recd_amttf;
    private com.toedter.calendar.JDateChooser recd_date;
    private com.toedter.calendar.JDateChooser recd_date2;
    private javax.swing.JButton reset2;
    private javax.swing.JButton update_button;
    private javax.swing.JButton update_details2;
    private javax.swing.JButton update_party;
    private javax.swing.JButton update_party_name2;
    private javax.swing.JTextField xs_days;
    private javax.swing.JTextField xs_days2;
    // End of variables declaration//GEN-END:variables
}
