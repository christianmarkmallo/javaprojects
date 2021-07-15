package hotelreservationsystem;
 //@author JungJiMi
import java.sql.*;
import javax.swing.*;

public class accsettings extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public accsettings() {
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

    public void mainmenu()
    {
        String sql = "Select * from files where ID = '" + id.getText() + "'";
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                String print2 = rs.getString("user");
                usern.setText(print2);
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
        jLabel6 = new javax.swing.JLabel();
        cupass = new javax.swing.JLabel();
        newpass = new javax.swing.JLabel();
        conpass = new javax.swing.JLabel();
        usern = new javax.swing.JLabel();
        accountset = new javax.swing.JLabel();
        current = new javax.swing.JPasswordField();
        newp = new javax.swing.JPasswordField();
        confirm = new javax.swing.JPasswordField();
        id = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        accountset1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

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
        account.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCOUNT SETTINGS", 0, 0, new java.awt.Font("Times New Roman", 0, 14), java.awt.Color.white)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Username: ");

        cupass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cupass.setForeground(new java.awt.Color(255, 255, 255));
        cupass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cupass.setText("Current Pasword:");

        newpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        newpass.setForeground(new java.awt.Color(255, 255, 255));
        newpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newpass.setText("New Password:");

        conpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conpass.setForeground(new java.awt.Color(255, 255, 255));
        conpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conpass.setText("Confirm Password");

        usern.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        usern.setForeground(new java.awt.Color(255, 255, 255));
        usern.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usern.setText("dsds");

        accountset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        accountset.setForeground(new java.awt.Color(255, 255, 255));
        accountset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountset.setText("CHANGE PASSWORD");
        accountset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsetMouseClicked(evt);
            }
        });

        current.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentActionPerformed(evt);
            }
        });

        id.setText("jLabel5");

        password.setText("jLabel3");

        username.setText("jLabel3");

        accountset1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        accountset1.setForeground(new java.awt.Color(255, 255, 255));
        accountset1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountset1.setText("BACK");
        accountset1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountset1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout accountLayout = new javax.swing.GroupLayout(account);
        account.setLayout(accountLayout);
        accountLayout.setHorizontalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cupass)
                    .addComponent(newpass)
                    .addComponent(conpass))
                .addGap(22, 22, 22)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usern, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(confirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(newp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(current, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
            .addGroup(accountLayout.createSequentialGroup()
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(username)
                        .addGap(83, 83, 83)
                        .addComponent(id))
                    .addGroup(accountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(accountset1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        accountLayout.setVerticalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usern, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cupass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(current, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conpass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accountLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(id))
                            .addComponent(username))
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(password)
                                    .addComponent(accountset)))
                            .addGroup(accountLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accountset1)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     con = Connect();
     mainmenu();
    }//GEN-LAST:event_formWindowOpened

    private void accountsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsetMouseClicked

        if(!String.valueOf(newp.getPassword()).equals(String.valueOf(confirm.getPassword())) ){
            JOptionPane.showMessageDialog(null,"Password did not matched");
         
        }
        else if (String.valueOf(newp.getPassword()).equals(String.valueOf(current.getPassword()))){
            JOptionPane.showMessageDialog(null,"New Password is the same with the current password");
        }
        
        else {
        con = Connect();
        String sql = "UPDATE `files` SET `pass`='" + String.valueOf(newp.getPassword()) + "',`pass2`='" + String.valueOf(confirm.getPassword()) + "'"
             +"WHERE `ID` ='" + id.getText() + "'";
                try
                {
                    pst = con.prepareStatement(sql);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Password has been changed. Use your new password in your next login.");
                     this.dispose();
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex);
                }
        }
    }//GEN-LAST:event_accountsetMouseClicked

    private void currentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentActionPerformed

    private void accountset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountset1MouseClicked
     this.dispose();
    }//GEN-LAST:event_accountset1MouseClicked

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
            java.util.logging.Logger.getLogger(accsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accsettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accsettings().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JLabel accountset;
    private javax.swing.JLabel accountset1;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JLabel conpass;
    private javax.swing.JPanel content;
    private javax.swing.JLabel cupass;
    private javax.swing.JPasswordField current;
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPasswordField newp;
    private javax.swing.JLabel newpass;
    private javax.swing.JLabel password;
    static javax.swing.JLabel usern;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
