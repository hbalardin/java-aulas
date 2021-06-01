import java.text.DecimalFormat;

public class P03O06GeometricForm {
  private double perimeter;
  private double area;

  public P03O06GeometricForm() {}

  public void setArea(double area) {
    this.area = area;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  public String getArea() {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    return decimalFormat.format(this.area);
  }
  
  public String getPerimeter() {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    return decimalFormat.format(this.perimeter);
  }
}
