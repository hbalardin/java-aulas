import java.util.Scanner;

class Exercise11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter product price: ");
    double price = scan.nextDouble();

    double percentage = 15;
    double descont = percentage / 100 * price;

    double finalPrice = price - descont;

    System.out.print("The price with " + percentage + "% discount is: " + finalPrice);
  }
}
