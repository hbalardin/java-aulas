public abstract class L07E01GeometricForm {
  private String form;
  private double perimeter;
  private double area;

  public L07E01GeometricForm(String form) {
    this.form = form;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  public double getArea() {
    return this.area;
  }

  public double getPerimeter() {
    return this.perimeter;
  }

  public boolean hasSameArea(L07E01GeometricForm form){
    return form.getArea() == this.getArea();
  }

  public boolean hasSamePerimeter(L07E01GeometricForm form){
    return form.getPerimeter() == this.getPerimeter();
  }

  public void show() {
    System.out.println("The " + form  + " area is: " + area);
    System.out.println("The " + form  + " perimeter is: " + perimeter);
  }
}
