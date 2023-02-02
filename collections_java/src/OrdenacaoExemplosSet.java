import java.util.*;

public class OrdenacaoExemplosSet {
    public static void main(String[] args) {
        Set<Series> minhaSeries = new HashSet<>() {{
            add(new Series("Game of Thrones", "Fantasia", 60));
            add(new Series("Cavaleiro da Lua", "Ficção/Fantasia", 30));
            add(new Series("The Doctor", "Ficçao", 40));
        }};

        for (Series serie: minhaSeries ) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());
        }
        System.out.println("--------------------------");
        System.out.println("--\tOrdem de Inserção\t--");
        Set<Series> minhaSeries1 = new LinkedHashSet<>() {{
            add(new Series("Game of Thrones", "Fantasia", 60));
            add(new Series("Cavaleiro da Lua", "Ficção/Fantasia", 30));
            add(new Series("The Doctor", "Ficçao", 40));
        }};
        for(Series serie: minhaSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());
        }

        System.out.println("--------------------------");
        System.out.println("--\tOrdem Natural (Duração)\t--");
        Set<Series> minhaSeries2 = new TreeSet<>(minhaSeries1);
        for(Series serie: minhaSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());
        }

        System.out.println("--------------------------");
        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
        Set<Series> minhaSeries3 = new TreeSet<>(new ComparandoNomeGeneroTempoEpisodio());
        minhaSeries3.addAll(minhaSeries);

        for(Series serie: minhaSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());
        }
        
    }
}

class Series implements Comparable<Series> {
    private String nome;
    private String genero;
    private Integer duracao;

    public Series(String nome_, String genero_, Integer duracao_) {
        this.nome = nome_; this.genero = genero_; this.duracao = duracao_;
    }
    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public Integer getDuracao() { return duracao; }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.
                equals(nome, series.nome)
                && Objects.
                equals(genero, series.genero)
                && Objects.equals(duracao, series.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracao);
    }

    @Override
    public int compareTo(Series serie) {
        int genero = this.getGenero().compareTo(serie.getGenero());
        int  tempoEpisodio = Integer.compare(this.getDuracao(), serie.getDuracao());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return  genero;
       
    }
}

class ComparandoNomeGeneroTempoEpisodio implements Comparator<Series> {
    @Override
    public int compare(Series s1, Series s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
      return Integer.compare(s1.getDuracao(), s2.getDuracao());
    }
}