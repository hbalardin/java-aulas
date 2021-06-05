public class L07E01Circle extends L07E01GeometricForm {
  public L07E01Circle(double radius) {
    super("circle");

    this.calculateArea(radius);
    this.calculateCircumference(radius);
  }

  private void calculateArea(double radius) {
    double area = Math.PI * Math.pow(radius, 2);
    this.setArea(area);
  }
  
  private void calculateCircumference(double radius) {
    double circumference = 2 * Math.PI * radius;
    this.setPerimeter(circumference);
  }
}