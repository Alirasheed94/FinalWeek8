

package busmanagementsystem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class DisplayTicket extends javax.swing.JFrame {

    
    static ResultSet rs;
    static String nm;
    static int fr;
    String bustype,dest,frm,too,d8,name,travels,seat,tckt, fare;
    public DisplayTicket(String nm,int fr,String from,String to) {
    	this.nm=nm;
    	this.fr=fr;
        initComponents();
      
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
       
        u1.setText(from+" to "+to);
        u2.setText(df.format(dateobj));
        u3.setText(travels);
        u4.setText(nm);
        u5.setText("123");
        u6.setText("S04");
        u7.setText(bustype);
        u8.setText(to);
        u10.setText("$"+ Integer.toString(fr));
      
        }
    private void makePanelImage(Component panel)
    {
        Dimension size = panel.getSize();
        BufferedImage image = new BufferedImage(
                    size.width, size.height 
                              , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        panel.paint(g2);
        try
        {
            ImageIO.write(image, "png", new File("tickets\\Ticket"+tckt+".png"));
            System.out.println("Panel saved as Image.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
  

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        u1 = new javax.swing.JLabel();
        u2 = new javax.swing.JLabel();
        u3 = new javax.swing.JLabel();
        u5 = new javax.swing.JLabel();
        u6 = new javax.swing.JLabel();
        u4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        u7 = new javax.swing.JLabel();
        u8 = new javax.swing.JLabel();
        u9 = new javax.swing.JLabel();
        u10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(51, 51, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/bus29_1.png"))); 

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Capture.JPG"))); 

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Travel Qurries");

        jLabel5.setText("Call:7738359326/9820092615");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 11)); 
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Passenger Name");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 11)); 
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Ticket Id");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 11)); 
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Seat number");

        u1.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u1.setText("khbhk");

        u2.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u2.setText("jkljkl");

        u3.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u3.setText("okoj");

        u5.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u5.setText("10");

        u6.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u6.setText("khbhk");

        u4.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u4.setText(nm);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 0));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 11)); 
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Bus Type");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 11)); 
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Reporting Destination");

        u7.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u7.setText("khbhk");

        u8.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        u8.setText("khbhk");

        u9.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); 
        u9.setText("Fare:");
        u9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        u10.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); 
        u10.setText("jLabel11");
        u10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        u10.setText("$" +Integer.toString(fr));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
        					.addComponent(jLabel3)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel4)
        						.addComponent(jLabel5))
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(u1)
        					.addGap(147)
        					.addComponent(u2)
        					.addPreferredGap(ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
        					.addComponent(u3)
        					.addGap(86))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel9)
        								.addComponent(u7))
        							.addGap(193)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(u8)
        								.addComponent(jLabel10)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(u9, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        							.addGap(35)
        							.addComponent(u10, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)))
        					.addGap(0, 296, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel6)
        						.addComponent(u4))
        					.addGap(152)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(u5)
        							.addContainerGap())
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel7)
        							.addPreferredGap(ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel8)
        								.addComponent(u6))
        							.addGap(59))))))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel4)
        						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel5))
        					.addComponent(jLabel3)))
        			.addGap(18)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(u1)
        				.addComponent(u3)
        				.addComponent(u2))
        			.addGap(18)
        			.addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7)
        				.addComponent(jLabel8))
        			.addGap(14)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(u4)
        				.addComponent(u5)
        				.addComponent(u6))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(jLabel10))
        			.addGap(14)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(u7)
        				.addComponent(u8))
        			.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(u9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        				.addComponent(u10, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        			.addGap(30))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Step Guide"));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/PrintIconX.png"))); 
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
        jTextField4.setText("3. Choose Bus                             ✓");
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("MS PGothic", 1, 12)); 
        jTextField5.setText("4. Choose Seat                            ✓");
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("MS PGothic", 1, 12)); 
        jTextField6.setText("5. Payment                                 ✓");
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("MS PGothic", 1, 12)); 
        jTextField7.setText("6. Print Ticket                       ");
        jTextField7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(80, 80, 80))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Important Points\r\n\r\n1. Ali,s Bus Service is an online marketplace. It does not operate bus services of its own. In order to provide a comprehensive choice of bus operators, departure times and prices to customers, it has tied up with many bus operators. \r\n\r\nAli,s Bus Service advice to customers is to choose bus operators they are aware of and whose service they are comfortable with.\r\n\r\nAli,s Bus Service responsibilities include: \r\n\r\n    -     Issuing a valid ticket (a ticket that will be accepted by the bus operator) for its network of bus operators \r\n    -     Providing refund and support in the event of cancellation\r\n    -     Providing customer support and information in case of any delays / inconvenience\r\n\r\nAli,s Bus Service responsibilities do NOT include:\r\n\r\n    -    The bus operator bus not departing / reaching on time\r\n    -    The bus operator employees being rude\r\n    -    The bus operator bus seats etc not being up to the customer\u00E2\u20AC\u2122s expectation\r\n    -    The bus operator canceling the trip due to unavoidable reasons  \r\n    -    The baggage of the customer getting lost / stolen / damaged\r\n    -    The bus operator changing a customers seat at the last minute to accommodate a lady / child\r\n    -    The customer waiting at the wrong boarding point (please call the bus operator to find out the exact\r\n          boarding point if you are not a regular traveler on that particular bus)\r\n    -    The bus operator changing the boarding point and/or using a pick-up vehicle at the boarding point to take\r\n          customers to the bus departure point \r\n\r\n* Ali,s Bus Service means to include Ali,s Bus Service and its partner outlets (Sify, Subhiksha, Done Card, Itz Cash etc) \r\n2. The arrival and departure times mentioned on the ticket are only tentative timings . However the bus will not leave the source before the time that is mentioned on the ticket. \r\n3. Passengers are required to furnish the following at the time of boarding the bus:\r\n    -    A copy of the ticket (A print out of the ticket or the print out of the ticket e-mail). \r\n    -    Identity proof (Driving license, Student ID card, Company ID card, Passport, PAN card or Voter ID card). \r\n\r\nFailing to do so, they may not be allowed to board the bus. \r\n4. Change of bus: In case the bus operator changes the type of bus due to some reason, Ali,s Bus Service will refund the differential amount to the customer upon being intimated by the customers in 24 hours of the journey. \r\n5. Cancellation Policy: The tickets booked through Ali,s Bus Service are cancelable. Kindly note that the money  is not transferred back to the passenger's credit/debit card. Instead the money will be refunded in the form of a Cash Coupon which can be used during your next transaction. This coupon is valid up to 6 months from the date of cancellation. \r\n\r\nThe following is the cancellation fee: Between 24 hours to 3 days before journey the cancellation charge is 10%. Between 3 days to 1 week before journey the cancellation charge is 5%. \r\nPlease note that the cancellation fee and cancellation period may differ from one bus operator to another. Please contact any of our executives for complete details or enter your ticket number on the print ticket tab to read the cancellation policy for your ticket. \r\n\r\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Terms & Conditions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 36))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Print Ticket->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("I agree to the tearms and conditions");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(51, 51, 51)))
                    .addComponent(jCheckBox1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
if(jCheckBox1.isEnabled())
{
        makePanelImage(jPanel1);
        JOptionPane.showMessageDialog(jButton1, "Ticket stored in Local Drive F!");
        this.dispose();
        new Completed().setVisible(true);
}
else
{
 JOptionPane.showMessageDialog(jButton1, "Agree to the tearms and conditions!");   
}
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {

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
            java.util.logging.Logger.getLogger(DisplayTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayTicket(nm,fr,"", "").setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel u1;
    private javax.swing.JLabel u10;
    private javax.swing.JLabel u2;
    private javax.swing.JLabel u3;
    private javax.swing.JLabel u4;
    private javax.swing.JLabel u5;
    private javax.swing.JLabel u6;
    private javax.swing.JLabel u7;
    private javax.swing.JLabel u8;
    private javax.swing.JLabel u9;
    
}
