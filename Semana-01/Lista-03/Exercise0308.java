import java.util.Scanner;

class Exercise0308 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = scanner.next();
    scanner.close();

    word = word.toLowerCase();

    int vowelsCounter = 0;

    for (int i = 0; i < word.length(); i++){
      char l = word.charAt(i);
      if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
        vowelsCounter++;
      }
    }

    System.out.print("The word has " + vowelsCounter + " vowels.");
  }
}