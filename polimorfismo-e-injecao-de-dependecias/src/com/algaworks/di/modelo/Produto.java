package com.algaworks.di.modelo;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal valorTotal;

    public Produto(String nome_, BigDecimal valorTotal_) {
        this.nome = nome_; this.valorTotal = valorTotal_;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
