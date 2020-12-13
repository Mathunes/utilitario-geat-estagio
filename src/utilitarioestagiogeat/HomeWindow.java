package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;

public class HomeWindow extends javax.swing.JFrame {

    public HomeWindow() {
        initComponents();
        stylizeComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        btnDeleteUser = new javax.swing.JButton();
        btnAlterUser = new javax.swing.JButton();
        btnAddUserIBM = new javax.swing.JButton();
        btnAddCC = new javax.swing.JButton();
        btnAddUserOut = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        homeWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        homeWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Utilitário GEAT");

        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/btnDeleteUserIcon.png"))); // NOI18N
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnAlterUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/btnAlterUserIcon.png"))); // NOI18N
        btnAlterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterUserActionPerformed(evt);
            }
        });

        btnAddUserIBM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/btnAddUserIBMIcon.png"))); // NOI18N
        btnAddUserIBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserIBMActionPerformed(evt);
            }
        });

        btnAddCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/btnAddCCIcon.png"))); // NOI18N
        btnAddCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCCActionPerformed(evt);
            }
        });

        btnAddUserOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/btnAddUserOutIcon.png"))); // NOI18N
        btnAddUserOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserOutActionPerformed(evt);
            }
        });

        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/btnAddUserIcon.png"))); // NOI18N
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeWindowPanelLayout = new javax.swing.GroupLayout(homeWindowPanel);
        homeWindowPanel.setLayout(homeWindowPanelLayout);
        homeWindowPanelLayout.setHorizontalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleWindow)
                    .addGroup(homeWindowPanelLayout.createSequentialGroup()
                        .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddUserIBM, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                                .addComponent(btnAddCC, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnAddUserOut, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                                .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        homeWindowPanelLayout.setVerticalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleWindow)
                .addGap(29, 29, 29)
                .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUserIBM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUserOut, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        dispose();
        
        AddUserWindow frame = new AddUserWindow();
        
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnAlterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterUserActionPerformed
        dispose();
        
        AlterUserWindow frame = new AlterUserWindow();
        
        frame.setVisible(true);
    }//GEN-LAST:event_btnAlterUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        dispose();
        
        DeleteUserWindow frame = new DeleteUserWindow();
        
        frame.setVisible(true);
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnAddUserIBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserIBMActionPerformed
        dispose();
        
        AddUserIBMWindow frame = new AddUserIBMWindow();
        
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddUserIBMActionPerformed

    private void btnAddCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCCActionPerformed
        dispose();
        
        AddCCWindow frame = new AddCCWindow();
        
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddCCActionPerformed

    private void btnAddUserOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserOutActionPerformed
        dispose();
        
        AddUserOutWindow frame = new AddUserOutWindow();
        
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddUserOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCC;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnAddUserIBM;
    private javax.swing.JButton btnAddUserOut;
    private javax.swing.JButton btnAlterUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JPanel homeWindowPanel;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        homeWindowPanel.setBackground(new Color(232, 243, 240));
        
        titleWindow.setForeground(new Color(51, 51, 51));
        titleWindow.setFont(new Font("Roboto", Font.BOLD, 28));
        titleWindow.setBounds(35, 31, titleWindow.getPreferredSize().width, titleWindow.getPreferredSize().height);
        
        btnAddUser.setLocation(35, 92);
        btnAddUser.setBackground(new Color(255, 255, 255));
        btnAddUser.setFocusable(false);
        
        btnDeleteUser.setLocation(282, 92);
        btnDeleteUser.setBackground(new Color(255, 255, 255));
        btnDeleteUser.setFocusable(false);
        
        btnAlterUser.setLocation(529, 92);
        btnAlterUser.setBackground(new Color(255, 255, 255));
        btnAlterUser.setFocusable(false);
        
        btnAddUserIBM.setLocation(35, 280);
        btnAddUserIBM.setBackground(new Color(255, 255, 255));
        btnAddUserIBM.setFocusable(false);
        
        btnAddCC.setLocation(282, 280);
        btnAddCC.setBackground(new Color(255, 255, 255));
        btnAddCC.setFocusable(false);
        
        btnAddUserOut.setLocation(529, 280);
        btnAddUserOut.setBackground(new Color(255, 255, 255));
        btnAddUserOut.setFocusable(false);
    }
}
