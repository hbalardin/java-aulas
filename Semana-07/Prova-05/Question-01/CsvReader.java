import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CsvReader {
  private String[] columns;

  CsvReader (String filename) {
    try {
      FileInputStream f = new FileInputStream(filename);
      Scanner scanner = new Scanner(f);

      int lineCounter = 0;
      while (scanner.hasNextLine()) {
        String row = scanner.nextLine(); 
        String[] data = row.split(",");
        
        if (lineCounter == 0) {
          this.columns = data;
          lineCounter++;
          continue;
        }

        for (int i = 0; i < data.length; i++){
          System.out.println(this.columns[i] + ": " + data[i]);
        }
        System.out.println();

        lineCounter++;
      }

      f.close();
      scanner.close();
    } catch (FileNotFoundException e) {
      System.err.println("O arquivo não existe!");
    } catch (IOException e) {
      System.err.println("Problema no sistema de arquivos!");
    }
  }
}
