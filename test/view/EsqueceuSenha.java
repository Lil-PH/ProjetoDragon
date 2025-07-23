package view;

import javax.swing.JOptionPane;
import model.bean.Usuario;
import model.dao.UsuarioDao;
import java.awt.CardLayout;

public class EsqueceuSenha extends javax.swing.JFrame {
    
    CardLayout cardLayout;
    
    public EsqueceuSenha() {
        
        initComponents();
        cardLayout =(CardLayout)(priCard.getLayout());
        cardLayout.show(priCard, "tela1");
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priCard = new javax.swing.JPanel();
        esqueceu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mensagem0 = new javax.swing.JLabel();
        nameTag = new javax.swing.JTextField();
        voltar0 = new javax.swing.JLabel();
        confirma = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        senhaNova = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        voltar1 = new javax.swing.JLabel();
        mensagem1 = new javax.swing.JLabel();
        altera = new javax.swing.JLabel();
        novaSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        priCard.setBackground(new java.awt.Color(51, 51, 51));
        priCard.setLayout(new java.awt.CardLayout());

        esqueceu.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DRAGON GAMES");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name Tag");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");

        mensagem0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mensagem0.setForeground(new java.awt.Color(255, 255, 255));
        mensagem0.setText("Digite seu endereço de e-mail ou usuário abaixo, para confirmamos que é você.");
        mensagem0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mensagem0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameTag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTagKeyPressed(evt);
            }
        });

        voltar0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar0.setForeground(new java.awt.Color(51, 102, 255));
        voltar0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar0.setText("Voltar");
        voltar0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar0MouseClicked(evt);
            }
        });

        confirma.setBackground(new java.awt.Color(127, 0, 255));
        confirma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        confirma.setForeground(new java.awt.Color(254, 254, 254));
        confirma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirma.setText("Confirmar");
        confirma.setOpaque(true);
        confirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmaMousePressed(evt);
            }
        });
        confirma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmaKeyPressed(evt);
            }
        });

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout esqueceuLayout = new javax.swing.GroupLayout(esqueceu);
        esqueceu.setLayout(esqueceuLayout);
        esqueceuLayout.setHorizontalGroup(
            esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esqueceuLayout.createSequentialGroup()
                .addGroup(esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esqueceuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensagem0)
                            .addComponent(jLabel2)))
                    .addGroup(esqueceuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltar0)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(esqueceuLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTag, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esqueceuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        esqueceuLayout.setVerticalGroup(
            esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esqueceuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(mensagem0)
                .addGap(29, 29, 29)
                .addGroup(esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esqueceuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(voltar0)
                        .addGap(16, 16, 16))
                    .addGroup(esqueceuLayout.createSequentialGroup()
                        .addGroup(esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(esqueceuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nameTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(103, Short.MAX_VALUE))))
        );

        priCard.add(esqueceu, "tela1");

        senhaNova.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DRAGON GAMES");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nova Senha:");

        voltar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar1.setForeground(new java.awt.Color(51, 102, 255));
        voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar1.setText("Voltar");
        voltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar1MouseClicked(evt);
            }
        });

        mensagem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mensagem1.setForeground(new java.awt.Color(255, 255, 255));
        mensagem1.setText("Digite sua nova senha abaixo.");

        altera.setBackground(new java.awt.Color(127, 0, 255));
        altera.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        altera.setForeground(new java.awt.Color(254, 254, 254));
        altera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        altera.setText("Alterar");
        altera.setOpaque(true);
        altera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alteraMousePressed(evt);
            }
        });
        altera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alteraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout senhaNovaLayout = new javax.swing.GroupLayout(senhaNova);
        senhaNova.setLayout(senhaNovaLayout);
        senhaNovaLayout.setHorizontalGroup(
            senhaNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(senhaNovaLayout.createSequentialGroup()
                .addGroup(senhaNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(senhaNovaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7))
                    .addGroup(senhaNovaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltar1))
                    .addGroup(senhaNovaLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(novaSenha))
                    .addGroup(senhaNovaLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(mensagem1))
                    .addGroup(senhaNovaLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(altera, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        senhaNovaLayout.setVerticalGroup(
            senhaNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(senhaNovaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(68, 68, 68)
                .addComponent(mensagem1)
                .addGap(37, 37, 37)
                .addGroup(senhaNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(altera, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(voltar1)
                .addGap(18, 18, 18))
        );

        priCard.add(senhaNova, "tela2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTagKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTagKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER){
            confirma.requestFocus();
        }
    }//GEN-LAST:event_nameTagKeyPressed

    private void voltar0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar0MouseClicked
        // Evento ao click em voltar - Para Voltar a TelaLogin
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltar0MouseClicked

    private void confirmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmaMousePressed
        // Evento ao click no botão - Fazer login
        UsuarioDao dao = new UsuarioDao();

        if(dao.checkInfor(email.getText(), nameTag.getText() )){
                cardLayout.show(priCard, "tela2");
        }else{
            JOptionPane.showMessageDialog(null, "!!Erro!!\nE-mail ou Name Tag invalidos !! ");
        }
    }//GEN-LAST:event_confirmaMousePressed

    private void confirmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmaKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER){
            nameTag.requestFocus();
        }
    }//GEN-LAST:event_emailKeyPressed

    private void voltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar1MouseClicked
        // Evento ao click em voltar - Para Voltar a TelaLogin
        cardLayout.show(priCard, "tela1");
    }//GEN-LAST:event_voltar1MouseClicked

    private void alteraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alteraMousePressed
        // TODO add your handling code here:
            Usuario u = new Usuario();
            UsuarioDao dao = new UsuarioDao();

            u.setEmail_usuario(email.getText());
            u.setNome_usuario(nameTag.getText());
            u.setSenha_usuario(novaSenha.getText());

            dao.updateSenha(u);
            
            email.setText("");
            nameTag.setText("");
            novaSenha.setText("");

            new TelaLogin().setVisible(true);
                this.dispose();   
    }//GEN-LAST:event_alteraMousePressed

    private void alteraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alteraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_alteraKeyPressed

    private void confirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsqueceuSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altera;
    private javax.swing.JLabel confirma;
    private javax.swing.JTextField email;
    private javax.swing.JPanel esqueceu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mensagem0;
    private javax.swing.JLabel mensagem1;
    private javax.swing.JTextField nameTag;
    private javax.swing.JPasswordField novaSenha;
    private javax.swing.JPanel priCard;
    private javax.swing.JPanel senhaNova;
    private javax.swing.JLabel voltar0;
    private javax.swing.JLabel voltar1;
    // End of variables declaration//GEN-END:variables
}
