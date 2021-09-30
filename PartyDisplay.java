
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class PartyDisplay extends javax.swing.JFrame {
ArrayList agentnames=new ArrayList();
    /**
     * Creates new form PartyDisplay
     */
    public PartyDisplay() {
        initComponents();
        FillCombo();
        //DatabaseName2();
        namecombo.setRenderer(new PartyDisplay.Demo(namecombo.getRenderer()));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
private void FillCombo(){
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
        namecombo.setModel(model);
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
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
public void reset(){
    party_name.setText("");  

address.setText("");
gstno.setText("");
owner1.setText("");
o1_m1.setText("");
o1_m2.setText("");
owner2.setText("");
o2_m1.setText("");
o2_m2.setText("");
a1.setText("");
a2.setText("");
a3.setText("");
email1.setText("");
email2.setText("");
website1.setText("");
website2.setText("");
    
}
public void show_user() {
      try{
         
         
        Connection con=null;
    con=ConnectionManager.getConnection();
    String selectedItem=namecombo.getSelectedItem().toString();
    int partyno=0;
    String sql="SELECT Party_No from party_table where PartyName=?";
    PreparedStatement pst=con.prepareStatement(sql);
    pst.setString(1,selectedItem);
    ResultSet rs=pst.executeQuery();
    while(rs.next()){
        partyno=rs.getInt(1);
    }
    String sql1="SELECT Address,GSTNo,owner1,o1_m1,o1_m2,owner2,o2_m1,o2_m2,agent1,agent2,agent3,email1,email2,website1,website2 from party_details where Party_No=?";
    PreparedStatement pst1=con.prepareStatement(sql1);
    pst1.setInt(1, partyno);
    ResultSet rs1=pst1.executeQuery();
    if(rs1.next()){
        address.setText(rs1.getString("Address"));
        gstno.setText(rs1.getString("GSTNo"));
        owner1.setText(rs1.getString("owner1"));
        o1_m1.setText(rs1.getString("o1_m1"));
        if(rs1.getString("o1_m2")==null||rs1.getString("o1_m2").equals("")){
            o1_m2.setText("");
        }
        else{
            o1_m2.setText(rs1.getString("o1_m2"));
        }
        if(rs1.getString("owner2")==null||rs1.getString("owner2").equals("")){
            owner2.setText("");
        }
        else{
            owner2.setText(rs1.getString("owner2"));
        }
        if(rs1.getString("o2_m1")==null||rs1.getString("o2_m1").equals("")){
            o2_m1.setText("");
        }
        else{
            o2_m1.setText(rs1.getString("o2_m1"));
        }
        if(rs1.getString("o2_m2")==null||rs1.getString("o2_m2").equals("")){
            o2_m2.setText("");
        }
        else{
            o2_m2.setText(rs1.getString("o2_m2"));
        }
        a1.setText(rs1.getString("agent1"));
        if(rs1.getString("agent2")==null||rs1.getString("agent2").equals("")){
            a2.setText("");
        }
        else{
            a2.setText(rs1.getString("agent2"));
        }
        if(rs1.getString("agent3")==null||rs1.getString("agent3").equals("")){
            a3.setText("");
        }
        else{
            a3.setText(rs1.getString("agent3"));
        }
        if(rs1.getString("email1")==null||rs1.getString("email1").equals("")){
            email1.setText("");
        }
        else{
            email1.setText(rs1.getString("email1"));
        }
        if(rs1.getString("email2")==null||rs1.getString("email2").equals("")){
            email2.setText("");
        }
        else{
            email2.setText(rs1.getString("email2"));
        }
        if(rs1.getString("website1")==null||rs1.getString("website1").equals("")){
            website1.setText("");
        }
        else{
            website1.setText(rs1.getString("website1"));
        }
        if(rs1.getString("website2")==null||rs1.getString("website2").equals("")){
            website2.setText("");
        }
        else{
            website2.setText(rs1.getString("website2"));
        }
        
    }
    
      }
      catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
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
        party_name = new javax.swing.JTextField();
        namecombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        gstno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        owner1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        o1_m1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        o1_m2 = new javax.swing.JTextField();
        owner2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        o2_m1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        o2_m2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        insert_details = new javax.swing.JButton();
        update_party = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        insert_name = new javax.swing.JButton();
        update_details = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        website1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        website2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 35, 71));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Party Name:");

        party_name.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        party_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                party_nameActionPerformed(evt);
            }
        });

        namecombo.setBackground(new java.awt.Color(249, 173, 129));
        namecombo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        namecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select party---" }));
        namecombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namecomboMouseClicked(evt);
            }
        });
        namecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namecomboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address:");

        address.setColumns(20);
        address.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        address.setRows(5);
        address.setMaximumSize(new java.awt.Dimension(40, 50));
        jScrollPane1.setViewportView(address);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GST Number:");

        gstno.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Owner1:");

        owner1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Owner2:");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile Number 1:");

        o1_m1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mobile Number 2:");

        o1_m2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        o1_m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1_m2ActionPerformed(evt);
            }
        });

        owner2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mobile Number 1:");

        o2_m1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile Number 2:");

        o2_m2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agents:");

        a1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
        });
        a1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                a1KeyPressed(evt);
            }
        });

        a3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
        });
        a3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                a3KeyPressed(evt);
            }
        });

        a2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
        });
        a2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                a2KeyPressed(evt);
            }
        });

        insert_details.setBackground(new java.awt.Color(255, 138, 115));
        insert_details.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        insert_details.setText("Insert details");
        insert_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_detailsActionPerformed(evt);
            }
        });

        update_party.setBackground(new java.awt.Color(255, 138, 115));
        update_party.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        update_party.setText("Update party");
        update_party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_partyActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 138, 115));
        delete.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        delete.setText("Delete party");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 138, 115));
        reset.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        insert_name.setBackground(new java.awt.Color(255, 138, 115));
        insert_name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        insert_name.setText("Insert Party");
        insert_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_nameActionPerformed(evt);
            }
        });

        update_details.setBackground(new java.awt.Color(255, 138, 115));
        update_details.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        update_details.setText("Update details");
        update_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_detailsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("email 1:");

        email1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("email 2:");

        email2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("website1:");

        website1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("website2:");

        website2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gstno)
                                    .addComponent(owner2)
                                    .addComponent(owner1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(43, 43, 43)
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(o1_m2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(o2_m1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(o1_m1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(o2_m2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18)
                                            .addComponent(website1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(40, 40, 40)
                                            .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(18, 18, 18)
                                            .addComponent(website2)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(43, 43, 43)
                                        .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(910, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namecombo, 0, 220, Short.MAX_VALUE)
                                    .addComponent(party_name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 263, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insert_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insert_details, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(update_details)
                                    .addComponent(update_party, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(819, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(party_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_party)
                            .addComponent(delete)
                            .addComponent(insert_name))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset)
                        .addComponent(update_details))
                    .addComponent(insert_details))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gstno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(owner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(o1_m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(o1_m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(website1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(owner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(o2_m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(o2_m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(website2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void party_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_party_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_party_nameActionPerformed

    private void update_partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_partyActionPerformed
if(party_name.getText().isEmpty()){
    new AlertBox_FieldEmpty().setVisible(true);
}
else{
    
    try{
    Connection con=null;
    con=ConnectionManager.getConnection();
    String nameOfParty= party_name.getText().trim().toUpperCase();
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
    String selectedItem = (String) namecombo.getSelectedItem();
    String sql1="SELECT Party_No from party_table WHERE PartyName=?";
    PreparedStatement pst1=con.prepareStatement(sql1);
    pst1.setString(1,selectedItem);
    ResultSet rs1=pst1.executeQuery();
    if (rs1.next()){
        int partyno=rs1.getInt(1);
        
                    String sql2="UPDATE party_table SET PartyName=? WHERE Party_No=? ";
                        PreparedStatement pst2=con.prepareStatement(sql2);
                    pst2.setString(1,party_name.getText().trim().toUpperCase());
                    pst2.setInt(2,partyno);
                    String sql3="UPDATE collection1 SET PartyName=? WHERE Party_No=?";
                    PreparedStatement pst3=con.prepareStatement(sql3);
                    pst3.setString(1,party_name.getText().trim().toUpperCase());
                    pst3.setInt(2,partyno);
                    pst2.executeUpdate();
                    pst3.executeUpdate();
                    namecombo.removeItem(selectedItem);
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

}          // TODO add your handling code here:
    }//GEN-LAST:event_update_partyActionPerformed

    private void insert_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_detailsActionPerformed
if(party_name.getText().isEmpty()){
    new AlertBox_FieldEmpty().setVisible(true);
}
/*else if(!Pattern.matches("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[1-9A-Z]{1}$",gstno.getText())){
    new Invalid_Format().setVisible(true);
    gstno.setText("");
    gstno.grabFocus();
}*/
/*else if(!Pattern.matches("^[+91]{3}[7-9]{1}[0-9]{9}$",o1_m1.getText())){
        new Invalid_Format().setVisible(true);
    o1_m1.setText("");
    o1_m1.grabFocus();
    }*/

else{
    try{
        Connection con=null;
    con=ConnectionManager.getConnection();
        String empty_text1,empty_text2,empty_text3,empty_text4,empty_text5,empty_text6,empty_text0,empty_text,empty_text7,empty_text8,empty_text9,empty_text10,empty_text11,empty_text12,empty_text13;
         String sql="SELECT Party_No from party_table WHERE PartyName=?";
    PreparedStatement pst0=con.prepareStatement(sql);
    pst0.setString(1,party_name.getText().trim().toUpperCase());
    ResultSet rs0=pst0.executeQuery();
    int partyno=0;
    if(rs0.next()){
        partyno=rs0.getInt(1);
    }
    System.out.println(partyno);
    String query="insert into party_details(Party_No,Address,GSTNo,owner1,o1_m1,o1_m2,owner2,o2_m1,o2_m2,agent1,agent2,agent3,email1,email2,website1,website2) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement pst=con.prepareStatement(query);
    pst.setInt(1,partyno);
    if(address.getText()==null || address.getText().equals("")){
        empty_text0=String.valueOf(0);
    }
    else{
        empty_text0=address.getText().toUpperCase();
    }
    if(gstno.getText()==null || gstno.getText().equals("")){
        empty_text=String.valueOf(0);
    }
    else{
        empty_text=gstno.getText().toUpperCase();
    }
    pst.setString(2,empty_text0);
    pst.setString(3,empty_text);
    if(owner1.getText()==null || owner1.getText().equals("")){
        empty_text7=String.valueOf(0);
    }
    else{
        empty_text7=owner1.getText().toUpperCase();
    }
    pst.setString(4,empty_text7);
    if(o1_m1.getText()==null || o1_m1.getText().equals("")){
        empty_text8=String.valueOf(0);
    }
    else{
        empty_text8=o1_m1.getText().toUpperCase();
    }
    pst.setString(5,empty_text8);
    if(o1_m2.getText()== null || o1_m2.getText().equals("")){
        empty_text1=String.valueOf(0);
    }
    else{
        empty_text1=o1_m2.getText();
    }
    pst.setString(6,empty_text1);
    if(owner2.getText()== null || owner2.getText().equals("")){
        empty_text2=String.valueOf(0);
    }
    else{
        empty_text2=owner2.getText().toUpperCase();
    }
    pst.setString(7,empty_text2);
    if(o2_m1.getText()== null || o2_m1.getText().equals("")){
        empty_text3=String.valueOf(0);
    }
    else{
        empty_text3=o2_m1.getText();
    }
    pst.setString(8,empty_text3);
    if(o2_m2.getText()== null || o2_m2.getText().equals("")){
        empty_text4=String.valueOf(0);
    }
    else{
        empty_text4=o2_m2.getText();
    }
    pst.setString(9,empty_text4);
    if(a1.getText()==null || a1.getText().equals("")){
        empty_text9=String.valueOf(0);
    }
    else{
        empty_text9=a1.getText().toUpperCase();
    }
    pst.setString(10,empty_text9);
    if(a2.getText()== null || a2.getText().equals("")){
        empty_text5=String.valueOf(0);
    }
    else{
        empty_text5=a2.getText().toUpperCase();
    }
    pst.setString(11,empty_text5);
    if(a3.getText()== null || a3.getText().equals("")){
        empty_text6=String.valueOf(0);
    }
    else{
        empty_text6=a3.getText().toUpperCase();
    }
    if(email1.getText()== null || email1.getText().equals("")){
        empty_text10=String.valueOf(0);
    }
    else{
        empty_text10=email1.getText().toUpperCase();
    }
    if(email2.getText()== null || email2.getText().equals("")){
        empty_text11=String.valueOf(0);
    }
    else{
        empty_text11=email2.getText().toUpperCase();
    }
    if(website1.getText()== null || website1.getText().equals("")){
        empty_text12=String.valueOf(0);
    }
    else{
        empty_text12=website1.getText().toUpperCase();
    }
    if(website2.getText()== null || website2.getText().equals("")){
        empty_text13=String.valueOf(0);
    }
    else{
        empty_text13=website2.getText().toUpperCase();
    }
    pst.setString(12,empty_text6);
    pst.setString(13,empty_text10);
    pst.setString(14,empty_text11);
    pst.setString(15,empty_text12);
    pst.setString(16,empty_text13);
    
    pst.executeUpdate();
    new InsertedSuccessfully().setVisible(true);
    reset();
    }
     catch (SQLException ex) { 
        Logger.getLogger(PartyDisplay.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PartyDisplay.class.getName()).log(Level.SEVERE, null, ex);
    } 
}
// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_insert_detailsActionPerformed

    private void insert_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_nameActionPerformed
if(party_name.getText().isEmpty()){
                new PartyName_FieldEmpty().setVisible(true);
                }
        else{
             
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=null;
    con=ConnectionManager.getConnection();
    String nameOfParty= party_name.getText().trim().toUpperCase();
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
    pst1.setString(1,party_name.getText().toUpperCase());
        pst1.executeUpdate();
        FillCombo();
            new InsertedSuccessfully().setVisible(true);
    
    
    }
        else{
        new PrartyName_Repeat().setVisible(true);
    }
            
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
             
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_insert_nameActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
try{
    if(party_name.getText().isEmpty()){
        new AlertBox_FieldEmpty().setVisible(true);
    }
    else{
        
            Connection con=null;
    con=ConnectionManager.getConnection();
    int partyno;
            String query2="select Party_No from party_table where PartyName=?";
            //PreparedStatement pst1 = con.prepareStatement(query1);
            PreparedStatement pst2 = con.prepareStatement(query2);
            //pst1.setString(1,name_combo2.getSelectedItem().toString());
            pst2.setString(1,party_name.getText().trim().toUpperCase());
            Object selectedItem = namecombo.getSelectedItem();
            //ResultSet rs1 = pst1.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            if(rs2.next()){
                 partyno=rs2.getInt(1);
                 String sql3="DELETE from party_details WHERE Party_No=?";
                    PreparedStatement pst3=con.prepareStatement(sql3);
                    pst3.setInt(1,partyno);
                    pst3.executeUpdate();
                    String sql1="DELETE from collection1 WHERE Party_No=?";
                    PreparedStatement pst1=con.prepareStatement(sql1);
                    pst1.setInt(1,partyno);
                    pst1.executeUpdate();
                    String sql="DELETE from party_table WHERE Party_No=?";
                        PreparedStatement pst=con.prepareStatement(sql);
                    pst.setInt(1,partyno);
                    pst.executeUpdate();
                    
                    
                    
            }
            
            namecombo.removeItem(selectedItem);
            party_name.setText("");
            new Deleted_record().setVisible(true);
            //reset();
            FillCombo();
        
        
    }
    
}
        catch(Exception e){
            System.out.println(e.getMessage());
        }          // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void update_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_detailsActionPerformed
if(party_name.getText().isEmpty()){
    new AlertBox_FieldEmpty().setVisible(true);
}
/*else if(!Pattern.matches("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[1-9A-Z]{1}$",gstno.getText())){
    new Invalid_Format().setVisible(true);
    gstno.setText("");
    gstno.grabFocus();
}*/
/*else if(!Pattern.matches("^[+91]{3}[7-9]{1}[0-9]{9}$",o1_m1.getText())){
        new Invalid_Format().setVisible(true);
    o1_m1.setText("");
    o1_m1.grabFocus();
    }
else if((o1_m2.getText() == null ? String.valueOf(0) != null : !o1_m2.getText().equals(String.valueOf(0)))||(o2_m1.getText() == null ? String.valueOf(0) != null : !o2_m1.getText().equals(String.valueOf(0)))||(o2_m2.getText() == null ? String.valueOf(0) != null : !o2_m2.getText().equals(String.valueOf(0)))){
    if(!Pattern.matches("^[+91]{3}[7-9]{1}[0-9]{9}$",o1_m2.getText())){
        new Invalid_Format().setVisible(true);
    o1_m2.setText("");
    o1_m2.grabFocus();
    }
    if(!Pattern.matches("^[+91]{3}[7-9]{1}[0-9]{9}$",o2_m1.getText())){
        new Invalid_Format().setVisible(true);
    o2_m1.setText("");
    o2_m1.grabFocus();
    }
    if(!Pattern.matches("^[+91]{3}[7-9]{1}[0-9]{9}$",o2_m2.getText())){
        new Invalid_Format().setVisible(true);
    o2_m2.setText("");
    o2_m2.grabFocus();
    }
    
}*/
else{
    try{
        Connection con=null;
    con=ConnectionManager.getConnection();
        String empty_text1,empty_text2,empty_text3,empty_text4,empty_text5,empty_text6,empty_text0,empty_text,empty_text7,empty_text8,empty_text9,empty_text10,empty_text11,empty_text12,empty_text13;
         String sql="SELECT Party_No from party_table WHERE PartyName=?";
    PreparedStatement pst0=con.prepareStatement(sql);
    pst0.setString(1,party_name.getText().trim().toUpperCase());
    ResultSet rs0=pst0.executeQuery();
    int partyno=0;
    if(rs0.next()){
        partyno=rs0.getInt(1);
    }
    System.out.println(partyno);
    String query="UPDATE party_details SET Address=?,GSTNo=?,owner1=?,o1_m1=?,o1_m2=?,owner2=?,o2_m1=?,o2_m2=?,agent1=?,agent2=?,agent3=?,email1=?,email2=?,website1=?,website2=? where Party_No=?";
    PreparedStatement pst=con.prepareStatement(query);
     if(address.getText()==null || address.getText().equals("")){
        empty_text0=String.valueOf(0);
    }
    else{
        empty_text0=address.getText().toUpperCase();
    }
    pst.setString(1,empty_text0);
    if(gstno.getText()==null || gstno.getText().equals("")){
        empty_text=String.valueOf(0);
    }
    else{
        empty_text=gstno.getText().toUpperCase();
    }
    pst.setString(2,empty_text);
    if(owner1.getText()==null || owner1.getText().equals("")){
        empty_text7=String.valueOf(0);
    }
    else{
        empty_text7=owner1.getText().toUpperCase();
    }
    
    if(o1_m1.getText()==null || o1_m1.getText().equals("")){
        empty_text8=String.valueOf(0);
    }
    else{
        empty_text8=o1_m1.getText().toUpperCase();
    }
    
    pst.setString(3,empty_text7);
    pst.setString(4,empty_text8);
    if(o1_m2.getText()== null || o1_m2.getText().equals("")){
        empty_text1=String.valueOf(0);
    }
    else{
        empty_text1=o1_m2.getText();
    }
    pst.setString(5,empty_text1);
    if(owner2.getText()== null || owner2.getText().equals("")){
        empty_text2=String.valueOf(0);
    }
    else{
        empty_text2=owner2.getText().toUpperCase();
    }
    pst.setString(6,empty_text2);
    if(o2_m1.getText()== null || o2_m1.getText().equals("")){
        empty_text3=String.valueOf(0);
    }
    else{
        empty_text3=o2_m1.getText();
    }
    pst.setString(7,empty_text3);
    if(o2_m2.getText()== null || o2_m2.getText().equals("")){
        empty_text4=String.valueOf(0);
    }
    else{
        empty_text4=o2_m2.getText();
    }
    pst.setString(8,empty_text4);
    if(a1.getText()==null || a1.getText().equals("")){
        empty_text9=String.valueOf(0);
    }
    else{
        empty_text9=a1.getText().toUpperCase();
    }
    pst.setString(9,empty_text9);
    if(a2.getText()== null || a2.getText().equals("")){
        empty_text5=String.valueOf(0);
    }
    else{
        empty_text5=a2.getText().toUpperCase();
    }
    pst.setString(10,empty_text5);
    if(a3.getText()== null || a3.getText().equals("")){
        empty_text6=String.valueOf(0);
    }
    else{
        empty_text6=a3.getText().toUpperCase();
    }
    pst.setString(11,empty_text6);
    if(email1.getText()== null || email1.getText().equals("")){
        empty_text10=String.valueOf(0);
    }
    else{
        empty_text10=email1.getText().toUpperCase();
    }
    pst.setString(12,empty_text10);
    if(email2.getText()== null || email2.getText().equals("")){
        empty_text11=String.valueOf(0);
    }
    else{
        empty_text11=email2.getText().toUpperCase();
    }
    pst.setString(13,empty_text11);
    if(website1.getText()== null || website1.getText().equals("")){
        empty_text12=String.valueOf(0);
    }
    else{
        empty_text12=website1.getText().toUpperCase();
    }
    pst.setString(14,empty_text12);
    if(website2.getText()== null || website2.getText().equals("")){
        empty_text13=String.valueOf(0);
    }
    else{
        empty_text13=website2.getText().toUpperCase();
    }
    pst.setString(15,empty_text13);
    pst.setInt(16,partyno);
    pst.executeUpdate();
    new Update_record().setVisible(true);
    reset();
    }
     catch (SQLException ex) { 
        Logger.getLogger(PartyDisplay.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PartyDisplay.class.getName()).log(Level.SEVERE, null, ex);
    } 
}        // TODO add your handling code here:
    }//GEN-LAST:event_update_detailsActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
reset();// TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void namecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namecomboActionPerformed
//FillCombo();
if(namecombo.getSelectedItem().toString().isEmpty()==false){
        String selectedValue=namecombo.getSelectedItem().toString();
        party_name.setText(selectedValue);
        show_user();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_namecomboActionPerformed

    private void namecomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namecomboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_namecomboMouseClicked

    private void o1_m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1_m2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o1_m2ActionPerformed

    private void a1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a1KeyPressed
switch(evt.getKeyCode()){
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                a1.setText(a1.getText().toUpperCase());
                break;
            default:
                EventQueue.invokeLater(new Runnable(){
                    @Override
            public void run() {
                String txt=a1.getText().toUpperCase();
                autocomplete(txt);//To change body of generated methods, choose Tools | Templates.
            }
                    
                });
        }              // TODO add your handling code here:
    }//GEN-LAST:event_a1KeyPressed

    private void a2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a2KeyPressed
switch(evt.getKeyCode()){
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                a2.setText(a2.getText().toUpperCase());
                break;
            default:
                EventQueue.invokeLater(new Runnable(){
                    @Override
            public void run() {
                String txt=a2.getText().toUpperCase();
                autocomplete2(txt);//To change body of generated methods, choose Tools | Templates.
            }
                    
                });
        }              // TODO add your handling code here:
    }//GEN-LAST:event_a2KeyPressed

    private void a3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a3KeyPressed
switch(evt.getKeyCode()){
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                a3.setText(a3.getText().toUpperCase());
                break;
            default:
                EventQueue.invokeLater(new Runnable(){
                    @Override
            public void run() {
                String txt=a3.getText().toUpperCase();
                autocomplete3(txt);//To change body of generated methods, choose Tools | Templates.
            }
                    
                });
        }              // TODO add your handling code here:
    }//GEN-LAST:event_a3KeyPressed

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
DatabaseName2();        // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseClicked

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
DatabaseName2();        // TODO add your handling code here:
    }//GEN-LAST:event_a2MouseClicked

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked
DatabaseName2();        // TODO add your handling code here:
    }//GEN-LAST:event_a3MouseClicked

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
            java.util.logging.Logger.getLogger(PartyDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartyDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartyDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartyDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartyDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextArea address;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField gstno;
    private javax.swing.JButton insert_details;
    private javax.swing.JButton insert_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JComboBox<String> namecombo;
    private javax.swing.JTextField o1_m1;
    private javax.swing.JTextField o1_m2;
    private javax.swing.JTextField o2_m1;
    private javax.swing.JTextField o2_m2;
    private javax.swing.JTextField owner1;
    private javax.swing.JTextField owner2;
    private javax.swing.JTextField party_name;
    private javax.swing.JButton reset;
    private javax.swing.JButton update_details;
    private javax.swing.JButton update_party;
    private javax.swing.JTextField website1;
    private javax.swing.JTextField website2;
    // End of variables declaration//GEN-END:variables
public void DatabaseName2(){
    try{
        
       Connection con=null;
    con=ConnectionManager.getConnection();
    String query="select agent1,agent2,agent3 from party_details ";
    java.sql.Statement pst=con.createStatement();
    ResultSet rs=pst.executeQuery(query);
    while(rs.next()){
        String name1=rs.getString("agent1");
        String name2=rs.getString("agent2");
        String name3=rs.getString("agent3");
         if(name1 == null ? String.valueOf(0) != null : !name1.equals(String.valueOf(0))){
        agentnames.add(name1);
        }
         if(name2 == null ? String.valueOf(0) != null : !name2.equals(String.valueOf(0))){
        agentnames.add(name2);
        }
         if(name3 == null ? String.valueOf(0) != null : !name3.equals(String.valueOf(0))){
        agentnames.add(name3);
        }
    }
    }
    catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    
}
public void autocomplete(String txt){
    String complete="";
    int start=txt.length();
    int end=txt.length();
    int a;
    for(a=0;a<agentnames.size();a++){
        if(agentnames.get(a).toString().toUpperCase().startsWith(txt)){
          complete=agentnames.get(a).toString().toUpperCase();
          end=complete.length();
          break;
        }
    }
    if(end>start){
        a1.setText(complete);
        a1.setCaretPosition(end);
        a1.moveCaretPosition(start);
         
    }
    
}
public void autocomplete2(String txt){
    String complete="";
    int start=txt.length();
    int end=txt.length();
    int a;
    for(a=0;a<agentnames.size();a++){
        if(agentnames.get(a).toString().toUpperCase().startsWith(txt)){
          complete=agentnames.get(a).toString().toUpperCase();
          end=complete.length();
          break;
        }
    }
    if(end>start){
        a2.setText(complete);
        a2.setCaretPosition(end);
        a2.moveCaretPosition(start);
         
    }
    
}
public void autocomplete3(String txt){
    String complete="";
    int start=txt.length();
    int end=txt.length();
    int a;
    for(a=0;a<agentnames.size();a++){
        if(agentnames.get(a).toString().toUpperCase().startsWith(txt)){
          complete=agentnames.get(a).toString().toUpperCase();
          end=complete.length();
          break;
        }
    }
    if(end>start){
        a3.setText(complete);
        a3.setCaretPosition(end);
        a3.moveCaretPosition(start);
         
    }
    
}
    
}
