package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso(String titulo_, String descricao_, int cargaHoraria_) {
        this.titulo = titulo_;
        this.descricao = descricao_;
        this.cargaHoraria = cargaHoraria_;
    }

    public void setTitulo(String titulo_) {
        this.titulo = titulo_;
    }

    public void setDescricao(String descricao_) {
        this.descricao = descricao_;
    }

    public void setCargaHoraria(int cargaHoraria_) {
        this.cargaHoraria = cargaHoraria_;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", carga_horaria = " + cargaHoraria +
                '}';
    }
}
