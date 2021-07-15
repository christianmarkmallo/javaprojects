package hotelreservationsystem;
 //@author JungJiMi
import java.sql.*;
import javax.swing.*;
import javax.swing.table.TableCellEditor;

public class mainmenu extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    
    public mainmenu() {
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

   /* public void mainmenu()
    {
        String sql = "Select * from rooms where RoomNumber = '" + .getText() + "'";
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {
               
              
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        account1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rooms1 = new javax.swing.JTable();
        check = new javax.swing.JLabel();
        bookroom = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        check1 = new javax.swing.JLabel();
        IED = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        content.setBackground(new java.awt.Color(0, 204, 204));
        content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        account1.setBackground(new java.awt.Color(0, 0, 0));
        account1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), java.awt.Color.white)); // NOI18N
        account1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        account1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                account1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("List of Rooms");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setToolTipText("");

        rooms1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        rooms1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(101), "AC", "Single",  new Integer(1000)},
                { new Integer(102), "AC", "Single",  new Integer(1000)},
                { new Integer(103), "AC", "Single",  new Integer(1000)},
                { new Integer(104), "AC", "Single",  new Integer(1000)},
                { new Integer(105), "AC", "Single",  new Integer(1000)},
                { new Integer(106), "NON-AC", "Single",  new Integer(700)},
                { new Integer(107), "NON-AC", "Single",  new Integer(700)},
                { new Integer(108), "NON-AC", "Single",  new Integer(700)},
                { new Integer(109), "NON-AC", "Single",  new Integer(700)},
                { new Integer(110), "NON-AC", "Single",  new Integer(700)},
                { new Integer(201), "AC", "Double",  new Integer(2000)},
                { new Integer(202), "AC", "Double",  new Integer(2000)},
                { new Integer(203), "AC", "Double",  new Integer(2000)},
                { new Integer(204), "AC", "Double",  new Integer(2000)},
                { new Integer(205), "AC", "Double",  new Integer(2000)},
                { new Integer(206), "NON-AC", "Double",  new Integer(1500)},
                { new Integer(207), "NON-AC", "Double",  new Integer(1500)},
                { new Integer(208), "NON-AC", "Double",  new Integer(1500)},
                { new Integer(209), "NON-AC", "Double",  new Integer(1500)},
                { new Integer(210), "NON-AC", "Double",  new Integer(1500)},
                { new Integer(301), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(302), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(303), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(304), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(305), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(306), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(307), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(308), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(309), "AC", "Deluxe",  new Integer(3000)},
                { new Integer(310), "AC", "Deluxe",  new Integer(3000)}
            },
            new String [] {
                "Room No.", "Room Type", "Bed Type", "Tariff Per Room"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        rooms1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(rooms1);
        if (rooms1.getColumnModel().getColumnCount() > 0) {
            rooms1.getColumnModel().getColumn(0).setResizable(false);
            rooms1.getColumnModel().getColumn(0).setPreferredWidth(2);
            rooms1.getColumnModel().getColumn(1).setResizable(false);
            rooms1.getColumnModel().getColumn(1).setPreferredWidth(2);
            rooms1.getColumnModel().getColumn(2).setResizable(false);
            rooms1.getColumnModel().getColumn(2).setPreferredWidth(2);
            rooms1.getColumnModel().getColumn(3).setResizable(false);
            rooms1.getColumnModel().getColumn(3).setPreferredWidth(3);
        }

        check.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check.setText("Check Room");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });

        bookroom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookroom.setForeground(new java.awt.Color(255, 255, 255));
        bookroom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookroom.setText("Book Room");
        bookroom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookroomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookroomMouseEntered(evt);
            }
        });

        check1.setBackground(new java.awt.Color(0, 0, 0));
        check1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        check1.setForeground(new java.awt.Color(255, 255, 255));
        check1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check1.setText("BACK");
        check1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout account1Layout = new javax.swing.GroupLayout(account1);
        account1.setLayout(account1Layout);
        account1Layout.setHorizontalGroup(
            account1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(account1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(account1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(account1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bookroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(account1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(check1)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        account1Layout.setVerticalGroup(
            account1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGroup(account1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(account1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookroom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, account1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(account1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(account1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        IED.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        IED.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(238, Short.MAX_VALUE)
                    .addComponent(IED, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(IED)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     /*con = Connect();
     mainmenu();*/
    }//GEN-LAST:event_formWindowOpened

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        roominfo info = new roominfo();
        info.show();
        int row = rooms1.getSelectedRow();
        String room_no = rooms1.getModel().getValueAt(row, 0).toString();
        String room_type = rooms1.getModel().getValueAt(row, 1).toString();
        String bed_type = rooms1.getModel().getValueAt(row, 2).toString();
        String tarif = rooms1.getModel().getValueAt(row, 3).toString();
        
        
        roominfo.no.setText(room_no);
        roominfo.type.setText(room_type);
        roominfo.btype.setText(bed_type);
        roominfo.tariff.setText(tarif);
        
    }//GEN-LAST:event_checkMouseClicked

    private void check1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check1MouseClicked
        this.dispose();
    }//GEN-LAST:event_check1MouseClicked

    private void bookroomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookroomMouseClicked
     
       
         Roombooking room = new Roombooking();
         room.show();
         this.dispose();
         String aid = IED.getText();
         Roombooking.ayde.setText(aid);
     
        int row = rooms1.getSelectedRow();
        String room_no = rooms1.getModel().getValueAt(row, 0).toString();
        String room_type = rooms1.getModel().getValueAt(row, 1).toString();
        String bed_type = rooms1.getModel().getValueAt(row, 2).toString();
        String tarif = rooms1.getModel().getValueAt(row, 3).toString();
        
        
        Roombooking.no.setText(room_no);
        Roombooking.type.setText(room_type);
        Roombooking.btype.setText(bed_type);
        Roombooking.tariff.setText(tarif);
     
    }//GEN-LAST:event_bookroomMouseClicked

    private void bookroomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookroomMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bookroomMouseEntered

    private void account1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_account1MouseClicked

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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainmenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel IED;
    private javax.swing.JPanel account1;
    private javax.swing.JLabel bookroom;
    private javax.swing.JLabel check;
    private javax.swing.JLabel check1;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable rooms1;
    // End of variables declaration//GEN-END:variables
}
