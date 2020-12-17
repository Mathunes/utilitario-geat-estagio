package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

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
        textArea = new javax.swing.JTextPane();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        btnHomeWindow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        radioSamu = new javax.swing.JRadioButton();
        radioMainframe = new javax.swing.JRadioButton();
        btnInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(776, 468));
        setResizable(false);

        alterUserWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        alterUserWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Alteração de pessoal");

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

        jLabel1.setText("Fonte de dados:");

        radioSamu.setBackground(new java.awt.Color(232, 243, 240));
        dataFontGroup.add(radioSamu);
        radioSamu.setText("Relatório SAMU");

        radioMainframe.setBackground(new java.awt.Color(232, 243, 240));
        dataFontGroup.add(radioMainframe);
        radioMainframe.setText("Relatório Mainframe");

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/info.png"))); // NOI18N

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
                        .addComponent(radioSamu)
                        .addGap(18, 18, 18)
                        .addComponent(radioMainframe)
                        .addContainerGap(404, Short.MAX_VALUE))
                    .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                        .addGroup(alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(alterUserWindowPanelLayout.createSequentialGroup()
                                .addComponent(titleWindow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(btnHomeWindow)
                    .addComponent(btnInfo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(alterUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radioSamu)
                    .addComponent(radioMainframe))
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

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        if (radioMainframe.isSelected()) {
        
            String textInput = textArea.getText().trim();
            textArea.setText("");

            for (int i = 0; i < textInput.length(); i++) {

                String userId = "";
                String userInfo = "";
                String lotacao = "";

                while ((textInput.charAt(i) != '\n') && (i < textInput.length()-1)) {
                    userInfo += textInput.charAt(i);
                    i++;
                }

                for (int j = 0; j < 11; j++) {
                    if (userInfo.charAt(j) != ' ') {
                        userId += userInfo.charAt(j);
                    }
                }

                for (int j = 61; j < userInfo.length(); j++) {
                    lotacao += userInfo.charAt(j);
                }

                textArea.setText(textArea.getText() + "- username: " + userId + "\n  org_unit: " + lotacao + "\n");
            }
        } else if (radioSamu.isSelected()) {
            
            String textInput = textArea.getText().trim();
            textArea.setText("");
            String userId = "";
            
            if (textInput.contains("Usuários desligados:")) {
                int indiceDesligado = textInput.indexOf("Usuários desligados:");
                
                String infoDesligado = "";
                
                for (int i = indiceDesligado; i < textInput.length(); i++) {
                    infoDesligado += textInput.charAt(i);
                }
                
                textInput = textInput.replace(infoDesligado, "");
                
            }
            
            
            
            
            int i = textInput.indexOf("Usuários alterados:") + "Usuários alterados:\n".length();
            
            for (; i < textInput.length(); i++) {
                
                String userInfo = "";
                String lotacao = "";
                boolean erroLotacao = false;
                
                while ((textInput.charAt(i) != '\n') && (i < textInput.length()-1)) {
                    userInfo += textInput.charAt(i);
                    i++;
                }
                
                if (userInfo.contains("User ID.............. ")) {
                    userId = "";
                    userId = userInfo.replace("User ID.............. ", "").toUpperCase();
                }
                
                if (userInfo.contains("Lotação.............. ")) {
                    erroLotacao = true;
                    
                    lotacao = userInfo.replace("Lotação.............. ", "");
                    
                    int j = lotacao.indexOf("->");
                    
                    String aux = "";
                    
                    for (int k = 0; k < j; k++) {
                        aux += lotacao.charAt(k);
                    }
                    
                    lotacao = lotacao.replace(aux + "-> ", "");
                    
                    if (lotacao.contains("/")) {

                        int firstBar = lotacao.indexOf('/');
                        int lastBar = lotacao.lastIndexOf('/');

                        aux = "";

                        for (int k = firstBar; k <= lastBar; k++) {
                            aux += lotacao.charAt(k);
                        }

                        lotacao = lotacao.replace(aux, "-");

                    }
                    
                }
                
                if (erroLotacao) {
                    textArea.setText(textArea.getText() + "- username: " + userId + "\n  org_unit: " + lotacao + "\n");
                    erroLotacao = false;
                }
                
            }
            
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma fonte de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        textArea.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alterUserWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JLabel btnInfo;
    private javax.swing.ButtonGroup dataFontGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioMainframe;
    private javax.swing.JRadioButton radioSamu;
    private javax.swing.JTextPane textArea;
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
        
        radioSamu.setFocusable(false);
        radioMainframe.setFocusable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));        
    }
}
