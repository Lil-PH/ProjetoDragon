package model.bean;

//Usuario extende Pessoa, usuário contém id da conta

import javax.swing.JOptionPane;

public class Usuario extends Pessoa {
    
    private int id_usuario;

    public Usuario() {
    }

    public Usuario(String nome_usuario, String email_usuario, String senha_usuario, int id_usuario){
        
        super(nome_usuario, email_usuario, senha_usuario);
        this.id_usuario = id_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    //Polimorfismo(sobrescrita) do método mensagem, utilizada na tela de Login em caso de erro ao realizar a autenticação do login
    @Override
    public void mensagem(){
        JOptionPane.showMessageDialog(null, "Seu nome de usuário ou senha estão errados.");
    }

}
