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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(776, 468));
        setPreferredSize(new java.awt.Dimension(776, 468));
        setResizable(false);

        titleWindow.setText("Utilitário GEAT");

        javax.swing.GroupLayout homeWindowPanelLayout = new javax.swing.GroupLayout(homeWindowPanel);
        homeWindowPanel.setLayout(homeWindowPanelLayout);
        homeWindowPanelLayout.setHorizontalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleWindow)
                .addContainerGap(680, Short.MAX_VALUE))
        );
        homeWindowPanelLayout.setVerticalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeWindowPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleWindow)
                .addContainerGap(432, Short.MAX_VALUE))
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeWindowPanel;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        homeWindowPanel.setBackground(new Color(232, 243, 240));
        
        titleWindow.setForeground(new Color(51, 51, 51));
        titleWindow.setFont(new Font("Roboto", Font.BOLD, 28));
        titleWindow.setLocation(185, 33);
    }
}
