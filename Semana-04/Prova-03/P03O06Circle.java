import java.text.DecimalFormat;

public class P03O06Circle extends P03O06GeometricForm {
  private double radius;

  public P03O06Circle(double radius) {
    super();

    this.radius = radius;

    this.calculateArea();
    this.calculateCircumference();
  }

  private void calculateArea() {
    double area = Math.PI * Math.pow(this.radius, 2);

    this.setArea(area);
  }
  
  private void calculateCircumference() {
    double circumference = 2 * Math.PI * this.radius;

    this.setPerimeter(circumference);
  }
  
  public String getStringToShow() {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    return "circle with radius " + decimalFormat.format(this.radius) + ", area = " + this.getArea() + ", perimeter = " + this.getPerimeter();
  }
}