package model.bean;
import javax.swing.JOptionPane; 

public class Pessoa {
    
    private String nome_usuario;
    private String email_usuario;
    private String senha_usuario;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome_usuario, String email_usuario, String senha_usuario){
        
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.senha_usuario = senha_usuario;
        
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

  
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

  
    public String getEmail_usuario() {
        return email_usuario;
    }


    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }


    public String getSenha_usuario() {
        return senha_usuario;
    }


    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    
    public void mensagem(){
        JOptionPane.showMessageDialog(null, "Seu cadastro foi efetuado.");
    }
    
}


