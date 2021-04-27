import java.util.Scanner;
import java.util.ArrayList;
 
class Exercise0304 {
  public static void main(String[] args){
    System.out.print("Enter a word all lowercase: ");

    Scanner scan = new Scanner(System.in);
    String word = scan.next();

    while (word != word.toLowerCase()){
      System.out.print("PLEASE! Enter a word ALL LOWERCASE: ");
      word = scan.next();
    }

    scan.close();

    int wordLength = word.length();

    ArrayList<Character> repeatedLetters = new ArrayList<>();

    for(int i = 0; i < wordLength - 1; i++){
      char letter = word.charAt(i);

      for(int j = i + 1; j < wordLength; j++){
        char nextLetter = word.charAt(j);

        if (letter == nextLetter){
          if (repeatedLetters.size() == 0) {
            repeatedLetters.add(letter);
            break;
          } else {
            for (char repeatedLetter: repeatedLetters){
              if(letter == repeatedLetter){
                break;
              } else {
                repeatedLetters.add(letter);
                break;
              }
            }
          }
        }
      }
    }

    if (repeatedLetters.size() > 0){
      System.out.println("Yes, the word '" + word + "' have repeated letters.");
      System.out.print("The repeated letters are: ");

      for (char letter: repeatedLetters){
        System.out.print(letter + " ");
      }
    } else {
      System.out.print("No, the word '" + word + "' haven't repeated letters.");
    }   
  }
}
