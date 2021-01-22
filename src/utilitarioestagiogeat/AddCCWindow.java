package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddCCWindow extends javax.swing.JFrame {

    //String para resultado de texto final
    private String result;
    //Tela de informações
    InfoWindow infoFrame;
    
    public AddCCWindow() {
        //Título da janela
        super("Utilitário GEAT - Gerador de colinhas");
        initComponents();
        //Método para estilizar os componentes
        stylizeComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serverGroup = new javax.swing.ButtonGroup();
        notificationAgentGroup = new javax.swing.ButtonGroup();
        addCCWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        inputName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputResponsible = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputIncident = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputMembers = new javax.swing.JTextPane();
        btnHomeWindow = new javax.swing.JLabel();
        radioNotes1 = new javax.swing.JRadioButton();
        radioNotes4 = new javax.swing.JRadioButton();
        radioNotificationAgentTrue = new javax.swing.JRadioButton();
        radioNotificationAgentFalse = new javax.swing.JRadioButton();
        btnInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addCCWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        addCCWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Criação de caixa corporativa");

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

        jLabel1.setText("Nome da caixa");

        jLabel2.setText("ID da caixa");

        jLabel3.setText("Servidor");

        jLabel4.setText("End. de email");

        jLabel5.setText("Responsável");

        jLabel6.setText("Incidente");

        jLabel7.setText("Agente de notificação");

        jLabel8.setText("Integrantes");

        jScrollPane1.setViewportView(inputMembers);

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

        radioNotificationAgentTrue.setBackground(new java.awt.Color(232, 243, 240));
        notificationAgentGroup.add(radioNotificationAgentTrue);
        radioNotificationAgentTrue.setText("Sim");

        radioNotificationAgentFalse.setBackground(new java.awt.Color(232, 243, 240));
        notificationAgentGroup.add(radioNotificationAgentFalse);
        radioNotificationAgentFalse.setText("Não");

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/info.png"))); // NOI18N
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHomeWindow)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCCWindowPanelLayout.createSequentialGroup()
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCCWindowPanelLayout.createSequentialGroup()
                                    .addComponent(inputID)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioNotes1)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioNotes4)
                                    .addGap(104, 104, 104))
                                .addComponent(inputName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCCWindowPanelLayout.createSequentialGroup()
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addCCWindowPanelLayout.createSequentialGroup()
                                .addComponent(inputIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(radioNotificationAgentTrue)
                                .addGap(18, 18, 18)
                                .addComponent(radioNotificationAgentFalse))
                            .addComponent(inputResponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        addCCWindowPanelLayout.setVerticalGroup(
            addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCCWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleWindow)
                        .addComponent(btnClean)
                        .addComponent(btnHomeWindow))
                    .addComponent(btnInfo))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(radioNotes1)
                    .addComponent(radioNotes4))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputResponsible, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(addCCWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(radioNotificationAgentTrue)
                    .addComponent(radioNotificationAgentFalse))
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

    //Método para voltar para tela inicial
    private void btnHomeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeWindowMouseClicked
        //Fechando janela atual
        dispose();

        HomeWindow frame = new HomeWindow();
        //Abrindo janela inicial
        frame.setVisible(true);
        
        try {
            //Fechando janela de informações se estiver aberta
            infoFrame.dispose();
        } catch (Exception e) {};
    }//GEN-LAST:event_btnHomeWindowMouseClicked

    //Método para gerar resultado final
    private void buildString() {
        
        Date dateNow = new Date();
        String date = new SimpleDateFormat("dd/MM/yyyy").format(dateNow);
        String server, notificationAgent, toSD;
        
        if (radioNotes1.isSelected())
            server = "Notes_1";
        else
            server = "Notes_4";
        
        if (radioNotificationAgentTrue.isSelected())
            notificationAgent = "Sim";
        else
            notificationAgent = "Não";
        
        result = "Caixa Institucional - " + inputName.getText() + "\n" +
            inputID.getText() + "\n" +
            "Caixa Institucional " + inputName.getText() + " em " + server + "/BNDES BNDES\\cc\\" + inputID.getText() + ".nsf" + "\n" +
            "Internet address: " + inputEmail.getText() + "\n" +
            "D:\\Users\\" + System.getProperty("user.name") + "\\Documents\\ID Vault\\" + inputID.getText() + ".id\n" +
            "Responsável: " + inputResponsible.getText() + "\n" +
            date + " - " + inputIncident.getText() + "\n" +
            "Integrantes: " + inputMembers.getText() + "\n" +
            "Agente de Notificação: " + notificationAgent;
        
        if (notificationAgent.equals("Sim"))
            toSD = "Ao Service Desk,\n" +
                "\n" +
                "Favor informar o seguinte ao solicitante:\n" +
                "\n" +
                "Foi criada a caixa institucional solicitada com o nome " + inputName.getText() + " em " + server + "/BNDES BNDES\\cc\\" + inputID.getText() + ".nsf" + "\n" +
                "\n" +
                "Foram criados os seguintes grupos de acesso à caixa institucional recém criada:\n" +
                "\n" +
                inputID.getText() + "[Responsaveis] - O usuário \"Responsável pela caixa\" foi incluído neste grupo de responsáveis o qual possui direitos de inclusão/exclusão de integrantes nos outros dois grupos abaixo além da permissão de incluir/excluir documentos na caixa institucional.\n" +
                inputID.getText() + "[Editores] - Inclui/exclui documentos da caixa institucional.\n" +
                inputID.getText() + "[Leitores] - Somente leitura/consulta de documentos da caixa institucional.\n" +
                inputID.getText() + "[AvisoMsgs] - Grupo de pessoas que recebem aviso de chegada de mensagens numa caixa postal corporativa\n" +
                "\n" +
                "Responsável: " + inputResponsible.getText() + "\n" +
                "\n" +
                "Integrantes: " + inputMembers.getText() + "\n" +
                "\n" +
                "Favor orientar o solicitante quanto à forma de utilização e edição dos referidos grupos acima dentro da lista de endereços do BNDES.\n" +
                "\n" +
                "O id da caixa foi copiado para a pasta do drive H:\\Notes dos usuários responsáveis \n" +
                "\n" +
                inputID.getText() + ".id\n" +
                "Senha: Senha padrão conhecida.\n" +
                "\n" +
                "Favor orientar o solicitante na troca da senha.";
        else
            toSD = "Ao Service Desk,\n" +
                "\n" +
                "Favor informar o seguinte ao solicitante:\n" +
                "\n" +
                "Foi criada a caixa institucional solicitada com o nome " + inputName.getText() + " criada no " + server + "/BNDES BNDES\\cc\\cc_" + inputID.getText() + ".nsf" + "\n" +
                "\n" +
                "Foram criados os seguintes grupos de acesso à caixa institucional recém criada:\n" +
                "\n" +
                inputID.getText() + "[Responsaveis] - O usuário \"Responsável pela caixa\" foi incluído neste grupo de responsáveis o qual possui direitos de inclusão/exclusão de integrantes nos outros dois grupos abaixo além da permissão de incluir/excluir documentos na caixa institucional.\n" +
                inputID.getText() + "[Editores] - Inclui/exclui documentos da caixa institucional.\n" +
                inputID.getText() + "[Leitores] - Somente leitura/consulta de documentos da caixa institucional.\n" +
                "\n" +
                "Responsável: " + inputResponsible.getText() + "\n" +
                "\n" +
                "Integrantes: " + inputMembers.getText() + "\n" +
                "\n" +
                "Favor orientar o solicitante quanto à forma de utilização e edição dos referidos grupos acima dentro da lista de endereços do BNDES.\n" +
                "\n" +
                "O id da caixa foi copiado para a pasta do drive H:\\Notes dos usuários responsáveis \n" +
                "\n" +
                inputID.getText() + ".id\n" +
                "Senha: Senha padrão conhecida.\n" +
                "\n" +
                "Favor orientar o solicitante na troca da senha.";
        
        result += "\n\n------------------------------------------------ Finalizar Incidente ------------------------------------------------\n\n" 
                + toSD;
    }

    //Ouvindo click do botão Converter
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        if (inputMembers.getText().equals("") || 
                inputEmail.getText().equals("") ||
                inputID.getText().equals("") ||
                inputIncident.getText().equals("") ||
                inputName.getText().equals("") ||
                inputResponsible.getText().equals("")
            ) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!(radioNotes1.isSelected() || radioNotes4.isSelected())) {
            JOptionPane.showMessageDialog(rootPane, "Escolha o servidor de criação!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!(radioNotificationAgentTrue.isSelected() || radioNotificationAgentFalse.isSelected())) {
            JOptionPane.showMessageDialog(rootPane, "Defina se a caixa possui ou não agente de notificação", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            
            buildString();
                    
            ResultWindow frame = new ResultWindow(result);
        
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    //Método para limpar os campos de entrada
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        inputMembers.setText("");
        inputEmail.setText("");
        inputID.setText("");
        inputIncident.setText("");
        inputName.setText("");
        inputResponsible.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    //Método para abrir janela de informações
    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        infoFrame = new InfoWindow("Gerar a colinha utilizada na criação de caixa corporativa no Notes",
            "Preencher todos os campos corretamente",
            "Verificar no incidente se a caixa possui agente de notificação",
            "Se for para uso interno, o email será o ID, se for para uso externo o email será o nome da caixa");

        infoFrame.setVisible(true);
    }//GEN-LAST:event_btnInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addCCWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JLabel btnInfo;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputIncident;
    private javax.swing.JTextPane inputMembers;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputResponsible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup notificationAgentGroup;
    private javax.swing.JRadioButton radioNotes1;
    private javax.swing.JRadioButton radioNotes4;
    private javax.swing.JRadioButton radioNotificationAgentFalse;
    private javax.swing.JRadioButton radioNotificationAgentTrue;
    private javax.swing.ButtonGroup serverGroup;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    //Método para estilizar os componentes
    private void stylizeComponents() {
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
        
        btnHomeWindow.setFont(new Font("Roboto", Font.BOLD, 14));
        btnHomeWindow.setForeground(new Color(44, 94, 95));
        
        radioNotes1.setFocusable(false);
        radioNotes4.setFocusable(false);
        
        radioNotificationAgentTrue.setFocusable(false);
        radioNotificationAgentFalse.setFocusable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assets/icon.png")));
    }
}
