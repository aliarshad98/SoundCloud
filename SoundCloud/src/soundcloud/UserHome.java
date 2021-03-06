/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundcloud;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ali Arshad
 */
public class UserHome extends javax.swing.JFrame {

    /**
     * Creates new form UserHome
     */
    public UserHome() {
        initComponents();
        EdPanel.setVisible(false);
    }
    
    private void setLabelColor(JPanel jPanel){
        jPanel.setBackground(Color.ORANGE);
    }
    
    private void resetLabelColor(JPanel jPanel){
        jPanel.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TrendingListPanel = new javax.swing.JPanel();
        TrListLabel = new javax.swing.JLabel();
        BrSongPanel = new javax.swing.JPanel();
        BrSongLabel = new javax.swing.JLabel();
        BrAlbumPanel = new javax.swing.JPanel();
        BrAlbumLabel = new javax.swing.JLabel();
        EditPanel = new javax.swing.JPanel();
        EditLabel = new javax.swing.JLabel();
        DePanel = new javax.swing.JPanel();
        DeLabel = new javax.swing.JLabel();
        OutPanel = new javax.swing.JPanel();
        OutLabel = new javax.swing.JLabel();
        SubsPanel = new javax.swing.JPanel();
        SubsLabel = new javax.swing.JLabel();
        FollowingPanel = new javax.swing.JPanel();
        FollowingLabel = new javax.swing.JLabel();
        FollowersPanel = new javax.swing.JPanel();
        FollowersLabel = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        EdPanel = new javax.swing.JPanel();
        EdLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameEdText = new javax.swing.JTextField();
        PassLabel = new javax.swing.JLabel();
        PassEdText = new javax.swing.JPasswordField();
        MobileLabel = new javax.swing.JLabel();
        MobileEdText = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        Main.setBackground(new java.awt.Color(255, 255, 255));

        Left.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soundcloud/index.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        TrendingListPanel.setBackground(new java.awt.Color(255, 255, 255));
        TrendingListPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrendingListPanelMouseClicked(evt);
            }
        });

        TrListLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TrListLabel.setForeground(new java.awt.Color(255, 153, 0));
        TrListLabel.setText("             Trending Songs");

        javax.swing.GroupLayout TrendingListPanelLayout = new javax.swing.GroupLayout(TrendingListPanel);
        TrendingListPanel.setLayout(TrendingListPanelLayout);
        TrendingListPanelLayout.setHorizontalGroup(
            TrendingListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TrListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TrendingListPanelLayout.setVerticalGroup(
            TrendingListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrendingListPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TrListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BrSongPanel.setBackground(new java.awt.Color(255, 255, 255));
        BrSongPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrSongPanelMouseClicked(evt);
            }
        });

        BrSongLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BrSongLabel.setForeground(new java.awt.Color(255, 153, 51));
        BrSongLabel.setText("             Access Song");

        javax.swing.GroupLayout BrSongPanelLayout = new javax.swing.GroupLayout(BrSongPanel);
        BrSongPanel.setLayout(BrSongPanelLayout);
        BrSongPanelLayout.setHorizontalGroup(
            BrSongPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BrSongLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BrSongPanelLayout.setVerticalGroup(
            BrSongPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BrSongPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(BrSongLabel)
                .addContainerGap())
        );

        BrAlbumPanel.setBackground(new java.awt.Color(255, 255, 255));
        BrAlbumPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrAlbumPanelMouseClicked(evt);
            }
        });

        BrAlbumLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BrAlbumLabel.setForeground(new java.awt.Color(255, 153, 0));
        BrAlbumLabel.setText("             Upload a Song");

        javax.swing.GroupLayout BrAlbumPanelLayout = new javax.swing.GroupLayout(BrAlbumPanel);
        BrAlbumPanel.setLayout(BrAlbumPanelLayout);
        BrAlbumPanelLayout.setHorizontalGroup(
            BrAlbumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BrAlbumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BrAlbumPanelLayout.setVerticalGroup(
            BrAlbumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BrAlbumPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(BrAlbumLabel)
                .addContainerGap())
        );

        EditPanel.setBackground(new java.awt.Color(255, 255, 255));
        EditPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditPanelMouseClicked(evt);
            }
        });

        EditLabel.setBackground(new java.awt.Color(255, 255, 255));
        EditLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditLabel.setForeground(new java.awt.Color(255, 153, 0));
        EditLabel.setText("             Edit Details");

        javax.swing.GroupLayout EditPanelLayout = new javax.swing.GroupLayout(EditPanel);
        EditPanel.setLayout(EditPanelLayout);
        EditPanelLayout.setHorizontalGroup(
            EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditPanelLayout.setVerticalGroup(
            EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EditLabel)
                .addContainerGap())
        );

        DePanel.setBackground(new java.awt.Color(255, 255, 255));
        DePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DePanelMouseClicked(evt);
            }
        });

        DeLabel.setBackground(new java.awt.Color(255, 255, 255));
        DeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeLabel.setForeground(new java.awt.Color(255, 153, 0));
        DeLabel.setText("            Delete Account");

        javax.swing.GroupLayout DePanelLayout = new javax.swing.GroupLayout(DePanel);
        DePanel.setLayout(DePanelLayout);
        DePanelLayout.setHorizontalGroup(
            DePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DePanelLayout.setVerticalGroup(
            DePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DePanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(DeLabel)
                .addContainerGap())
        );

        OutPanel.setBackground(new java.awt.Color(255, 255, 255));
        OutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OutPanelMouseClicked(evt);
            }
        });

        OutLabel.setBackground(new java.awt.Color(255, 255, 255));
        OutLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OutLabel.setForeground(new java.awt.Color(255, 153, 0));
        OutLabel.setText("                 Sign Out");

        javax.swing.GroupLayout OutPanelLayout = new javax.swing.GroupLayout(OutPanel);
        OutPanel.setLayout(OutPanelLayout);
        OutPanelLayout.setHorizontalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OutPanelLayout.setVerticalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(OutLabel)
                .addContainerGap())
        );

        SubsPanel.setBackground(new java.awt.Color(255, 255, 255));
        SubsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubsPanelMouseClicked(evt);
            }
        });

        SubsLabel.setBackground(new java.awt.Color(255, 255, 255));
        SubsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubsLabel.setForeground(new java.awt.Color(255, 153, 0));
        SubsLabel.setText("             Subscriptions");

        javax.swing.GroupLayout SubsPanelLayout = new javax.swing.GroupLayout(SubsPanel);
        SubsPanel.setLayout(SubsPanelLayout);
        SubsPanelLayout.setHorizontalGroup(
            SubsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SubsPanelLayout.setVerticalGroup(
            SubsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubsPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(SubsLabel)
                .addContainerGap())
        );

        FollowingPanel.setBackground(new java.awt.Color(255, 255, 255));
        FollowingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FollowingPanelMouseClicked(evt);
            }
        });

        FollowingLabel.setBackground(new java.awt.Color(255, 255, 255));
        FollowingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FollowingLabel.setForeground(new java.awt.Color(255, 153, 0));
        FollowingLabel.setText("               Following");

        javax.swing.GroupLayout FollowingPanelLayout = new javax.swing.GroupLayout(FollowingPanel);
        FollowingPanel.setLayout(FollowingPanelLayout);
        FollowingPanelLayout.setHorizontalGroup(
            FollowingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FollowingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FollowingPanelLayout.setVerticalGroup(
            FollowingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FollowingPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(FollowingLabel)
                .addContainerGap())
        );

        FollowersPanel.setBackground(new java.awt.Color(255, 255, 255));
        FollowersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FollowersPanelMouseClicked(evt);
            }
        });

        FollowersLabel.setBackground(new java.awt.Color(255, 255, 255));
        FollowersLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FollowersLabel.setForeground(new java.awt.Color(255, 153, 0));
        FollowersLabel.setText("               Followers");

        javax.swing.GroupLayout FollowersPanelLayout = new javax.swing.GroupLayout(FollowersPanel);
        FollowersPanel.setLayout(FollowersPanelLayout);
        FollowersPanelLayout.setHorizontalGroup(
            FollowersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FollowersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FollowersPanelLayout.setVerticalGroup(
            FollowersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FollowersPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(FollowersLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TrendingListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BrSongPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BrAlbumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EditPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SubsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addComponent(FollowingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(FollowersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TrendingListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrSongPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrAlbumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FollowingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FollowersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right.setBackground(new java.awt.Color(255, 255, 255));

        EdPanel.setBackground(new java.awt.Color(255, 255, 255));

        EdLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EdLabel.setForeground(new java.awt.Color(255, 153, 0));
        EdLabel.setText("Edit Details");

        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameLabel.setText("Name");

        PassLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PassLabel.setText("Password");

        MobileLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MobileLabel.setText("Mobile");

        UpdateButton.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EdPanelLayout = new javax.swing.GroupLayout(EdPanel);
        EdPanel.setLayout(EdPanelLayout);
        EdPanelLayout.setHorizontalGroup(
            EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EdPanelLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(EdLabel)
                .addGap(128, 128, 128))
            .addGroup(EdPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MobileLabel)
                    .addGroup(EdPanelLayout.createSequentialGroup()
                        .addGroup(EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassLabel)
                            .addComponent(NameLabel))
                        .addGap(33, 33, 33)
                        .addGroup(EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateButton)
                            .addGroup(EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PassEdText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NameEdText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MobileEdText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EdPanelLayout.setVerticalGroup(
            EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EdPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(EdLabel)
                .addGap(43, 43, 43)
                .addGroup(EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameEdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel)
                    .addComponent(PassEdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(EdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MobileLabel)
                    .addComponent(MobileEdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(UpdateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addComponent(EdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrendingListPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrendingListPanelMouseClicked
        // TODO add your handling code here:
        setLabelColor(TrendingListPanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(DePanel);
        resetLabelColor(OutPanel);
        resetLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        EdPanel.setVisible(false);
        this.dispose();
        TrendingList tl = new TrendingList();
        tl.setVisible(true);
    }//GEN-LAST:event_TrendingListPanelMouseClicked

    private void BrSongPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrSongPanelMouseClicked
        // TODO add your handling code here:
        setLabelColor(BrSongPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(DePanel);
        resetLabelColor(OutPanel);
        resetLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        EdPanel.setVisible(false);
        this.dispose();
        Access_Song s = new Access_Song(SoundCloud.u);
        s.setVisible(true);
    }//GEN-LAST:event_BrSongPanelMouseClicked

    private void BrAlbumPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrAlbumPanelMouseClicked
        // TODO add your handling code here:
        setLabelColor(BrAlbumPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(DePanel);
        resetLabelColor(OutPanel);
        resetLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        //EdPanel.setVisible(false);
        this.dispose();
        test t = new test();
        t.setVisible(true);
    }//GEN-LAST:event_BrAlbumPanelMouseClicked

    private void EditPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditPanelMouseClicked
        // TODO add your handling code here:
        setLabelColor(EditPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(DePanel);
        resetLabelColor(OutPanel);
        resetLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        EdPanel.setVisible(true);
        NameEdText.setText(SoundCloud.u.name);
        PassEdText.setText(SoundCloud.u.password);
        MobileEdText.setText(SoundCloud.u.mobile_number);
    }//GEN-LAST:event_EditPanelMouseClicked

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        String Name = NameEdText.getText().toString();
        char[] p = PassEdText.getPassword();
        String pass = new String(p);
        String mob = MobileEdText.getText().toString();
        SoundCloud.u.setName(Name);
        SoundCloud.u.setPassword(pass);
        SoundCloud.u.setNum(mob);
        DBConnection db = DBConnection.getInstance();
        boolean flag = db.updateUser(SoundCloud.u);
        if (flag == true)
        {
            JOptionPane.showMessageDialog(this, "User updated Succesfully");
            resetLabelColor(EditPanel);
            EdPanel.setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(this, "User not Updated");
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DePanelMouseClicked
        // TODO add your handling code here:
        setLabelColor(DePanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(OutPanel);
        resetLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        EdPanel.setVisible(false);
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            DBConnection db = DBConnection.getInstance();
            int id = db.getUserID(SoundCloud.u);
            boolean flag = db.permanentlyDelete(id);
            if (flag == true)
            {
                JOptionPane.showMessageDialog(this, "User deleted Successfully");
            }
            else
                JOptionPane.showMessageDialog(this,"User not deleted");
            SoundCloud.u = null;
            this.dispose();
            StartPage st = new StartPage();
            st.setVisible(true);
        } 
        else
        {
             // no option
        }
    }//GEN-LAST:event_DePanelMouseClicked

    private void OutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OutPanelMouseClicked
        // TODO add your handling code here:
        setLabelColor(OutPanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(DePanel);
        resetLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        EdPanel.setVisible(false);
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            SoundCloud.u = null;
            StartPage st = new StartPage();
            this.dispose();
        } 
        else
        {
             // no option
        }
    }//GEN-LAST:event_OutPanelMouseClicked

    private void SubsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubsPanelMouseClicked
        // TODO add your handling code here:
        resetLabelColor(OutPanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(DePanel);
        setLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        EditPanel.setVisible(false);
        this.dispose();
        Subscribe sub = new Subscribe();
        sub.setVisible(true);
        
    }//GEN-LAST:event_SubsPanelMouseClicked

    private void FollowingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FollowingPanelMouseClicked
        // TODO add your handling code here:
        resetLabelColor(OutPanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(DePanel);
        resetLabelColor(SubsPanel);
        setLabelColor(FollowingPanel);
        resetLabelColor(FollowersPanel);
        EditPanel.setVisible(false);
        this.dispose();
        Following following = new Following();
        following.setVisible(true);
    }//GEN-LAST:event_FollowingPanelMouseClicked

    private void FollowersPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FollowersPanelMouseClicked
        // TODO add your handling code here:
        resetLabelColor(OutPanel);
        resetLabelColor(BrSongPanel);
        resetLabelColor(BrAlbumPanel);
        resetLabelColor(EditPanel);
        resetLabelColor(TrendingListPanel);
        resetLabelColor(DePanel);
        resetLabelColor(SubsPanel);
        resetLabelColor(FollowingPanel);
        setLabelColor(FollowersPanel);
        EditPanel.setVisible(false);
        this.dispose();
        Followers followers = new Followers();
        followers.setVisible(true);

    }//GEN-LAST:event_FollowersPanelMouseClicked

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BrAlbumLabel;
    private javax.swing.JPanel BrAlbumPanel;
    private javax.swing.JLabel BrSongLabel;
    private javax.swing.JPanel BrSongPanel;
    private javax.swing.JLabel DeLabel;
    private javax.swing.JPanel DePanel;
    private javax.swing.JLabel EdLabel;
    private javax.swing.JPanel EdPanel;
    private javax.swing.JLabel EditLabel;
    private javax.swing.JPanel EditPanel;
    private javax.swing.JLabel FollowersLabel;
    private javax.swing.JPanel FollowersPanel;
    private javax.swing.JLabel FollowingLabel;
    private javax.swing.JPanel FollowingPanel;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Main;
    private javax.swing.JTextField MobileEdText;
    private javax.swing.JLabel MobileLabel;
    private javax.swing.JTextField NameEdText;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel OutLabel;
    private javax.swing.JPanel OutPanel;
    private javax.swing.JPasswordField PassEdText;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel SubsLabel;
    private javax.swing.JPanel SubsPanel;
    private javax.swing.JLabel TrListLabel;
    private javax.swing.JPanel TrendingListPanel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
