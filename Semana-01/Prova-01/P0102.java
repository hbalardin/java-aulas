import java.util.Scanner;

public class P0102 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a word  ");
    String word = scanner.next();

    word = word.toLowerCase();

    char firstLetter = 'a';
    char secondLetter = 'o';

    boolean[] verification = {false , false};

    for (int i = 0; i < word.length(); i++){
      if (word.charAt(i) == firstLetter){
        verification[0] = true;
      }
      if (word.charAt(i) == secondLetter){
        verification[1] = true;
      }
    }

    if (verification[0] == true && verification[1] == true){
      System.out.print("Essa palavra possui as duas letras.");
    }
    else {
      System.out.print("Essa palavra não possui as duas letras.");
    }
  }
}