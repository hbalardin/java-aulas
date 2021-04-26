import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the value that your friend ask for money: ");
    double value = scan.nextDouble();

    double result = value * 1.15;

    System.out.print("Your friend should give back to you: " + result);
  }
}
