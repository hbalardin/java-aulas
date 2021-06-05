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

  public int compareArea(L07E01GeometricForm form){
    if (form.getArea() > this.getArea()) {
      return 1;
    } else if (form.getArea() == this.getArea()){
      return 0;
    } else {
      return -1;
    }
  }

  public int comparePerimeter(L07E01GeometricForm form){
    if (form.getPerimeter() > this.getPerimeter()) {
      return 1;
    } else if (form.getPerimeter() == this.getPerimeter()){
      return 0;
    } else {
      return -1;
    }
  }

  public void show() {
    System.out.println("The " + form  + " area is: " + area);
    System.out.println("The " + form  + " perimeter is: " + perimeter);
  }
}
