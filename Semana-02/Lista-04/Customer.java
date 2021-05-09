import java.util.Scanner;

public class Customer {
  String name;
  String email;

  Customer() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a name: ");
    this.name = scanner.nextLine();
    System.out.print("Enter an email: ");
    this.email = scanner.nextLine();
  }

  void show() {
    System.out.println(this.name + " <" + this.email + ">");
  }
}
