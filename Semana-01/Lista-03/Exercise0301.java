import java.util.Scanner;

class Exercise0301 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number between 2 and 9: ");
    int number = scan.nextInt();

    while(number < 2 || number > 9){
      System.out.print("PLEASE! Enter a number BETWEEN 2 and 9: ");
      number = scan.nextInt();
    }

    scan.close();
    
    System.out.println(number + " times table:");
    System.out.println("---------------------------------");

    for(int i = 1; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " + number * i);
    }
  }
}
