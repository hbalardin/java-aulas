import java.util.Scanner;

class Exercise06 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a integer number: ");
    int number = scan.nextInt();

    int rest = number % 16;

    System.out.print("The division rest is: " + rest);
  }
}
