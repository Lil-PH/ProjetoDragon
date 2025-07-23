package model.bean;

public class Compra {

    private int id_compra;
    private Usuario usuario;
    private double valor_compra;
    private Jogo jogo;
    //private double data_compra;
    
    public Compra() {
    }
    
    public Compra(int id_compra, Usuario usuario, double valor_compra, Jogo jogo){
        
        this.id_compra = id_compra;
        this.usuario = usuario;
        this.valor_compra = valor_compra;
        this.jogo = jogo;
        //this.data_compra = data_compra;       
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
