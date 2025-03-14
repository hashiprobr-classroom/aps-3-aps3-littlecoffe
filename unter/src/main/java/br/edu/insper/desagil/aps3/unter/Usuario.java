package br.edu.insper.desagil.aps3.unter;

public abstract class Usuario {
    private final String cpf;
    private String nome;

    public Usuario(String cpf, String nome){
        this.cpf = cpf;
        this.nome= nome;

    }

    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public abstract void avalia(Corrida corrida, int nota);
}
