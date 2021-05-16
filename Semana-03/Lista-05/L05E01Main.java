import java.util.Scanner;

public class L05E01Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    L05E01Dice dice = new L05E01Dice(2);

    System.out.println(dice);
    boolean areEquals = dice.areEquals();
    if (areEquals){
      System.out.println("Results are equals! :D");
    } else {
      System.out.println("Results are differents! :S");
    }

    boolean rollAgain = true;
    
    while (rollAgain){
      char response = '0';
      
      while (response != 'y' && response != 'n'){
        System.out.print("Do you wanna roll again? (y/n) ");
        response = scanner.next().charAt(0);
      }

      if (response == 'n') {
        rollAgain = false;
        break;
      }

      dice.rollAgain();

      System.out.println(dice);
      areEquals = dice.areEquals();
      if (areEquals){
        System.out.println("Results are equals! :D");
      } else {
        System.out.println("Results are differents! :S");
      }
    }
  }
}