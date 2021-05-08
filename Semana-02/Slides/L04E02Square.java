public class L04E02Square {
  double side;

  L04E02Square(double side) {
    this.side = side;
  }

  double calculateArea(double side) {
    double area = Math.pow(side, 2);
    return area;
  }

  double calculatePerimeter(double side) {
    double perimeter = side * 4;
    return perimeter;
  }

  void show() {
    double area = calculateArea(this.side);
    double perimeter = calculatePerimeter(this.side);

    System.out.println("The square area is: " + area);
    System.out.println("The square perimeter is: " + perimeter);
  }
}
