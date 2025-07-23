
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Loading extends javax.swing.JFrame {

    public Loading() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCor = new javax.swing.JPanel();
        gif = new javax.swing.JLabel();
        progresso = new javax.swing.JProgressBar();
        porcentagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaCor.setBackground(new java.awt.Color(51, 51, 51));
        telaCor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loader.gif"))); // NOI18N

        progresso.setForeground(new java.awt.Color(127, 0, 255));

        porcentagem.setBackground(new java.awt.Color(127, 0, 255));
        porcentagem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        porcentagem.setForeground(new java.awt.Color(127, 0, 255));
        porcentagem.setText("99");

        javax.swing.GroupLayout telaCorLayout = new javax.swing.GroupLayout(telaCor);
        telaCor.setLayout(telaCorLayout);
        telaCorLayout.setHorizontalGroup(
            telaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCorLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(gif)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCorLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(telaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCorLayout.createSequentialGroup()
                        .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCorLayout.createSequentialGroup()
                        .addComponent(porcentagem)
                        .addGap(251, 251, 251))))
        );
        telaCorLayout.setVerticalGroup(
            telaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCorLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(gif)
                .addGap(18, 18, 18)
                .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(porcentagem)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Codigo de carregamento
        Loading loading = new Loading();
        loading.setVisible(true);
        try {
            for (int i = 0; i <= 100; i +=3){
               Thread.sleep(70);
               loading.progresso.setValue(i);
               loading.porcentagem.setText(Integer.toString(i) + "%");     
            }
            loading.dispose();
            
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
        } catch (InterruptedException e){
        JOptionPane.showConfirmDialog(null, "!! ERRO !!");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gif;
    private javax.swing.JLabel porcentagem;
    private javax.swing.JProgressBar progresso;
    private javax.swing.JPanel telaCor;
    // End of variables declaration//GEN-END:variables
}
