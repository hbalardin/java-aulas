import java.util.Scanner;

class Exercise07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the B value: ");
    double b = scan.nextDouble();

    System.out.print("Enter the C value: ");
    double c = scan.nextDouble();

    // a² = b² + c²
    double aSquared = Math.pow(b, 2) + Math.pow(c, 2);

    // a = √a²
    double a = Math.sqrt(aSquared);

    System.out.print("The hypotenuse is: " + a);
  }
}
