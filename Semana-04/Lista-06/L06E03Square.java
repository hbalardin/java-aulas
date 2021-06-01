public class L06E03Square extends L06E04GeometricForm{
  public L06E03Square(double side) {
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
