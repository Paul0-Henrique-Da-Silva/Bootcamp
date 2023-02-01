import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoExemplosList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Batata", 4, "Tigrado"));
            add(new Gato("Gataun", 2, "Laranja"));
            add(new Gato("Bingo", 4, "Preto"));
        }};


        System.out.println("--\tOrdem de Inserção\t--");
         // list sempre trabalha com ordem de inserção
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("--\tOrdem Cor\t--");
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

     public Gato(String nome, Integer idade, String cor) {
         this.nome = nome;
         this.idade = idade;
         this.cor = cor;
     }
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
    @Override
    public int compareTo(Gato gato) {
         return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

