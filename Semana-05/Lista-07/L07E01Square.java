public class L07E01Square extends L07E01GeometricForm{
  public L07E01Square(double side) {
    super("square");

    this.calculateArea(side);
    this.calculatePerimeter(side);
  }

  private void calculateArea(double side) {
    double area = Math.pow(side, 2);
    this.setArea(area);
  }

  private void calculatePerimeter(double side) {
    double perimeter = side * 4;
    this.setPerimeter(perimeter);
  }
}
