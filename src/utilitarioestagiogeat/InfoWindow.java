package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class InfoWindow extends javax.swing.JFrame {

    public InfoWindow(String description, String info1, String info2, String info3) {
        super("Utilitário GEAT - Gerador de colinhas");
        initComponents();
        stylizeComponentes();
        
        labelDescription.setText("<html><p style=\"width:300px\">"+description+"</p></html>");
        labelInfo1.setText("<html><p style=\"width:318px\">"+info1+"</p></html>");
        labelInfo2.setText("<html><p style=\"width:318px\">"+info2+"</p></html>");
        labelInfo3.setText("<html><p style=\"width:318px\">"+info3+"</p></html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        labelInfo3 = new javax.swing.JLabel();
        labelInfo2 = new javax.swing.JLabel();
        labelInfo1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        titleWindow.setText("Instruções");

        labelDescription.setText("Descrição");

        labelInfo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/ellipse.png"))); // NOI18N
        labelInfo3.setText("Label");

        labelInfo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/ellipse.png"))); // NOI18N
        labelInfo2.setText("Label");

        labelInfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/ellipse.png"))); // NOI18N
        labelInfo1.setText("Label");

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/close.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout infoWindowPanelLayout = new javax.swing.GroupLayout(infoWindowPanel);
        infoWindowPanel.setLayout(infoWindowPanelLayout);
        infoWindowPanelLayout.setHorizontalGroup(
            infoWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoWindowPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(infoWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoWindowPanelLayout.createSequentialGroup()
                        .addGroup(infoWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescription)
                            .addComponent(labelInfo1)
                            .addComponent(labelInfo2)
                            .addComponent(labelInfo3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(infoWindowPanelLayout.createSequentialGroup()
                        .addComponent(titleWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addGap(38, 38, 38))))
        );
        infoWindowPanelLayout.setVerticalGroup(
            infoWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoWindowPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(infoWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleWindow)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDescription)
                .addGap(18, 18, 18)
                .addComponent(labelInfo1)
                .addGap(18, 18, 18)
                .addComponent(labelInfo2)
                .addGap(18, 18, 18)
                .addComponent(labelInfo3)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JPanel infoWindowPanel;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelInfo1;
    private javax.swing.JLabel labelInfo2;
    private javax.swing.JLabel labelInfo3;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        infoWindowPanel.setBackground(new Color(255, 187, 192));
        
        titleWindow.setForeground(new Color(51, 51, 51));
        titleWindow.setFont(new Font("Roboto", Font.BOLD, 18));
        titleWindow.setBounds(35, 31, titleWindow.getPreferredSize().width, titleWindow.getPreferredSize().height);
        
        labelDescription.setForeground(new Color(86, 73, 73));
        labelDescription.setFont(new Font("Roboto", Font.ITALIC, 13));
        
        labelInfo1.setForeground(new Color(51, 51, 51));
        labelInfo1.setFont(new Font("Roboto", 0, 14));
        
        labelInfo2.setForeground(new Color(51, 51, 51));
        labelInfo2.setFont(new Font("Roboto", 0, 14));
        
        labelInfo3.setForeground(new Color(51, 51, 51));
        labelInfo3.setFont(new Font("Roboto", 0, 14));
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assets\\icon.png")));
    }
}
