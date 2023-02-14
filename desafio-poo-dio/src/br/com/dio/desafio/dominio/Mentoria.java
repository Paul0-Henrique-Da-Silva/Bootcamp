package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo_, String descricao_, LocalDate data_) {
        super(titulo_, descricao_);
        this.data = data_;
    }

    public void setData(LocalDate data_) { this.data = data_; }

    public LocalDate getData() { return data; }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }
}
