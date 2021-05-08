import java.util.Scanner;

public class P0101 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n1 = scanner.nextInt();
    System.out.print("Enter another number: ");
    int n2 = scanner.nextInt();

    scanner.close();
   
    int higher = 0;

    if (n1 > n2 || n1 == n2 ){
      higher = n1;
    } else {
      higher = n2;
    }
   
    for (int i = 0; i <= higher; i++){
      System.out.print(" " + i);
    }
  }
}