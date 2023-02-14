import java.io.*;

public class ExeCheckedException {
  public static void  main(String[] args) {
        String nomedoarquivo = "lista.txt";
        try {
            imprimirNoConsole(nomedoarquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Revise o nome do arquivo que você deseja imprimir");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inexperado");
        }
        finally {
            System.out.println("Apesar da exception ou não o programa continua..");
        }
  }

  public static void  imprimirNoConsole(String param) throws IOException {
      File file = new File(param);
      BufferedReader br = new BufferedReader(new FileReader(file.getName()));
      String line = br.readLine();

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      do {
          bw.write(line); bw.newLine(); line=br.readLine();
      } while (line != null);
          bw.flush(); br.close();
  }
}
