package com.algaworks.di.modelo;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private  boolean ativo = false;

    public Cliente(String nome_,  String email_, String telefone_) {
        this.nome = nome_; this.email = email_; this.telefone = telefone_;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar () {
        this.ativo = true;
    }
}
