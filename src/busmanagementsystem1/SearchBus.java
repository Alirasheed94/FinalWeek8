

package busmanagementsystem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class SearchBus extends javax.swing.JFrame {
    String u,f,t,d8,n,tr,fr,s,tid;
    ResultSet rs;
    int count=0;
    JDateChooser dateChooser = new JDateChooser();
    String value;
    
    public SearchBus() {
       initComponents();
       jLabel5.setVisible(false);
       
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            PreparedStatement ps=con.prepareStatement("select *from ticket where username=(select userid from session);");
            rs=ps.executeQuery();
            while(rs.next())
            {
                f=rs.getString("frm").toUpperCase();
                t=rs.getString("too").toUpperCase();
                t=f+" to "+t;
                d8=rs.getString("d8");
                n=rs.getString("name");
                tr=rs.getString("travels");
                fr=Integer.toString(rs.getInt("fare"));
                s=rs.getString("seat");
                tid=rs.getString("tcktid");
                count++;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(new Object[]{count,t,n,tid,s,tr,d8});
                  
            }
            if(count==0)
            {
                jTable1.setVisible(false);
                jScrollPane1.setVisible(false);
                jLabel5.setVisible(true);
            }
               
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     

    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Step Guide"));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/bus2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("MS PGothic", 1, 12)); 
        jTextField2.setText("1. Login/Register                          ✓ ");
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("MS PGothic", 1, 12)); 
        jTextField3.setText("2. Book/Cancel");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setText("<- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTabbedPane4.setFont(new java.awt.Font("Times New Roman", 1, 18)); 

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        jLabel1.setText("TO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel4.setText("FROM");

        from.setText("Enter City");
        from.setToolTipText("City\n");

        to.setText("Enter City");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel3.setText("DATE OF JOURNEY");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/tt.JPG"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setText("SEARCH BUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(from, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        							.addGap(113)
        							.addComponent(jLabel6)))
        					.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        								.addComponent(to, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
        							.addGap(74))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
        							.addGap(62))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jLabel3)
        					.addGap(82)
        					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(116)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jLabel1))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(from, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(to, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel6))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(70)
        					.addComponent(jLabel3))
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addGap(65)
        					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
        			.addGap(59)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Book Ticket", jPanel1);

        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No", "Source & Destination", "Passenger Name", "TicketID", "Seats", "Travels", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(50);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Selection(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Cancel Ticket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel all tickets");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("YOU HAVNT BOOKED ANY TICKETS!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(100, 100, 100)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Cancel Ticket", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            PreparedStatement ps=con.prepareStatement("delete from session;");
            ps.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        new LoginRegisterPage().setVisible(true);
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
int x=0,i=0,y=0,z=0,d=0;
char check[];
PreparedStatement ps,ps1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
  String frm=from.getText();
  String too=to.getText();
  String d8=new SimpleDateFormat("yyyy-MM-dd").format(dateChooser.getDate());
if(frm.equals("")||too.equals("")||d8.equals(""))
{
    JOptionPane.showMessageDialog(jButton1, "Blank Field!");
}
else
{
try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
       ps=con.prepareStatement("select userid from session;");
       rs=ps.executeQuery();
       if(rs.next())
       {
           u=rs.getString("userid");
       }
       
            ps=con.prepareStatement("update session set frm=?,too=?,d8=?;");
            ps.setString(1,frm);
            ps.setString(2,too);
            ps.setString(3,d8);
            ps.execute();
            ps1=con.prepareStatement("insert into ticket values(?,?,?,'','','','','na',?);");
            ps1.setString(1,frm);
            ps1.setString(2, too);
            ps1.setString(3, d8);
            ps1.setString(4, u);
            ps1.execute();
            ShowBusses sb=new ShowBusses(frm,too);
            sb.addData();
            
            this.dispose();
            sb.setVisible(true);
            
      
    
    }
 catch(ClassNotFoundException| SQLException ex)
 {
     
     Logger.getLogger(ShowBusses.class.getName()).log(Level.SEVERE, null, ex);
     
 }
  
}
   
    }

int j=0,row;
    private void Selection(java.awt.event.MouseEvent evt) {
int clk=evt.getClickCount();
if(clk==1)
{
row=jTable1.getSelectedRow();
value=(String)jTable1.getValueAt(row, 3);
}



     
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

    
        if(row==-1)
            JOptionPane.showMessageDialog(jButton3, "No Ticket Selected!");
        else{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            PreparedStatement ps=con.prepareStatement("delete from ticket where username=(select userid from session) and tcktid=?;");
            PreparedStatement ps2=con.prepareStatement("delete from seats where username=(select userid from session) and tcktid=?;");
            ps.setString(1, value);
            ps.execute();
            int cnt=jTable1.getRowCount();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(row);
            if(cnt==0)
            {
                jTable1.setVisible(false);
                jScrollPane1.setVisible(false);
                jLabel5.setVisible(true);
            
            }
           
            
   }
 catch(ClassNotFoundException| SQLException ex)
 {
     
     Logger.getLogger(ShowBusses.class.getName()).log(Level.SEVERE, null, ex);
     
 }    
        }
        
 
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int cnt=jTable1.getRowCount();
            System.out.println(value);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            PreparedStatement ps=con.prepareStatement("delete from ticket where username=(select userid from session) ;");
            ps.execute();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for(int k=0;k<cnt-1;k++)
            model.removeRow(k);
            jTable1.setVisible(false);
            jScrollPane1.setVisible(false);
            jLabel5.setVisible(true);
            
           
            
   }
 catch(ClassNotFoundException| SQLException ex)
 {
     
     Logger.getLogger(ShowBusses.class.getName()).log(Level.SEVERE, null, ex);
     
 }
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchBus().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField to;
}