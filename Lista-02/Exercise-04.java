import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.0");

    System.out.print("Enter a decimal number: ");
    double number = scan.nextDouble();

    String roundedNumber = decimalFormat.format(number);

    System.out.print("The rounded number is: " + roundedNumber);
  }
}
