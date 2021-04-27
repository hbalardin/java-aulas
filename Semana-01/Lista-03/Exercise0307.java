import java.util.Scanner;
 
class Exercise0307 {
  public static void main(String[] args){  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = scanner.next();
    scanner.close();

    String drow = "";

    for (int i = word.length(); i > 0; i--) {
      drow += word.charAt(i - 1);
    }

    System.out.print("The reverse word is: " + drow);
  }
}
