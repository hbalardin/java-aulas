public class L04E01ShowCustomer {
  public static void main(String[] args) {
    System.out.println("Fisrt customer:");
    L04E01Customer firstCustomer = new L04E01Customer();

    System.out.println("Second customer:");
    L04E01Customer secondCustomer = new L04E01Customer();

    System.out.println("------ Register ------");
    firstCustomer.show();
    secondCustomer.show();
  }
}