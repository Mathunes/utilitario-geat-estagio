package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class AddUserIBMWindow extends javax.swing.JFrame {

    private String result;
    InfoWindow infoFrame;

    public AddUserIBMWindow() {
        super("Utilitário GEAT");
        initComponents();
        stylizeComponentes();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        addUserIBMWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        inputID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputNameTSO = new javax.swing.JTextField();
        inputNameComplete = new javax.swing.JTextField();
        inputArea = new javax.swing.JTextField();
        inputPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnHomeWindow = new javax.swing.JLabel();
        radioUserDefault = new javax.swing.JRadioButton();
        radioUserExternal = new javax.swing.JRadioButton();
        btnInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addUserIBMWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        addUserIBMWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Criação de usuário IBM");

        btnClean.setText("Limpar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnConvert.setText("Gerar");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        jLabel1.setText("ID do usuário");

        jLabel2.setText("name_tso");

        jLabel4.setText("name_complete");

        jLabel5.setText("Lotação (Área-Ger)");

        jLabel6.setText("Senha");

        jLabel3.setText("Grupo");

        btnHomeWindow.setText("Página Inicial");
        btnHomeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeWindowMouseClicked(evt);
            }
        });

        radioUserDefault.setBackground(new java.awt.Color(232, 243, 240));
        buttonGroup.add(radioUserDefault);
        radioUserDefault.setText("USERDFLT");

        radioUserExternal.setBackground(new java.awt.Color(232, 243, 240));
        buttonGroup.add(radioUserExternal);
        radioUserExternal.setText("EXTERNOS");

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/info.png"))); // NOI18N
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addUserIBMWindowPanelLayout = new javax.swing.GroupLayout(addUserIBMWindowPanel);
        addUserIBMWindowPanel.setLayout(addUserIBMWindowPanelLayout);
        addUserIBMWindowPanelLayout.setHorizontalGroup(
            addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserIBMWindowPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserIBMWindowPanelLayout.createSequentialGroup()
                        .addComponent(titleWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHomeWindow)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean))
                    .addGroup(addUserIBMWindowPanelLayout.createSequentialGroup()
                        .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputID)
                            .addComponent(inputNameComplete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputArea)
                            .addComponent(inputNameTSO)
                            .addGroup(addUserIBMWindowPanelLayout.createSequentialGroup()
                                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(radioUserDefault)
                                .addGap(18, 18, 18)
                                .addComponent(radioUserExternal)
                                .addGap(0, 132, Short.MAX_VALUE)))))
                .addGap(37, 37, 37))
        );
        addUserIBMWindowPanelLayout.setVerticalGroup(
            addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserIBMWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleWindow)
                        .addComponent(btnClean)
                        .addComponent(btnHomeWindow))
                    .addComponent(btnInfo))
                .addGap(18, 18, 18)
                .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNameTSO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputNameComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addUserIBMWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(radioUserDefault)
                    .addComponent(radioUserExternal))
                .addGap(18, 18, 18)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addUserIBMWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addUserIBMWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeWindowMouseClicked
        dispose();

        HomeWindow frame = new HomeWindow();

        frame.setVisible(true);
        
        try {
            infoFrame.dispose();
        } catch (Exception e) {};
    }//GEN-LAST:event_btnHomeWindowMouseClicked

    private void buildString() {
        String group;
        
        if (radioUserDefault.isSelected())
            group = "USERDFLT";
        else
            group = "EXTERNOS";
        
        result = "- username: " + inputID.getText().toUpperCase() + "\n" +
            "  name_tso: " + inputNameTSO.getText().toUpperCase() + "\n" +
            "  name_complete: " + inputNameComplete.getText().toUpperCase() + "\n" +
            "  copy: USUAR\n" +
            "  org_unit: " + inputArea.getText().toUpperCase() + "\n" +
            "  password: " + inputPassword.getText() + "\n" +
            "  group: " + group + "\n";
    }
    
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        if (inputArea.getText().equals("") || 
                inputNameTSO.getText().equals("") ||
                inputNameComplete.getText().equals("") ||
                inputID.getText().equals("") ||
                inputPassword.getText().equals("")
            ) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!(radioUserDefault.isSelected() || radioUserExternal.isSelected())) {
            JOptionPane.showMessageDialog(rootPane, "Escolha o grupo!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (inputNameTSO.getText().length() > 20) {
            JOptionPane.showMessageDialog(rootPane, "name_tso tem " + inputNameTSO.getText().length() + " caracteres, deve ter no máximo 20!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (inputNameComplete.getText().length() > 32) {
            JOptionPane.showMessageDialog(rootPane, "name_complete tem " + inputNameComplete.getText().length() + " caracteres, deve ter no máximo 32!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            
            buildString();
                    
            ResultWindow frame = new ResultWindow(result);
        
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        inputArea.setText("");
        inputID.setText("");
        inputNameComplete.setText("");
        inputNameTSO.setText("");
        inputPassword.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        infoFrame = new InfoWindow("Gerar script utilizado na criação da conta de usuário no IBM Mainframe",
            "Evitar o uso de caracter especial na senha",
            "Se for funcionário/estagiário, o grupo é USERDFLT",
            "Se for terceiro, o grupo é EXTERNOS");

        infoFrame.setVisible(true);
    }//GEN-LAST:event_btnInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addUserIBMWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JLabel btnInfo;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField inputArea;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputNameComplete;
    private javax.swing.JTextField inputNameTSO;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioUserDefault;
    private javax.swing.JRadioButton radioUserExternal;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

        private void stylizeComponentes() {
        addUserIBMWindowPanel.setBackground(new Color(232, 243, 240));
        
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
        
        radioUserDefault.setFocusable(false);
        radioUserExternal.setFocusable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
