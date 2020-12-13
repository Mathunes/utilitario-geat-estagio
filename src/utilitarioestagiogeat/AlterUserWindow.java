package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;

public class AlterUserWindow extends javax.swing.JFrame {

    public AlterUserWindow() {
        initComponents();
        stylizeComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterUserWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextPane = new javax.swing.JTextPane();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        btnHomeWindow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(776, 468));
        setMinimumSize(new java.awt.Dimension(776, 468));
        setResizable(false);

        alterUserWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        alterUserWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Alteração de pessoal");

        jScrollPane1.setViewportView(inputTextPane);

        btnClean.setText("Limpar");

        btnConvert.setText("Converter");

        btnHomeWindow.setText("Página Inicial");
        btnHomeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeWindowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout alterUserWindowPanelLayout = new javax.swing.GroupLayout(alterUserWindowPanel);
        alterUserWindowPanel.setLayout(alterUserWindowPanelLayout);
        alterUserWindowPanelLayout.setHorizontalGroup(
            alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterUserWindowPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                        .addComponent(titleWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
                        .addComponent(btnHomeWindow)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean)))
                .addGap(37, 37, 37))
        );
        alterUserWindowPanelLayout.setVerticalGroup(
            alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleWindow)
                    .addComponent(btnClean)
                    .addComponent(btnHomeWindow))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alterUserWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alterUserWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeWindowMouseClicked
        dispose();
        
        HomeWindow frame = new HomeWindow();
        
        frame.setVisible(true);
    }//GEN-LAST:event_btnHomeWindowMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterUserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alterUserWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JTextPane inputTextPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        alterUserWindowPanel.setBackground(new Color(232, 243, 240));
        
        titleWindow.setForeground(new Color(51, 51, 51));
        titleWindow.setFont(new Font("Roboto", Font.BOLD, 20));
        titleWindow.setBounds(35, 31, titleWindow.getPreferredSize().width, titleWindow.getPreferredSize().height);
        
        btnConvert.setBackground(new Color(17, 125, 125));
        btnConvert.setFocusable(false);
        btnConvert.setFont(new Font("Roboto", Font.BOLD, 18));
        btnConvert.setForeground(new Color(255, 255, 255));
        
        btnClean.setBackground(new Color(255, 72, 90));
        btnClean.setFocusable(false);
        btnClean.setFont(new Font("Roboto", Font.BOLD, 14));
        btnClean.setForeground(new Color(255, 255, 255));
        
        btnHomeWindow.setFont(new Font("Roboto", Font.BOLD, 14));
        btnHomeWindow.setForeground(new Color(44, 94, 95));
    }
}
