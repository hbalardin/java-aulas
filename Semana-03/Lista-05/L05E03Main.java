import java.util.Scanner;

public class L05E03Main {
  public static void main(String args[]){
    System.out.println("========= Supermarket =========");

    L05E03Cart cart = new L05E03Cart();
    System.out.println(cart);

    String option = "";
    int productsQuantity;
    Scanner scanner = new Scanner(System.in);
    while(option != "0"){
      System.out.println();
      System.out.println("What do you wanna do?");
      
      productsQuantity = cart.getQuantity();

      if (productsQuantity > 0){
        System.out.print("0 Leave / 1 Buy item / 2 Remove item: ");
      } else {
        System.out.print("0 Leave / 1 Buy item: ");
      }
      option = scanner.nextLine();

      String product;
      switch (option) {
        case "0":
          System.out.println();
          System.out.println("Bye bye! :)");
          return;
        case "1":
          System.out.print("Enter product: ");
          product = scanner.nextLine();
          
          boolean productAlreadyPurchased = cart.addProduct(product);
          
          if (productAlreadyPurchased){
            System.out.println();
            System.out.println("This product has already been purchased.");
          }

          System.out.println();
          System.out.println(cart);
          break;
        case "2":
          System.out.println();
          System.out.print("Enter product: ");
          product = scanner.nextLine();
          
          boolean productExists = cart.removeProduct(product);
          
          if (!productExists){
            System.out.println("This product do not exists.");
          }

          System.out.println();
          System.out.println(cart);
          break;
        default:
          System.out.println("Invalid option.");
      }
    }
  }
}
