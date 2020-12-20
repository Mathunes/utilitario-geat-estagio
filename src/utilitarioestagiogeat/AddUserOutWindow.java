package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddUserOutWindow extends javax.swing.JFrame {

    private String result;
    InfoWindow infoFrame;
    
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
        inputName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputResponsible = new javax.swing.JTextField();
        inputIncident = new javax.swing.JTextField();
        inputCompany = new javax.swing.JTextField();
        btnHomeWindow = new javax.swing.JLabel();
        radioNotes1 = new javax.swing.JRadioButton();
        radioNotes4 = new javax.swing.JRadioButton();
        btnInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addUserOutWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        addUserOutWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Criação de terceiro");

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

        radioNotes1.setBackground(new java.awt.Color(232, 243, 240));
        serverGroup.add(radioNotes1);
        radioNotes1.setText("Notes_1");

        radioNotes4.setBackground(new java.awt.Color(232, 243, 240));
        serverGroup.add(radioNotes4);
        radioNotes4.setText("Notes_4");

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/info.png"))); // NOI18N
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInfo)
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
                                .addComponent(inputID, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(radioNotes1)
                                .addGap(18, 18, 18)
                                .addComponent(radioNotes4)
                                .addGap(90, 90, 90))
                            .addComponent(inputName)
                            .addComponent(inputEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputResponsible)
                            .addComponent(inputIncident)
                            .addComponent(inputCompany))))
                .addGap(37, 37, 37))
        );
        addUserOutWindowPanelLayout.setVerticalGroup(
            addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserOutWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleWindow)
                        .addComponent(btnClean)
                        .addComponent(btnHomeWindow))
                    .addComponent(btnInfo))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNotes1)
                    .addComponent(radioNotes4))
                .addGap(17, 17, 17)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputResponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(addUserOutWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        try {
            infoFrame.dispose();
        } catch (Exception e) {};
    }//GEN-LAST:event_btnHomeWindowMouseClicked

    private void buildString() {
        
        Date dateNow = new Date();
        String date = new SimpleDateFormat("dd/MM/yyyy").format(dateNow);
        String server;

        if (radioNotes1.isSelected())
            server = "Notes_1";
        else
            server = "Notes_4";
        
        if (inputCompany.getText().toLowerCase().contains("service desk"))
            result = inputCompany.getText() + "." + inputName.getText() + " - Terceiro\n" +
                inputID.getText() + "\n" +
                "Usuário(a) " + inputCompany.getText() + "." + inputName.getText() + " criado(a) no " + server + "/BNDES externos\\cp\\cp_" + inputID.getText() + ".nsf" + "\n" +
                "Internet Address: " + inputEmail.getText() + "\n" +
                date + " - " + inputIncident.getText() + "\n" +
                "Responsável: " + inputResponsible.getText() + "\n" +
                "D:\\Users\\" + System.getProperty("user.name") + "\\Documents\\ID Vault\\" + inputID.getText() + ".id\n" +
                "CN=" + inputID.getText() + "/CN=Users/DC=bndes/DC=net\n" +
                "\\" + "\\" + "bndes.net\\bndes\\SERVICEDESK\\ID Notes - Usuario\\Zoom Tecnologia\\" + inputID.getText();
        else
            result = inputCompany.getText() + "." + inputName.getText() + " - Terceiro\n" +
                inputID.getText() + "\n" +
                "Usuário(a) " + inputCompany.getText() + "." + inputName.getText() + " criado(a) no " + server + "/BNDES externos\\cp\\cp_" + inputID.getText() + ".nsf" + "\n" +
                "Internet Address: " + inputEmail.getText() + "\n" +
                date + " - " + inputIncident.getText() + "\n" +
                "Responsável: " + inputResponsible.getText() + "\n" +
                "D:\\Users\\" + System.getProperty("user.name") + "\\Documents\\ID Vault\\" + inputID.getText() + ".id\n" +
                "CN=" + inputID.getText() + "/CN=Users/DC=bndes/DC=net\n" +
                "\\" + "\\" + "bndes.net\\bndes\\SERVICEDESK\\ID Notes - Usuario\\" + inputID.getText();
    }
    
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        if (inputCompany.getText().equals("") || 
                inputEmail.getText().equals("") ||
                inputID.getText().equals("") ||
                inputIncident.getText().equals("") ||
                inputName.getText().equals("") ||
                inputResponsible.getText().equals("")
            ) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!(radioNotes1.isSelected() || radioNotes4.isSelected())) {
            JOptionPane.showMessageDialog(rootPane, "Escolha o servidor de criação!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            
            buildString();
                    
            ResultWindow frame = new ResultWindow(result);
        
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        inputCompany.setText("");
        inputEmail.setText("");
        inputID.setText("");
        inputIncident.setText("");
        inputName.setText("");
        inputResponsible.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        infoFrame = new InfoWindow("Gerar a colinha utilizada na criação da conta de terceiros no Notes",
            "Preencher todos os campos corretamente",
            "Verificar no incidente a empresa do terceiro",
            "Se for terceiro da Zoom Tecnologia é necessário preencher o campo Empresa com “Service Desk");

        infoFrame.setVisible(true);
    }//GEN-LAST:event_btnInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addUserOutWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JLabel btnInfo;
    private javax.swing.JTextField inputCompany;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputIncident;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputResponsible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton radioNotes1;
    private javax.swing.JRadioButton radioNotes4;
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
        
        radioNotes1.setFocusable(false);
        radioNotes4.setFocusable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
