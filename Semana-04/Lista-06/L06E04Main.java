import java.util.Scanner;

public class L06E04Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter circle radius: ");
    double radius = scanner.nextDouble();
    
    System.out.print("Enter square side: ");
    double side = scanner.nextDouble();
    
    scanner.close();
    
    L06E04Circle circle = new L06E04Circle(radius);
    circle.show();
    
    L06E04Square square = new L06E04Square(side);
    square.show();
  }
}
