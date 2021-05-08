import java.util.Scanner;

class L04E01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a name: ");
    String firstName = scanner.nextLine();

    System.out.print("Enter an email: ");
    String firstEmail = scanner.nextLine();

    System.out.print("Enter another name: ");
    String secondName = scanner.nextLine();

    System.out.print("Enter another email: ");
    String secondEmail = scanner.nextLine();

    scanner.close();

    System.out.println("------ Register ------");
    System.out.println(firstName + " <" + firstEmail + ">");
    System.out.println(secondName + " <" + secondEmail + ">");
  }
}