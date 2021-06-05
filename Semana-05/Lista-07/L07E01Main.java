public class L07E01Main {
  public static void main(String[] args) {
    L07E01Circle circle1 = new L07E01Circle(10);
    L07E01Circle circle2 = new L07E01Circle(20);
    L07E01Square square1 = new L07E01Square(10);
    L07E01Square square2 = new L07E01Square(20);

    L07E03GeometricFormsList list = new L07E03GeometricFormsList(3);

    list.add(circle1);
    list.add(circle2);
    list.add(square1);
    list.add(square2);

    System.out.println("List total items: " + list.getSize());
    System.out.println(list);
  }
}
