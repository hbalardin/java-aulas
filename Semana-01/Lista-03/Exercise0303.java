import java.util.Scanner;

class Exercise0303 {
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

    for(int i = 0; i < wordLength - 1; i++){
      char letter = word.charAt(i);

      for(int j = i + 1; j < wordLength; j++){
        char nextLetter = word.charAt(j);
        if (letter == nextLetter){
          System.out.println("Yes, the word '" + word + "' have repeated letters.");
          return;
        }
      }
    }
  
    System.out.println("No, the word '" + word + "' haven't repeated letters.");
  }
}
