import java.util.Scanner;

public class L04E02Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter circle radius: ");
    double radius = scanner.nextDouble();
    
    Circle circle = new Circle(radius);
    circle.show();

    System.out.print("Enter square side: ");
    double side = scanner.nextDouble();

    Square square = new Square(side);
    square.show();
    
    scanner.close();
  }
}
