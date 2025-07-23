package model.bean;

public class Jogo {
    
    private int id_jogo;
    private String nome_jogo;
    private Categoria categoria;
    private double preco_jogo;

    public Jogo() {
    }

    public Jogo( String nome_jogo, Categoria categoria, double preco_jogo){
        
        this.nome_jogo = nome_jogo;
        this.categoria = categoria;
        this.preco_jogo = preco_jogo;
        
    }
    
    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public String getNome_jogo() {
        return nome_jogo;
    }

    public void setNome_jogo(String nome_jogo) {
        this.nome_jogo = nome_jogo;
    }

    public double getPreco_jogo() {
        return preco_jogo;
    }
    
    public void setPreco_jogo(double preco_jogo) {
        this.preco_jogo = preco_jogo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}

 
