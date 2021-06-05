import java.text.DecimalFormat;

public class L07E01Circle extends L07E01GeometricForm {
  private double radius;

  public L07E01Circle(double radius) {
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

  public String toString(){
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    String area = decimalFormat.format(this.getArea());
    String perimeter = decimalFormat.format(this.getPerimeter());

    return (
      "Circle with radius " + this.radius + 
      ", area = " + area +
      ", perimeter = " + perimeter
    );
  }
}