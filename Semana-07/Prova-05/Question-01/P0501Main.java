import java.util.Scanner;

public class P0501Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter CSV filename: ");
    String filename = scanner.next();
    System.out.println();

    System.out.println("== Data ==");
    System.out.println();
    
    new CsvReader(filename);
    scanner.close();
  }
}
