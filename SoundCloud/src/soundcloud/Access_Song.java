/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.sql.ResultSet;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static soundcloud.AddPlayList.showAddPlayList;
import static soundcloud.PlatformsPopUp.showPlatformPage;
import static soundcloud.Song_Page.showSongPage;

/**
 *
 * @author hamza
 */
public class Access_Song extends javax.swing.JFrame {

    /**
     * Creates new form Access_Song
     */
    DBConnection conn = DBConnection.getInstance();
    DefaultTableModel dtm,dtm_playlist;
    ResultSet x,playlist_rs;
    private static MediaPlayer mp;
    String path="Music\\";
    private static Music_player mmp;
    User u;
    String sel,writ,des;
    public Access_Song(User u) {
        
        this.u=u;
        x = conn.SongDetail("");
        dtm = DBConnection.buildTableModel(x);
        playlist_rs = conn.playlistDetail("");
        dtm_playlist = DBConnection.buildTableModel(playlist_rs);
        initComponents();
    }
    public Access_Song(User u, String song) {
        //mmp=new Music_player(mp,path);
        this.u=u;
        x = conn.SongDetail(song);
        dtm = DBConnection.buildTableModel(x);
        playlist_rs = conn.playlistDetail("");
        dtm_playlist = DBConnection.buildTableModel(playlist_rs);
        initComponents();
        this.jTable1.setRowSelectionAllowed(true);
        this.jTable2.setRowSelectionAllowed(true);

    }        
    public Access_Song(User u, ResultSet abc) {
        //mmp=new Music_player(mp,path);
        this.u=u;
        x = abc;
        dtm = DBConnection.buildTableModel(x);
        playlist_rs = conn.playlistDetail("");
        dtm_playlist = DBConnection.buildTableModel(playlist_rs);
        initComponents();
        this.jTable1.setRowSelectionAllowed(true);
        this.jTable2.setRowSelectionAllowed(true);

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
        jButton3 = new javax.swing.JButton();
        songinput = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(dtm);
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable(dtm_playlist);
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soundcloud/Capture7.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 68, 29));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sign Out");
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 16, 90, 25));

        songinput.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        songinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songinputActionPerformed(evt);
            }
        });
        jPanel1.add(songinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 12, 200, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soundcloud/Capture8.PNG"))); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 26));

        search.setBackground(new java.awt.Color(51, 51, 51));
        search.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 16, 90, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Result");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, 590));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADD TO PLAYLIST");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soundcloud/Capture12.PNG"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 530, 178));

        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 280));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Share");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 100, 30));

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Create New Playlist");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 140, 30));

        jScrollPane1.setViewportView(jTable2);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 120, 280));

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Give Feedback");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 140, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 50, 610, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Boolean JOPTION(int s)
    {
        if(s == -1)
        {
            JOptionPane.showMessageDialog(null, "Select a Song");
            return false;
        }
        return true;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jTable1.setRowSelectionAllowed(true);
        int selected_row = this.jTable1.getSelectedRow();
        if(!JOPTION(selected_row))
            return;
        
        //int user_id = (int) this.userlist.getValueAt(selected_row, 0);
        String filename = (String) this.jTable1.getValueAt(selected_row, 5);
        String title = (String) this.jTable1.getValueAt(selected_row, 1);
        int song_id = conn.getSongID(title);
        Song s = conn.retrieveSong(song_id);
        
        // String email = (String) this.userlist.getValueAt(selected_row, 2);
        path = "Music\\" + s.path_to_file;        
        mmp=new Music_player( mp,path);
        mmp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int yesno=JOptionPane.showConfirmDialog(null,"Are You Sure To Sign Out","Sign_Out",JOptionPane.YES_NO_OPTION);
        if(yesno==0){
              SoundCloud.u = null;
              this.dispose();
              StartPage p = new StartPage();
              p.setVisible(true);
              // redirect kar deni ha login page par              ----------------
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // TODO add your handling code here:
        
        //set visibility true karni ha last page ki and is ki false karni ha  ------------------
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.jTable2.setRowSelectionAllowed(true);
       this.jTable1.setRowSelectionAllowed(true);
        int selected_row_1 = this.jTable1.getSelectedRow();
        int selected_row_2 = this.jTable2.getSelectedRow();
        if(!JOPTION(selected_row_1))
            return;
        if(!JOPTION(selected_row_2))
            return;
        int playlist_id = (int) this.jTable2.getValueAt(selected_row_2, 0);
        //String filename = (String) this.jTable1.getValueAt(selected_row_1, 5);
        String title = (String) this.jTable1.getValueAt(selected_row_1, 1);
        int song_id = conn.getSongID(title);
        conn.addToPlaylist(song_id,playlist_id);
        JOptionPane.showMessageDialog(null,"Song added to playlist successfully");
        //Song s = conn.retrieveSong(song_id);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        writ = songinput.getText();
        x = conn.SongDetail(writ);
//        dtm = DBConnection.buildTableModel(x);
        this.dispose();
        System.out.println(writ);
        Access_Song assedfds = new Access_Song(SoundCloud.u, x);
        assedfds.setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.jTable1.setRowSelectionAllowed(true);
        int selected_row = this.jTable1.getSelectedRow();
        if(!JOPTION(selected_row))
            return;
        //int user_id = (int) this.userlist.getValueAt(selected_row, 0);
        //int user_id = (int) this.userlist.getValueAt(selected_row, 0);
        String filename = (String) this.jTable1.getValueAt(selected_row, 5);
        String title = (String) this.jTable1.getValueAt(selected_row, 1);
        int song_id = conn.getSongID(title);
        Song s = conn.retrieveSong(song_id);
        String url = s.Url;
        System.out.println(url);

    // String email = (String) this.userlist.getValueAt(selected_row, 2);
        if(url.isEmpty())
                   JOptionPane.showMessageDialog(null,"This song cant be shared because it has no url");
            else{
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();     //storing into buffer
                StringSelection selection = new StringSelection(url);
                clipboard.setContents(selection, selection); 
                showPlatformPage();
            }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UserHome uh = new UserHome();
        uh.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        System.out.println(SoundCloud.u.id);
        AddPlayList ap = new AddPlayList();
        ap.showAddPlayList(SoundCloud.u);

        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.jTable1.setRowSelectionAllowed(true);
        int selected_row = this.jTable1.getSelectedRow();
        if(!JOPTION(selected_row))
            return;
        //int user_id = (int) this.userlist.getValueAt(selected_row, 0);
        String filename = (String) this.jTable1.getValueAt(selected_row, 5);
        String title = (String) this.jTable1.getValueAt(selected_row, 1);
        int song_id = conn.getSongID(title);
        Feed f = new Feed(song_id);
        f.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void songinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songinputActionPerformed

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
            java.util.logging.Logger.getLogger(Access_Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Access_Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Access_Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Access_Song.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User u = null;
                new Access_Song(u).setVisible(true);    
            }
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton search;
    private javax.swing.JTextField songinput;
    // End of variables declaration//GEN-END:variables

}
