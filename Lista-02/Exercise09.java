import java.util.Scanner;

class Exercise09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter car price: ");
    double carPrice = scan.nextDouble();

    System.out.print("Enter down payment percentual (0-100): ");
    double downPaymentPercentage = scan.nextDouble();

    System.out.print("Enter number of installments: ");
    double installments = scan.nextDouble();

    double installmentPrice = (carPrice - (downPaymentPercentage / 100 * carPrice)) / installments;

    System.out.print("Each installment will cost: " + installmentPrice);
  }
}
