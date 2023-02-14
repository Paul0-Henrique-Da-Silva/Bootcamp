package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public void setTitulo(String titulo_) {
        this.titulo = titulo_;
    }

    public void setDescricao(String descricao_) {
        this.descricao = descricao_;
    }

    public void setData(LocalDate data_) {
        this.data = data_;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", data = " + data +
                '}';
    }
}