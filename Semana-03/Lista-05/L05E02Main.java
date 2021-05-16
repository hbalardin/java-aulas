import java.util.Scanner;

public class L05E02Main {
  public static void main(String[] args){
    L05E02Bank bank = new L05E02Bank();
    
    System.out.println(bank);

    int option = 0;
    while (option != 4){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Which operation do you want to do? ");
      System.out.print("1 Deposit / 2 Withdraw / 3 Profitability / 4 Leave: ");
      option = scanner.nextInt();

      double quantity = 0;
      switch (option) {
        case 1:
          System.out.print("Enter deposit quantity: ");
          quantity = scanner.nextDouble();
          bank.increment(quantity);
          System.out.println(bank);
          break;
        case 2:
          System.out.print("Enter withdraw quantity: ");
          quantity = scanner.nextDouble();
          boolean hasEnoughMoney = bank.decrement(quantity);
          
          if (hasEnoughMoney){
            System.out.println(bank);
          } else {
            System.out.println("You do not have enough money.");
          }
          break;
        case 3:
          bank.monetize();
          System.out.println(bank);
          break;
        case 4:
          return;
        default:
          System.out.println("Invalid operation.");
      }
    }
  }
}
