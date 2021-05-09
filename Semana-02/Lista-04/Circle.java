public class Circle {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double calculateArea(double radius) {
    double area = Math.PI * Math.pow(radius, 2);
    return area;
  }

  double calculateCircumference(double radius) {
    double circumference = 2 * Math.PI * radius;
    return circumference;
  }

  void show() {
    double area = calculateArea(this.radius);
    double circumference = calculateCircumference(this.radius);

    System.out.println("The circle area is:" + area);
    System.out.println("The circle circumference is: " + circumference);
  }
}
