import java.util.ArrayList;
import java.util.List;

public class ListExemplars {
    public static void main (String[] args) {
//        ArrayList notas = new ArrayList(); // Antes do Java 5
//        List<Double> notas = new ArrayList<>(); // Generics(jdk-5) - Diamond Operator(jdk-7)
//        ArrayList<Double> notas = new ArrayList<>();
//        List<Double> notas =  new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //imutavél
//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // tb imutável

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d); //7d ou 7.0
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        // ou
        System.out.println(notas.toString());

        System.out.println("Exiba a posiçao da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram infomados: ");
        for (Double nota : notas) System.out.println(nota);


    }
}