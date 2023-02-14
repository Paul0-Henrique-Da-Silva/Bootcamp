package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo_, String descricao_, int cargaHoraria_) {
        super(titulo_, descricao_);
        this.cargaHoraria = cargaHoraria_;
    }

    public void setCargaHoraria(int cargaHoraria_) {
        this.cargaHoraria = cargaHoraria_;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", carga_horaria = " + cargaHoraria +
                '}';
    }
}
