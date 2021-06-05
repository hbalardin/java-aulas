public abstract class L07E01GeometricForm {
  private double perimeter;
  private double area;

  public L07E01GeometricForm() {}

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

  public abstract String toString();
}
