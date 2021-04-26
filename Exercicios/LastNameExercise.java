import java.util.Scanner;
 
class LastNameExercise {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scan.next();

    System.out.print("Enter your last name: ");
    String lastName = scan.next();

    name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
    lastName = lastName.toUpperCase();
    System.out.println(lastName + ", " + name);
  }
}
