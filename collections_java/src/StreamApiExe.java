import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApiExe {
    public static void main(String[] args) {
        List<String> numeros = Arrays.
                asList("1","0","4","1","2","3","9","6","5");

        System.out.println("Imprima todas os elementos dessa lista de String:");

        numeros.forEach(System.out::println);

        System.out.println("\t");
        System.out.println("Pegue os 5 primeiros e coloque dentro de um Set");
        Set<String> fivenumber = numeros.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(fivenumber);

        System.out.println("\t");
        System.out.println("tranforme esta lista de string em uma lista de números inteiros");
         List<Integer> numerosInt = numeros.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        System.out.println(numerosInt);

        System.out.println("\t");
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        List<Integer> numerosmaioresque2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(numerosmaioresque2);

        System.out.println("\t");
        System.out.println("Mostre a média dos números");
         numeros.stream()
                 .mapToInt(Integer::parseInt)
                 .average()
                 .ifPresent(System.out::println);

        System.out.println("\t");
        System.out.println();
         numerosInt.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosInt);

    }


}
