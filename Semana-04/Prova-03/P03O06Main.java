import java.util.Scanner;

public class P03O06Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] results = new String[3];
    
    for (int i = 1; i <= 3; i ++){
      boolean repeat = true;

      while (repeat) {
        System.out.print("Choose one option for " + i + "º form (1 = circle, 2 = square): ");
        int option = scanner.nextInt();
      
        if (option == 1){
          System.out.print("Enter circle radius: ");
          double radius = scanner.nextDouble();

          P03O06Circle form = new P03O06Circle(radius);
          results[i - 1] = form.getStringToShow();
          repeat = false;
        }
        if (option == 2) {
          System.out.print("Enter square side: ");
          double side = scanner.nextDouble();
          
          P03O06Square form = new P03O06Square(side);
          results[i - 1] = form.getStringToShow();
          repeat = false;
        }
      }
    }

    scanner.close();

    System.out.println();
    for (int i = 1; i <= 3; i ++){
      System.out.print("Form #" + i + ": ");
      System.out.println(results[i - 1]);
    }
  }
}
