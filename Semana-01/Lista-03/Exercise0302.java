import java.util.Scanner;

class Exercise0302 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 20: ");
    int number = scan.nextInt();

    while(number < 0 || number > 20){
      System.out.print("PLEASE! Enter a number BETWEEN 0 and 20: ");
      number = scan.nextInt();
    }

    scan.close();

    int factorial = 1;
    for(int i = number; i > 1; i--) {
      factorial *= i;
    }
    
    System.out.print(number + " Factorial is: " + factorial);
  }
}
