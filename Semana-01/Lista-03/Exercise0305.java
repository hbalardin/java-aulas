import java.util.Scanner;    
import java.util.Random;    
 
class Main{
 public static void main(String[] args){
   Random random = new Random();
   int number = random.nextInt(100);
   
   Scanner scanner = new Scanner(System.in);

   System.out.print("Try to guess a number. Enter a number from 0 to 100: ");
   int guess = scanner.nextInt();
 
   int counter = 1;
   
   while (number != guess){
     if (number > guess){
       System.out.print("The number is higher than yout attempt. Try again: ");
       guess = scanner.nextInt();
     } else {
       System.out.print("The number is less than yout attempt. Try again: ");
       guess = scanner.nextInt();
     }
     counter++;
   }

   scanner.close();

   System.out.println("You got it!");
   System.out.println("Number of attempts: " + counter);
 }
}
