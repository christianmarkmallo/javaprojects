package hotelreservationsystem;
import java.sql.*;
import javax.swing.JOptionPane;

//@author JungJiMi
 
public class Signup extends javax.swing.JFrame {
     Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
 
    public Signup() {
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
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        Show = new javax.swing.JCheckBox();
        signin = new javax.swing.JLabel();
        signin1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox();
        no = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        content.setBackground(new java.awt.Color(0, 204, 204));
        content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Username :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Password :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Confirm Password :");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        Show.setBackground(new java.awt.Color(0, 204, 204));
        Show.setForeground(new java.awt.Color(255, 255, 255));
        Show.setText("Show Password");
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShowMouseExited(evt);
            }
        });
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        signin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin.setText("Sign In");
        signin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinMouseExited(evt);
            }
        });

        signin1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin1.setText("Back");
        signin1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signin1MouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Account Type:");

        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Administrator", "Guest" }));
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                typeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                typeMouseExited(evt);
            }
        });

        no.setBackground(new java.awt.Color(0, 204, 204));
        no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        no.setForeground(new java.awt.Color(0, 204, 204));
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setText("------------------");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentLayout.createSequentialGroup()
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username)
                                    .addComponent(pass1)
                                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Show))))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(signin1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(66, 66, 66)))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signin1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentLayout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        if (Show.isSelected()) {
            pass1.setEchoChar((char) 0);
            pass2.setEchoChar((char) 0);
        } else {
            pass1.setEchoChar('*');
            pass2.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowActionPerformed

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        if( type.getSelectedItem() == "Select")
      {
          JOptionPane.showMessageDialog(null, "Account type is not accessible");
          username.setText("");
          pass1.setText("");
           pass2.setText("");
      }
          else if ( type.getSelectedItem() == "Administrator")
          {
               con = Connect();
        String user = username.getText();
        String passw1 = String.valueOf(pass1.getPassword());
        String passw2 =String.valueOf(pass2.getPassword());
        
        
        if (("".equals(user) || "".equals(passw1)) || "".equals(passw2))        
        {
            JOptionPane.showMessageDialog(null,"One of more field is empty");
        }
        else
        {
            
           
       
            String sql = "Select * from admin where user='" + user + "'";
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"Username exist.");
                }
                else
                {
                    int compare = passw1.compareTo(passw2);
                    if(compare < 0)
                    {
                        JOptionPane.showMessageDialog(null,"Password not match");
                    }
                    else if(compare > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Password not match.");
                    }
                    else if(compare == 0)
                    {
                        String sign = "Insert into admin(`user`, `pass`, `pass2`)"
                                + "VALUES ('" + user + "','" + passw2 + "','" + passw2 + "')";
                        int confirm = JOptionPane.showConfirmDialog(null, "Create Account","Account Creation",JOptionPane.YES_NO_OPTION);
                  if( confirm == JOptionPane.YES_NO_OPTION)
                            
                        {
                            try
                            {
                                pst = con.prepareStatement(sign);
                                pst.execute();
                                JOptionPane.showMessageDialog(null,"Created Successfully");
                                
                                login log = new login();
                                log.setVisible(true);
                                this.dispose();
                            }
                            catch(Exception ex)
                            {
                                JOptionPane.showMessageDialog(null, ex);
                            }
                        }
                        
                    }
                }
                
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
            
                    
        }
              /*
              AdminConfirm as = new AdminConfirm();
              as.show();*/
          }
        else if ( type.getSelectedItem() == "Guest")
        {
        con = Connect();
        String user = username.getText();
        String passw1 = String.valueOf(pass1.getPassword());
        String passw2 =String.valueOf(pass2.getPassword());
        
        
        if (("".equals(user) || "".equals(passw1)) || "".equals(passw2))        
        {
            JOptionPane.showMessageDialog(null,"One of more field is empty");
        }
        else
        {
            String sql = "Select * from files where user='" + user + "'";
            try
            {
                st = con.createStatement();
                rs = st.executeQuery(sql);
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"Username exist.");
                }
                else
                {
                    int compare = passw1.compareTo(passw2);
                    if(compare < 0)
                    {
                        JOptionPane.showMessageDialog(null,"Password not match");
                    }
                    else if(compare > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Password not match.");
                    }
                    else if(compare == 0)
                    {
                        String sign = "Insert into files(`user`, `pass`, `pass2`,`access`,`Fname`, `Lname`, `gender`,`Age`, `contact`, `Address`,`city`,`province`,`nationality`,`RoomNumber`,`checkindate`,`checkoutdate`,`NumbPerson`,`DaysStaying`,`Meal`,`TotalAmount`)"
                                + "VALUES ('" + user + "','" + passw2 + "','" + passw2 + "','" +""+ "','" + "none" + "','" + "none" + "','" + "none" + "','" + "none"  + "','" +  "none"   + "','" + "none" + "','" + "none" + "','" + "none" + "','" + "none" + "','"+ "none" +"','"+ "none" +"','"+ "none" +"','"+"none"+"','"+"none"+"','"+"none"+"','"+"none"+"')";
                        int confirm = JOptionPane.showConfirmDialog(null, "Create Account","Account Creation",JOptionPane.YES_NO_OPTION);
                        if( confirm == JOptionPane.YES_NO_OPTION)
                        {
                            try
                            {
                                pst = con.prepareStatement(sign);
                                pst.execute();
                                JOptionPane.showMessageDialog(null,"Created Successfully");
                                
                                login log = new login();
                                log.setVisible(true);
                                this.dispose();
                            }
                            catch(Exception ex)
                            {
                                JOptionPane.showMessageDialog(null, ex);
                            }
                        }
                    }
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
            
        }
        }
        
    }//GEN-LAST:event_signinMouseClicked

    private void signin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin1MouseClicked
   login log = new login();
   log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signin1MouseClicked

    private void typeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseEntered
         type.setBackground(new java.awt.Color(0, 204, 204));
    }//GEN-LAST:event_typeMouseEntered

    private void typeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseExited
      type.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_typeMouseExited

    private void signin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin1MouseEntered
        signin1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_signin1MouseEntered

    private void signin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin1MouseExited
       
     
            signin1.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_signin1MouseExited

    private void signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseEntered
     signin.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_signinMouseEntered

    private void signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseExited
           signin.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_signinMouseExited

    private void ShowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseEntered
          Show.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_ShowMouseEntered

    private void ShowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseExited
           Show.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_ShowMouseExited

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Show;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel no;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signin1;
    private javax.swing.JComboBox type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
