import java.text.DecimalFormat;

public class P03O06Square extends P03O06GeometricForm{
  private double side;

  public P03O06Square(double side) {
    super();

    this.side = side;

    this.calculateArea();
    this.calculatePerimeter();
  }

  private void calculateArea() {
    double area = Math.pow(this.side, 2);

    this.setArea(area);
  }

  private void calculatePerimeter() {
    double perimeter = this.side * 4;
    
    this.setPerimeter(perimeter);
  }

  public String getStringToShow() {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    return "square with side " + decimalFormat.format(this.side) + ", area = " + this.getArea() + ", perimeter = " + this.getPerimeter();
  }
}
