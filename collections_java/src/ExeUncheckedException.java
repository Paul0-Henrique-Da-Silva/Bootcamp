import java.util.Scanner;

public class ExeUncheckedException {
    public static void  main (String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numerador: ");
        String a = scan.nextLine();
        System.out.println("Divisor");
        String b = scan.nextLine();

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, informe um numero inteiro");
        } catch (ArithmeticException e) {
            System.out.println("Impossivel dividis por '0'!");
        } finally {
            System.out.println("Chegou no finally");
        }
           }

    public  static int dividir(int a, int b) { return a / b; }
}
