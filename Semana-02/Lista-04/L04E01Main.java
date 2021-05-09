public class L04E01Main {
  public static void main(String[] args) {
    System.out.println("Fisrt customer:");
    Customer firstCustomer = new Customer();

    System.out.println("Second customer:");
    Customer secondCustomer = new Customer();

    System.out.println("------ Register ------");
    firstCustomer.show();
    secondCustomer.show();
  }
}