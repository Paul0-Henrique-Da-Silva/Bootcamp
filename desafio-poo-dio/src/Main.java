import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descrição (...) ");
        curso.setCargaHoraria(8);

        System.out.println(curso);
        System.out.println("\t");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JavaScript");
        curso1.setDescricao("Descrição (...)");
        curso1.setCargaHoraria(6);

        System.out.println(curso1);
    }
}