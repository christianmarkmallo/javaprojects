
package hotelreservationsystem;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class myreservations extends javax.swing.JFrame {
  Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    public myreservations() {
        initComponents();
         setLocationRelativeTo(null);
    }
        public java.sql.Connection Connect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            st =con.createStatement();
            return con;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Not Connected");
            return null;
        }
    }
         public void reserve()
    {
       
        String sql = "Select * from files where ID = '" + id.getText() + "'";
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                String city = rs.getString("city");
                String province = rs.getString("province");
                String aname = rs.getString("Fname");
                String na = rs.getString("Lname");
                name.setText(aname + " "+na);
                String addresss = rs.getString("Address");
                address.setText(addresss + " "+city+" "+province );
                 String contaact = rs.getString("contact");
                 contact1.setText(contaact);
                 String rnumb = rs.getString("RoomNumber");
                 rNumber.setText(rnumb);
                 String npers = rs.getString("NumbPerson");
                 noperson.setText(npers);
                 String dayss = rs.getString("DaysStaying");
                 days.setText(dayss);
                 String chin = rs.getString("checkindate");
                 indate.setText(chin);
                 String chout = rs.getString("checkoutdate");
                 outdate.setText(chout);
                 String food = rs.getString("Meal");
                 meal.setText(food);
                 String rsdate = rs.getString("checkindate");
                 reserveddate.setText(rsdate);
                 String Total = rs.getString("TotalAmount");
                 total.setText(Total);
                  
            }
         }
        
    
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
              public void reserve1()
    {
      String sq2l = "Select * from rooms where RoomNumber = '" + rNumber.getText() + "'";
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(sq2l);
            while(rs.next())
            {
                 String rtype = rs.getString("RoomType");
                 Rtype.setText(rtype);
            }
         }
        
    
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        account = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        CANCEL = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        Rtype = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        contact1 = new javax.swing.JLabel();
        rNumber = new javax.swing.JLabel();
        noperson = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sa = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        indate = new javax.swing.JLabel();
        outdate = new javax.swing.JLabel();
        days = new javax.swing.JLabel();
        meal = new javax.swing.JLabel();
        sa1 = new javax.swing.JLabel();
        sa2 = new javax.swing.JLabel();
        reserveddate = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        content.setBackground(new java.awt.Color(0, 204, 204));
        content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        account.setBackground(new java.awt.Color(0, 0, 0));
        account.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MY RESERVATION", 0, 0, new java.awt.Font("Times New Roman", 0, 14), java.awt.Color.white)); // NOI18N

        CANCEL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        CANCEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CANCEL.setText("CANCEL RESERVATION");
        CANCEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CANCEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CANCEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CANCELMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Name:");

        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id.setText("jLabel19");

        check.setBackground(new java.awt.Color(0, 0, 0));
        check.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check.setText("BACK");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ID Number:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Address:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Contact Number:");

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("jLabel19");

        address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        address.setText("jLabel19");

        Rtype.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Rtype.setForeground(new java.awt.Color(255, 255, 255));
        Rtype.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Rtype.setText("jLabel19");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Room Type:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Room Number:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Number of Person:");

        contact1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact1.setForeground(new java.awt.Color(255, 255, 255));
        contact1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contact1.setText("jLabel19");

        rNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rNumber.setForeground(new java.awt.Color(255, 255, 255));
        rNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rNumber.setText("jLabel19");

        noperson.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        noperson.setForeground(new java.awt.Color(255, 255, 255));
        noperson.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        noperson.setText("jLabel19");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Check-in-date:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Check-out-date:");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("No. of days staying:");

        sa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sa.setForeground(new java.awt.Color(255, 255, 255));
        sa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sa.setText("Meal:");

        indate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        indate.setForeground(new java.awt.Color(255, 255, 255));
        indate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        indate.setText("jLabel19");

        outdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        outdate.setForeground(new java.awt.Color(255, 255, 255));
        outdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outdate.setText("jLabel19");

        days.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        days.setForeground(new java.awt.Color(255, 255, 255));
        days.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        days.setText("jLabel19");

        meal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        meal.setForeground(new java.awt.Color(255, 255, 255));
        meal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        meal.setText("jLabel19");

        sa1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sa1.setForeground(new java.awt.Color(255, 255, 255));
        sa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sa1.setText("Reserved Date:");

        sa2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sa2.setForeground(new java.awt.Color(255, 255, 255));
        sa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sa2.setText("Total Amount:");

        reserveddate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reserveddate.setForeground(new java.awt.Color(255, 255, 255));
        reserveddate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reserveddate.setText("jLabel19");

        total.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total.setText("jLabel19");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRINT");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout accountLayout = new javax.swing.GroupLayout(account);
        account.setLayout(accountLayout);
        accountLayout.setHorizontalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accountLayout.createSequentialGroup()
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createSequentialGroup()
                                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))
                                        .addGap(37, 37, 37))
                                    .addGroup(accountLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(8, 8, 8)))
                                .addGap(20, 20, 20)
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                        .addComponent(contact1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(accountLayout.createSequentialGroup()
                                .addComponent(sa)
                                .addGap(94, 94, 94)
                                .addComponent(meal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(accountLayout.createSequentialGroup()
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sa1)
                                    .addComponent(sa2))
                                .addGap(42, 42, 42)
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(reserveddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(accountLayout.createSequentialGroup()
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addGap(16, 16, 16)
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(noperson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Rtype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(accountLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(accountLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(42, 42, 42)
                                .addComponent(indate, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(accountLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(34, 34, 34)
                                .addComponent(outdate, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createSequentialGroup()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(accountLayout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CANCEL)
                                .addGap(38, 38, 38)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accountLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, accountLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))))
        );
        accountLayout.setVerticalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(contact1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Rtype))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(rNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(noperson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(indate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(outdate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(days))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sa)
                    .addComponent(meal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sa1)
                    .addComponent(reserveddate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sa2)
                    .addComponent(total))
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANCELMouseClicked
                    
        con = Connect();
      
              
                  String sql = "Select * from files where Fname='" + name.getText() + "'";
               
               try
                                {
                                st = con.createStatement();
                                rs = st.executeQuery(sql);
              
                            String file = "UPDATE `files` SET `access` = '"+""+"',`Fname` ='" + "none" + "',`Lname` = '" + "none" + "', `gender` ='" + "none" + "',`Age` ='" + "none" + "' , `contact` ='" + 0 + "' ,`Address` ='" + "none" + "',`city` = '" + "none" + "',`province` ='" + "none" + "',`nationality` ='" + "none" + "',`RoomNumber` = '" + "none"+ "',`checkindate` = '"+ "none" +"',`checkoutdate` = '"+ "none" +"',`NumbPerson` ='"+"none"+"',`DaysStaying` = '"+"none"+"',`Meal` ='"+"none"+"',`TotalAmount` ='"+"none"+"'"
                                +"WHERE `ID` ='" + id.getText() + "'";
          
                           
                             
                             String sql1 = "UPDATE rooms SET Availability = 'Available' WHERE RoomNumber = "+rNumber.getText()+" ";
                 

                              int confirm = JOptionPane.showConfirmDialog(null, "Cancel Reservation?","Confirm",JOptionPane.YES_NO_OPTION);
                        if( confirm == JOptionPane.YES_NO_OPTION)
                        {
                            try
                            {
                              
                    
                                 st = con.createStatement();
                            pst = con.prepareStatement(file);
                            pst.execute();
                            pst.executeUpdate();
                           st.executeUpdate(sql1);
                          
                           JOptionPane.showMessageDialog(null,"Cancelled Successfully");
                            
                            
                            this.dispose();
                            }
                            catch(Exception ex)
                            {
                            JOptionPane.showMessageDialog(null, ex);
                            }
                        }
                            
                                }
               catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
                
         
    }//GEN-LAST:event_CANCELMouseClicked

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        this.dispose();
    }//GEN-LAST:event_checkMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    con = Connect();
    reserve();
    reserve1();
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      print pr= new print();
      pr.show();
        print.name.setText(name.getText());
        print.id.setText(id.getText());
        print.address.setText(address.getText());
        print.contact1.setText(contact1.getText());
        print.rNumber.setText(rNumber.getText());
        print.noperson.setText(noperson.getText());
        print.days.setText(days.getText());
        print.Rtype.setText(Rtype.getText());
        print.indate.setText(indate.getText());
        print.outdate.setText(outdate.getText());
        print.meal.setText(meal.getText());
        print.reserveddate.setText(reserveddate.getText());
        print.total.setText(total.getText());
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(myreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myreservations().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CANCEL;
    public static javax.swing.JLabel Rtype;
    private javax.swing.JPanel account;
    public static javax.swing.JLabel address;
    private javax.swing.JLabel check;
    public static javax.swing.JLabel contact1;
    private javax.swing.JPanel content;
    public static javax.swing.JLabel days;
    public static javax.swing.JLabel id;
    public static javax.swing.JLabel indate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JLabel meal;
    public static javax.swing.JLabel name;
    public static javax.swing.JLabel noperson;
    public static javax.swing.JLabel outdate;
    public static javax.swing.JLabel rNumber;
    public static javax.swing.JLabel reserveddate;
    private javax.swing.JLabel sa;
    private javax.swing.JLabel sa1;
    private javax.swing.JLabel sa2;
    public static javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
