import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso(
                "Curso java",
                "Descrição (...) ",
                8
        );

        System.out.println(cursoJava);
        System.out.println("\t");

        Curso cursoJS = new Curso(
                "Curso JavaScript",
                "Descriçao (...)",
                12
        );

        System.out.println(cursoJS);

        System.out.println("\t");
        Mentoria mentoria = new Mentoria(
                "Mentoria Java",
                "Descrição (...)",
                LocalDate.now()
        );

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        System.out.println(bootcamp.getNome());
        bootcamp.setDescricao("""
                          Lorem ipsum dolor sit amet, consectetur adipiscing elit,\s
                        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\s
                        Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris \s
                        nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in \s
                        reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla \s
                        pariatur. Excepteur sint occaecat cupidatat non proident, sunt in \s
                        culpa qui officia deserunt mollit anim id est laborum
                        """);
        System.out.println(bootcamp.getDescricao());
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("\t");
        System.out.println("--------------------");
        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        System.out.println("dev: " + devPaulo.getNome());
        devPaulo.inscreverBootcamp(bootcamp);

        System.out.println("Conteudo Inscritos" + devPaulo.getConteudosIncritos());
        devPaulo.progredir();
        System.out.println("Conteudo Concluidos" + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

        System.out.println("\t");
        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");

    }
}