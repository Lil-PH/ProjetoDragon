
package view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Categoria;
import model.bean.Compra;
import model.bean.Jogo;
import model.bean.Pessoa;
import model.bean.Usuario;
import model.dao.CategoriaDao;
import model.dao.CompraDao;
import model.dao.JogosDao;
import model.dao.UsuarioDao;


public class TelaInicial extends javax.swing.JFrame {

  
    CardLayout cardLayout;
    public TelaInicial() {       
        initComponents();
        
        
        cardLayout =(CardLayout)(priCards.getLayout());
        DefaultTableModel md1 = (DefaultTableModel) jTCategorias1.getModel();
        jTCategorias1.setRowSorter(new TableRowSorter(md1));
        readJTable();
        
        
        DefaultTableModel md2 = (DefaultTableModel) jTCompraJ.getModel();
        jTCompraJ.setRowSorter(new TableRowSorter(md2));
        
        }   
  
public void readJTable(){
     DefaultTableModel md1 = (DefaultTableModel) jTCategorias1.getModel();
     md1.setNumRows(0);
     CategoriaDao cDao = new CategoriaDao();
        
        for(Categoria c: cDao.read()){
            
            md1.addRow(new Object[]{
                
                c.getId_categoria(),
                c.getNome_categoria()
                
            });
            
        }
     
    }

public void readJTableCompra(int id){
    
     DefaultTableModel md2 = (DefaultTableModel) jTCompraJ.getModel();
     md2.setNumRows(0);
     CompraDao cpDao = new CompraDao();
        
        for(Compra cp: cpDao.readCompra(id)){
            
            md2.addRow(new Object[]{
                
                cp.getJogo().getNome_jogo(),
                cp.getJogo().getPreco_jogo(),
                cp.getValor_compra()
                
            });
            
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        salvar = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel34 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        titulo11 = new javax.swing.JLabel();
        telaInicial = new javax.swing.JLabel();
        biblioteca2 = new javax.swing.JLabel();
        loja1 = new javax.swing.JLabel();
        conta1 = new javax.swing.JLabel();
        priCards = new javax.swing.JPanel();
        loja = new javax.swing.JPanel();
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
        compra = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        idJogo = new javax.swing.JTextField();
        idUsuario = new javax.swing.JTextField();
        biblioteca = new javax.swing.JPanel();
        biblioteca1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTCompraJ = new javax.swing.JTable();
        lastId = new javax.swing.JTextField();
        ver = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        conta = new javax.swing.JPanel();
        adicionarJogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        alterarNameTag = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        alterarEmail1 = new javax.swing.JLabel();
        alterarSenha = new javax.swing.JLabel();
        addJogo = new javax.swing.JPanel();
        voltar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeDeJogo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        preco1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idCategoria = new javax.swing.JTextField();
        salvar2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCategorias1 = new javax.swing.JTable();
        altNameTag = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        confirma = new javax.swing.JLabel();
        voltar2 = new javax.swing.JLabel();
        altNameTag2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        novoUsuario = new javax.swing.JTextField();
        alterar = new javax.swing.JLabel();
        voltar3 = new javax.swing.JLabel();
        altEmail = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        senha2 = new javax.swing.JPasswordField();
        confirma2 = new javax.swing.JLabel();
        voltar5 = new javax.swing.JLabel();
        altEmail2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        novoEmail = new javax.swing.JTextField();
        voltar4 = new javax.swing.JLabel();
        alterar2 = new javax.swing.JLabel();
        altSenha = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        confirma3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        voltar6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        nameTag = new javax.swing.JTextField();
        altSenha2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        novaSenha = new javax.swing.JPasswordField();
        alterar3 = new javax.swing.JLabel();
        voltar7 = new javax.swing.JLabel();

        salvar.setBackground(new java.awt.Color(127, 0, 255));
        salvar.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        salvar.setForeground(new java.awt.Color(254, 254, 254));
        salvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salvar.setText("Salvar");
        salvar.setOpaque(true);
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salvarMousePressed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("BIBLIOTECA");
        jLabel34.setToolTipText("");

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
        telaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shoppingCart.png"))); // NOI18N
        telaInicial.setText("LOJA");
        telaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaInicialMouseClicked(evt);
            }
        });

        biblioteca2.setBackground(new java.awt.Color(0, 0, 0));
        biblioteca2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        biblioteca2.setForeground(new java.awt.Color(255, 255, 255));
        biblioteca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list1.png"))); // NOI18N
        biblioteca2.setText("BIBLIOTECA");
        biblioteca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                biblioteca2MouseClicked(evt);
            }
        });

        loja1.setBackground(new java.awt.Color(0, 0, 0));
        loja1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loja1.setForeground(new java.awt.Color(255, 255, 255));
        loja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        loja1.setText("COMPRA");
        loja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loja1MouseClicked(evt);
            }
        });

        conta1.setBackground(new java.awt.Color(0, 0, 0));
        conta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        conta1.setForeground(new java.awt.Color(255, 255, 255));
        conta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        conta1.setText("CONTA");
        conta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conta1MouseClicked(evt);
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
                        .addComponent(conta1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(loja1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(biblioteca2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(55, 55, 55)
                .addComponent(loja1)
                .addGap(55, 55, 55)
                .addComponent(biblioteca2)
                .addGap(55, 55, 55)
                .addComponent(conta1)
                .addContainerGap(505, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        priCards.setBackground(new java.awt.Color(0, 0, 0));
        priCards.setLayout(new java.awt.CardLayout());

        loja.setBackground(new java.awt.Color(0, 0, 0));
        loja.setToolTipText("");

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
        vendaJG5.setText("PRÉ-VENDA R$ 250,00");

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
        compraJG6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraJG6MouseClicked(evt);
            }
        });

        vendaJG9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG9.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG9.setText("PRÉ-VENDA R$ 190,00");

        imagemJG7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Untitled-2.png"))); // NOI18N

        compraJG9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        compraJG9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraJG9MouseClicked(evt);
            }
        });

        nomeJG7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG7.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG7.setText("The King of Fighters ");

        imagemJG10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/War Thuder.png"))); // NOI18N

        vendaJG7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG7.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG7.setText("PRÉ-VENDA R$ 50,00");

        nomeJG10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG10.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG10.setText("War Thunder ");

        compraJG7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        compraJG7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraJG7MouseClicked(evt);
            }
        });

        vendaJG10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG10.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG10.setText("PRÉ-VENDA R$ 70,00");

        imagemJG8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Gran Turismo7.png"))); // NOI18N

        compraJG10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        compraJG10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraJG10MouseClicked(evt);
            }
        });

        nomeJG8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG8.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG8.setText("Gran Turismo 7");

        vendaJG8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG8.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG8.setText("PRÉ-VENDA R$ 150,00");

        imagemJG6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Flight Simulador.png"))); // NOI18N

        compraJG8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping.png"))); // NOI18N
        compraJG8.setText("jLabel1");
        compraJG8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraJG8MouseClicked(evt);
            }
        });

        nomeJG6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG6.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG6.setText("Flight Simulator");

        imagemJG9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Ghost of Tsushima.png"))); // NOI18N

        vendaJG6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendaJG6.setForeground(new java.awt.Color(255, 255, 255));
        vendaJG6.setText("PRÉ-VENDA R$ 70,00");

        nomeJG9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeJG9.setForeground(new java.awt.Color(255, 255, 255));
        nomeJG9.setText("Ghost of Tsushima");

        javax.swing.GroupLayout lojaLayout = new javax.swing.GroupLayout(loja);
        loja.setLayout(lojaLayout);
        lojaLayout.setHorizontalGroup(
            lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lojaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lojaLayout.createSequentialGroup()
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addComponent(imagemJG1)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG2))
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vendaJG1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprarJG1)
                                .addGap(18, 18, 18)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG2)
                                    .addComponent(vendaJG2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprarJG2)))
                        .addGap(18, 18, 18)
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG3)
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG3)
                                    .addComponent(nomeJG3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprarJG3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG4)
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG4)
                                    .addComponent(nomeJG4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG5)
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG5)
                                    .addGroup(lojaLayout.createSequentialGroup()
                                        .addComponent(vendaJG5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compraJG5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(maisVendidos)
                    .addComponent(recomendados)
                    .addGroup(lojaLayout.createSequentialGroup()
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addComponent(imagemJG6)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG7)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG8))
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG6)
                                    .addComponent(nomeJG6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG6)
                                .addGap(46, 46, 46)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG7)
                                    .addComponent(nomeJG7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG7)
                                .addGap(44, 44, 44)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lojaLayout.createSequentialGroup()
                                        .addComponent(vendaJG8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compraJG8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nomeJG8))))
                        .addGap(18, 18, 18)
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addComponent(imagemJG9)
                                .addGap(18, 18, 18)
                                .addComponent(imagemJG10))
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG9)
                                    .addComponent(vendaJG9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG9)
                                .addGap(48, 48, 48)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendaJG10)
                                    .addComponent(nomeJG10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compraJG10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lojaLayout.setVerticalGroup(
            lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lojaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(maisVendidos)
                .addGap(18, 18, 18)
                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lojaLayout.createSequentialGroup()
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG3)
                            .addComponent(imagemJG4)
                            .addComponent(imagemJG5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(lojaLayout.createSequentialGroup()
                                    .addComponent(nomeJG3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG3))
                                .addComponent(comprarJG3))
                            .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(compraJG4)
                                .addGroup(lojaLayout.createSequentialGroup()
                                    .addComponent(nomeJG4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lojaLayout.createSequentialGroup()
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(compraJG5)
                                    .addGroup(lojaLayout.createSequentialGroup()
                                        .addComponent(nomeJG5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vendaJG5)))
                                .addGap(11, 11, 11))))
                    .addGroup(lojaLayout.createSequentialGroup()
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemJG2)
                            .addComponent(imagemJG1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(lojaLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lojaLayout.createSequentialGroup()
                                    .addComponent(nomeJG2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vendaJG2)))
                            .addComponent(comprarJG2)
                            .addComponent(comprarJG1))))
                .addGap(25, 25, 25)
                .addComponent(recomendados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemJG6)
                    .addComponent(imagemJG7)
                    .addComponent(imagemJG8)
                    .addComponent(imagemJG9)
                    .addComponent(imagemJG10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lojaLayout.createSequentialGroup()
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeJG6)
                                    .addComponent(nomeJG7)
                                    .addComponent(nomeJG8)
                                    .addComponent(nomeJG9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vendaJG6)
                                        .addComponent(vendaJG7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(vendaJG8, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(lojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(compraJG8)
                                .addComponent(vendaJG9))
                            .addComponent(compraJG7)
                            .addComponent(compraJG6)
                            .addComponent(compraJG9))
                        .addGroup(lojaLayout.createSequentialGroup()
                            .addComponent(nomeJG10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vendaJG10)))
                    .addComponent(compraJG10))
                .addContainerGap())
        );

        priCards.add(loja, "priCard1");
        loja.getAccessibleContext().setAccessibleName("");

        compra.setBackground(new java.awt.Color(51, 51, 51));

        nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome:");

        mensagem.setEditable(false);
        mensagem.setBackground(new java.awt.Color(51, 51, 51));
        mensagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mensagem.setForeground(new java.awt.Color(255, 255, 255));

        sinopse.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sinopse.setForeground(new java.awt.Color(255, 255, 255));
        sinopse.setText("Sinopse:");

        descricao.setEditable(false);
        descricao.setBackground(new java.awt.Color(51, 51, 51));
        descricao.setColumns(20);
        descricao.setForeground(new java.awt.Color(255, 255, 255));
        descricao.setRows(5);
        descricao.setBorder(null);
        jScrollPane1.setViewportView(descricao);

        preco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        preco.setForeground(new java.awt.Color(255, 255, 255));
        preco.setText("Preço:");

        valor.setEditable(false);
        valor.setBackground(new java.awt.Color(51, 51, 51));
        valor.setForeground(new java.awt.Color(255, 255, 255));
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão Débito", "Cartão Crédito", "Boleto", "Pix" }));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dragon Games Serviços de Games do Brasil Ltda. | CNPJ 99.400.300/0001-70");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Formas de pagamento aceitas: cartões de crédito (Visa, MasterCard e Elo), cartões de débito (Visa e Elo), Boleto e Pix. ");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Informe seu ID:");

        idJogo.setBackground(new java.awt.Color(51, 51, 51));
        idJogo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout compraLayout = new javax.swing.GroupLayout(compra);
        compra.setLayout(compraLayout);
        compraLayout.setHorizontalGroup(
            compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compraLayout.createSequentialGroup()
                        .addComponent(preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(compraLayout.createSequentialGroup()
                        .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(compraLayout.createSequentialGroup()
                                .addComponent(nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(compraLayout.createSequentialGroup()
                                .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(compraLayout.createSequentialGroup()
                                        .addComponent(sinopse)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(compraLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(idJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67)
                                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(compraLayout.createSequentialGroup()
                .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compraLayout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jLabel2))
                    .addGroup(compraLayout.createSequentialGroup()
                        .addGap(752, 752, 752)
                        .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(compraLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(compraLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(191, 191, 191))
        );
        compraLayout.setVerticalGroup(
            compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compraLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compraLayout.createSequentialGroup()
                        .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome)
                            .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(idJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sinopse)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(compraLayout.createSequentialGroup()
                        .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(salvar1))
                    .addComponent(imagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293)
                .addGroup(compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(24, 24, 24))
        );

        priCards.add(compra, "priCard3");

        biblioteca.setBackground(new java.awt.Color(255, 204, 0));

        biblioteca1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("BIBLIOTECA");
        jLabel31.setToolTipText("");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("- Meus Jogos");

        jTCompraJ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Jogo", "Preço do Jogo", "Valor da Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCompraJ.setToolTipText("");
        jTCompraJ.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTCompraJ);

        ver.setBackground(new java.awt.Color(127, 0, 255));
        ver.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        ver.setForeground(new java.awt.Color(254, 254, 254));
        ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver.setText("VER");
        ver.setOpaque(true);
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verMousePressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Informe seu ID abaixo e aperte no botão para mostrar seus jogos adquiridos");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Informe seu ID:");

        javax.swing.GroupLayout biblioteca1Layout = new javax.swing.GroupLayout(biblioteca1);
        biblioteca1.setLayout(biblioteca1Layout);
        biblioteca1Layout.setHorizontalGroup(
            biblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biblioteca1Layout.createSequentialGroup()
                .addGroup(biblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(biblioteca1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(biblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(biblioteca1Layout.createSequentialGroup()
                                .addGap(439, 439, 439)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31)))
                    .addGroup(biblioteca1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(biblioteca1Layout.createSequentialGroup()
                        .addGap(515, 515, 515)
                        .addComponent(jLabel32))
                    .addGroup(biblioteca1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel35))
                    .addGroup(biblioteca1Layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        biblioteca1Layout.setVerticalGroup(
            biblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biblioteca1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(37, 37, 37)
                .addComponent(jLabel35)
                .addGap(60, 60, 60)
                .addGroup(biblioteca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(ver)
                .addGap(272, 272, 272))
        );

        javax.swing.GroupLayout bibliotecaLayout = new javax.swing.GroupLayout(biblioteca);
        biblioteca.setLayout(bibliotecaLayout);
        bibliotecaLayout.setHorizontalGroup(
            bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(biblioteca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bibliotecaLayout.setVerticalGroup(
            bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(biblioteca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        priCards.add(biblioteca, "priCard2");

        conta.setBackground(new java.awt.Color(51, 51, 51));

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

        alterarSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        alterarSenha.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-password-24.png"))); // NOI18N
        alterarSenha.setText("Alterar Senha");
        alterarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contaLayout = new javax.swing.GroupLayout(conta);
        conta.setLayout(contaLayout);
        contaLayout.setHorizontalGroup(
            contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaLayout.createSequentialGroup()
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contaLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel10))
                    .addGroup(contaLayout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarJogo)
                            .addComponent(alterarNameTag)
                            .addComponent(alterarEmail1)
                            .addComponent(sair)
                            .addComponent(alterarSenha))))
                .addContainerGap(549, Short.MAX_VALUE))
        );
        contaLayout.setVerticalGroup(
            contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel10)
                .addGap(87, 87, 87)
                .addComponent(adicionarJogo)
                .addGap(62, 62, 62)
                .addComponent(alterarNameTag)
                .addGap(71, 71, 71)
                .addComponent(alterarEmail1)
                .addGap(75, 75, 75)
                .addComponent(alterarSenha)
                .addGap(74, 74, 74)
                .addComponent(sair)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        alterarNameTag.getAccessibleContext().setAccessibleName("Alterar Nome");
        alterarNameTag.getAccessibleContext().setAccessibleParent(priCards);

        priCards.add(conta, "priCard4");
        conta.getAccessibleContext().setAccessibleName("");

        addJogo.setBackground(new java.awt.Color(51, 51, 51));
        addJogo.setPreferredSize(new java.awt.Dimension(400, 300));

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

        idCategoria.setEditable(false);

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

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Categoria");

        categoria.setEditable(false);

        jTCategorias1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_categorias", "nome_categorias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCategorias1.setToolTipText("");
        jTCategorias1.getTableHeader().setReorderingAllowed(false);
        jTCategorias1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCategorias1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTCategorias1);

        javax.swing.GroupLayout addJogoLayout = new javax.swing.GroupLayout(addJogo);
        addJogo.setLayout(addJogoLayout);
        addJogoLayout.setHorizontalGroup(
            addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJogoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(voltar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(addJogoLayout.createSequentialGroup()
                .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addJogoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(addJogoLayout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoria)
                            .addComponent(nomeDeJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addJogoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addJogoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addJogoLayout.createSequentialGroup()
                        .addComponent(salvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))))
        );
        addJogoLayout.setVerticalGroup(
            addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJogoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(95, 95, 95)
                .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomeDeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(preco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(addJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel33)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(salvar2)
                .addGap(121, 121, 121)
                .addComponent(voltar)
                .addGap(25, 25, 25))
        );

        priCards.add(addJogo, "add");

        altNameTag.setBackground(new java.awt.Color(51, 51, 51));

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
        confirma.setText("Confirmar");
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

        javax.swing.GroupLayout altNameTagLayout = new javax.swing.GroupLayout(altNameTag);
        altNameTag.setLayout(altNameTagLayout);
        altNameTagLayout.setHorizontalGroup(
            altNameTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altNameTagLayout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addGroup(altNameTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altNameTagLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(348, 348, 348))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altNameTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(altNameTagLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altNameTagLayout.createSequentialGroup()
                            .addGroup(altNameTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addGroup(altNameTagLayout.createSequentialGroup()
                                    .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)))
                            .addGap(396, 396, 396)))))
            .addGroup(altNameTagLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(voltar2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        altNameTagLayout.setVerticalGroup(
            altNameTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altNameTagLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel14)
                .addGap(129, 129, 129)
                .addComponent(jLabel15)
                .addGap(128, 128, 128)
                .addGroup(altNameTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addComponent(confirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(voltar2)
                .addGap(22, 22, 22))
        );

        priCards.add(altNameTag, "novoNome");

        altNameTag2.setBackground(new java.awt.Color(51, 51, 51));

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

        javax.swing.GroupLayout altNameTag2Layout = new javax.swing.GroupLayout(altNameTag2);
        altNameTag2.setLayout(altNameTag2Layout);
        altNameTag2Layout.setHorizontalGroup(
            altNameTag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altNameTag2Layout.createSequentialGroup()
                .addContainerGap(564, Short.MAX_VALUE)
                .addGroup(altNameTag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altNameTag2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altNameTag2Layout.createSequentialGroup()
                        .addGroup(altNameTag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(altNameTag2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(novoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altNameTag2Layout.createSequentialGroup()
                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408))))
            .addGroup(altNameTag2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(voltar3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        altNameTag2Layout.setVerticalGroup(
            altNameTag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altNameTag2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel11)
                .addGap(108, 108, 108)
                .addComponent(jLabel12)
                .addGap(121, 121, 121)
                .addGroup(altNameTag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(novoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(voltar3)
                .addGap(21, 21, 21))
        );

        priCards.add(altNameTag2, "alteraNome");
        altNameTag2.getAccessibleContext().setAccessibleName("jPanel2");

        altEmail.setBackground(new java.awt.Color(51, 51, 51));

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
        confirma2.setText("Confirmar");
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

        javax.swing.GroupLayout altEmailLayout = new javax.swing.GroupLayout(altEmail);
        altEmail.setLayout(altEmailLayout);
        altEmailLayout.setHorizontalGroup(
            altEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altEmailLayout.createSequentialGroup()
                .addContainerGap(586, Short.MAX_VALUE)
                .addGroup(altEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altEmailLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altEmailLayout.createSequentialGroup()
                        .addGroup(altEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(altEmailLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altEmailLayout.createSequentialGroup()
                                .addComponent(confirma2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(394, 394, 394))))
            .addGroup(altEmailLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(voltar5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        altEmailLayout.setVerticalGroup(
            altEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altEmailLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel20)
                .addGap(124, 124, 124)
                .addComponent(jLabel21)
                .addGap(90, 90, 90)
                .addGroup(altEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(confirma2)
                .addGap(91, 91, 91)
                .addComponent(voltar5)
                .addGap(20, 20, 20))
        );

        priCards.add(altEmail, "confirmaSenha2");

        altEmail2.setBackground(new java.awt.Color(51, 51, 51));

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

        javax.swing.GroupLayout altEmail2Layout = new javax.swing.GroupLayout(altEmail2);
        altEmail2.setLayout(altEmail2Layout);
        altEmail2Layout.setHorizontalGroup(
            altEmail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altEmail2Layout.createSequentialGroup()
                .addContainerGap(598, Short.MAX_VALUE)
                .addGroup(altEmail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altEmail2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(415, 415, 415))
                    .addGroup(altEmail2Layout.createSequentialGroup()
                        .addGroup(altEmail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(altEmail2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(altEmail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alterar2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(altEmail2Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(novoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(365, 365, 365))))
            .addGroup(altEmail2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(voltar4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        altEmail2Layout.setVerticalGroup(
            altEmail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altEmail2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel17)
                .addGap(117, 117, 117)
                .addComponent(jLabel18)
                .addGap(127, 127, 127)
                .addGroup(altEmail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(novoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(alterar2)
                .addGap(92, 92, 92)
                .addComponent(voltar4)
                .addGap(24, 24, 24))
        );

        priCards.add(altEmail2, "alteraEmail");

        altSenha.setBackground(new java.awt.Color(51, 51, 51));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Alteração de Senha");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Para confirmar, digite seu e-mail e nametag abaixo");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("NameTag:");

        confirma3.setBackground(new java.awt.Color(127, 0, 255));
        confirma3.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        confirma3.setForeground(new java.awt.Color(254, 254, 254));
        confirma3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirma3.setText("Confirmar");
        confirma3.setOpaque(true);
        confirma3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirma3MousePressed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("E-mail:");

        voltar6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar6.setForeground(new java.awt.Color(51, 102, 255));
        voltar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar6.setText("Voltar");
        voltar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltar6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout altSenhaLayout = new javax.swing.GroupLayout(altSenha);
        altSenha.setLayout(altSenhaLayout);
        altSenhaLayout.setHorizontalGroup(
            altSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altSenhaLayout.createSequentialGroup()
                .addContainerGap(549, Short.MAX_VALUE)
                .addGroup(altSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altSenhaLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(392, 392, 392))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altSenhaLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(372, 372, 372))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altSenhaLayout.createSequentialGroup()
                        .addGroup(altSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirma3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(altSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(altSenhaLayout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameTag, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(altSenhaLayout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(439, 439, 439))))
            .addGroup(altSenhaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(voltar6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        altSenhaLayout.setVerticalGroup(
            altSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altSenhaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel23)
                .addGap(160, 160, 160)
                .addComponent(jLabel24)
                .addGap(95, 95, 95)
                .addGroup(altSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(altSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(nameTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(confirma3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(voltar6)
                .addGap(25, 25, 25))
        );

        priCards.add(altSenha, "entrarEmail");
        altSenha.getAccessibleContext().setAccessibleName("entrarEmail");

        altSenha2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Alteração de Senha");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Digite sua nova senha abaixo");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Nova Senha:");

        alterar3.setBackground(new java.awt.Color(127, 0, 255));
        alterar3.setFont(new java.awt.Font("Simplifica", 0, 24)); // NOI18N
        alterar3.setForeground(new java.awt.Color(254, 254, 254));
        alterar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alterar3.setText("Alterar");
        alterar3.setOpaque(true);
        alterar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                alterar3MousePressed(evt);
            }
        });

        voltar7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar7.setForeground(new java.awt.Color(51, 102, 255));
        voltar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        voltar7.setText("Voltar");
        voltar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltar7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout altSenha2Layout = new javax.swing.GroupLayout(altSenha2);
        altSenha2.setLayout(altSenha2Layout);
        altSenha2Layout.setHorizontalGroup(
            altSenha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altSenha2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(voltar7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altSenha2Layout.createSequentialGroup()
                .addContainerGap(583, Short.MAX_VALUE)
                .addGroup(altSenha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altSenha2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altSenha2Layout.createSequentialGroup()
                        .addGroup(altSenha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(altSenha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(altSenha2Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altSenha2Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(22, 22, 22)))
                            .addComponent(alterar3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(406, 406, 406))))
        );
        altSenha2Layout.setVerticalGroup(
            altSenha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altSenha2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel27)
                .addGap(136, 136, 136)
                .addComponent(jLabel28)
                .addGap(104, 104, 104)
                .addGroup(altSenha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(alterar3)
                .addGap(120, 120, 120)
                .addComponent(voltar7)
                .addGap(24, 24, 24))
        );

        priCards.add(altSenha2, "novaSenha");

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

    private void biblioteca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biblioteca2MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard2");
    }//GEN-LAST:event_biblioteca2MouseClicked

    private void loja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loja1MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
    }//GEN-LAST:event_loja1MouseClicked

    private void conta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conta1MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard4");
    }//GEN-LAST:event_conta1MouseClicked

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void salvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMousePressed
        // Evento ao click no botão - Criar Conta

        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_salvarMousePressed

    private void salvar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvar1MousePressed
        // Evento ao click no botão - Criar Conta

        Compra cp = new Compra();
        CompraDao dao = new CompraDao();
        
        cp.setFk_id_usuario(Integer.parseInt(idUsuario.getText()));
        cp.setFk_id_jogo(Integer.parseInt(idJogo.getText()));
        cp.setValor_compra(Double.parseDouble(valor.getText()));
        dao.create(cp);
        
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
        categoria.setText("");

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

    private void alterarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarSenhaMouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards,"entrarEmail");
    }//GEN-LAST:event_alterarSenhaMouseClicked

    private void confirma3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirma3MousePressed
        // TODO add your handling code here:
        UsuarioDao dao = new UsuarioDao();

        if(dao.checkInfor(email.getText(), nameTag.getText() )){
                cardLayout.show(priCards, "novaSenha");
        }else{
            JOptionPane.showMessageDialog(null, "!!Erro!!\nE-mail ou Name Tag invalidos !! ");
        }
    }//GEN-LAST:event_confirma3MousePressed

    private void voltar6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar6MousePressed
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard4");
    }//GEN-LAST:event_voltar6MousePressed

    private void alterar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterar3MousePressed
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
            
            cardLayout.show(priCards, "priCard4");

    }//GEN-LAST:event_alterar3MousePressed

    private void voltar7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar7MousePressed
        // TODO add your handling code here:
        cardLayout.show(priCards, "entrarEmail");
    }//GEN-LAST:event_voltar7MousePressed

    private void jTCategorias1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCategorias1MouseClicked

        if(jTCategorias1.getSelectedRow()!= -1){

            idCategoria.setText(jTCategorias1.getValueAt(jTCategorias1.getSelectedRow(), 0).toString());
            categoria.setText(jTCategorias1.getValueAt(jTCategorias1.getSelectedRow(), 1).toString());

        }
    }//GEN-LAST:event_jTCategorias1MouseClicked

    private void compraJG8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG8MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("Gran Turismo 7");
        descricao.setText("Gran Turismo 7 reúne os melhores recursos do simulador de corridas online. "
            + "\nSeja você um piloto competitivo ou casual, colecionador, tuner, designer de visuais ou fotógrafo, "
            + "\nencontre seu caminho com um número impressionante de modos de jogo, incluindo favoritos dos fãs "
            + "\ncomo Campanha GT, Arcade e Escola de Pilotagem");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Gran Turismo7.png")));
        idJogo.setText("8");
        idJogo.setVisible(false);
        valor.setText("150.00");
    }//GEN-LAST:event_compraJG8MouseClicked

    private void compraJG10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG10MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("War Thunder");
        descricao.setText("É um simulador de batalhas aéreas e terrestres, "
            + "\nambientado na segunda guerra mundial, incrivelmente realista e super detalhado. "
            + "\nCom o tempo fui aprendendo as táticas guerra, principalmente as aéreas, "
            + "\ne isso faz uma grande diferença para conquistar vitórias nas batalhas.");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/War Thuder.png")));
        idJogo.setText("10");
        idJogo.setVisible(false);
        valor.setText("70.00");
    }//GEN-LAST:event_compraJG10MouseClicked

    private void compraJG7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG7MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("The King of Fighters");
        descricao.setText("Equipes de lutadores de todo o mundo se reuniram "
            + "\npara responder a uma pergunta ardente: quem é o guerreiro mais forte vivo?");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Untitled-2.png")));
        idJogo.setText("7");
        valor.setText("50.00");
    }//GEN-LAST:event_compraJG7MouseClicked

    private void compraJG9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG9MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("Ghost of Tsushima");
        descricao.setText("A história acompanha Jin Sakai, um samurai que precisa proteger a Ilha de Tsushima "
            + "\ndurante a primeira invasão mongol do Japão. Ele se vê dividido entre escolher seguir o código do guerreiro "
            + "\npara lutar honradamente ou usar métodos práticos e desonrosos para subjugar os mongóis.");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Ghost of Tsushima.png")));
        idJogo.setText("9");
        valor.setText("190.00");
    }//GEN-LAST:event_compraJG9MouseClicked

    private void compraJG6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG6MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("Flight Simulator");
        descricao.setText("Microsoft Flight Simulator X é um jogo que comemora os 25 anos "
            + "\nda série mundialmente famosa, onde o jogador pode voar pelo mundo inteiro "
            + "\ncom uma grande variedade de aviões e pousar nos aeroportos mais conhecidos, "
            + "\ntudo isso com muito realismo - chegando a ser tão grande que os comandos "
            + "\ne os aviões são muito próximos das aeronaves de verdade");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Flight Simulador.png")));
        idJogo.setText("6");
        idJogo.setVisible(false);
        valor.setText("70.00");
    }//GEN-LAST:event_compraJG6MouseClicked

    private void compraJG5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG5MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("Horizon Forbidden");
        descricao.setText("Junte-se à Aloy para desbravar o Oeste Proibido, uma área majestosa "
            + "\ne perigosa que esconde novas ameaças misteriosas. Explore terras distantes, "
            + "\nenfrente máquinas maiores e mais imponentes, e encontre novas tribos incríveis "
            + "\nao retornar o futuro distante e pós-apocalíptico de Horizon.");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Horizon.png")));
        idJogo.setText("5");
        idJogo.setVisible(false);
        valor.setText("250.00");
    }//GEN-LAST:event_compraJG5MouseClicked

    private void compraJG4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraJG4MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("Spider-Man");
        descricao.setText("O Homem-Aranha precisa proteger a cidade assim que o Senhor Negativo "
            + "\nameaça lançar um vírus mortal por toda a área, ao mesmo tempo que é forçado "
            + "\na lidar com seus problemas pessoais como Peter Parker.");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Spider-Man.png")));
        idJogo.setText("4");
        idJogo.setVisible(false);
        valor.setText("190.00");
    }//GEN-LAST:event_compraJG4MouseClicked

    private void comprarJG3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarJG3MouseClicked
        // TODO add your handling code here:
        cardLayout.show(priCards, "priCard3");
        mensagem.setText("MultiVersus");
        descricao.setText("MultiVersus é um jogo eletrônico de luta crossover desenvolvido "
            + "\npela Player First Games e publicado pela Warner Bros. Interactive Entertainment. "
            + "\nO jogo é gratuito para jogar e apresenta vários personagens dentro do catálogo da Warner Bros. "
            + "\nDiscovery.");
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/MultiVersus.png")));
        idJogo.setText("3");
        idJogo.setVisible(false);
        valor.setText("200.00");
    }//GEN-LAST:event_comprarJG3MouseClicked

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
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/Gotham knights.png")));
        idJogo.setText("2");
        idJogo.setVisible(false);
        valor.setText("180.00");
    }//GEN-LAST:event_comprarJG2MouseClicked

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
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgJogos/images.jpg")));
        idJogo.setText("1");
        idJogo.setVisible(false);
        valor.setText("210.00");

    }//GEN-LAST:event_comprarJG1MouseClicked

    private void verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMousePressed
        // TODO add your handling code here:
        readJTableCompra(Integer.parseInt(lastId.getText()));
    }//GEN-LAST:event_verMousePressed

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
    private javax.swing.JPanel addJogo;
    private javax.swing.JLabel adicionarJogo;
    private javax.swing.JPanel altEmail;
    private javax.swing.JPanel altEmail2;
    private javax.swing.JPanel altNameTag;
    private javax.swing.JPanel altNameTag2;
    private javax.swing.JPanel altSenha;
    private javax.swing.JPanel altSenha2;
    private javax.swing.JLabel alterar;
    private javax.swing.JLabel alterar2;
    private javax.swing.JLabel alterar3;
    private javax.swing.JLabel alterarEmail1;
    private javax.swing.JLabel alterarNameTag;
    private javax.swing.JLabel alterarSenha;
    private javax.swing.JPanel biblioteca;
    private javax.swing.JPanel biblioteca1;
    private javax.swing.JLabel biblioteca2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField categoria;
    private javax.swing.JPanel compra;
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
    private javax.swing.JLabel confirma3;
    private javax.swing.JPanel conta;
    private javax.swing.JLabel conta1;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idCategoria;
    private javax.swing.JTextField idJogo;
    private javax.swing.JTextField idUsuario;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTCategorias1;
    private javax.swing.JTable jTCompraJ;
    private javax.swing.JTextField lastId;
    private javax.swing.JPanel loja;
    private javax.swing.JLabel loja1;
    private javax.swing.JLabel maisVendidos;
    private javax.swing.JTextField mensagem;
    private javax.swing.JTextField nameTag;
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
    private javax.swing.JPasswordField novaSenha;
    private javax.swing.JTextField novoEmail;
    private javax.swing.JTextField novoUsuario;
    private javax.swing.JLabel preco;
    private javax.swing.JTextField preco1;
    private javax.swing.JPanel priCards;
    private javax.swing.JLabel recomendados;
    private javax.swing.JLabel sair;
    private javax.swing.JLabel salvar;
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
    private javax.swing.JLabel ver;
    private javax.swing.JLabel voltar;
    private javax.swing.JLabel voltar2;
    private javax.swing.JLabel voltar3;
    private javax.swing.JLabel voltar4;
    private javax.swing.JLabel voltar5;
    private javax.swing.JLabel voltar6;
    private javax.swing.JLabel voltar7;
    // End of variables declaration//GEN-END:variables

    private void print(String comprar_confirmadar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
