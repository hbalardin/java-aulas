public class L06E04GeometricForm {
  private String form;
  private double perimeter;
  private double area;

  public L06E04GeometricForm(String form) {
    this.form = form;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  public void show() {
    System.out.println("The " + form  + " area is: " + area);
    System.out.println("The " + form  + " perimeter is: " + perimeter);
  }
}
