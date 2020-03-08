

package busmanagementsystem1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShowBusses extends javax.swing.JFrame {
    private SearchBus sb;
    private static String from;
	private static String to;
int clk,rw,clm;String aa;
    
    public ShowBusses(String frm,String to) {
    	this.from=frm;
    	this.to=to;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                closeSession(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Step Guide"));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/busses.gif"))); // NOI18N
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
        jTextField3.setFont(new java.awt.Font("MS PGothic", 1, 12)); // 
        jTextField3.setText("2. Book/Cancel                            ✓");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("MS PGothic", 1, 12)); 
        jTextField4.setText("3. Choose Bus");
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setText("<-Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Travels", "Departure", "Bus Type", "Fare"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Result(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    } 
Connection con;
ResultSet rs;
String travels="",bb;
String bustyp="";
String dep="";
int fare,row=0;
PreparedStatement ps2,ps3;
    public void addData()
{
    try{
        
    	
              Class.forName("com.mysql.jdbc.Driver");
              Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
              ps2=con.prepareStatement("select * from bus where source='"+from+"' AND dest='"+to+"';");
              System.out.println("select * from bus where source='"+from+"' AND dest='"+to+"';");
              rs=ps2.executeQuery();
              while(rs.next())
              {
            	  System.out.println("sdffsdfsd");
                  travels=rs.getString("travels");
                  bustyp=rs.getString("bustype");
                  dep=rs.getString("dept");
                  fare=rs.getInt("fare");
                  String from=rs.getString("source");
                  String too=rs.getString("dest");
                  DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                  model.addRow(new Object[]{travels,dep,bustyp,fare});
                  row++;
              }
             
              
              ps2.close();
              rs.close();
              con.close();
              
    }
    catch (  ClassNotFoundException | SQLException ex) {
              Logger.getLogger(LoginRegisterPage.class.getName()).log(Level.SEVERE, null, ex);
              
              
    }
    
    }
    private void closeSession(java.awt.event.WindowEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            PreparedStatement ps=con.prepareStatement("delete from session;");
            ps.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        this.dispose();
        new SearchBus().setVisible(true);

    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
int da;
String tr,bbid;
PreparedStatement ps,ps4;
    private void Result(java.awt.event.MouseEvent evt) {
        clk=evt.getClickCount();
if(clk==2)
{
    rw=jTable1.getSelectedRow();
    aa=(String) jTable1.getValueAt(rw, 1);
    try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            ps2=con.prepareStatement("select fare,travels,bid from bus where (source='"+this.from+"' AND dest='"+this.to+"' AND dept=? );");
            ps2.setString(1, aa);
            rs=ps2.executeQuery();
            if(rs.next())
            {
            this.da=rs.getInt("fare");
            tr=rs.getString("travels");
            bbid=rs.getString("bid");
            }
            ps3=con.prepareStatement("update session set selected=?,aa=?,bbid=?;");
            ps2=con.prepareStatement("update ticket set travels=? where tcktid='na';");
            ps3.setInt(1, da);
            ps2.setString(1,tr);
            ps3.setString(2,aa);
            ps3.setString(3,bbid);
            ps3.execute();

            ps2.execute();
            ps2.close();
            rs.close();
            con.close();
    }
    catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WelcomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    ViewSeats vs=new ViewSeats(from,to,this.da);
    vs.setVisible(true);
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
            java.util.logging.Logger.getLogger(ShowBusses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowBusses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowBusses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowBusses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowBusses(from,to).setVisible(true);

            }
        });
    }


    
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    

    private void SearchBus() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
