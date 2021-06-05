import java.text.DecimalFormat;

public class L07E01Square extends L07E01GeometricForm{
  private double side;

  public L07E01Square(double side) {
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

  public String toString(){
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    String area = decimalFormat.format(this.getArea());
    String perimeter = decimalFormat.format(this.getPerimeter());

    return (
      "Square with side " + this.side + 
      ", area = " + area +
      ", perimeter = " + perimeter
    );
  }
}
