package view;

import infor.GerenteDeImagens;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.bean.Usuario;
import model.dao.CadastroDao;

public class CriaConta extends javax.swing.JFrame {
    
        GerenteDeImagens gerenteDeImagens = new GerenteDeImagens();

        
    public CriaConta() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        criar = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        fotoUs = new javax.swing.JLabel();
        fotoDeUsuario = new javax.swing.JLabel();
        titulo11 = new javax.swing.JLabel();
        senha1 = new javax.swing.JPasswordField();
        senha2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name Tag:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Senha:");

        criar.setBackground(new java.awt.Color(127, 0, 255));
        criar.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        criar.setForeground(new java.awt.Color(254, 254, 254));
        criar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        criar.setText("Criar");
        criar.setOpaque(true);
        criar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                criarMousePressed(evt);
            }
        });
        criar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                criarKeyPressed(evt);
            }
        });

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(127, 0, 255));
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Cadastro de Usuario");

        voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar.setForeground(new java.awt.Color(51, 102, 255));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        fotoUs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fotoUs.setForeground(new java.awt.Color(255, 255, 255));
        fotoUs.setText("Foto de Usuario:");

        fotoDeUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fotoDeUsuario.setForeground(new java.awt.Color(127, 0, 255));
        fotoDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpaper.png"))); // NOI18N
        fotoDeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoDeUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fotoDeUsuarioMousePressed(evt);
            }
        });

        titulo11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo11.setForeground(new java.awt.Color(255, 255, 255));
        titulo11.setText("DRAGON GAMES");

        senha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senha1KeyPressed(evt);
            }
        });

        senha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senha2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(senha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(fotoUs)
                    .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(titulo11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(141, 141, 141)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltar)
                        .addGap(176, 176, 176)
                        .addComponent(criar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(titulo11))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fotoUs))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fotoDeUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criar)
                    .addComponent(voltar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void fotoDeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoDeUsuarioMouseClicked
        // Evento ao click em Foto - Add Foto
        if (evt.getClickCount() == 1) {
            gerenteDeImagens.escolherImagem(fotoDeUsuario);
        }
    }//GEN-LAST:event_fotoDeUsuarioMouseClicked

    private void fotoDeUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoDeUsuarioMousePressed
        // Evento ao click em Foto - Add Foto
        
    }//GEN-LAST:event_fotoDeUsuarioMousePressed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        // Evento ao click em voltar - Para Voltar a TelaLogin
        TelaLogin login = new TelaLogin();
         login.setVisible(true);
           dispose();

    }//GEN-LAST:event_voltarMouseClicked

    private void criarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarMousePressed
        // Evento ao click no botão - Criar Conta
        
        if(new String(senha1.getPassword()).equals(new String(senha2.getPassword()))){
            Usuario u = new Usuario();
            CadastroDao dao = new CadastroDao();

            u.setNome_usuario(name.getText());
            u.setEmail_usuario(email.getText());
            u.setSenha_usuario(senha1.getText());

            dao.create(u);

            email.setText("");
            name.setText("");
            senha1.setText("");
            senha2.setText("");

            new TelaLogin().setVisible(true);
                this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "!!Erro!!\nSenhas não compatíveis !! ");
        }
    }//GEN-LAST:event_criarMousePressed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER){
            email.requestFocus();
        }
    }//GEN-LAST:event_nameKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER){
            senha1.requestFocus();
        }
    }//GEN-LAST:event_emailKeyPressed

    private void senha1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senha1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER){
            senha2.requestFocus();
        }
    }//GEN-LAST:event_senha1KeyPressed

    private void criarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_criarKeyPressed
        // TODO add your handling code here:
        
        if(new String(senha1.getPassword()).equals(new String(senha2.getPassword()))){
            Usuario u = new Usuario();
            CadastroDao dao = new CadastroDao();

            u.setNome_usuario(name.getText());
            u.setEmail_usuario(email.getText());
            u.setSenha_usuario(senha1.getText());

            dao.create(u);

            email.setText("");
            name.setText("");
            senha1.setText("");
            senha2.setText("");

            new TelaLogin().setVisible(true);
                this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "!!Erro!!\nSenhas não compatíveis !! ");
        }
        
        
    }//GEN-LAST:event_criarKeyPressed

    private void senha2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senha2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER){
            criar.requestFocus();
        }
    }//GEN-LAST:event_senha2KeyPressed
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CriaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel criar;
    private javax.swing.JTextField email;
    private javax.swing.JLabel fotoDeUsuario;
    private javax.swing.JLabel fotoUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JPasswordField senha2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo11;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
