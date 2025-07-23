
package view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.bean.Categoria;
import model.bean.Jogo;
import model.bean.Usuario;
import model.dao.JogosDao;
import model.dao.UsuarioDao;

public class TelaInicial extends javax.swing.JFrame {

    
    CardLayout cardLayout;
    public TelaInicial() {
        initComponents();
        cardLayout =(CardLayout)(priCards.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        titulo11 = new javax.swing.JLabel();
        telaInicial = new javax.swing.JLabel();
        biblioteca = new javax.swing.JLabel();
        loja = new javax.swing.JLabel();
        conta = new javax.swing.JLabel();
        priCards = new javax.swing.JPanel();
        priCard1 = new javax.swing.JPanel();
        maisVendidos = new javax.swing.JLabel();
        imagemJG1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vendaJG1 = new javax.swing.JLabel();
        comprarJG1 = new javax.swing.JLabel();
        imagemJG2 = new javax.swing.JLabel();
        nomeJG2 = new javax.swing.JLabel();
        vendaJG2 = new javax.swing.JLabel();
        comprarJG2 = new javax.swing.JLabel();
        imagemJG3 = new javax.swing.JLabel();
        nomeJG3 = new javax.swing.JLabel();
        vendaJG3 = new javax.swing.JLabel();
        comprarJG3 = new javax.swing.JLabel();
        imagemJG4 = new javax.swing.JLabel();
        nomeJG4 = new javax.swing.JLabel();
        vendaJG4 = new javax.swing.JLabel();
        compraJG4 = new javax.swing.JLabel();
        imagemJG5 = new javax.swing.JLabel();
        nomeJG5 = new javax.swing.JLabel();
        vendaJG5 = new javax.swing.JLabel();
        compraJG5 = new javax.swing.JLabel();
        recomendados = new javax.swing.JLabel();
        compraJG6 = new javax.swing.JLabel();
        vendaJG9 = new javax.swing.JLabel();
        imagemJG7 = new javax.swing.JLabel();
        compraJG9 = new javax.swing.JLabel();
        nomeJG7 = new javax.swing.JLabel();
        imagemJG10 = new javax.swing.JLabel();
        vendaJG7 = new javax.swing.JLabel();
        nomeJG10 = new javax.swing.JLabel();
        compraJG7 = new javax.swing.JLabel();
        vendaJG10 = new javax.swing.JLabel();
        imagemJG8 = new javax.swing.JLabel();
        compraJG10 = new javax.swing.JLabel();
        nomeJG8 = new javax.swing.JLabel();
        vendaJG8 = new javax.swing.JLabel();
        imagemJG6 = new javax.swing.JLabel();
        compraJG8 = new javax.swing.JLabel();
        nomeJG6 = new javax.swing.JLabel();
        imagemJG9 = new javax.swing.JLabel();
        vendaJG6 = new javax.swing.JLabel();
        nomeJG9 = new javax.swing.JLabel();
        priCard3 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        mensagem = new javax.swing.JTextField();
        sinopse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        preco = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        imagem = new javax.swing.JLabel();
        salvar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        priCard2 = new javax.swing.JPanel();
        priCard5 = new javax.swing.JPanel();
        jgImagem1 = new javax.swing.JLabel();
        jgImagem2 = new javax.swing.JLabel();
        jgImagem3 = new javax.swing.JLabel();
        jgImagem4 = new javax.swing.JLabel();
        jgImagem5 = new javax.swing.JLabel();
        jgImagem6 = new javax.swing.JLabel();
        jgImagem7 = new javax.swing.JLabel();
        jgImagem8 = new javax.swing.JLabel();
        jgImagem9 = new javax.swing.JLabel();
        jgImagem10 = new javax.swing.JLabel();
        priCard4 = new javax.swing.JPanel();
        adicionarJogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        alterarNameTag = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        alterarEmail1 = new javax.swing.JLabel();
        priCard6 = new javax.swing.JPanel();
        voltar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeDeJogo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        preco1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idCategoria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        salvar2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        confirma = new javax.swing.JLabel();
        voltar2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        novoUsuario = new javax.swing.JTextField();
        alterar = new javax.swing.JLabel();
        voltar3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        senha2 = new javax.swing.JPasswordField();
        confirma2 = new javax.swing.JLabel();
        voltar5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        novoEmail = new javax.swing.JTextField();
        voltar4 = new javax.swing.JLabel();
        alterar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerSize(1);
        jSplitPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        titulo11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo11.setForeground(new java.awt.Color(255, 255, 255));
        titulo11.setText("DRAGON GAMES");

        telaInicial.setBackground(new java.awt.Color(0, 0, 0));
        telaInicial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telaInicial.setForeground(new java.awt.Color(255, 255, 255));
        telaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        telaInicial.setText("TELA INICIAL");
        telaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaInicialMouseClicked(evt);
            }
        });

        biblioteca.setBackground(new java.awt.Color(0, 0, 0));
        biblioteca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        biblioteca.setForeground(new java.awt.Color(255, 255, 255));
        biblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list1.png"))); // NOI18N
        biblioteca.setText("BIBLIOTECA");
        biblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bibliotecaMouseClicked(evt);
            }
        });

        loja.setBackground(new java.awt.Color(0, 0, 0));
        loja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loja.setForeground(new java.awt.Color(255, 255, 255));
        loja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        loja.setText("LOJA");
        loja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lojaMouseClicked(evt);
            }
        });

        conta.setBackground(new java.awt.Color(0, 0, 0));
        conta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        conta.setForeground(new java.awt.Color(255, 255, 255));
        conta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        conta.setText("CONTA");
        conta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(conta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(loja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titulo11)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo11)
                .addGap(66, 66, 66)
                .addComponent(telaInicial)
                .addGap(59, 59, 59)
                .addComponent(loja)
                .addGap(55, 55, 55)
                .addComponent(biblioteca)
                .addGap(37, 37, 37)
                .addComponent(conta)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        priCards.setBackground(new java.awt.Color(0, 0, 0));
        priCards.setLayout(new java.awt.CardLayout());

        priCard1.setBackground(new java.awt.Color(0, 0, 0));
        priCard1.setToolTipText("");

        maisVendidos.setBackground(new java.awt.Color(255, 255, 255));
        maisVendidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maisVendidos.setForeground(new java.awt.Color(255, 255, 255));
        maisVendidos.setText("Mais vendidos");

        imagemJG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/images.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("God of War Ragnarok");

        vendaJG1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG1.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG1.setText("PRÉ-VENDA R$ 210,00");

        comprarJG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        comprarJG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarJG1MouseClicked(evt);
            }
        });

        imagemJG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Gotham knights.png"))); // NOI18N

        nomeJG2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG2.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG2.setText("Gotham Knights");

        vendaJG2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG2.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG2.setText("PRÉ-VENDA R$ 180,00");

        comprarJG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        comprarJG2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarJG2MouseClicked(evt);
            }
        });

        imagemJG3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        imagemJG3.setForeground(new java.awt.Color(255, 255, 255));
        imagemJG3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/MultiVersus.png"))); // NOI18N

        nomeJG3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG3.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG3.setText("MultiVersus");

        vendaJG3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG3.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG3.setText("PRÉ-VENDA R$ 200,00");

        comprarJG3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        comprarJG3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarJG3MouseClicked(evt);
            }
        });

        imagemJG4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Spider-Man.png"))); // NOI18N

        nomeJG4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG4.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG4.setText("Spider-Man");

        vendaJG4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG4.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG4.setText("PRÉ-VENDA R$ 190,00");

        compraJG4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        compraJG4.setText("jLabel1");
        compraJG4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraJG4MouseClicked(evt);
            }
        });

        imagemJG5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Horizon.png"))); // NOI18N

        nomeJG5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG5.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG5.setText("Horizon Forbidden");

        vendaJG5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG5.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG5.setText("PRÉ-VANDA R$ 250,00");

        compraJG5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        compraJG5.setText("jLabel1");
        compraJG5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraJG5MouseClicked(evt);
            }
        });

        recomendados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        recomendados.setForeground(new java.awt.Color(255, 255, 255));
        recomendados.setText("Recomendados para você ");

        compraJG6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N

        vendaJG9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG9.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG9.setText("Pré-Venda R$ 189,00");

        imagemJG7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Untitled-2.png"))); // NOI18N

        compraJG9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N

        nomeJG7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG7.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG7.setText("The King of Fighters ");

        imagemJG10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/War Thuder.png"))); // NOI18N

        vendaJG7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG7.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG7.setText("Pré-Venda R$ 50,00");

        nomeJG10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG10.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG10.setText("War Thunder ");

        compraJG7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N

        vendaJG10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG10.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG10.setText("Pré-venda R$ 70,00");

        imagemJG8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Gran Turismo7.png"))); // NOI18N

        compraJG10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N

        nomeJG8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG8.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG8.setText("Gran Turismo 7");

        vendaJG8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG8.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG8.setText("Pré-Vanda R$ 150,00");

        imagemJG6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Flight Simulador.png"))); // NOI18N

        compraJG8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        compraJG8.setText("jLabel1");

        nomeJG6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG6.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG6.setText("Flight Simulator");

        imagemJG9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Ghost of Tsushima.png"))); // NOI18N

        vendaJG6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG6.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG6.setText("Pré-Venda R$ 70,00");

        nomeJG9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG9.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG9.setText("Ghost of Tsushima");

        javax.swing.GroupLayout priCard1Layout = new javax.swing.GroupLayout(priCard1);
        priCard1.setLayout(priCard1Layout);
        priCard1Layout.setHorizontalGroup(
            priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priCard1Layout.createSequentialGroup()
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addComponent(imagemJG1)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG2))
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vendaJG1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprarJG1)
                                .addGap(18, 18, 18)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG2)
                                    .addComponent(vendaJG2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprarJG2)))
                        .addGap(18, 18, 18)
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG3)
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG3)
                                    .addComponent(nomeJG3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprarJG3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG4)
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG4)
                                    .addComponent(nomeJG4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG5)
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG5)
                                    .addGroup(priCard1Layout.createSequentialGroup()
                                        .addComponent(vendaJG5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compraJG5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(maisVendidos)
                    .addComponent(recomendados)
                    .addGroup(priCard1Layout.createSequentialGroup()
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addComponent(imagemJG6)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG7)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG8))
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG6)
                                    .addComponent(nomeJG6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG6)
                                .addGap(46, 46, 46)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG7)
                                    .addComponent(nomeJG7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG7)
                                .addGap(44, 44, 44)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(priCard1Layout.createSequentialGroup()
                                        .addComponent(vendaJG8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compraJG8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nomeJG8))))
                        .addGap(18, 18, 18)
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addComponent(imagemJG9)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG10))
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG9)
                                    .addComponent(vendaJG9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG9)
                                .addGap(48, 48, 48)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG10)
                                    .addComponent(nomeJG10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        priCard1Layout.setVerticalGroup(
            priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(maisVendidos)
                .addGap(18, 18, 18)
                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priCard1Layout.createSequentialGroup()
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG3)
                            .addComponent(imagemJG4)
                            .addComponent(imagemJG5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(priCard1Layout.createSequentialGroup()
                                    .addComponent(nomeJG3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG3))
                                .addComponent(comprarJG3))
                            .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(compraJG4)
                                .addGroup(priCard1Layout.createSequentialGroup()
                                    .addComponent(nomeJG4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard1Layout.createSequentialGroup()
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(compraJG5)
                                    .addGroup(priCard1Layout.createSequentialGroup()
                                        .addComponent(nomeJG5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vendaJG5)))
                                .addGap(11, 11, 11))))
                    .addGroup(priCard1Layout.createSequentialGroup()
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG2)
                            .addComponent(imagemJG1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(priCard1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, priCard1Layout.createSequentialGroup()
                                    .addComponent(nomeJG2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG2)))
                            .addComponent(comprarJG2)
                            .addComponent(comprarJG1))))
                .addGap(25, 25, 25)
                .addComponent(recomendados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemJG6)
                    .addComponent(imagemJG7)
                    .addComponent(imagemJG8)
                    .addComponent(imagemJG9)
                    .addComponent(imagemJG10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(priCard1Layout.createSequentialGroup()
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG6)
                                    .addComponent(nomeJG7)
                                    .addComponent(nomeJG8)
                                    .addComponent(nomeJG9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vendaJG6)
                                        .addComponent(vendaJG7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(vendaJG8, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(priCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(compraJG8)
                                .addComponent(vendaJG9))
                            .addComponent(compraJG7)
                            .addComponent(compraJG6)
                            .addComponent(compraJG9))
                        .addGroup(priCard1Layout.createSequentialGroup()
                            .addComponent(nomeJG10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vendaJG10)))
                    .addComponent(compraJG10))
                .addContainerGap())
        );

        priCards.add(priCard1, "priCard1");

        priCard3.setBackground(new java.awt.Color(51, 51, 51));

        nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome:");

        mensagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        sinopse.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sinopse.setForeground(new java.awt.Color(255, 255, 255));
        sinopse.setText("Sinopse:");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        preco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        preco.setForeground(new java.awt.Color(255, 255, 255));
        preco.setText("Preço:");

        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        salvar1.setBackground(new java.awt.Color(127, 0, 255));
        salvar1.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        salvar1.setForeground(new java.awt.Color(254, 254, 254));
        salvar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salvar1.setText("Fechar pedido");
        salvar1.setOpaque(true);
        salvar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvar1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salvar1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formas de Pagamentos:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto", "Cartão", "Pix", " " }));

        javax.swing.GroupLayout priCard3Layout = new javax.swing.GroupLayout(priCard3);
        priCard3.setLayout(priCard3Layout);
        priCard3Layout.setHorizontalGroup(
            priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard3Layout.createSequentialGroup()
                        .addComponent(preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor))
                    .addGroup(priCard3Layout.createSequentialGroup()
                        .addComponent(sinopse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(priCard3Layout.createSequentialGroup()
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensagem)))
                .addGap(49, 49, 49)
                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(priCard3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salvar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        priCard3Layout.setVerticalGroup(
            priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(priCard3Layout.createSequentialGroup()
                            .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nome)
                                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sinopse)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(priCard3Layout.createSequentialGroup()
                        .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(salvar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(priCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        priCards.add(priCard3, "priCard3");

        priCard2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout priCard2Layout = new javax.swing.GroupLayout(priCard2);
        priCard2.setLayout(priCard2Layout);
        priCard2Layout.setHorizontalGroup(
            priCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        priCard2Layout.setVerticalGroup(
            priCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );

        priCards.add(priCard2, "priCard2");

        jgImagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/images.jpg"))); // NOI18N

        jgImagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Gotham knights.png"))); // NOI18N

        jgImagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/MultiVersus.png"))); // NOI18N

        jgImagem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Spider-Man.png"))); // NOI18N

        jgImagem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Horizon.png"))); // NOI18N

        jgImagem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Flight Simulador.png"))); // NOI18N

        jgImagem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Untitled-2.png"))); // NOI18N

        jgImagem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Gran Turismo7.png"))); // NOI18N

        jgImagem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Ghost of Tsushima.png"))); // NOI18N

        jgImagem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/War Thuder.png"))); // NOI18N

        javax.swing.GroupLayout priCard5Layout = new javax.swing.GroupLayout(priCard5);
        priCard5.setLayout(priCard5Layout);
        priCard5Layout.setHorizontalGroup(
            priCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(priCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priCard5Layout.createSequentialGroup()
                        .addComponent(jgImagem6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem10))
                    .addGroup(priCard5Layout.createSequentialGroup()
                        .addComponent(jgImagem1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgImagem5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        priCard5Layout.setVerticalGroup(
            priCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(priCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jgImagem5)
                    .addComponent(jgImagem4)
                    .addComponent(jgImagem3)
                    .addComponent(jgImagem2)
                    .addComponent(jgImagem1))
                .addGap(18, 18, 18)
                .addGroup(priCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jgImagem6)
                        .addComponent(jgImagem7)
                        .addComponent(jgImagem8))
                    .addComponent(jgImagem9)
                    .addComponent(jgImagem10))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        priCards.add(priCard5, "priCard5");

        priCard4.setBackground(new java.awt.Color(51, 51, 51));

        adicionarJogo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        adicionarJogo.setForeground(new java.awt.Color(255, 255, 255));
        adicionarJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/joystick.png"))); // NOI18N
        adicionarJogo.setText("Adicionar Jogo");
        adicionarJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarJogoMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Olá, o que deseja fazer ?");

        alterarNameTag.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        alterarNameTag.setForeground(new java.awt.Color(255, 255, 255));
        alterarNameTag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        alterarNameTag.setText("Alterar NameTag");
        alterarNameTag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarNameTagMouseClicked(evt);
            }
        });

        sair.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        sair.setText("Sair da Conta");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        alterarEmail1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        alterarEmail1.setForeground(new java.awt.Color(255, 255, 255));
        alterarEmail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/services.png"))); // NOI18N
        alterarEmail1.setText("Alterar Email");
        alterarEmail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarEmail1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout priCard4Layout = new javax.swing.GroupLayout(priCard4);
        priCard4.setLayout(priCard4Layout);
        priCard4Layout.setHorizontalGroup(
            priCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard4Layout.createSequentialGroup()
                .addGroup(priCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priCard4Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel10))
                    .addGroup(priCard4Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addGroup(priCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarJogo)
                            .addComponent(alterarNameTag)
                            .addComponent(alterarEmail1)
                            .addComponent(sair))))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        priCard4Layout.setVerticalGroup(
            priCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel10)
                .addGap(87, 87, 87)
                .addComponent(adicionarJogo)
                .addGap(75, 75, 75)
                .addComponent(alterarNameTag)
                .addGap(73, 73, 73)
                .addComponent(alterarEmail1)
                .addGap(75, 75, 75)
                .addComponent(sair)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        alterarNameTag.getAccessibleContext().setAccessibleName("Alterar Nome");
        alterarNameTag.getAccessibleContext().setAccessibleParent(priCards);

        priCards.add(priCard4, "priCard4");
        priCard4.getAccessibleContext().setAccessibleName("");

        priCard6.setBackground(new java.awt.Color(51, 51, 51));
        priCard6.setPreferredSize(new java.awt.Dimension(400, 300));

        voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar.setForeground(new java.awt.Color(51, 102, 255));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltarMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastro de Jogos");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome do Jogo:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preço:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Categoria:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpaper.png"))); // NOI18N

        salvar2.setBackground(new java.awt.Color(127, 0, 255));
        salvar2.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        salvar2.setForeground(new java.awt.Color(254, 254, 254));
        salvar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salvar2.setText("Salvar");
        salvar2.setOpaque(true);
        salvar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvar2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salvar2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout priCard6Layout = new javax.swing.GroupLayout(priCard6);
        priCard6.setLayout(priCard6Layout);
        priCard6Layout.setHorizontalGroup(
            priCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard6Layout.createSequentialGroup()
                .addGroup(priCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(priCard6Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addGroup(priCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeDeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)))
                .addGap(156, 442, Short.MAX_VALUE))
            .addGroup(priCard6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(voltar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(priCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                        .addComponent(salvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(421, 421, 421))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(501, 501, 501))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(priCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(526, 526, 526))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priCard6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(385, 385, 385))))
        );
        priCard6Layout.setVerticalGroup(
            priCard6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priCard6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(nomeDeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(idCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(19, 19, 19)
                .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(65, 65, 65)
                .addComponent(salvar2)
                .addGap(58, 58, 58)
                .addComponent(voltar)
                .addGap(25, 25, 25))
        );

        priCards.add(priCard6, "add");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Alteração de NameTag");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Para confirmar, digite sua senha abaixo");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Senha:");

        confirma.setBackground(new java.awt.Color(127, 0, 255));
        confirma.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        confirma.setForeground(new java.awt.Color(254, 254, 254));
        confirma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirma.setText("Confirma");
        confirma.setOpaque(true);
        confirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmaMousePressed(evt);
            }
        });

        voltar2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar2.setForeground(new java.awt.Color(51, 102, 255));
        voltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar2.setText("Voltar");
        voltar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltar2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(348, 348, 348))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)))
                            .addGap(396, 396, 396)))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(voltar2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel14)
                .addGap(129, 129, 129)
                .addComponent(jLabel15)
                .addGap(128, 128, 128)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addComponent(confirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(voltar2)
                .addGap(22, 22, 22))
        );

        priCards.add(jPanel3, "novoNome");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Alteração de NameTag");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Digite abaixo seu novo nome de usuário");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Novo Usuário:");

        alterar.setBackground(new java.awt.Color(127, 0, 255));
        alterar.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        alterar.setForeground(new java.awt.Color(254, 254, 254));
        alterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alterar.setText("Alterar");
        alterar.setOpaque(true);
        alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alterarMousePressed(evt);
            }
        });

        voltar3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar3.setForeground(new java.awt.Color(51, 102, 255));
        voltar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar3.setText("Voltar");
        voltar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltar3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(novoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(voltar3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel11)
                .addGap(108, 108, 108)
                .addComponent(jLabel12)
                .addGap(121, 121, 121)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(novoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(voltar3)
                .addGap(21, 21, 21))
        );

        priCards.add(jPanel2, "alteraNome");
        jPanel2.getAccessibleContext().setAccessibleName("jPanel2");

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Alteração de E-mail");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Para confirmar, digite sua senha abaixo");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Senha:");

        confirma2.setBackground(new java.awt.Color(127, 0, 255));
        confirma2.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        confirma2.setForeground(new java.awt.Color(254, 254, 254));
        confirma2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirma2.setText("Confirma");
        confirma2.setOpaque(true);
        confirma2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirma2MousePressed(evt);
            }
        });

        voltar5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar5.setForeground(new java.awt.Color(51, 102, 255));
        voltar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar5.setText("Voltar");
        voltar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltar5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(confirma2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(394, 394, 394))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(voltar5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel20)
                .addGap(124, 124, 124)
                .addComponent(jLabel21)
                .addGap(90, 90, 90)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(confirma2)
                .addGap(91, 91, 91)
                .addComponent(voltar5)
                .addGap(20, 20, 20))
        );

        priCards.add(jPanel5, "confirmaSenha2");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Alteração de E-mail");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Digite abaixo seu novo e-mail");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Novo E-mail:");

        voltar4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar4.setForeground(new java.awt.Color(51, 102, 255));
        voltar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar4.setText("Voltar");
        voltar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltar4MousePressed(evt);
            }
        });

        alterar2.setBackground(new java.awt.Color(127, 0, 255));
        alterar2.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        alterar2.setForeground(new java.awt.Color(254, 254, 254));
        alterar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alterar2.setText("Alterar");
        alterar2.setOpaque(true);
        alterar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alterar2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(415, 415, 415))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alterar2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(novoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(365, 365, 365))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(voltar4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel17)
                .addGap(117, 117, 117)
                .addComponent(jLabel18)
                .addGap(127, 127, 127)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(novoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(alterar2)
                .addGap(92, 92, 92)
                .addComponent(voltar4)
                .addGap(24, 24, 24))
        );

        priCards.add(jPanel4, "alteraEmail");

        jSplitPane1.setRightComponent(priCards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaInicialMouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard1");
    }//GEN-LAST:event_telaInicialMouseClicked

    private void bibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bibliotecaMouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard2");
    }//GEN-LAST:event_bibliotecaMouseClicked

    private void lojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lojaMouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
    }//GEN-LAST:event_lojaMouseClicked

    private void contaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contaMouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard4");
    }//GEN-LAST:event_contaMouseClicked

    private void comprarJG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarJG1MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("God of War");
        descricao.setText("Em God of War Ragnarök, a relação"
                + "\nentre Kratos e Atreus é o "
                + "\ncentro do que define a nossa história. "
                + "\nEmbora sejam nossa família principal, "
                + "\nhá muitos outros nos Nove Reinos "
                + "\nque também colocarão suas marcas "
                + "\nsobre como os eventos "
                + "\nque levam a Ragnarök se desdobram.");
        imagem.add (jgImagem1);
        valor.setText("R$210,00 reais");
        
    }//GEN-LAST:event_comprarJG1MouseClicked

    private void comprarJG2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarJG2MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("Gotham Knights");
        descricao.setText("Gotham Knights é um RPG de ação em mundo aberto ambientado "
                + "\nna Gotham City mais dinâmica e interativa já criada. "
                + "Patrulhe os cinco"
                + "distritos de Gotham, em jogo solo ou com outro herói"
                + "\ne combata as atividades "
                + "\ncriminosas onde quer que estejam. Batman está morto.");
        imagem.add (jgImagem2);
        valor.setText("R$180,00 reais");
    }//GEN-LAST:event_comprarJG2MouseClicked

    private void comprarJG3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarJG3MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
    }//GEN-LAST:event_comprarJG3MouseClicked

    private void compraJG4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG4MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
    }//GEN-LAST:event_compraJG4MouseClicked

    private void compraJG5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG5MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
    }//GEN-LAST:event_compraJG5MouseClicked

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void salvar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvar1MousePressed
        // Evento ao click no botão - Criar Conta

        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_salvar1MousePressed

    private void salvar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvar1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_salvar1MouseClicked

    private void adicionarJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarJogoMouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "add");
    }//GEN-LAST:event_adicionarJogoMouseClicked

    private void salvar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvar2MousePressed
        // Evento ao click no botão - Criar Conta
        
        Categoria ct = new Categoria();
        ct.setId_categoria(Integer.parseInt(idCategoria.getText()));
        Jogo j = new Jogo();
        j.setNome_jogo(nomeDeJogo.getText());
        j.setPreco_jogo(Double.parseDouble(preco1.getText()));
        j.setCategoria(ct);
        JogosDao dao = new JogosDao();
        dao.create(j);
        
        nomeDeJogo.setText("");
        preco1.setText("");
        idCategoria.setText("");

    }//GEN-LAST:event_salvar2MousePressed

    private void voltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMousePressed
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard4");
        
    }//GEN-LAST:event_voltarMousePressed

    private void alterarNameTagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarNameTagMouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards,"novoNome");

    }//GEN-LAST:event_alterarNameTagMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
           dispose();
    }//GEN-LAST:event_sairMouseClicked

    private void alterarEmail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarEmail1MouseClicked
        // TODO add your handling code here:alteraEmail
        cardLayout.show(priCards,"confirmaSenha2");
    }//GEN-LAST:event_alterarEmail1MouseClicked

    private void alterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarMousePressed
        // TODO add your handling code here:
        Usuario u1 = new Usuario();
        UsuarioDao dao = new UsuarioDao();
            
            u1.setSenha_usuario(senha.getText());
            u1.setNome_usuario(novoUsuario.getText());
            
            dao.updateUsuario(u1);
            
            senha.setText("");
            novoUsuario.setText("");
            cardLayout.show(priCards, "priCard4");
    }//GEN-LAST:event_alterarMousePressed

    private void confirmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmaMousePressed
        // TODO add your handling code here:
        UsuarioDao dao = new UsuarioDao();

        if(dao.checkSenha(senha.getText() )){
                cardLayout.show(priCards, "alteraNome");
        }else{
            JOptionPane.showMessageDialog(null, "!!Erro!!\nSenha errada, tente novamente !! ");
        }
    }//GEN-LAST:event_confirmaMousePressed

    private void voltar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar3MousePressed
        // TODO add your handling code here:
        cardLayout.show(priCards,"novoNome");
    }//GEN-LAST:event_voltar3MousePressed

    private void voltar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar2MousePressed
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard4");
    }//GEN-LAST:event_voltar2MousePressed

    private void voltar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar4MousePressed
        // TODO add your handling code here:
        cardLayout.show(priCards, "confirmaSenha2");
    }//GEN-LAST:event_voltar4MousePressed

    private void confirma2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirma2MousePressed
        // TODO add your handling code here:
        UsuarioDao dao = new UsuarioDao();

        if(dao.checkSenha(senha2.getText() )){
                cardLayout.show(priCards, "alteraEmail");
        }else{
            JOptionPane.showMessageDialog(null, "!!Erro!!\nSenha errada, tente novamente !! ");
        }
        
    }//GEN-LAST:event_confirma2MousePressed

    private void voltar5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar5MousePressed
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard4");
    }//GEN-LAST:event_voltar5MousePressed

    private void alterar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterar2MousePressed
        // TODO add your handling code here:
        Usuario u2 = new Usuario();
        UsuarioDao dao = new UsuarioDao();
            
            u2.setSenha_usuario(senha2.getText());
            u2.setEmail_usuario(novoEmail.getText());
            
            dao.updateEmail(u2);
            
            senha2.setText("");
            novoEmail.setText("");
            cardLayout.show(priCards, "priCard4");
    }//GEN-LAST:event_alterar2MousePressed

    private void salvar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvar2MouseClicked
        // TODO add your handling code here:        
        
//        nomeDeJogo.setText("");
//        idCategoria.setText("");
//        preco.setText("");
    }//GEN-LAST:event_salvar2MouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adicionarJogo;
    private javax.swing.JLabel alterar;
    private javax.swing.JLabel alterar2;
    private javax.swing.JLabel alterarEmail1;
    private javax.swing.JLabel alterarNameTag;
    private javax.swing.JLabel biblioteca;
    private javax.swing.JLabel compraJG10;
    private javax.swing.JLabel compraJG4;
    private javax.swing.JLabel compraJG5;
    private javax.swing.JLabel compraJG6;
    private javax.swing.JLabel compraJG7;
    private javax.swing.JLabel compraJG8;
    private javax.swing.JLabel compraJG9;
    private javax.swing.JLabel comprarJG1;
    private javax.swing.JLabel comprarJG2;
    private javax.swing.JLabel comprarJG3;
    private javax.swing.JLabel confirma;
    private javax.swing.JLabel confirma2;
    private javax.swing.JLabel conta;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField idCategoria;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagemJG1;
    private javax.swing.JLabel imagemJG10;
    private javax.swing.JLabel imagemJG2;
    private javax.swing.JLabel imagemJG3;
    private javax.swing.JLabel imagemJG4;
    private javax.swing.JLabel imagemJG5;
    private javax.swing.JLabel imagemJG6;
    private javax.swing.JLabel imagemJG7;
    private javax.swing.JLabel imagemJG8;
    private javax.swing.JLabel imagemJG9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jgImagem1;
    private javax.swing.JLabel jgImagem10;
    private javax.swing.JLabel jgImagem2;
    private javax.swing.JLabel jgImagem3;
    private javax.swing.JLabel jgImagem4;
    private javax.swing.JLabel jgImagem5;
    private javax.swing.JLabel jgImagem6;
    private javax.swing.JLabel jgImagem7;
    private javax.swing.JLabel jgImagem8;
    private javax.swing.JLabel jgImagem9;
    private javax.swing.JLabel loja;
    private javax.swing.JLabel maisVendidos;
    private javax.swing.JTextField mensagem;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeDeJogo;
    private javax.swing.JLabel nomeJG10;
    private javax.swing.JLabel nomeJG2;
    private javax.swing.JLabel nomeJG3;
    private javax.swing.JLabel nomeJG4;
    private javax.swing.JLabel nomeJG5;
    private javax.swing.JLabel nomeJG6;
    private javax.swing.JLabel nomeJG7;
    private javax.swing.JLabel nomeJG8;
    private javax.swing.JLabel nomeJG9;
    private javax.swing.JTextField novoEmail;
    private javax.swing.JTextField novoUsuario;
    private javax.swing.JLabel preco;
    private javax.swing.JTextField preco1;
    private javax.swing.JPanel priCard1;
    private javax.swing.JPanel priCard2;
    private javax.swing.JPanel priCard3;
    private javax.swing.JPanel priCard4;
    private javax.swing.JPanel priCard5;
    private javax.swing.JPanel priCard6;
    private javax.swing.JPanel priCards;
    private javax.swing.JLabel recomendados;
    private javax.swing.JLabel sair;
    private javax.swing.JLabel salvar1;
    private javax.swing.JLabel salvar2;
    private javax.swing.JPasswordField senha;
    private javax.swing.JPasswordField senha2;
    private javax.swing.JLabel sinopse;
    private javax.swing.JLabel telaInicial;
    private javax.swing.JLabel titulo11;
    private javax.swing.JTextField valor;
    private javax.swing.JLabel vendaJG1;
    private javax.swing.JLabel vendaJG10;
    private javax.swing.JLabel vendaJG2;
    private javax.swing.JLabel vendaJG3;
    private javax.swing.JLabel vendaJG4;
    private javax.swing.JLabel vendaJG5;
    private javax.swing.JLabel vendaJG6;
    private javax.swing.JLabel vendaJG7;
    private javax.swing.JLabel vendaJG8;
    private javax.swing.JLabel vendaJG9;
    private javax.swing.JLabel voltar;
    private javax.swing.JLabel voltar2;
    private javax.swing.JLabel voltar3;
    private javax.swing.JLabel voltar4;
    private javax.swing.JLabel voltar5;
    // End of variables declaration//GEN-END:variables

    private void print(String comprar_confirmadar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
