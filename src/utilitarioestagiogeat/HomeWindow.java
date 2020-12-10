package utilitarioestagiogeat;

import java.awt.Color;

public class HomeWindow extends javax.swing.JFrame {

    public HomeWindow() {
        initComponents();
        stylizeComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeWindowPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(776, 468));
        setPreferredSize(new java.awt.Dimension(776, 468));
        setResizable(false);

        javax.swing.GroupLayout homeWindowPanelLayout = new javax.swing.GroupLayout(homeWindowPanel);
        homeWindowPanel.setLayout(homeWindowPanelLayout);
        homeWindowPanelLayout.setHorizontalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        homeWindowPanelLayout.setVerticalGroup(
            homeWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
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
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        homeWindowPanel.setBackground(new Color(255, 187, 192));
    }
}
