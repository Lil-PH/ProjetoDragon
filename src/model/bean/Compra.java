package model.bean;

public class Compra {

    private int id_compra;
    private Usuario usuario;
    private double valor_compra;
    private Jogo jogo;
    private int fk_id_usuario;
    private int fk_id_jogo;
    

    
    public Compra() {
    }

    public Compra(int id_compra, Usuario usuario, double valor_compra, Jogo jogo, int fk_id_usuario, int fk_id_jogo){
        
        this.id_compra = id_compra;
        this.usuario = usuario;
        this.valor_compra = valor_compra;
        this.jogo = jogo;
        this.fk_id_usuario = fk_id_usuario;
        this.fk_id_jogo = fk_id_jogo; 
               
    }
        
    
        
        
    public int getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(int fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }

    public int getFk_id_jogo() {
        return fk_id_jogo;
    }

    public void setFk_id_jogo(int fk_id_jogo) {
        this.fk_id_jogo = fk_id_jogo;
    }
        
    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
}
