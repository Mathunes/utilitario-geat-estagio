package utilitarioestagiogeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddUserWindow extends javax.swing.JFrame {

    //Variáveis para armazenar os dados de cada usuário antes da impressão
    private String userId = "";
    private String name = "";
    private String area = "";
    private String email = "";
    private String office = "";
    private String subgroup = "";
    private int notes = 4;
    private Boolean firstUser;
    //Tela de informações
    InfoWindow infoFrame;
    
    public AddUserWindow() {
        //Título da janela
        super("Utilitário GEAT - Gerador de colinhas");
        initComponents();
        //Método para estilizar os componentes
        stylizeComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUserWindowPanel = new javax.swing.JPanel();
        titleWindow = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        btnClean = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        btnHomeWindow = new javax.swing.JLabel();
        btnInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(768, 468));
        setResizable(false);

        addUserWindowPanel.setMaximumSize(new java.awt.Dimension(776, 468));
        addUserWindowPanel.setMinimumSize(new java.awt.Dimension(776, 468));

        titleWindow.setText("Entrada de pessoal");

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

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarioestagiogeat/assets/info.png"))); // NOI18N
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addUserWindowPanelLayout = new javax.swing.GroupLayout(addUserWindowPanel);
        addUserWindowPanel.setLayout(addUserWindowPanelLayout);
        addUserWindowPanelLayout.setHorizontalGroup(
            addUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserWindowPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(addUserWindowPanelLayout.createSequentialGroup()
                        .addComponent(titleWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                        .addComponent(btnHomeWindow)
                        .addGap(18, 18, 18)
                        .addComponent(btnClean)))
                .addGap(37, 37, 37))
        );
        addUserWindowPanelLayout.setVerticalGroup(
            addUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserWindowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addUserWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleWindow)
                        .addComponent(btnClean)
                        .addComponent(btnHomeWindow)))
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
            .addComponent(addUserWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addUserWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void buildResult() {
        
        Date dateNow = new Date();
        String date = new SimpleDateFormat("dd/MM/yyyy").format(dateNow);        
        
        if (notes == 4)
            notes = 1;
        else
            notes = 4;
        
        if (firstUser) {
            textArea.setText(textArea.getText()
                + name + " - " + office + "\n"
                + userId + "\n"
                + "Usuário(a) " + name + " criado(a) no Notes_" + notes + "/BNDES BNDES\\cp\\cp_" + userId + ".nsf\n"
                + "Internet Address: " + email + "\n"
                + "D:\\Users\\" + System.getProperty("user.name") + "\\Documents\\ID Vault\\" + userId + ".id\n"
                + date + " - \n"
                + area + "\n"
                + "CN=" + userId.toUpperCase() + "/CN=Users/DC=bndes/DC=net"
            );
            
            firstUser = false;
        } else
            textArea.setText(textArea.getText()
                + "\n\n\n\n" + name + " - " + office + "\n"
                + userId + "\n"
                + "Usuário(a) " + name + " criado(a) no Notes_" + notes + "/BNDES BNDES\\cp\\cp_" + userId + ".nsf\n"
                + "Internet Address: " + email + "\n"
                + "D:\\Users\\" + System.getProperty("user.name") + "\\Documents\\ID Vault\\" + userId + ".id\n"
                + date + " - \n"
                + area + "\n"
                + "CN=" + userId.toUpperCase() + "/CN=Users/DC=bndes/DC=net"
            );
    
    }
    
    //Ouvindo click do botão Converter
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        
        firstUser = true;
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

            textInput = textInput.replace(infoDesligado, "");

        }

        if (textInput.contains("Usuários alterados:")) {
            int indiceAlter = textInput.indexOf("Usuários alterados:");

            String infoAlter = "";

            for (int i = indiceAlter; i < textInput.length(); i++) {
                infoAlter += textInput.charAt(i);
            }

            textInput = textInput.replace(infoAlter, "");

        }
        
        if (textInput.contains("Usuários novos:")) {
            int indiceAdd = textInput.indexOf("Usuários novos:");

            String infoRemove = "";

            for (int i = 0; i < indiceAdd; i++) {
                infoRemove += textInput.charAt(i);
            }

            textInput = textInput.replace(infoRemove, "");

        }
        
        int i = textInput.indexOf("Usuários novos:") + "Usuários novos:\n".length();

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
                
            } else if (userInfo.contains("Nome................. ")) {
                name = "";
                name = userInfo.replace("Nome................. ", "");
                name = name.replace(Character.toString(name.charAt(name.length() - 1)), "");
                
            } else if (userInfo.contains("Lotação.............. ")) {
                area = "";
                auxStr = "";
                area = userInfo.replace("Lotação.............. ", "");
                
                aux = area.indexOf("(");
                
                for (int j = aux; j < area.length(); j++) {
                    auxStr += area.charAt(j);
                }
                
                area = area.replace(" " + auxStr, "");
                
            } else if (userInfo.contains("E-mail............... ")) {
                email = "";
                email = userInfo.replace("E-mail............... ", "");
                
            } else if (userInfo.contains("Cargo................ ")) {
                office = "";
                auxStr = "";
                office = userInfo.replace("Cargo................ ", "");
                
                aux = office.indexOf("(");
                
                for (int j = aux; j < office.length(); j++) {
                    auxStr += office.charAt(j);
                }
                
                office = office.replace(" " + auxStr, "");
                
            } else if (userInfo.contains("Subgrupo............. ")) {
                subgroup = "";
                auxStr = "";
                subgroup = userInfo.replace("Subgrupo............. ", "");
                
                if (subgroup.contains("Estagiário")) {
                    aux = subgroup.indexOf("(");

                    for (int j = aux; j < subgroup.length(); j++) {
                        auxStr += subgroup.charAt(j);
                    }

                    subgroup = subgroup.replace(" " + auxStr, "");
                    
                    office = subgroup;
                }
                
                buildResult();
            }
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    //Método para limpar os campos de entrada
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        textArea.setText("");
        this.notes = 4;
    }//GEN-LAST:event_btnCleanActionPerformed

    //Método para abrir janela de informações
    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        infoFrame = new InfoWindow("Converter o texto gerado no relátorio SAMU para a colinha utilizada na criação de usuário no Notes",
            "Selecionar todo texto do relatório SAMU - <b>CTRL + A</b>",
            "Copiar o texto selecionado - <b>CTRL + C</b>",
            "Colar o texto selecionado na área de texto - <b>CTRL + V</b>");

        infoFrame.setVisible(true);
    }//GEN-LAST:event_btnInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addUserWindowPanel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel btnHomeWindow;
    private javax.swing.JLabel btnInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane textArea;
    private javax.swing.JLabel titleWindow;
    // End of variables declaration//GEN-END:variables

    //Método para estilizar os componentes
    private void stylizeComponents() {
        addUserWindowPanel.setBackground(new Color(232, 243, 240));
        
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
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assets/icon.png")));
    }

}
