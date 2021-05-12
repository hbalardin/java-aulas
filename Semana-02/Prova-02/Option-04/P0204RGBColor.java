import java.util.Scanner;

public class P0204RGBColor {
  double r;
  double g;
  double b;

  P0204RGBColor(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter R component value (0 - 255): ");
    this.r = scanner.nextDouble();
    System.out.print("Enter G component value (0 - 255): ");
    this.g = scanner.nextDouble();
    System.out.print("Enter B component value (0 - 255): ");
    this.b = scanner.nextDouble();

    scanner.close();
  }

  void convertToCmyk(){
    double k = 1 - Math.max(Math.max(this.r / 255, this.g / 255), this.b / 255);
    double c = (1 - this.r / 255 - k) / (1 - k);
    double m = (1 - g / 255 - k) / (1 - k);
    double y = (1 - b / 255 - k) / (1 - k);

    System.out.println("The CMYK values are: " + c + " " + m + " " + y + " " + k);
  }
}
