import java.util.Scanner;

public class L04E02Circle {
  double radius;

  double area;

  double circumference;

  L04E02Circle() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter circle radius: ");
    this.radius = scanner.nextDouble();

    this.calculateArea();
    this.calculateCircumference();
  }

  void calculateArea() {
    this.area = Math.PI * Math.pow(this.radius, 2);
  }

  void calculateCircumference() {
    this.circumference = 2 * Math.PI * this.radius;
  }

  void show() {
    System.out.println("The circle area is:" + this.area);
    System.out.println("The circle circumference is: " + this.circumference);
  }
}
