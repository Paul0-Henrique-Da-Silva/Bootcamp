import java.util.*;

public class OrdenacaoExemplosMap {
    public static void main(String[] param) {
        System.out.println("-- Ordem aleatória --");
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hanking, Stephen",
                   new Livro("Uma breve história do tempo",300));
           put("Duhigg, Charles",
                   new Livro("O poder do Hábito", 400));
           put("Harari, Yuval Noah",
                   new Livro("21 Licões para século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.
                    println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\t");
        System.out.println("--Ordem Inserção--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hanking, Stephen",
                    new Livro("Uma breve história do tempo",300));
            put("Duhigg, Charles",
                    new Livro("O poder do Hábito", 400));
            put("Harari, Yuval Noah",
                    new Livro("21 Licões para século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out
                    .println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\t");
        System.out.println("Ordem afalbética autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out
                    .println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\t");
        System.out.println("--Ordem alfabética nomes dos livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3) {
            System.out
                    .println(livro.getKey() + " - " + livro.getValue().getNome());
        }
    }

}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome_, Integer paginas_) {
        this.nome = nome_;
        this.paginas = paginas_;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}