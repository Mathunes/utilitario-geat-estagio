package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;

public class AddCCWindow extends javax.swing.JFrame {

    public AddCCWindow() {
        initComponents();
        stylizeComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCCWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addCCWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        addCCWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Criação de caixa corporativa");

        btnClean.setText("Limpar");

        btnConvert.setText("Gerar");

        jLabel1.setText("Nome da caixa");

        jLabel2.setText("ID da caixa");

        jLabel3.setText("Servidor");

        jLabel4.setText("End. de email");

        jLabel5.setText("Responsável");

        jLabel6.setText("Incidente");

        jLabel7.setText("Agente de notificação");

        jLabel8.setText("Integrantes");

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout addCCWindowPanelLayout = new javax.swing.GroupLayout(addCCWindowPanel);
        addCCWindowPanel.setLayout(addCCWindowPanelLayout);
        addCCWindowPanelLayout.setHorizontalGroup(
            addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCCWindowPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addCCWindowPanelLayout.createSequentialGroup()
                        .addComponent(titleWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClean))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCCWindowPanelLayout.createSequentialGroup()
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addCCWindowPanelLayout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCCWindowPanelLayout.createSequentialGroup()
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addCCWindowPanelLayout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(37, 37, 37))
        );
        addCCWindowPanelLayout.setVerticalGroup(
            addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCCWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleWindow)
                    .addComponent(btnClean))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCCWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCCWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCCWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addCCWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        addCCWindowPanel.setBackground(new Color(232, 243, 240));
        
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
        
        //jScrollPane1.setBorder(null);
    }
}
