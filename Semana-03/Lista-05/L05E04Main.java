import java.util.Scanner;

public class L05E04Main {
  public static void main(String[] args){
    System.out.println("======== Hangman game ========");
    L05E04Hangman game = new L05E04Hangman();
    
    int errors = game.getErrors();
    boolean hasFinished = game.hasFinished();
    
    Scanner scanner = new Scanner(System.in);
    while(!hasFinished){
      System.out.print(game);
      System.out.println("  Errors: " + errors);
      
      
      System.out.print("Letter: ");
      game.attempt(scanner.next().charAt(0));
      System.out.println();
      
      errors = game.getErrors();
      hasFinished = game.hasFinished();
    }
    scanner.close();
    
    System.out.print(game);
    System.out.println("  Errors: " + errors);
    System.out.println("Congratulations!!");
  }
}
