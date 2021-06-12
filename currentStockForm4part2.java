

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class currentStockForm4part2 extends javax.swing.JFrame {
static int user_rights_binary=0;
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * Creates new form currentStockForm4part2
     */
    public currentStockForm4part2() {
        initComponents();
        
    setLocation(screenSize.width/2-getWidth()/2, screenSize.height/2-getHeight()/2);
    setVisible(true);
    
        //pack();
        //setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
        jScrollPane1.getViewport().setBackground(new Color(116,121,180));
        base.setEditable(false);
        base.setRenderer(new currentStockForm4part2.Demo(base.getRenderer()));
        TableCellRenderer alteredColorRenderer = new AlterColor();
        brp_table.setDefaultRenderer(Object.class, alteredColorRenderer);
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
       brp_table.setRowHeight(brp_table.getRowHeight()+20);
               

        brp_table.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(headerClr);
        brp_table.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(headerClr);
        brp_table.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(headerClr);
        brp_table.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(headerClr);
        brp_table.getTableHeader().getColumnModel().getColumn(4).setHeaderRenderer(headerClr);
        JTableHeader tableHeader = brp_table.getTableHeader();
        tableHeader.setVisible(true);
        tableHeader.setFont(new Font("Copperplate Gothic Bold",1, 24));
        tableHeader.setOpaque(false); 
        tableHeader.setForeground(new Color(255,255,255));
        TableColumn tc1=brp_table.getColumnModel().getColumn(0);
        tc1.setPreferredWidth(150);
        TableColumn tc2=brp_table.getColumnModel().getColumn(1);
        tc2.setPreferredWidth(30);
        TableColumn tc3=brp_table.getColumnModel().getColumn(2);
        tc3.setPreferredWidth(30);
        TableColumn tc4=brp_table.getColumnModel().getColumn(3);
        tc4.setPreferredWidth(30);
        TableColumn tc5=brp_table.getColumnModel().getColumn(4);
        tc5.setPreferredWidth(60);
    }
    public ArrayList<BRP> BRP(){
    ArrayList<BRP> brpList=new ArrayList<>();
    DefaultTableModel model=(DefaultTableModel)brp_table.getModel();
    while(model.getRowCount()>0){
        for (int i=0;i<model.getRowCount(); i++){
                model.removeRow(i);
    }
    }
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con;
    con = DriverManager.getConnection(
            "jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_astron","u159657273_user1","Vaishnavi$2801");
    String SelectedBase=base.getSelectedItem().toString();
    String query1="";
    switch (SelectedBase) {
        case "Balatan Butta Rich Pallu":
        query1="SELECT * from balatan_rich_pallu";
        break;
        case "Raw Slub Butta Rich Pallu":
        query1="SELECT * from raw_rich_pallu";
        break;
        case "Balatan Butta Chit Pallu":
        query1="SELECT * from balatan_chit_pallu";
        break;
         case "Raw Slub Butta Chit Pallu":
        query1="SELECT * from raw_chit_pallu";
        break;
         case "Balatan Embose Chit Pallu":
        query1="SELECT * from embose_chit_pallu";
        break;
         case "Raw Slub all Over Pallu":
        query1="SELECT * from all_over_butta";
        break;
         default:
             break;
    }
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query1);
    BRP brp;
    while(rs.next()){
        brp=new BRP(rs.getString("Design"),rs.getString("RMS"),rs.getString("GR"),rs.getString("Mill"),rs.getString("Total"));
        brpList.add(brp);
    }
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return brpList;
    
}
    public void show_user(){
    ArrayList<BRP> list= BRP();
    DefaultTableModel model=(DefaultTableModel)brp_table.getModel();
    String[] row=new String[5];
     int rmssum=0,grsum=0,millsum=0,finalsum=0;
    for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getdesign();
        row[1]=list.get(i).getrms();
        row[2]=list.get(i).getgr();
        row[3]=list.get(i).getmill();
        row[4]=list.get(i).gettotal();
        model.addRow(row);
        rmssum=rmssum+Integer.parseInt( row[1]);
        grsum=grsum+Integer.parseInt( row[2]);
        millsum=millsum+Integer.parseInt( row[3]);
        finalsum=finalsum+Integer.parseInt( row[4]);
    }
    rmstotal.setText(String.valueOf(rmssum));
        grtotal.setText(String.valueOf(grsum));
        milltotal.setText(String.valueOf(millsum));
        finaltotal.setText(String.valueOf(finalsum));
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
        base = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        brp_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        rmstotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        milltotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        finaltotal = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        update_design_button = new javax.swing.JButton();
        update_design = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("Software_logo.jpeg")).getImage());

        jPanel1.setBackground(new java.awt.Color(31, 35, 71));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Display");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(411, 13, 205, 54);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Base:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 100, 100, 28);

        base.setBackground(new java.awt.Color(249, 173, 129));
        base.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        base.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Balatan Butta Rich Pallu", "Raw Slub Butta Rich Pallu", "Balatan Butta Chit Pallu", "Raw Slub Butta Chit Pallu", "Balatan Embose Chit Pallu", "Raw Slub all Over Butta" }));
        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });
        jPanel1.add(base);
        base.setBounds(370, 100, 395, 34);

        brp_table.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        brp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESIGN", "RMS", "GR", "MILL", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(brp_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 180, 575, 493);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RMS Total:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(660, 200, 150, 28);

        rmstotal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        rmstotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmstotalActionPerformed(evt);
            }
        });
        jPanel1.add(rmstotal);
        rmstotal.setBounds(830, 200, 144, 34);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GR Total:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(670, 260, 131, 28);

        grtotal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(grtotal);
        grtotal.setBounds(830, 260, 144, 34);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mill Total:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(660, 330, 149, 28);

        milltotal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        milltotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milltotalActionPerformed(evt);
            }
        });
        jPanel1.add(milltotal);
        milltotal.setBounds(830, 330, 144, 34);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("grand total:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(640, 400, 180, 28);

        finaltotal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(finaltotal);
        finaltotal.setBounds(830, 400, 144, 34);

        back.setBackground(new java.awt.Color(255, 138, 115));
        back.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(680, 470, 229, 37);

        update_design_button.setBackground(new java.awt.Color(255, 138, 115));
        update_design_button.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        update_design_button.setText("Update Design");
        update_design_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_design_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(update_design_button);
        update_design_button.setBounds(680, 530, 229, 37);

        update_design.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jPanel1.add(update_design);
        update_design.setBounds(680, 590, 229, 34);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rmstotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmstotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmstotalActionPerformed

    private void milltotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milltotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_milltotalActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
 new currentStockForm3().setVisible(true);
 dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseActionPerformed
 show_user();        // TODO add your handling code here:
    }//GEN-LAST:event_baseActionPerformed

    private void update_design_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_design_buttonActionPerformed
if(update_design.getText().trim().isEmpty()){
new AlertBox_FieldEmpty().setVisible(true);}
else if(update_design.getText()!=""){
    
    try{
             Class.forName("com.mysql.cj.jdbc.Driver");  
             Connection con=DriverManager.getConnection("jdbc:mysql://sql452.main-hosting.eu:3306/u159657273_astron","u159657273_user1","Vaishnavi$2801");  
            DefaultTableModel model = (DefaultTableModel) brp_table.getModel();
            String design, rms, gr, mill, total, selectedBase, query=null, deleteQuery;
            PreparedStatement pst = null;
            int row = brp_table.getSelectedRow();
            design = model.getValueAt(row, 0).toString();
            rms = model.getValueAt(row, 1).toString();
            gr = model.getValueAt(row, 2).toString();
            mill = model.getValueAt(row, 3).toString();
            total = model.getValueAt(row, 4).toString();
            selectedBase = base.getSelectedItem().toString();
            switch(selectedBase){
                case "Balatan Butta Rich Pallu":
                    deleteQuery ="DELETE FROM balatan_rich_pallu WHERE `Design`=?";
                    pst = con.prepareStatement(deleteQuery);
                    pst.setString(1,design.toUpperCase());
                    pst.executeUpdate();
                    break;
                case "Raw Slub Butta Rich Pallu":
                    deleteQuery = "DELETE FROM raw_rich_pallu WHERE Design=?";
                    pst = con.prepareStatement(deleteQuery);
                    pst.setString(1,design.toUpperCase());
                    pst.executeUpdate();
                    break;
                case "Balatan Butta Chit Pallu":
                    deleteQuery = "DELETE FROM balatan_chit_pallu WHERE Design=?";
                    pst = con.prepareStatement(deleteQuery);
                    pst.setString(1,design.toUpperCase());
                    pst.executeUpdate();
                    break;
                case "Raw Slub Butta Chit Pallu":
                    deleteQuery = "DELETE FROM raw_chit_pallu WHERE Design=?";
                    pst = con.prepareStatement(deleteQuery);
                    pst.setString(1,design.toUpperCase());
                    pst.executeUpdate();
                    break;
                case "Balatan Embose Chit Pallu":
                    deleteQuery = "DELETE FROM embose_chit_pallu WHERE Design=?";
                    pst = con.prepareStatement(deleteQuery);
                    pst.setString(1,design.toUpperCase());
                    pst.executeUpdate();
                    break;
                case "Raw Slub all over Butta":
                    deleteQuery ="DELETE FROM all_over_butta WHERE Design=?";
                    pst = con.prepareStatement(deleteQuery);
                    pst.setString(1,design.toUpperCase());
                    pst.executeUpdate();
                    break;
            }
            
            switch(selectedBase){
                case "Balatan Butta Rich Pallu":
                    query="insert into balatan_rich_pallu(Design, RMS, GR, MILL, TOTAL) values(?,?,?,?,?)";
                    break;
                case "Raw Slub Butta Rich Pallu":
                    query="insert into raw_rich_pallu`Design, RMS, GR, MILL, TOTAL) values(?,?,?,?,?)";
                    break;
                case "Balatan Butta Chit Pallu":
                    query="insert into balatan_chit_pallu(Design, RMS, GR, MILL, TOTAL) values(?,?,?,?,?)";
                    break;
                case "Raw Slub Butta Chit Pallu":
                    query="insert into raw_chit_pallu(Design, RMS, GR, MILL, TOTAL) values(?,?,?,?,?)";
                    break;
                case "Balatan Embose Chit Pallu":
                    query="insert into embose_chit_pallu(Design, RMS, GR, MILL, TOTAL) values(?,?,?,?,?)";
                    break;
                case "Raw Slub all over Butta":
                    query="insert into all_over_butta(Design, RMS, GR, MILL, TOTAL) values(?,?,?,?,?)";
                    break;
            }
            pst = con.prepareStatement(query);
            pst.setString(1, update_design.getText().trim().toUpperCase());
            pst.setString(2, rms);
            pst.setString(3, gr);
            pst.setString(4, mill);
            pst.setString(5, total);
            pst.executeUpdate();
            update_design.setText("");
            show_user();
            new Update_record().setVisible(true);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }     


}
// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_update_design_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(currentStockForm4part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currentStockForm4part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currentStockForm4part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currentStockForm4part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new currentStockForm4part2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> base;
    private javax.swing.JTable brp_table;
    private javax.swing.JTextField finaltotal;
    private javax.swing.JTextField grtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField milltotal;
    private javax.swing.JTextField rmstotal;
    private javax.swing.JTextField update_design;
    private javax.swing.JButton update_design_button;
    // End of variables declaration//GEN-END:variables
}

class AlterColor  extends JTable implements TableCellRenderer{
    public static final DefaultTableCellRenderer def_renderer = new DefaultTableCellRenderer();
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
            //Component c=super.prepareRenderer(ren,row,col);
           Component c = def_renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
           c.setBackground(new Color(116, 121, 180));
            if(row%2==0 && !isCellSelected(row,col)){
                c.setBackground(new Color(239, 40, 83));
            }
            else if(row%2==1 && !isCellSelected(row,col)){
                c.setBackground(new Color(241, 136, 147));
            }
            
            return c;
        }  
 }
