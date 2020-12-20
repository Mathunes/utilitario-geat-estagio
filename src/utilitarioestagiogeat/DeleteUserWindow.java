package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class DeleteUserWindow extends javax.swing.JFrame {

    private String userId = "";
    InfoWindow infoFrame;
    
    public DeleteUserWindow() {
        super("Utilitário GEAT");
        initComponents();
        stylizeComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteUserWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        btnHomeWindow = new javax.swing.JLabel();
        btnInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titleWindow.setText("Desligamento de pessoal");

        jScrollPane1.setViewportView(textArea);

        btnClean.setText("Limpar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnConvert.setText("Converter");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnHomeWindow.setText("Página Inicial");
        btnHomeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeWindowMouseClicked(evt);
            }
        });

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/info.png"))); // NOI18N
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout deleteUserWindowPanelLayout = new javax.swing.GroupLayout(deleteUserWindowPanel);
        deleteUserWindowPanel.setLayout(deleteUserWindowPanelLayout);
        deleteUserWindowPanelLayout.setHorizontalGroup(
            deleteUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteUserWindowPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(deleteUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(deleteUserWindowPanelLayout.createSequentialGroup()
                        .addComponent(titleWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                        .addComponent(btnHomeWindow)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean)))
                .addGap(37, 37, 37))
        );
        deleteUserWindowPanelLayout.setVerticalGroup(
            deleteUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteUserWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(deleteUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleWindow)
                        .addComponent(btnClean)
                        .addComponent(btnHomeWindow))
                    .addComponent(btnInfo))
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
            .addComponent(deleteUserWindowPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteUserWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buildResult() {
        textArea.setText(textArea.getText() + "- username: " + userId.toUpperCase() + "\n");
    }
    
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        String textInput = textArea.getText().trim();
        textArea.setText("");
        
        int aux;
        String auxStr = "";

        if (textInput.contains("Usuários desligados:")) {
            int indiceDesligado = textInput.indexOf("Usuários desligados:");

            String infoDesligado = "";

            for (int i = indiceDesligado; i < textInput.length(); i++) {
                infoDesligado += textInput.charAt(i);
            }

            textInput = infoDesligado.replaceAll("Atenciosamente,", "");
            textInput = textInput.replaceAll("Sistema de Acessos e Manutenção de Usuários", "");

        }

        int i = textInput.indexOf("Usuários desligados:") + "Usuários desligados:\n".length();

        for (; i < textInput.length(); i++) {

            String userInfo = "";

            while ((textInput.charAt(i) != '\n') && (i < textInput.length()-1)) {
                userInfo += textInput.charAt(i);
                i++;
            }

            if (userInfo.contains("User ID.............. ")) {
                userId = "";
                userId = userInfo.replace("User ID.............. ", "");
                userId = userId.replace(Character.toString(userId.charAt(userId.length() - 1)), "");
                
                buildResult();
            } 

        }
        
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        textArea.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        infoFrame = new InfoWindow("Converter o texto gerado no relátorio SAMU para o script utilizado no bloqueio da conta de usuário no IBM Mainframe",
            "Selecionar todo texto do relatório SAMU - <b>CTRL + A</b>",
            "Copiar o texto selecionado - <b>CTRL + C</b>",
            "Colar o texto selecionado na área de texto - <b>CTRL + V</b>");

        infoFrame.setVisible(true);
    }//GEN-LAST:event_btnInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JLabel btnInfo;
    private javax.swing.JPanel deleteUserWindowPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane textArea;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    private void stylizeComponentes() {
        deleteUserWindowPanel.setBackground(new Color(232, 243, 240));
        
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
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
}
