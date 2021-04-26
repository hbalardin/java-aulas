import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scan.nextInt();

    int result = number / 2;

    System.out.print("The integer division of this number is: " + result);
  }
}
