package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class AlterUserWindow extends javax.swing.JFrame {

    public AlterUserWindow() {
        super("Utilitário GEAT");
        initComponents();
        stylizeComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataFontGroup = new javax.swing.ButtonGroup();
        alterUserWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextPane = new javax.swing.JTextPane();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        btnHomeWindow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel1.setText("Fonte de dados:");

        jRadioButton1.setBackground(new java.awt.Color(232, 243, 240));
        dataFontGroup.add(jRadioButton1);
        jRadioButton1.setText("Relatório SAMU");

        jRadioButton2.setBackground(new java.awt.Color(232, 243, 240));
        dataFontGroup.add(jRadioButton2);
        jRadioButton2.setText("Relatório Mainframe");

        javax.swing.GroupLayout alterUserWindowPanelLayout = new javax.swing.GroupLayout(alterUserWindowPanel);
        alterUserWindowPanel.setLayout(alterUserWindowPanelLayout);
        alterUserWindowPanelLayout.setHorizontalGroup(
            alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                        .addGroup(alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                                .addComponent(titleWindow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
                                .addComponent(btnHomeWindow)
                                .addGap(18, 18, 18)
                                .addComponent(btnClean)))
                        .addGap(37, 37, 37))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
    private javax.swing.ButtonGroup dataFontGroup;
    private javax.swing.JTextPane inputTextPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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
        
        jRadioButton1.setFocusable(false);
        jRadioButton2.setFocusable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));        
    }
}
