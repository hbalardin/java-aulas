import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Animator {
  Animator () {
    try {
      FileInputStream f = new FileInputStream("./Semana-07/Prova-05/database.csv");
      Scanner scanner = new Scanner(f);

      int lineCounter = 0;
      while (scanner.hasNextLine()) {
        String row = scanner.nextLine();

        if (lineCounter == 0) {
          lineCounter++;
          continue;
        }

        String[] data = row.split(",");

        for (int i = 0; i < data.length; i++){
          if (i == 0) {
            System.out.println(data[i]);
            continue;
          }
          if (i == data.length - 1) {
            System.out.println(data[i]);
            continue;
          } 

          System.out.print(data[i] + " | ");
        }

        lineCounter++;
      }

      f.close();
    } catch (FileNotFoundException e) {
      System.err.println("O arquivo não existe!");
    } catch (IOException e) {
      System.err.println("Problema no sistema de arquivos!");
    }
  }
}
