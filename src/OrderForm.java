
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.governors.MaxPagesGovernor;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class OrderForm extends javax.swing.JFrame {
public Collection1 c;
    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        FillAgentCombo();
         FillCombo();
         jScrollPane1.getViewport().setBackground(new Color(116,121,180));
         name_combo2.setRenderer(new OrderForm.Demo(name_combo2.getRenderer()));
          agent_dropbox.setRenderer(new OrderForm.Demo(agent_dropbox.getRenderer()));
          i_want_to.setRenderer(new OrderForm.Demo(i_want_to.getRenderer()));
          base.setRenderer(new OrderForm.Demo(base.getRenderer()));
        TableCellRenderer alteredColorRenderer = new AlterColor();
        displayTable.setDefaultRenderer(Object.class, alteredColorRenderer);
        headerColorAndWidth();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
       
    }
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

    public final void headerColorAndWidth(){
        DefaultTableCellRenderer headerClr = new DefaultTableCellRenderer();
        headerClr.setBackground(new Color(255, 138, 115));
       // headerClr.setForeground(Color.decode("#FCE7FC"));
       displayTable.setRowHeight(displayTable.getRowHeight()+20);
               

        displayTable.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(headerClr);
        displayTable.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(headerClr);
        displayTable.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(headerClr);
        displayTable.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(headerClr);
        displayTable.getTableHeader().getColumnModel().getColumn(4).setHeaderRenderer(headerClr);
        displayTable.getTableHeader().getColumnModel().getColumn(5).setHeaderRenderer(headerClr);
        JTableHeader tableHeader = displayTable.getTableHeader();
        tableHeader.setVisible(true);
        tableHeader.setFont(new Font("Copperplate Gothic Bold",1, 24));
        tableHeader.setOpaque(false); 
        tableHeader.setForeground(new Color(255,255,255));
        TableColumn tc1=displayTable.getColumnModel().getColumn(0);
        tc1.setPreferredWidth(30);
        TableColumn tc2=displayTable.getColumnModel().getColumn(1);
        tc2.setPreferredWidth(100);
        TableColumn tc3=displayTable.getColumnModel().getColumn(2);
        tc3.setPreferredWidth(3);
        TableColumn tc4=displayTable.getColumnModel().getColumn(3);
        tc4.setPreferredWidth(50);
        TableColumn tc5=displayTable.getColumnModel().getColumn(4);
        tc5.setPreferredWidth(20);
        TableColumn tc6=displayTable.getColumnModel().getColumn(5);
        tc6.setPreferredWidth(20);
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
        name_combo2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        formNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        agent_dropbox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        base = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        sareesParcels = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        paymentDays = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalSarees = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        totalParcels = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        pdf = new javax.swing.JButton();
        insertRow = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        i_want_to = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        city = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("Software_logo.jpeg")).getImage());
        setPreferredSize(new java.awt.Dimension(1299, 760));

        jPanel1.setBackground(new java.awt.Color(31, 35, 71));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date:");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Party:");

        name_combo2.setBackground(new java.awt.Color(249, 173, 129));
        name_combo2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        name_combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select party---" }));
        name_combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_combo2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order Form No.");

        formNo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        formNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agent:");

        agent_dropbox.setBackground(new java.awt.Color(249, 173, 129));
        agent_dropbox.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quality:");

        base.setBackground(new java.awt.Color(249, 173, 129));
        base.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        base.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Balatan Butta Rich Pallu", "Balatan Butta Chit Pallu", "Raw Slub Butta Rich Pallu", "Raw Slub Butta Chit Pallu", "Balatan Embose Chit Pallu", "Raw Slub all Over Butta" }));
        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });

        displayTable.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Quality", "Sr. No", "Design", "Sarees", "Parcels"
            }
        ));
        jScrollPane1.setViewportView(displayTable);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sarees/Parcels:");

        sareesParcels.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Payment Days:");

        paymentDays.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total sarees:");

        totalSarees.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        totalSarees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSareesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Parcels:");

        totalParcels.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rate:");

        rate.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N

        insert.setBackground(new java.awt.Color(255, 138, 115));
        insert.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 138, 115));
        update.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 138, 115));
        delete.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 138, 115));
        reset.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        pdf.setBackground(new java.awt.Color(255, 138, 115));
        pdf.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        pdf.setText("Create PDF ");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        insertRow.setBackground(new java.awt.Color(255, 138, 115));
        insertRow.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        insertRow.setText("Insert Row");
        insertRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRowActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("I want to:");

        i_want_to.setBackground(new java.awt.Color(249, 173, 129));
        i_want_to.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        i_want_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insert table data", "Insert form data", "Insert all data together", "Search by Date", "Search by Quality and Date", "Delete table data", "Delete order data" }));

        search.setBackground(new java.awt.Color(255, 138, 115));
        search.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City:");

        city.setColumns(20);
        city.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        city.setRows(5);
        jScrollPane2.setViewportView(city);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(987, 987, 987)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertRow)
                            .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1055, 1055, 1055)
                        .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel11)
                                        .addGap(14, 14, 14)
                                        .addComponent(i_want_to, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(formNo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(300, 300, 300))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel12)
                                                            .addComponent(jLabel1))
                                                        .addGap(99, 99, 99)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jScrollPane2)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(90, 90, 90)
                                                        .addComponent(name_combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(81, 81, 81)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addGap(17, 17, 17)))))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agent_dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymentDays, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sareesParcels, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalParcels, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalSarees, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(996, 996, 996)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(i_want_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agent_dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(name_combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sareesParcels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(paymentDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalSarees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(totalParcels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel10)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insert)
                            .addComponent(update))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete)
                            .addComponent(reset))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(insertRow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(search)))
                        .addGap(18, 18, 18)
                        .addComponent(pdf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Order form");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
try{
    Connection con=null;
    con=ConnectionManager.getConnection();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    java.util.Date d3=date.getDate();
    String newDate3=formatter.format(d3);
    String SelectedBase=base.getSelectedItem().toString();
    String party=name_combo2.getSelectedItem().toString();
    String agent=agent_dropbox.getSelectedItem().toString();
    if(i_want_to.getSelectedIndex()==1){
    String query1="insert into order_form(Date,PartyName,city,Agent_name,form_no,payment_days,rate,sareesParcels,Quality) values (?,?,?,?,?,?,?,?,?)";
    PreparedStatement pst1=con.prepareStatement(query1);
    pst1.setString(1,newDate3);
    pst1.setString(2,party);
    pst1.setString(3,city.getText());
    pst1.setString(4,agent);
    pst1.setString(5,formNo.getText());
    pst1.setString(6,paymentDays.getText());
    pst1.setString(7,rate.getText());
    pst1.setString(8,sareesParcels.getText());
    pst1.setString(9,SelectedBase);
    pst1.executeUpdate();
    }
    else if(i_want_to.getSelectedIndex()==0){
    int rows=displayTable.getRowCount();
    int totalSarees=0;
    int totalParcels=0;
    //System.out.println(rows);
    for(int row=0;row<rows;row++){
       
        String date1=(String) displayTable.getValueAt(row,0);
        String quality=(String) displayTable.getValueAt(row,1);
        String srno=(String)displayTable.getValueAt(row,2);
        String design=(String)displayTable.getValueAt(row,3);
        String sarees=(String)displayTable.getValueAt(row,4);
        String parcels=(String)displayTable.getValueAt(row,5);
        totalSarees=Integer.parseInt(sarees)+totalSarees;
        totalParcels=Integer.parseInt(parcels)+totalParcels;
        //System.out.println(totalSarees);
        //System.out.println(totalParcels);
   
    if((date1=="" || date1==null)&&(quality=="" ||quality==null)){
    String query2="insert into order_details(PartyName,Date,SrNumber,Design,Quality,sarees,parcels) values(?,?,?,?,?,?,?)";
    PreparedStatement pst2=con.prepareStatement(query2);
    String query3="update order_form set totalParcels=?,totalSarees=? where Date=? and PartyName=? and Quality=?";
    PreparedStatement pst3=con.prepareStatement(query3);
    pst2.setString(1,party);
    pst2.setString(2,newDate3);
    pst2.setString(3,srno);
     pst2.setString(4,design);
      pst2.setString(5,SelectedBase);
       pst2.setString(6,sarees);
       pst2.setString(7, parcels);
       
       pst2.executeUpdate();
       pst3.setInt(1,totalParcels);
       pst3.setInt(2,totalSarees);
       pst3.setString(3,newDate3);
       pst3.setString(4,party);
       pst3.setString(5,SelectedBase);
       pst3.executeUpdate();
       
       
    }
    
    }
    }
    else if(i_want_to.getSelectedIndex()==2){
        String query1="insert into order_form(Date,PartyName,city,Agent_name,form_no,payment_days,rate,sareesParcels,Quality) values (?,?,?,?,?,?,?,?,?)";
    PreparedStatement pst1=con.prepareStatement(query1);
    pst1.setString(1,newDate3);
    pst1.setString(2,party);
    pst1.setString(3,city.getText());
    pst1.setString(4,agent);
    pst1.setString(5,formNo.getText());
    pst1.setString(6,paymentDays.getText());
    pst1.setString(7,rate.getText());
    pst1.setString(8,sareesParcels.getText());
    pst1.setString(9,SelectedBase);
    pst1.executeUpdate();
    int rows=displayTable.getRowCount();
    int totalSarees=0;
    int totalParcels=0;
    //System.out.println(rows);
    for(int row=0;row<rows;row++){
       
        String date1=(String) displayTable.getValueAt(row,0);
        String quality=(String) displayTable.getValueAt(row,1);
        String srno=(String)displayTable.getValueAt(row,2);
        String design=(String)displayTable.getValueAt(row,3);
        String sarees=(String)displayTable.getValueAt(row,4);
        String parcels=(String)displayTable.getValueAt(row,5);
        totalSarees=Integer.parseInt(sarees)+totalSarees;
        totalParcels=Integer.parseInt(parcels)+totalParcels;
   
    if((date1=="" || date1==null)&&(quality=="" ||quality==null)){
    String query2="insert into order_details(PartyName,Date,SrNumber,Design,Quality,sarees,parcels) values(?,?,?,?,?,?,?)";
    PreparedStatement pst2=con.prepareStatement(query2);
    String query3="update order_form set totalParcels=?,totalSarees=? where Date=? and PartyName=? and Quality=?";
    PreparedStatement pst3=con.prepareStatement(query3);
    pst2.setString(1,party);
    //pst2.setString(2,city.getText());
    pst2.setString(2,newDate3);
    pst2.setString(3,srno);
     pst2.setString(4,design);
      pst2.setString(5,SelectedBase);
       pst2.setString(6,sarees);
       pst2.setString(7, parcels);
       
       pst2.executeUpdate();
       
        pst3.setInt(1,totalParcels);
       pst3.setInt(2,totalSarees);
       pst3.setString(3,newDate3);
       pst3.setString(4,party);
       pst3.setString(5,SelectedBase);
       pst3.executeUpdate();
       
    }
    
    }
    }
    
    new InsertedSuccessfully().setVisible(true);
    
}
 catch(Exception e){
            System.out.println(e.getMessage());

        }
    // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed

    private void formNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNoActionPerformed

    private void insertRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRowActionPerformed
TableModel model=displayTable.getModel(); 
DefaultTableModel dtm=(DefaultTableModel)model;
dtm.addRow(new Object[] {"","","","","",""});// TODO add your handling code here:
    }//GEN-LAST:event_insertRowActionPerformed

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_baseActionPerformed

    private void name_combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_combo2ActionPerformed
show_user();        // TODO add your handling code here:
    }//GEN-LAST:event_name_combo2ActionPerformed

    
    
    private void reset(){
        date.setDate(null);
        name_combo2.setSelectedIndex(0);
        agent_dropbox.setSelectedIndex(0);
        sareesParcels.setText("");
        city.setText("");
        formNo.setText("");
        base.setSelectedIndex(0);
        paymentDays.setText("");
        rate.setText("");
    }
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
try{
      if(i_want_to.getSelectedIndex()==5){  
           Connection con=null;
    con=ConnectionManager.getConnection();
    DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
            int row = displayTable.getSelectedRow();
            String date=(String)displayTable.getValueAt(row,0);
            String srno=(String)displayTable.getValueAt(row,2);
            String quality=(String)displayTable.getValueAt(row,1);
            String party=name_combo2.getSelectedItem().toString();
            String sarees=(String)displayTable.getValueAt(row,4);
            String parcels=(String)displayTable.getValueAt(row,5);
            int newParcels=Integer.parseInt(totalParcels.getText())-Integer.parseInt(parcels);
            int newSarees=Integer.parseInt(totalSarees.getText())-Integer.parseInt(sarees);
            String query="delete from order_details where SrNumber=? and Date=? and quality=? and PartyName=?";
            String query2="update order_form set totalSarees=?,totalParcels=? where Date=? and quality=? and PartyName=?";
            PreparedStatement pst=con.prepareStatement(query);
            PreparedStatement pst2=con.prepareStatement(query2);
            pst.setString(1,srno);
            pst.setString(2,date);
            pst.setString(3, quality);
            pst.setString(4, party);
            pst.executeUpdate();
            
            pst2.setInt(1,newSarees);
            pst2.setInt(2,newParcels);
            pst2.setString(3,date);
            pst2.setString(4,quality);
            pst2.setString(5,party);
            pst2.executeUpdate();
            
            new Deleted_record().setVisible(true);
            model.removeRow(row);
      }
      else if(i_want_to.getSelectedIndex()==6){
     Connection con=null;
    con=ConnectionManager.getConnection();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    java.util.Date d3=date.getDate();
    String newDate3=formatter.format(d3);
    String query1="delete from order_form where form_no=? and PartyName=? and Date=?";
    PreparedStatement pst1=con.prepareStatement(query1);
    pst1.setString(1, formNo.getText());
    pst1.setString(2, name_combo2.getSelectedItem().toString());
    pst1.setString(3, newDate3);
    pst1.executeUpdate();
        
    String query2="delete from order_details where PartyName=? and Date=? and Quality=?";
    PreparedStatement pst2=con.prepareStatement(query2);
    
    pst2.setString(1, name_combo2.getSelectedItem().toString());
    pst2.setString(2, newDate3);
    pst2.setString(3,base.getSelectedItem().toString());
    
    //System.out.println("1");
    //System.out.println("2");
    pst2.executeUpdate();
    new Deleted_record().setVisible(true);
      }
      
        
}
catch(Exception e){
            System.out.println(e.getMessage());
        
        }// TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
reset();        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
if(i_want_to.getSelectedIndex()==3){
    show_date_user();
}
else if(i_want_to.getSelectedIndex()==4){
    show_date_quality_user();
}// TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
String quality=base.getSelectedItem().toString();
String party=name_combo2.getSelectedItem().toString();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    java.util.Date d3=date.getDate();
    String newDate3=formatter.format(d3);

        try{  
    
         Connection con=null;
    con=ConnectionManager.getConnection();
    int rows=displayTable.getRowCount();
    int totalSarees=0;
    int totalParcels=0;
for(int row=0;row<rows;row++){
     String sarees=(String)displayTable.getValueAt(row,4);
        String parcels=(String)displayTable.getValueAt(row,5);
        totalSarees=Integer.parseInt(sarees)+totalSarees;
        totalParcels=Integer.parseInt(parcels)+totalParcels;
}
    String query1="update order_form set Agent_name=?,city=?,form_no=?,rate=?,sareesParcels=?,totalSarees=?,totalParcels=?,payment_days=? where Date=? and PartyName=? and Quality=?";
    TableModel model=displayTable.getModel();
   String query2="Update order_details SET Design=?,sarees=?,parcels=? where PartyName=? and Date=? and SrNumber=? and Quality=?";
PreparedStatement pst1=con.prepareStatement(query1);
PreparedStatement pst2=con.prepareStatement(query2);
             
             int row=displayTable.getSelectedRow();
             if(row==-1){
       pst1.setString(1,agent_dropbox.getSelectedItem().toString());
       pst1.setString(2,city.getText());
       pst1.setString(3,formNo.getText());
       pst1.setString(4,rate.getText());
       pst1.setString(5,sareesParcels.getText());
       pst1.setInt(6,totalSarees);
       pst1.setInt(7,totalParcels);
        pst1.setString(8,paymentDays.getText());
       
       pst1.setString(9,newDate3);
       pst1.setString(10,party);
       pst1.setString(11,quality);
       pst1.executeUpdate();
       //System.out.print("update 1");
         new Update_record().setVisible(true);  
             }
             else{
                 pst1.setString(1,agent_dropbox.getSelectedItem().toString());
       pst1.setString(2,city.getText());
       pst1.setString(3,formNo.getText());
       pst1.setString(4,rate.getText());
       pst1.setString(5,sareesParcels.getText());
       pst1.setInt(6,totalSarees);
       pst1.setInt(7,totalParcels);
        pst1.setString(8,paymentDays.getText());
       pst1.setString(9,newDate3);
       pst1.setString(10,party);
       pst1.setString(11,quality);
       pst1.executeUpdate();
       //System.out.print("update 1");
        
       pst2.setString(1,model.getValueAt(row,3).toString().trim());
            pst2.setString(2,model.getValueAt(row,4).toString().trim());
            pst2.setString(3,model.getValueAt(row,5).toString().trim());
            pst2.setString(4,name_combo2.getSelectedItem().toString());
            pst2.setString(5,model.getValueAt(row,0).toString());
            pst2.setString(6,model.getValueAt(row,2).toString().trim());
            pst2.setString(7,model.getValueAt(row,1).toString().trim());
            //pst1.executeUpdate();
            pst2.executeUpdate();
            //System.out.print("update 2");
    
    
    
new Update_record().setVisible(true);
             }
            
    
    }        catch(Exception e){
                    System.out.println(e.getMessage());     
         }           // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
      try{
Connection con=null;
    con=ConnectionManager.getConnection();
java.util.Date d3=date.getDate();
String SelectedBase=name_combo2.getSelectedItem().toString();
String quality=base.getSelectedItem().toString();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
String newDate3=formatter.format(d3);
JasperDesign jd=JRXmlLoader.load("D:\\Astron\\orderforms.jrxml");
String query="select SrNumber,Design,sarees,parcels from order_details where Date='"+newDate3+"' "
+ "and PartyName='"+name_combo2.getSelectedItem().toString()+"' and Quality='"+base.getSelectedItem().toString()+"'";

String query2="select * from order_details od NATURAL JOIN order_form ofrm WHERE (od.PartyName='"+name_combo2.getSelectedItem().toString()+"') "
+ "and (od.Date='"+newDate3+"') and (od.Quality='"+base.getSelectedItem().toString()+"') and(ofrm.PartyName=od.PartyName) "
+ "and (ofrm.Date=od.Date) and (ofrm.Quality=od.Quality)";



//pst2.executeQuery();
JRDesignQuery newQuery=new JRDesignQuery();
newQuery.setText(query2);
jd.setQuery(newQuery);



HashMap<String,Object> para = new HashMap<>();
PreparedStatement pst=con.prepareStatement(query2);
ResultSet rs=pst.executeQuery();



int form_no=0,payment_days=0,sareesParcels=0,totalSarees=0,totalParcels=0;
String agent_name="",rate="",Design="";



//System.out.println(totalSarees);
//System.out.println(totalParcels);
while(rs.next()){
form_no=rs.getInt("form_no");
payment_days=rs.getInt("payment_days");
sareesParcels=rs.getInt("sareesParcels");
agent_name=rs.getString("Agent_name");
rate=rs.getString("rate");
}
//System.out.print(form_no);
para.put("form_no",form_no);
para.put("payment_days",payment_days);
para.put("sareesParcels",sareesParcels);
para.put("Agent_name",agent_name);
para.put("rate",rate);
para.put("PartyName",name_combo2.getSelectedItem().toString());
para.put("Date",date.getDate());
para.put("Quality",base.getSelectedItem().toString());
para.put("totalSarees",totalSarees);
para.put("totalParcels",totalParcels);

List<PdfListTable> pdfTableList = new ArrayList<PdfListTable>();
PreparedStatement pst2=con.prepareStatement(query);
ResultSet rs2=pst2.executeQuery();
while(rs2.next()){
pdfTableList.add(new PdfListTable(rs2.getInt("SrNumber"),rs2.getString("Design"),rs2.getInt("sarees"),rs2.getInt("parcels")));
}



JRBeanCollectionDataSource listToData=new JRBeanCollectionDataSource(pdfTableList);
para.put("ListToTablePdf",listToData);

JasperReport js=JasperCompileManager.compileReport(jd);
JasperPrint jPrint=JasperFillManager.fillReport(js,para,con);
js.setProperty(MaxPagesGovernor.PROPERTY_MAX_PAGES, String.valueOf(1));
JasperViewer.viewReport(jPrint,false);



}
catch(Exception e){
System.out.println(e.getMessage());
}
        
        
    }//GEN-LAST:event_pdfActionPerformed

    private void totalSareesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSareesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSareesActionPerformed
public ArrayList<orderDetails> date_quality_specific_order(){
        ArrayList<orderDetails> orderList3=new ArrayList<orderDetails>();
        DefaultTableModel model=(DefaultTableModel)displayTable.getModel();
    while(model.getRowCount()>0){
        for (int i=0;i<model.getRowCount(); i++){
                model.removeRow(i);
    }
    }
    try{
       Connection con=null;
    con=ConnectionManager.getConnection();
    
    String SelectedBase=name_combo2.getSelectedItem().toString();
    String quality=base.getSelectedItem().toString();
    orderDetails od;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    java.util.Date d3=date.getDate();
    String newDate3=formatter.format(d3);
    //System.out.print(newDate3);
    String query="select * from order_details od NATURAL JOIN order_form ofrm WHERE (od.PartyName=?) and (od.Date=?) and (od.Quality=?) and(ofrm.PartyName=od.PartyName) and (ofrm.Date=od.Date) and (ofrm.Quality=od.Quality)";
    
    PreparedStatement pst=con.prepareStatement(query);
   
    pst.setString(1,SelectedBase);
    pst.setString(2,newDate3);
    pst.setString(3,quality);
    ResultSet rs=pst.executeQuery();
   
    while(rs.next()){
        od=new orderDetails(rs.getString("Date"),rs.getString("SrNumber"),rs.getString("Design"),rs.getString("city"),rs.getString("Quality"),rs.getString("sarees"),rs.getString("parcels"),rs.getString("Agent_name"),rs.getString("form_no"),rs.getString("payment_days"),rs.getString("rate"),rs.getString("sareesParcels"));
        orderList3.add(od);
        }
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    return orderList3;
    }
public void show_date_quality_user(){
        ArrayList<orderDetails> list3=date_quality_specific_order();
        DefaultTableModel model=(DefaultTableModel)displayTable.getModel();
    String[] row=new String[6];
    int total_sarees=0;
    int total_parcels=0;
    for(int i=0;i<list3.size();i++){
                row[0]=list3.get(i).getDate();
                row[1]=list3.get(i).getQuality();
                row[2]=list3.get(i).getSrNo();
            row[3]=list3.get(i).getDesign();
            row[4]=list3.get(i).getSarees();
             row[5]=list3.get(i).getParcels();
             formNo.setText(list3.get(i).getform());
             agent_dropbox.setSelectedItem(list3.get(i).getAgent());
             sareesParcels.setText(list3.get(i).getSareesParcels());
             rate.setText(list3.get(i).getRate());
             paymentDays.setText(list3.get(i).getPayment());
             city.setText(list3.get(i).getCity());
             
             
             model.addRow(row);
        total_sarees=total_sarees+Integer.parseInt(row[4]);
        total_parcels=total_parcels+Integer.parseInt(row[5]);
    }
    totalSarees.setText(String.valueOf(total_sarees));
   totalParcels.setText(String.valueOf(total_parcels));
    }
    
    public ArrayList<order> date_specific_order(){
        ArrayList<order> orderList2=new ArrayList<order>();
        DefaultTableModel model=(DefaultTableModel)displayTable.getModel();
    while(model.getRowCount()>0){
        for (int i=0;i<model.getRowCount(); i++){
                model.removeRow(i);
    }
    }
    try{
        Connection con=null;
    con=ConnectionManager.getConnection();
    String SelectedBase=name_combo2.getSelectedItem().toString();
    order od;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    java.util.Date d3=date.getDate();
    String newDate3=formatter.format(d3);
    
    String query="select * from order_details where PartyName=? and Date=?";
    PreparedStatement pst=con.prepareStatement(query);
    pst.setString(1,SelectedBase);
    pst.setString(2,newDate3);
    ResultSet rs=pst.executeQuery();
    while(rs.next()){
        od=new order(rs.getString("Date"),rs.getString("SrNumber"),rs.getString("Design"),rs.getString("Quality"),rs.getString("sarees"),rs.getString("parcels"));
        orderList2.add(od);
        }
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    return orderList2;
    }
    public void show_date_user(){
        ArrayList<order> list2=date_specific_order();
        DefaultTableModel model=(DefaultTableModel)displayTable.getModel();
    String[] row=new String[6];
    int total_sarees=0;
    int total_parcels=0;
    for(int i=0;i<list2.size();i++){
                row[0]=list2.get(i).getDate();
                row[1]=list2.get(i).getQuality();
                row[2]=list2.get(i).getSrNo();
            row[3]=list2.get(i).getDesign();
            row[4]=list2.get(i).getSarees();
             row[5]=list2.get(i).getParcels();
             
             model.addRow(row);
        total_sarees=total_sarees+Integer.parseInt(row[4]);
        total_parcels=total_parcels+Integer.parseInt(row[5]);
    }
    totalSarees.setText(String.valueOf(total_sarees));
   totalParcels.setText(String.valueOf(total_parcels));
    }
    
    public ArrayList<order> order(){
        ArrayList<order> orderList=new ArrayList<>();
        DefaultTableModel model=(DefaultTableModel)displayTable.getModel();
    while(model.getRowCount()>0){
        for (int i=0;i<model.getRowCount(); i++){
                model.removeRow(i);
    }
    }
    try{
        Connection con=null;
    con=ConnectionManager.getConnection();
    String SelectedBase=name_combo2.getSelectedItem().toString();
    order od;
    String query="select * from order_details where PartyName=?";
    PreparedStatement pst=con.prepareStatement(query);
    pst.setString(1,SelectedBase);
    ResultSet rs=pst.executeQuery();
    while(rs.next()){
        od=new order(rs.getString("Date"),rs.getString("SrNumber"),rs.getString("Design"),rs.getString("Quality"),rs.getString("sarees"),rs.getString("parcels"));
        orderList.add(od);
        }
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    return orderList;
    }
    public void show_user(){
        ArrayList<order> list=order();
        DefaultTableModel model=(DefaultTableModel)displayTable.getModel();
    String[] row=new String[6];
    int total_sarees=0;
    int total_parcels=0;
    for(int i=0;i<list.size();i++){
                row[0]=list.get(i).getDate();
                row[1]=list.get(i).getQuality();
                row[2]=list.get(i).getSrNo();
            row[3]=list.get(i).getDesign();
            row[4]=list.get(i).getSarees();
             row[5]=list.get(i).getParcels();
             
             model.addRow(row);
        total_sarees=total_sarees+Integer.parseInt(row[4]);
        total_parcels=total_parcels+Integer.parseInt(row[5]);
    }
    totalSarees.setText(String.valueOf(total_sarees));
   totalParcels.setText(String.valueOf(total_parcels));
    }
    public void sortarraylist(){
        ArrayList<agents> list =getAgents();
        
        
    }
    
    public ArrayList<agents> getAgents(){
        ArrayList<agents> AgentList=new ArrayList<>();
    DefaultComboBoxModel model = new DefaultComboBoxModel(); 
    model.setSelectedItem("---select agent---");
    try{
         
         
        Connection con=null;
    con=ConnectionManager.getConnection();
    String query="select DISTINCT agent1,agent2,agent3 from party_details";
    agents ag;
    PreparedStatement pst=con.prepareStatement(query);
    ResultSet rs=pst.executeQuery();
    while(rs.next()){
        ag=new agents(rs.getString("agent1"),rs.getString("agent2"),rs.getString("agent3"));
        AgentList.add(ag);
    }
    
    
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
   
 
    return AgentList;
}
public void FillCombo(){
    DefaultComboBoxModel model = new DefaultComboBoxModel(); 
    model.setSelectedItem("---select party---");
    try{
         
         
       Connection con=null;
    con=ConnectionManager.getConnection();
    String sql="select DISTINCT PartyName from party_table";
    PreparedStatement pst=con.prepareStatement(sql);
    ResultSet rs=pst.executeQuery();
    Set<String> partyNames = new HashSet<>();
    while(rs.next()){
            
        String name=rs.getString("PartyName");
        partyNames.add(name);  
    }
    ArrayList<String> partyList = new ArrayList<>(partyNames);
        java.util.Collections.sort(partyList);
        for(String agent: partyList){
            model.addElement(agent);
        }
        name_combo2.setModel(model);
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void FillAgentCombo(){
    DefaultComboBoxModel model = new DefaultComboBoxModel(); 

    model.setSelectedItem("---select agent---");
    try{
        Connection con=null;
    con=ConnectionManager.getConnection();
        String sql="select DISTINCT agent1,agent2,agent3 from party_details";
        PreparedStatement pst=con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        Set<String> agentNames = new HashSet<>();
        while(rs.next()){
            String name1=rs.getString("agent1");
            String name2=rs.getString("agent2");
            String name3=rs.getString("agent3");
            if(name1 == null ? String.valueOf(0) != null : !name1.equals(String.valueOf(0))){
                agentNames.add(name1);
            }
            if(name2 == null ? String.valueOf(0) != null : !name2.equals(String.valueOf(0))){
                agentNames.add(name2);
            }
            if(name3 == null ? String.valueOf(0) != null : !name3.equals(String.valueOf(0))){
                agentNames.add(name3);
            }
        }
        ArrayList<String> agentList = new ArrayList<>(agentNames);
        java.util.Collections.sort(agentList);
//      for(String agent: agentList)
//          System.out.println(agent);
        for(String agent: agentList){
            model.addElement(agent);
        }
        agent_dropbox.setModel(model);
    //con.close();
    //pst.close();
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
    }
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
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agent_dropbox;
    private javax.swing.JComboBox<String> base;
    private javax.swing.JTextArea city;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton delete;
    private javax.swing.JTable displayTable;
    private javax.swing.JTextField formNo;
    private javax.swing.JComboBox<String> i_want_to;
    private javax.swing.JButton insert;
    private javax.swing.JButton insertRow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> name_combo2;
    private javax.swing.JTextField paymentDays;
    private javax.swing.JButton pdf;
    private javax.swing.JTextField rate;
    private javax.swing.JButton reset;
    private javax.swing.JTextField sareesParcels;
    private javax.swing.JButton search;
    private javax.swing.JTextField totalParcels;
    private javax.swing.JTextField totalSarees;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    
}
