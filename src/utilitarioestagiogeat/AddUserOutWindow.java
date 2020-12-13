package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class AddUserOutWindow extends javax.swing.JFrame {

    public AddUserOutWindow() {
        super("Utilitário GEAT");
        initComponents();
        stylizeComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serverGroup = new javax.swing.ButtonGroup();
        addUserOutWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        btnHomeWindow = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addUserOutWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        addUserOutWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Criação de terceiro");

        btnClean.setText("Limpar");

        btnConvert.setText("Gerar");

        jLabel1.setText("Nome completo");

        jLabel2.setText("ID do usuário");

        jLabel3.setText("Servidor");

        jLabel4.setText("End. de email");

        jLabel5.setText("Responsável");

        jLabel6.setText("Incidente");

        jLabel8.setText("Empresa");

        btnHomeWindow.setText("Página Inicial");
        btnHomeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeWindowMouseClicked(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(232, 243, 240));
        serverGroup.add(jRadioButton1);
        jRadioButton1.setText("Notes_1");

        jRadioButton2.setBackground(new java.awt.Color(232, 243, 240));
        serverGroup.add(jRadioButton2);
        jRadioButton2.setText("Notes_4");

        javax.swing.GroupLayout addUserOutWindowPanelLayout = new javax.swing.GroupLayout(addUserOutWindowPanel);
        addUserOutWindowPanel.setLayout(addUserOutWindowPanelLayout);
        addUserOutWindowPanelLayout.setHorizontalGroup(
            addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserOutWindowPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserOutWindowPanelLayout.createSequentialGroup()
                        .addComponent(titleWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHomeWindow)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean))
                    .addGroup(addUserOutWindowPanelLayout.createSequentialGroup()
                        .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addUserOutWindowPanelLayout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(90, 90, 90))
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField9)
                            .addComponent(jTextField10))))
                .addGap(37, 37, 37))
        );
        addUserOutWindowPanelLayout.setVerticalGroup(
            addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserOutWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleWindow)
                    .addComponent(btnClean)
                    .addComponent(btnHomeWindow))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(17, 17, 17)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addUserOutWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addUserOutWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                new AddUserOutWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addUserOutWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.ButtonGroup serverGroup;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        addUserOutWindowPanel.setBackground(new Color(232, 243, 240));
        
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
