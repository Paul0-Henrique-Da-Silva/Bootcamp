import br.com.dio.desafio.dominio.Curso;
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
    }
}