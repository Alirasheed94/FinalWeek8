

package busmanagementsystem1;

import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewSeats extends javax.swing.JFrame {

    
     
    int da,ss,i=1;
    ResultSet rs,rs1;
    String[] seat=new String[49];
    int lp=0;
    String[] seatnos=new String[49];
    String frm,too,aa,bbid,d8;
	static String from;
	static String to;
	static int fare;
    int count;
    int sel1,sel2,sel3,sel4,sel5,sel6,sel7,sel8,sel9,sel10,sel11,sel12,sel13,sel14,sel15,sel16,sel17,sel18,sel19,sel20,sel21,sel22,sel23,sel24,sel25,sel26,sel27,sel28,sel29,sel30,sel31,sel32,sel33,sel34,sel35,sel36,sel37,sel38,sel39,sel40,sel41,sel42,sel43,sel44,sel45,sel46,sel47,sel48,sel49;
    public ViewSeats(String from,String to,int fare) {
        this.from=from;
        this.to=to;
        this.fare=fare;
        initComponents();
        for(int i=0;i<49;i++)
        {
            seat[i]=null;
            seatnos[i]="";
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            PreparedStatement ps=con.prepareStatement("select * from session");
             rs=ps.executeQuery();
            if(rs.next())
            {
                System.out.println("2");
                this.da=Integer.parseInt(rs.getString("selected"));
                frm=rs.getString("frm");
                too=rs.getString("too");
                aa=rs.getString("aa");
                bbid=rs.getString("bbid");
                d8=rs.getString("d8");
            }
            
            PreparedStatement ps1=con.prepareStatement("select seatno from seats where busid=?");
            
            ps1.setString(1,bbid );
           
            System.out.println(bbid);
            rs1=ps1.executeQuery();
            System.out.println("4");
            int k=0;
            if(rs1.next())
            {
                do
                {
                System.out.println("7");
                seatnos[k]=rs1.getString("seatno");
                if(seatnos[k].equals("S01"))
                    {
                        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel1=1;
                    }
                if(seatnos[k].equals("S02"))
                    {
                        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel2=2;
                    }
                if(seatnos[k].equals("S03"))
                    {
                        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel3=3;
                    }
                if(seatnos[k].equals("S04"))
                    {
                        four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel4=4;
                    }
                if(seatnos[k].equals("S05"))
                    {
                        five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel5=5;
                    }
                if(seatnos[k].equals("S06"))
                    {
                        six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel6=6;
                    }
                if(seatnos[k].equals("S07"))
                    {
                        seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel7=7;
                    }
                if(seatnos[k].equals("S08"))
                    {
                        eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel8=8;
                    }
                if(seatnos[k].equals("S09"))
                    {
                        nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel9=9;
                    }
                if(seatnos[k].equals("S10"))
                    {
                        ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel10=10;
                    }
                if(seatnos[k].equals("S11"))
                    {
                        eleven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel11=11;
                    }
                if(seatnos[k].equals("S12"))
                    {
                        twelve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel12=12;
                    }
                if(seatnos[k].equals("S13"))
                    {
                        thirteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel13=13;
                    }
                if(seatnos[k].equals("S14"))
                    {
                        fourteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel14=14;
                    }
                if(seatnos[k].equals("S15"))
                    {
                        fifteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel15=15;
                    }
                if(seatnos[k].equals("S16"))
                    {
                        sixteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel16=16;
                    }
                if(seatnos[k].equals("S17"))
                    {
                        seventeen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel17=17;
                    }
                if(seatnos[k].equals("S18"))
                    {
                        eighteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel18=18;
                    }
                if(seatnos[k].equals("S19"))
                    {
                        nineteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel19=19;
                    }
                if(seatnos[k].equals("S20"))
                    {
                        twenty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel20=20;
                    }
                if(seatnos[k].equals("S21"))
                    {
                        twentyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel21=21;
                    }
                if(seatnos[k].equals("S22"))
                    {
                        twentytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel22=22;
                    }
                if(seatnos[k].equals("S23"))
                    {
                        twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel23=23;
                    }
                if(seatnos[k].equals("S24"))
                    {
                        twentyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel24=24;
                    }
                if(seatnos[k].equals("S25"))
                    {
                        twentyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel25=25;
                    }
                if(seatnos[k].equals("S26"))
                    {
                        twentysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel26=26;
                    }
                if(seatnos[k].equals("S27"))
                    {
                        twentyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel27=27;
                    }
                if(seatnos[k].equals("S28"))
                    {
                        twentyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel28=28;
                    }
                if(seatnos[k].equals("S29"))
                    {
                        twentynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel29=29;
                    }
                if(seatnos[k].equals("S30"))
                    {
                        thirty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel30=30;
                    }
                if(seatnos[k].equals("S31"))
                    {
                        thirtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel31=31;
                    }
                if(seatnos[k].equals("S32"))
                    {
                        thirtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel32=32;
                    }
                if(seatnos[k].equals("S33"))
                    {
                        thirtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel33=33;
                    }
                if(seatnos[k].equals("S34"))
                    {
                        thirtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel34=34;
                    }
                if(seatnos[k].equals("S35"))
                {
                        thirtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel35=35;
                    }
                if(seatnos[k].equals("S36"))
                    {
                        thirtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel36=36;
                    }
                if(seatnos[k].equals("S37"))
                    {
                        thirtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel37=37;
                    }
                if(seatnos[k].equals("S38"))
                    {
                        thirtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel38=38;
                    }
                if(seatnos[k].equals("S39"))
                    {
                        thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel39=39;
                    }
                if(seatnos[k].equals("S40"))
                    {
                        fourty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel40=40;
                    }
                if(seatnos[k].equals("S41"))
                    {
                        fourtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel41=41;
                    }
                if(seatnos[k].equals("S42"))
                    {
                        fourtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel42=42;
                    }
                if(seatnos[k].equals("S43"))
                    {
                        fourtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel43=43;
                    }
                if(seatnos[k].equals("S44"))
                    {
                        fourtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel44=44;
                    }
                if(seatnos[k].equals("S45"))
                    {
                        fourtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel45=45;
                    }
                if(seatnos[k].equals("S46"))
                    {
                        fourtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel46=46;
                    }
                if(seatnos[k].equals("S47"))
                    {
                        fourtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel47=47;
                    }
                if(seatnos[k].equals("S48"))
                    {
                        fourtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel48=48;
                    }
                if(seatnos[k].equals("S49"))
                    {
                        fourtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
                        sel49=49;
                    }
                k++;    
                }while(rs1.next());
                
            }
         }
         catch (  ClassNotFoundException | SQLException ex) {
              Logger.getLogger(ViewSeats.class.getName()).log(Level.SEVERE, null, ex);

              
              
    }
       
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        one = new javax.swing.JLabel();
        two = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        four = new javax.swing.JLabel();
        five = new javax.swing.JLabel();
        six = new javax.swing.JLabel();
        seven = new javax.swing.JLabel();
        eight = new javax.swing.JLabel();
        nine = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        eleven = new javax.swing.JLabel();
        twelve = new javax.swing.JLabel();
        thirteen = new javax.swing.JLabel();
        fourteen = new javax.swing.JLabel();
        fifteen = new javax.swing.JLabel();
        sixteen = new javax.swing.JLabel();
        seventeen = new javax.swing.JLabel();
        eighteen = new javax.swing.JLabel();
        nineteen = new javax.swing.JLabel();
        twenty = new javax.swing.JLabel();
        twentyone = new javax.swing.JLabel();
        twentytwo = new javax.swing.JLabel();
        twentythree = new javax.swing.JLabel();
        twentyfour = new javax.swing.JLabel();
        twentyseven = new javax.swing.JLabel();
        thirty = new javax.swing.JLabel();
        fourtynine = new javax.swing.JLabel();
        twentynine = new javax.swing.JLabel();
        twentyeight = new javax.swing.JLabel();
        thirtyfour = new javax.swing.JLabel();
        twentysix = new javax.swing.JLabel();
        thirtysix = new javax.swing.JLabel();
        thirtythree = new javax.swing.JLabel();
        thirtytwo = new javax.swing.JLabel();
        thirtyone = new javax.swing.JLabel();
        thirtyfive = new javax.swing.JLabel();
        twentyfive = new javax.swing.JLabel();
        thirtyseven = new javax.swing.JLabel();
        thirtyeight = new javax.swing.JLabel();
        thirtynine = new javax.swing.JLabel();
        fourty = new javax.swing.JLabel();
        fourtyone = new javax.swing.JLabel();
        fourtytwo = new javax.swing.JLabel();
        fourtythree = new javax.swing.JLabel();
        fourtyfour = new javax.swing.JLabel();
        fourtyfive = new javax.swing.JLabel();
        fourtysix = new javax.swing.JLabel();
        fourtyseven = new javax.swing.JLabel();
        fourtyeight = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Step Guide"));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/seats.gif"))); // NOI18N
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
        jTextField5.setText("4. Choose Seat                   ");
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 51), new java.awt.Color(204, 0, 51), null, new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/wheel.JPG"))); // NOI18N

        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectSeat(evt);
            }
        });

        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoSelectSeat(evt);
            }
        });

        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeSelectSeat(evt);
            }
        });

        four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourSelectSeat(evt);
            }
        });

        five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveSeatSelected(evt);
            }
        });

        six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixSeatSelected(evt);
            }
        });

        seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenSeatSelected(evt);
            }
        });

        eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightSeatSelected(evt);
            }
        });

        nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nine(evt);
            }
        });

        ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        ten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenSeatSelected(evt);
            }
        });

        eleven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        eleven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elevenSeatSelected(evt);
            }
        });

        twelve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twelve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twelveSeatSelected(evt);
            }
        });

        thirteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirteenSeatSelected(evt);
            }
        });

        fourteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourteenSeatSelected(evt);
            }
        });

        fifteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fifteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fifteenSeatSelected(evt);
            }
        });

        sixteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        sixteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixteenSeatSelected(evt);
            }
        });

        seventeen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        seventeen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seventeenSeatSelected(evt);
            }
        });

        eighteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        eighteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eighteenSeatSelected(evt);
            }
        });

        nineteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        nineteen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineteenSeatSelected(evt);
            }
        });

        twenty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twenty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentySeatSelected(evt);
            }
        });

        twentyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentyone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyoneSelectSeat(evt);
            }
        });

        twentytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentytwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentytwoSelectSeat(evt);
            }
        });

        twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentythree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentythreeSelectSeat(evt);
            }
        });

        twentyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentyfour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyfourSelectSeat(evt);
            }
        });

        twentyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentyseven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentysevenSeatSelected(evt);
            }
        });

        thirty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtySeatSelected(evt);
            }
        });

        fourtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtynine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtynineSelectSeat(evt);
            }
        });

        twentynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentynine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentynineSeatSelected(evt);
            }
        });

        twentyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentyeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyeightSeatSelected(evt);
            }
        });

        thirtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtyfour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtyfourSelectSeat(evt);
            }
        });

        twentysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentysix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentysixSeatSelected(evt);
            }
        });

        thirtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtysix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtysixSelectSeat(evt);
            }
        });

        thirtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtythree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtythreeSeatSelected(evt);
            }
        });

        thirtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtytwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtytwoSeatSelected(evt);
            }
        });

        thirtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtyone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtyoneSeatSelected(evt);
            }
        });

        thirtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtyfive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtyfiveSelectSeat(evt);
            }
        });

        twentyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        twentyfive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyfiveSeatSelected(evt);
            }
        });

        thirtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtyseven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtysevenSelectSeat(evt);
            }
        });

        thirtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtyeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtyeightSelectSeat(evt);
            }
        });

        thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        thirtynine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirtynineSelectSeat(evt);
            }
        });

        fourty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtySelectSeat(evt);
            }
        });

        fourtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtyone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtyoneSeatSelected(evt);
            }
        });

        fourtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtytwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtytwoSeatSelected(evt);
            }
        });

        fourtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtythree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtythreeSeatSelected(evt);
            }
        });

        fourtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtyfour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtyfourSeatSelected(evt);
            }
        });

        fourtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtyfive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtyfiveSeatSelected(evt);
            }
        });

        fourtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtysix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtysixSeatSelected(evt);
            }
        });

        fourtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtyseven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtysevenSeatSelected(evt);
            }
        });

        fourtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png"))); // NOI18N
        fourtyeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourtyeightSeatSelected(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(thirtyeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirtynine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtyone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtytwo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtythree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtyfour)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtyfive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtysix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtyseven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtyeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourtynine))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(thirtyseven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirtysix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirtyfive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirtyfour)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirtythree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirtytwo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirtyone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentynine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentyeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentyseven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentysix))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(one)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(two)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(three)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(four)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ten)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eleven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twelve))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(twentyfour)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentythree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentytwo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentyone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twenty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineteen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eighteen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seventeen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixteen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fifteen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourteen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(twentyfive)
                                    .addComponent(thirteen))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(twelve)
                    .addComponent(eleven)
                    .addComponent(ten)
                    .addComponent(nine)
                    .addComponent(eight)
                    .addComponent(seven)
                    .addComponent(six)
                    .addComponent(five)
                    .addComponent(four)
                    .addComponent(three)
                    .addComponent(two)
                    .addComponent(jLabel1)
                    .addComponent(one))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thirteen)
                    .addComponent(fourteen)
                    .addComponent(fifteen)
                    .addComponent(sixteen)
                    .addComponent(seventeen)
                    .addComponent(eighteen)
                    .addComponent(nineteen)
                    .addComponent(twenty)
                    .addComponent(twentyone)
                    .addComponent(twentytwo)
                    .addComponent(twentythree)
                    .addComponent(twentyfour))
                .addGap(18, 18, 18)
                .addComponent(twentyfive)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(twentysix)
                    .addComponent(twentyseven)
                    .addComponent(twentyeight)
                    .addComponent(twentynine)
                    .addComponent(thirty)
                    .addComponent(thirtyone)
                    .addComponent(thirtytwo)
                    .addComponent(thirtythree)
                    .addComponent(thirtyfour)
                    .addComponent(thirtyfive)
                    .addComponent(thirtysix)
                    .addComponent(thirtyseven))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fourtyeight)
                    .addComponent(fourtyseven)
                    .addComponent(fourtysix)
                    .addComponent(fourtyfive)
                    .addComponent(fourtyfour)
                    .addComponent(fourtythree)
                    .addComponent(fourtytwo)
                    .addComponent(fourtyone)
                    .addComponent(fourty)
                    .addComponent(thirtynine)
                    .addComponent(thirtyeight)
                    .addComponent(fourtynine))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel3.setText("Select your seat");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel4.setText("Fare");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Next->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(151, 151, 151)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
int f=0;
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
int clk=1;

int far;
int x=0;
boolean b1=false;
boolean b2=false;
boolean b3=false;
boolean b4=false;
boolean b5=false;
boolean b6=false;
boolean b7=false;
boolean b8=false;
boolean b9=false;
boolean b10=false;
boolean b11=false;
boolean b12=false;
boolean b13=false;
boolean b14=false;
boolean b15=false;
boolean b16=false;
boolean b17=false;
boolean b18=false;
boolean b19=false;
boolean b20=false;
boolean b21=false;
boolean b22=false;
boolean b23=false;
boolean b24=false;
boolean b25=false;
boolean b26=false;
boolean b27=false;
boolean b28=false;
boolean b29=false;
boolean b30=false;
boolean b31=false;
boolean b32=false;
boolean b33=false;
boolean b34=false;
boolean b35=false;
boolean b36=false;
boolean b37=false;
boolean b38=false;
boolean b39=false;
boolean b40=false;
boolean b41=false;
boolean b42=false;
boolean b43=false;
boolean b44=false;
boolean b45=false;
boolean b46=false;
boolean b47=false;
boolean b48=false;
boolean b49=false;

		

    private void SelectSeat(java.awt.event.MouseEvent evt) {

if(sel1==1)
{
    one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    System.out.println("inside else");
    if(!b1)                           
    {
   
    this.f=f+1;
    one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
    b1=!b1;
    seat[lp]="S01";
   lp++;
}
else
{
    this.f=f-1;
    one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b1=!b1;
     lp--;
     seat[lp]=null;
}

}

 


    }

    private void twoSelectSeat(java.awt.event.MouseEvent evt) {
        
   
if(sel2==2)
{
    two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
if(!b2)                           
{
   
    this.f=f+1;
    two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b2=!b2;
   seat[lp]="S02";
   lp++;
}
else
{
    this.f=f-1;
    two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b2=!b2;
     lp--;
     seat[lp]=null;
}

    
}
 

    }

    private void threeSelectSeat(java.awt.event.MouseEvent evt) {

        if(sel3==3)
{
    three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    
        if(!b3)                           
{
   
    this.f=f+1;
    three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b3=!b3;
   seat[lp]="S03";
   lp++;
}
else
{
    this.f=f-1;
    three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b3=!b3;
     lp--;
     seat[lp]=null;
}

 
}


 
    }

    private void fourSelectSeat(java.awt.event.MouseEvent evt) {
        if(sel4==4)
{
    four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b4)                           
{
   
    this.f=f+1;
    four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b4=!b4;
   seat[lp]="S04";
   lp++;
}
else
{
    this.f=f-1;
    four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b4=!b4;
     lp--;
     seat[lp]=null;
}
}
    
        
    }

    private void twentyoneSelectSeat(java.awt.event.MouseEvent evt) {
        if(sel21==21)
{
    twentyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b21)                           
{
   
    this.f=f+1;
    twentyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b3=!b3;
   seat[lp]="S21";
   lp++;
}
else
{
    this.f=f-1;
    twentyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b21=!b21;
     lp--;
     seat[lp]=null;
} 
}
    
    }

    private void twentytwoSelectSeat(java.awt.event.MouseEvent evt) {
      if(sel22==22)
{
    twentytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b3)                           
{
   
    this.f=f+1;
    twentytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b22=!b22;
   seat[lp]="S22";
   lp++;
}
else
{
    this.f=f-1;
    twentytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b22=!b22;
     lp--;
     seat[lp]=null;
}
}
    
    }

    private void twentythreeSelectSeat(java.awt.event.MouseEvent evt) {
     if(sel23==23)
{
    twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    if(!b23)                           
{
   
    this.f=f+1;
    twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b23=!b23;
   seat[lp]="S23";
   lp++;
}
else
{
    this.f=f-1;
    twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b23=!b23;
     lp--;
     seat[lp]=null;
}
}          
        
    }

    private void twentyfourSelectSeat(java.awt.event.MouseEvent evt) {
     if(sel24==24)
{
    twentyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b24)                           
{
   
    this.f=f+1;
    twentyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b24=!b24;
   seat[lp]="S24";
   lp++;
}
else
{
    this.f=f-1;
    twentyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b24=!b24;
     lp--;
     seat[lp]=null;
} 
}
    
    }

    private void fourtynineSelectSeat(java.awt.event.MouseEvent evt) {
     if(sel49==49)
{
    fourtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{    
     if(!b49)                           
{
   
    this.f=f+1;
    fourtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b49=!b49;
   seat[lp]="S49";
   lp++;
}
else
{
    this.f=f-1;
    fourtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b49=!b49;
     lp--;
     seat[lp]=null;
}   
}
    
        
        
    }

    private void thirtyfourSelectSeat(java.awt.event.MouseEvent evt) {
         if(sel34==34)
{
    twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b34)                           
{
   
    this.f=f+1;
    thirtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b34=!b34;
   seat[lp]="S34";
   lp++;
}
else
{
    this.f=f-1;
    thirtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b34=!b34;
     lp--;
     seat[lp]=null;
}
}
     
    }

    private void thirtysixSelectSeat(java.awt.event.MouseEvent evt) {
      if(sel36==36)
{
    twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b36)                           
{
   
    this.f=f+1;
    thirtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b36=!b36;
   seat[lp]="S36";
   lp++;
}
else
{
    this.f=f-1;
    thirtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b36=!b36;
     lp--;
     seat[lp]=null;
}  
}
     
    }

    private void thirtyfiveSelectSeat(java.awt.event.MouseEvent evt) {
        if(sel35==35)
{
    twentythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
      if(!b35)                           
{
   
    this.f=f+1;
    thirtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b35=!b35;
   seat[lp]="S35";
   lp++;
}
else
{
    this.f=f-1;
    thirtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b35=!b35;
     lp--;
     seat[lp]=null;
}
}
      
    }

    private void thirtysevenSelectSeat(java.awt.event.MouseEvent evt) {
      if(sel37==37)
{
    thirtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    if(!b37)                           
{
   
    this.f=f+1;
    thirtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b37=!b37;
   seat[lp]="S03";
   lp++;
}
else
{
    this.f=f-1;
    thirtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b37=!b37;
     lp--;
     seat[lp]=null;
}
}
        
        
    }

    private void thirtyeightSelectSeat(java.awt.event.MouseEvent evt) {
             if(sel38==38)
{
    thirtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    if(!b38)                           
{
   
    this.f=f+1;
    thirtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b38=!b38;
   seat[lp]="S38";
   lp++;
}
else
{
    this.f=f-1;
    thirtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b38=!b38;
     lp--;
     seat[lp]=null;
}
}
        // TODO add your handling code here:
    }//GEN-LAST:event_thirtyeightSelectSeat

    private void thirtynineSelectSeat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirtynineSelectSeat
             if(sel39==39)
{
    thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    
        if(!b39)                           
{
   
    this.f=f+1;
    thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b39=!b39;
   seat[lp]="S39";
   lp++;
}
else
{
    this.f=f-1;
    thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b39=!b39;
     lp--;
     seat[lp]=null;
}
}
    // TODO add your handling code here:
    }//GEN-LAST:event_thirtynineSelectSeat

    private void fourtySelectSeat(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtySelectSeat
             if(sel40==40)
{
    fourty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    if(!b40)                           
{
   
    this.f=f+1;
    fourty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b40=!b40;
   seat[lp]="S40";
   lp++;
}
else
{
    this.f=f-1;
    fourty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b40=!b40;
     lp--;
     seat[lp]=null;
}
}
 
        // TODO add your handling code here:
    }//GEN-LAST:event_fourtySelectSeat

    private void fiveSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveSeatSelected
             if(sel5==39)
{
    five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b5)                           
{
   
    this.f=f+1;
    five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b5=!b5;
   seat[lp]="S05";
   lp++;
}
else
{
    this.f=f-1;
    five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b5=!b5;
     lp--;
     seat[lp]=null;
}
}
 
    // TODO add your handling code here:
    }//GEN-LAST:event_fiveSeatSelected

    private void sixSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixSeatSelected
             if(sel6==39)
{
    six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b6)                           
{
   
    this.f=f+1;
    six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b6=!b6;
   seat[lp]="S06";
   lp++;
}
else
{
    this.f=f-1;
    six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b6=!b6;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_sixSeatSelected

    private void sevenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenSeatSelected
                if(sel7==7)
{
   seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b7)                           
{
   
    this.f=f+1;
    seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b7=!b7;
   seat[lp]="S07";
   lp++;
}
else
{
    this.f=f-1;
    seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b7=!b7;
     lp--;
     seat[lp]=null;
}
}
 
    
    
    }//GEN-LAST:event_sevenSeatSelected

    private void eightSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightSeatSelected
                    if(sel8==8)
{
    thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b8)                           
{
   
    this.f=f+1;
    eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b8=!b8;
   seat[lp]="S08";
   lp++;
}
else
{
    this.f=f-1;
    eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b8=!b8;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_eightSeatSelected

    private void nine(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nine
                if(sel9==9)
{
    nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b9)                           
{
   
    this.f=f+1;
    nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b9=!b9;
   seat[lp]="S09";
   lp++;
}
else
{
    this.f=f-1;
    nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b9=!b9;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_nine

    private void tenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenSeatSelected
 if(sel10==10)
{
    ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b10)                           
{
   
    this.f=f+1;
    ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b10=!b10;
   seat[lp]="S10";
   lp++;
}
else
{
    this.f=f-1;
    ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b10=!b10;
     lp--;
     seat[lp]=null;
}
}
 
    

    }//GEN-LAST:event_tenSeatSelected

    private void elevenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elevenSeatSelected
             if(sel11==11)
{
    eleven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
    if(!b11)                           
{
   
    this.f=f+1;
    eleven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b11=!b11;
   seat[lp]="S11";
   lp++;
}
else
{
    this.f=f-1;
    eleven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b11=!b11;
     lp--;
     seat[lp]=null;
}
}        
    }//GEN-LAST:event_elevenSeatSelected

    private void twelveSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twelveSeatSelected
 if(sel12==12)
{
    twelve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b12)                           
{
   
    this.f=f+1;
    twelve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b12=!b12;
   seat[lp]="S12";
   lp++;
}
else
{
    this.f=f-1;
    twelve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b12=!b12;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_twelveSeatSelected

    private void twentySeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentySeatSelected
    if(sel20==20)
{
    twenty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b20)                           
{
   
    this.f=f+1;
    twenty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b20=!b20;
   seat[lp]="S20";
   lp++;
}
else
{
    this.f=f-1;
    twenty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b20=!b20;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_twentySeatSelected

    private void nineteenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineteenSeatSelected
                if(sel19==19)
{
    nineteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
     if(!b19)                           
{
   
    this.f=f+1;
    nineteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b19=!b19;
   seat[lp]="S19";
   lp++;
}
else
{
    this.f=f-1;
    nineteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b19=!b19;
     lp--;
     seat[lp]=null;
}
}
 
       
    }//GEN-LAST:event_nineteenSeatSelected

    private void eighteenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eighteenSeatSelected
             if(sel18==18)
{
    thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b18)                           
{
   
    this.f=f+1;
    eighteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b18=!b18;
   seat[lp]="S18";
   lp++;
}
else
{
    this.f=f-1;
    eighteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b18=!b18;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_eighteenSeatSelected

    private void seventeenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seventeenSeatSelected
                if(sel17==17)
{
    thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b17)                           
{
   
    this.f=f+1;
    seventeen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b17=!b17;
   seat[lp]="S17";
   lp++;
}
else
{
    this.f=f-1;
    seventeen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b17=!b17;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_seventeenSeatSelected

    private void sixteenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixteenSeatSelected
                if(sel16==16)
{
    sixteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b16)                           
{
   
    this.f=f+1;
    sixteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b16=!b16;
   seat[lp]="S16";
   lp++;
}
else
{
    this.f=f-1;
    sixteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b16=!b16;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_sixteenSeatSelected

    private void fifteenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fifteenSeatSelected
            if(sel15==15)
{
    thirtynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b15)                           
{
   
    this.f=f+1;
    fifteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b15=!b15;
   seat[lp]="S15";
   lp++;
}
else
{
    this.f=f-1;
    fifteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b15=!b15;
     lp--;
     seat[lp]=null;
}
}
     
    
    }//GEN-LAST:event_fifteenSeatSelected

    private void fourteenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourteenSeatSelected
                    if(sel14==14)
{
    fourteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b14)                           
{
   
    this.f=f+1;
    fourteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b14=!b14;
   seat[lp]="S14";
   lp++;
}
else
{
    this.f=f-1;
    fourteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b14=!b14;
     lp--;
     seat[lp]=null;
}
}
    
    
    }//GEN-LAST:event_fourteenSeatSelected

    private void thirteenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirteenSeatSelected
                if(sel13==13)
{
    thirteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b13)                           
{
   
    this.f=f+1;
    thirteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b13=!b13;
   seat[lp]="S13";
   lp++;
}
else
{
    this.f=f-1;
    thirteen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b13=!b13;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_thirteenSeatSelected

    private void twentyfiveSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyfiveSeatSelected
             if(sel25==25)
{
    twentyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b25)                           
{
   
    this.f=f+1;
    twentyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b25=!b25;
   seat[lp]="S25";
   lp++;
}
else
{
    this.f=f-1;
    twentyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b25=!b25;
     lp--;
     seat[lp]=null;
}
}
    
    
    }//GEN-LAST:event_twentyfiveSeatSelected

    private void thirtythreeSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirtythreeSeatSelected
                if(sel33==33)
{
    thirtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b33)                           
{
   
    this.f=f+1;
    thirtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b33=!b33;
   seat[lp]="S33";
   lp++;
}
else
{
    this.f=f-1;
    thirtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b33=!b33;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_thirtythreeSeatSelected

    private void thirtytwoSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirtytwoSeatSelected
                if(sel32==32)
{
    thirtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b32)                           
{
   
    this.f=f+1;
    thirtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b32=!b32;
   seat[lp]="S32";
   lp++;
}
else
{
    this.f=f-1;
    thirtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b32=!b32;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_thirtytwoSeatSelected

    private void thirtyoneSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirtyoneSeatSelected
                if(sel31==31)
{
    thirtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b31)                           
{
   
    this.f=f+1;
    thirtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b31=!b31;
   seat[lp]="S31";
   lp++;
}
else
{
    this.f=f-1;
    thirtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b31=!b31;
     lp--;
     seat[lp]=null;
}
}
 
    
    }//GEN-LAST:event_thirtyoneSeatSelected

    private void thirtySeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirtySeatSelected
            if(sel30==30)
{
    thirty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b30)                           
{
   
    this.f=f+1;
    thirty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b30=!b30;
   seat[lp]="S30";
   lp++;
}
else
{
    this.f=f-1;
    thirty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b30=!b30;
     lp--;
     seat[lp]=null;
}
}    
    
    }//GEN-LAST:event_thirtySeatSelected

    private void twentynineSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentynineSeatSelected
                if(sel29==29)
{
    twentynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b29)                           
{
   
    this.f=f+1;
    twentynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b29=!b29;
   seat[lp]="S29";
   lp++;
}
else
{
    this.f=f-1;
    twentynine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b29=!b29;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_twentynineSeatSelected

    private void twentyeightSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyeightSeatSelected
                if(sel28==28)
{
    twentyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b28)                           
{
   
    this.f=f+1;
    twentyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b28=!b28;
   seat[lp]="S28";
   lp++;
}
else
{
    this.f=f-1;
    twentyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b28=!b28;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_twentyeightSeatSelected

    private void twentysevenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentysevenSeatSelected
                if(sel27==27)
{
    twentyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b27)                           
{
   
    this.f=f+1;
    twentyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b27=!b27;
   seat[lp]="S27";
   lp++;
}
else
{
    this.f=f-1;
    twentyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b27=!b27;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_twentysevenSeatSelected

    private void twentysixSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentysixSeatSelected
            if(sel26==26)
{
    twentysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{    
        if(!b26)                           
{
   
    this.f=f+1;
    twentysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b26=!b26;
   seat[lp]="S26";
   lp++;
}
else
{
    this.f=f-1;
    twentysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b26=!b26;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_twentysixSeatSelected

    private void fourtyoneSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtyoneSeatSelected
                if(sel41==41)
{
    fourtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
            if(!b41)                           
{
   
    this.f=f+1;
    fourtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b41=!b41;
   seat[lp]="S41";
   lp++;
}
else
{
    this.f=f-1;
    fourtyone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b41=!b41;
     lp--;
     seat[lp]=null;
}

}
    }//GEN-LAST:event_fourtyoneSeatSelected

    private void fourtytwoSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtytwoSeatSelected
            if(sel42==42)
{
    fourtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b42)                           
{
   
    this.f=f+1;
    fourtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b42=!b42;
   seat[lp]="S42";
   lp++;
}
else
{
    this.f=f-1;
    fourtytwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b42=!b42;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_fourtytwoSeatSelected

    private void fourtythreeSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtythreeSeatSelected
            if(sel43==43)
{
    fourtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{    
        if(!b43)                           
{
   
    this.f=f+1;
    fourtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b43=!b43;
   seat[lp]="S43";
   lp++;
}
else
{
    this.f=f-1;
    fourtythree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b43=!b43;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_fourtythreeSeatSelected

    private void fourtyfourSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtyfourSeatSelected
                if(sel44==31)
{
    fourtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{
        if(!b44)                           
{
   
    this.f=f+1;
    fourtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b44=!b44;
   seat[lp]="S44";
   lp++;
}
else
{
    this.f=f-1;
    fourtyfour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b44=!b44;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_fourtyfourSeatSelected

    private void fourtyfiveSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtyfiveSeatSelected
            if(sel45==45)
{
    fourtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{     
        if(!b45)                           
{
   
    this.f=f+1;
    fourtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b45=!b45;
   seat[lp]="S45";
   lp++;
}
else
{
    this.f=f-1;
    fourtyfive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b45=!b45;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_fourtyfiveSeatSelected

    private void fourtysixSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtysixSeatSelected
            if(sel46==46)
{
    fourtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{    
        if(!b46)                           
{
   
    this.f=f+1;
    fourtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b46=!b46;
   seat[lp]="S46";
   lp++;
}
else
{
    this.f=f-1;
    fourtysix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b46=!b46;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_fourtysixSeatSelected

    private void fourtysevenSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtysevenSeatSelected
            if(sel47==47)
{
    fourtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{    
        if(!b47)                           
{
   
    this.f=f+1;
    fourtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b47=!b47;
   seat[lp]="S47";
   lp++;
}
else
{
    this.f=f-1;
    fourtyseven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b47=!b47;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_fourtysevenSeatSelected

    private void fourtyeightSeatSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourtyeightSeatSelected
            if(sel48==48)
{
    fourtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/Booked.jpg")));
}
else
{    
        if(!b48)                           
{
   
    this.f=f+1;
    fourtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/selected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText("$"+q);
   b48=!b48;
   seat[lp]="S48";
   lp++;
}
else
{
    this.f=f-1;
    fourtyeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busmanagementsystem1/newpackage/unselected.png")));
    far=da*(f);
    String q=Integer.toString(far);
    jTextField1.setText(q);
     b48=!b48;
     lp--;
     seat[lp]=null;
}
}
    
    }//GEN-LAST:event_fourtyeightSeatSelected

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed
 String u;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String store="";int j=0;
      
       while(seat[j]!=null)
       {
           try
           {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
            
            PreparedStatement ps=con.prepareStatement("insert into seats values(?,?,?,?,?,?);");
            ps.setString(1,frm );
            ps.setString(2,too );
            ps.setString(3,seat[j] );
            ps.setString(4,bbid );
            ps.setString(5,aa );
            ps.setString(6,d8 );
            ps.execute();
           }
           catch (  ClassNotFoundException | SQLException ex) {
              Logger.getLogger(LoginRegisterPage.class.getName()).log(Level.SEVERE, null, ex);
          }
           store=store+","+seat[j];
           j++;
       }
       System.out.println(store);
        if(f==0)
        {
            JOptionPane.showMessageDialog(jButton1, "No seat selected!");
        }
        else
        {
            try{
               
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/busmanagementsystem","root","");
                PreparedStatement ps1=con.prepareStatement("select userid from session");
            rs=ps1.executeQuery();
            if(rs.next())
            {
                u=rs.getString("userid");
            }
            
                PreparedStatement ps=con.prepareStatement("update ticket set seat=?,fare=? where username=? and tcktid='na';");
                ps.setString(1, store);
                ps.setInt(2, this.far);
                ps.setString(3, u);
                ps.execute();
                
            }
              catch (  ClassNotFoundException | SQLException ex) {
              Logger.getLogger(LoginRegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            
                       }
            this.dispose();
            new PassengerDetails(this.far,this.from,this.to).setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crate and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSeats(from,to,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eight;
    private javax.swing.JLabel eighteen;
    private javax.swing.JLabel eleven;
    private javax.swing.JLabel fifteen;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JLabel fourteen;
    private javax.swing.JLabel fourty;
    private javax.swing.JLabel fourtyeight;
    private javax.swing.JLabel fourtyfive;
    private javax.swing.JLabel fourtyfour;
    private javax.swing.JLabel fourtynine;
    private javax.swing.JLabel fourtyone;
    private javax.swing.JLabel fourtyseven;
    private javax.swing.JLabel fourtysix;
    private javax.swing.JLabel fourtythree;
    private javax.swing.JLabel fourtytwo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel nine;
    private javax.swing.JLabel nineteen;
    private javax.swing.JLabel one;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel seventeen;
    private javax.swing.JLabel six;
    private javax.swing.JLabel sixteen;
    private javax.swing.JLabel ten;
    private javax.swing.JLabel thirteen;
    private javax.swing.JLabel thirty;
    private javax.swing.JLabel thirtyeight;
    private javax.swing.JLabel thirtyfive;
    private javax.swing.JLabel thirtyfour;
    private javax.swing.JLabel thirtynine;
    private javax.swing.JLabel thirtyone;
    private javax.swing.JLabel thirtyseven;
    private javax.swing.JLabel thirtysix;
    private javax.swing.JLabel thirtythree;
    private javax.swing.JLabel thirtytwo;
    private javax.swing.JLabel three;
    private javax.swing.JLabel twelve;
    private javax.swing.JLabel twenty;
    private javax.swing.JLabel twentyeight;
    private javax.swing.JLabel twentyfive;
    private javax.swing.JLabel twentyfour;
    private javax.swing.JLabel twentynine;
    private javax.swing.JLabel twentyone;
    private javax.swing.JLabel twentyseven;
    private javax.swing.JLabel twentysix;
    private javax.swing.JLabel twentythree;
    private javax.swing.JLabel twentytwo;
    private javax.swing.JLabel two;
    // End of variables declaration//GEN-END:variables
}
