import java.util.*;

public class SetExemplars {
    public static void main (String[] args) {
//        Set notas = new Hashset(); // Antes do Java 5
//        HashSet<Double> notas = new HashSet<>(); // Generics(jdk-5) - Diamond Operator(jdk-7)
//        Set<Double> notas =  new Set.of<>(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //imutavél
//        ArrayList<Double> notas = new ArrayList<>();
//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // tb imutável

        Set<Double> nota = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(nota.toString());

//        System.out.println("Exiba a posiçao da nota 5.0: ");

//        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

//        System.out.println("Substitua a nota 5.0 pela nota 6.0");

        System.out.println("Confira se a nota 5.0 está na lista: " + nota.contains(5d));

//        System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba a menor nota: " + Collections.min(nota));

        System.out.println("Exiba a maior nota: " + Collections.max(nota));

        Iterator<Double> interetor = nota.iterator();
        Double soma = 0d;
        while (interetor.hasNext()) {
            Double next = interetor.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/nota.size()));

        System.out.println("Remova a nota 0:");
        nota.remove(0d);
        System.out.println(nota);

//        System.out.println("Remova a nota na posição 0");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
            Iterator<Double> iterator1 = nota.iterator();

            while (iterator1.hasNext()) {
                Double next = iterator1.next();
                if (next < 7) iterator1.remove();
            }
        System.out.println(nota);

        System.out.println("Exiba todas as notas na ordem em que foram infomados: ");
        Set<Double> nota2 = new LinkedHashSet<>();
        nota2.add(7d);
        nota2.add(8.5); nota2.add(9.3); nota2.add(5d);
        nota2.add(7d); nota2.add(0d); nota2.add(3.6);
        System.out.println(nota2);

        System.out.println("Exiba todas as notas em onde crescente: ");
        Set<Double> nota3 = new TreeSet<>(nota2);
        System.out.println(nota3);

        nota.clear();
        System.out.println("Confira se a lista esta vazia: " + nota.isEmpty());

        System.out.println(nota);
    }
}
