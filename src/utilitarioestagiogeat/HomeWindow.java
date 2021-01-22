package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;

public class HomeWindow extends javax.swing.JFrame {

    public HomeWindow() {
        //Título da janela
        super("Utilitário GEAT - Gerador de colinhas");
        initComponents();
        //Método para estilizar os componentes
        stylizeComponents();
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
        jLabel1 = new javax.swing.JLabel();
        version = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        homeWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        homeWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Utilitário GEAT");

        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/btnDeleteUserIcon.png"))); // NOI18N
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnAlterUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/btnAlterUserIcon.png"))); // NOI18N
        btnAlterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterUserActionPerformed(evt);
            }
        });

        btnAddUserIBM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/btnAddUserIBMIcon.png"))); // NOI18N
        btnAddUserIBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserIBMActionPerformed(evt);
            }
        });

        btnAddCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/btnAddCCIcon.png"))); // NOI18N
        btnAddCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCCActionPerformed(evt);
            }
        });

        btnAddUserOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/btnAddUserOutIcon.png"))); // NOI18N
        btnAddUserOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserOutActionPerformed(evt);
            }
        });

        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/btnAddUserIcon.png"))); // NOI18N
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/githubIcon.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        version.setText("Versão 1.8");

        javax.swing.GroupLayout homeWindowPanelLayout = new javax.swing.GroupLayout(homeWindowPanel);
        homeWindowPanel.setLayout(homeWindowPanelLayout);
        homeWindowPanelLayout.setHorizontalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeWindowPanelLayout.createSequentialGroup()
                .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(homeWindowPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(version))
                    .addGroup(homeWindowPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                                .addComponent(titleWindow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
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
                                        .addComponent(btnAlterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(40, 40, 40))
        );
        homeWindowPanelLayout.setVerticalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleWindow)
                    .addComponent(jLabel1))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(version)
                .addContainerGap(23, Short.MAX_VALUE))
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

    //Método para abrir janela "Entrada de pessoal"
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        //Fechando janela atual
        dispose();
        
        AddUserWindow frame = new AddUserWindow();
        //Abrindo janela "Entrada de pessoal"
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddUserActionPerformed

    //Método para abrir janela "Alteração de pessoal"
    private void btnAlterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterUserActionPerformed
        //Fechando janela atual
        dispose();
        
        AlterUserWindow frame = new AlterUserWindow();
        //Abrindo janela "Alteração de pessoal"
        frame.setVisible(true);
    }//GEN-LAST:event_btnAlterUserActionPerformed

    //Método para abrir janela "Desligamento de pessoal"
    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        //Fechando janela atual
        dispose();
        
        DeleteUserWindow frame = new DeleteUserWindow();
        //Abrindo janela "Desligamento de pessoal"
        frame.setVisible(true);
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    //Método para abrir janela "Criação de usuário IBM"
    private void btnAddUserIBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserIBMActionPerformed
        //Fechando janela atual
        dispose();
        
        AddUserIBMWindow frame = new AddUserIBMWindow();
        //Abrindo janela "Criação de usuário IBM"
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddUserIBMActionPerformed

    //Método para abrir janela "Criação de caixa corporativa"
    private void btnAddCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCCActionPerformed
        //Fechando janela atual
        dispose();
        
        AddCCWindow frame = new AddCCWindow();
        //Abrindo janela "Criação de caixa corporativa"
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddCCActionPerformed

    //Método para abrir janela "Criação de terceiro"
    private void btnAddUserOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserOutActionPerformed
        //Fechando janela atual
        dispose();
        
        AddUserOutWindow frame = new AddUserOutWindow();
        //Abrindo janela "Criação de terceiro"
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddUserOutActionPerformed

    //Método para abrir projeto no github
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //Abrindo página do github
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/Mathunes/utilitario-geat-estagio").toURI());
        } catch (Exception e) {}

    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCC;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnAddUserIBM;
    private javax.swing.JButton btnAddUserOut;
    private javax.swing.JButton btnAlterUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JPanel homeWindowPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titleWindow;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables

    //Método para estilizar os componentes
    private void stylizeComponents() {
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
        
        version.setForeground(new Color(153, 140, 140));
        version.setFont(new Font("Roboto", 0, 11));
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assets/icon.png")));
    }
}
