import java.util.Scanner;

class Exercise08 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter car price: ");
    double carPrice = scan.nextDouble();

    System.out.print("Enter down payment: ");
    double downPayment = scan.nextDouble();

    System.out.print("Enter number of installments: ");
    double installments = scan.nextDouble();

    double installmentPrice = (carPrice - downPayment) / installments;

    System.out.print("Each installment will cost: " + installmentPrice);
  }
}
