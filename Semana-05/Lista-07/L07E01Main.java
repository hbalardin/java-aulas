public class L07E01Main {
  public static void main(String[] args) {
    L07E01Circle circle = new L07E01Circle(10);
    L07E01Square square = new L07E01Square(20);

    int comparation = circle.compareArea(square);
    if (comparation == -1) {
      System.out.println("Square area is lower than circle area!");
    } else if (comparation == 1) {
      System.out.println("Square area is bigger than circle area!");
    } else {
      System.out.println("Square area is equal circle area!");
    }
  }
}
