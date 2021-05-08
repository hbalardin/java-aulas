import java.util.Scanner;

public class L04E02Square {
  double side;

  double area;

  double perimeter;

  L04E02Square() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter square side: ");
    this.side = scanner.nextDouble();

    this.calculateArea();
    this.calculatePerimeter();
  }

  void calculateArea() {
    this.area = Math.pow(this.side, 2);
  }

  void calculatePerimeter() {
    this.perimeter = this.side * 4;
  }

  void show() {
    System.out.println("The square area is: " + this.area);
    System.out.println("The square perimeter is: " + this.perimeter);
  }
}
