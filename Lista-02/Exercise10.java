import java.util.Scanner;

class Exercise10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Fahrenheit temperature: ");
    double fahrenheitTemperature = scan.nextDouble();

    double celsiusTemperature = (fahrenheitTemperature - 32) * 5/9;

    System.out.print("The Celsius equivalent is: " + celsiusTemperature);
  }
}