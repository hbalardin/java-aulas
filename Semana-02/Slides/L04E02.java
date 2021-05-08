import java.util.Scanner;

public class L04E02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter circle radius: ");
    double radius = scanner.nextDouble();
    
    L04E02Circle circle = new L04E02Circle(radius);
    circle.show();

    System.out.print("Enter square side: ");
    double side = scanner.nextDouble();

    scanner.close();

    L04E02Square square = new L04E02Square(side);

    square.show();
  }
}
