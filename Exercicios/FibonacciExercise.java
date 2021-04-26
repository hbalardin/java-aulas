import java.util.Scanner;

class FibonacciExercise {
  public static void main(String[] args) {
    int[] fibonacciNumbers = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number between 1-10: ");
    int number = scan.nextInt();

    while(number < 1 || number > 10){
      System.out.print("PLEASE! Enter a number BETWEEN 1-10: ");
      number = scan.nextInt();
    }

    int index = number - 1;
  
    int findFibonacciNumber = fibonacciNumbers[index];
    System.out.print("The " + number + "° number of Fibonacci Serie is " + findFibonacciNumber + ".");
  }
}
