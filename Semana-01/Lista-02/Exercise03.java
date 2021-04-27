import java.util.Scanner;

class Exercise03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the amount in dollar: ");
    double amountInDollar = scan.nextDouble();

    System.out.print("Enter the dollar price: ");
    double dollarPrice = scan.nextDouble();

    double amount = amountInDollar * dollarPrice;
  
    System.out.print("The equivalent amount in reais is: " + amount);
  }
}
