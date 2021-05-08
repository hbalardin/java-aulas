import java.util.Scanner;

public class L04E01Customer {
  String name;
  String email;

  L04E01Customer() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a name: ");
    this.name = scanner.nextLine();
    System.out.print("Entre com o email: ");
    this.email = scanner.nextLine();

    scanner.close();
  }

  void show() {
    System.out.println(this.name + " <" + this.email + ">");
  }
}
