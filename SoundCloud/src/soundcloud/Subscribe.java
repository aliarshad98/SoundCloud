/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ibrahim
 */
public class Subscribe extends javax.swing.JFrame {
    DBConnection conn = DBConnection.getInstance();
    //SubscriptionManager subman = SubscriptionManager.getInstance("qwe", "dfsg", "sfddf", "sffsdsf");
    DefaultTableModel dtm;
    ResultSet x;
    User u;
    /**
     * Creates new form Subscribe
     */
    public Subscribe() {
        this.setResizable(false);
        x = conn.getSubscriptionPackages();
        dtm = DBConnection.buildTableModel(x);
        initComponents();
        this.title.setText("Subscription Packages");
    }
    public Subscribe(User a) {
        u = a;
        this.setResizable(false);
        x = conn.getSubscriptionPackages();
        dtm = DBConnection.buildTableModel(x);
        initComponents();
        this.title.setText("Subscription Packages");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        subpackages = new JTable(dtm);
        title = new javax.swing.JLabel();
        viewpast = new javax.swing.JButton();
        Subscribe = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subpackages.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(subpackages);

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setText("Browse Packages");

        viewpast.setText("View Current Subscription");
        viewpast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpastActionPerformed(evt);
            }
        });

        Subscribe.setText("Subscribe");
        Subscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscribeActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soundcloud/Capture8.PNG"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewpast, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Subscribe, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewpast)
                    .addComponent(Subscribe))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewpastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpastActionPerformed
        // TODO add your handling code here:
        try{
            String a = SoundCloud.u.sub.subpackage.name;
            Subscription sub = conn.getSubscription(SoundCloud.u.id);
            JOptionPane.showMessageDialog(null, "Package: "+ sub.subpackage.name +"\nExpiry: "+ sub.subscription_expiry+"\n");
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "No subscriptions yet.");

        }
        
    }//GEN-LAST:event_viewpastActionPerformed

    private void SubscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubscribeActionPerformed
        
        this.subpackages.setRowSelectionAllowed(true);
        int selected_row = this.subpackages.getSelectedRow();
        int package_id = (int) this.subpackages.getValueAt(selected_row, 0);
        String name = (String) this.subpackages.getValueAt(selected_row, 1);
        double price = (double) this.subpackages.getValueAt(selected_row, 2);
        
        
        JTextField pas = new JTextField(40);
        JLabel abc = new JLabel("Enter 14-digit Credit Card number: " + name);
        int ok = JOptionPane.showConfirmDialog(null, pas,"Credit Card", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (ok==0)
        {
            if (pas.getText().length()==14)
            {
                SubscriptionPackages sp = new SubscriptionPackages(name, price);
                String status = SoundCloud.u.SubPackage(sp);
                conn.setUserSubscription(SoundCloud.u, sp);
                if (status=="Success")
                {
                    Subscription sub = conn.getSubscription(SoundCloud.u.id);
                    SoundCloud.u.setSub(sub);
                    JOptionPane.showMessageDialog(null, SoundCloud.u.getName()+" has successfully subscribed to " + name + ".");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Unable to subscribe");
                }
            }    
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Credit card number length");
            }
        
        }
        
    }//GEN-LAST:event_SubscribeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        UserHome uh = new UserHome();
        uh.setVisible(true);
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Subscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subscribe(SoundCloud.u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Subscribe;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable subpackages;
    private javax.swing.JLabel title;
    private javax.swing.JButton viewpast;
    // End of variables declaration//GEN-END:variables
}
