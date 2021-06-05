public class L07E01Main {
  public static void main(String[] args) {
    L07E01Circle circle = new L07E01Circle(10);
    L07E01Square square = new L07E01Square(10);
    if (circle.hasSameArea(square)) {
      System.out.println("This forms have the same area!");
    } else {
      System.out.println("This forms have not the same area.");
    }
  }
}
