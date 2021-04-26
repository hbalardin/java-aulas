import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter first grade: ");
    double n1 = keyboard.nextDouble();
    System.out.print("Enter second grade: ");
    double n2 = keyboard.nextDouble();

    double average = (n1 + n2) / 2;
    System.out.println("Average: " + average);
  }
}
