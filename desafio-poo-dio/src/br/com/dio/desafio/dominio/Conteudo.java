package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public Conteudo(String titulo_, String descricao_) {
        this.titulo = titulo_;
        this.descricao = descricao_;
    }

    public abstract double calcularXp();

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
