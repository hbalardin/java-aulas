import java.util.Scanner;

public class P0701Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("======= Hanoi Tower =======" + "\n");
      System.out.println("Your goal is to transfer the disks from pin A to pin B. " + "\n");

      Hanoi hanoi = new Hanoi(3);
      boolean gameIsOver = hanoi.hasFinished();

      while (!gameIsOver){
        System.out.println(hanoi);
        System.out.print("Your move: ");

        String attempt = scanner.nextLine();
        String[] pins = attempt.split(" ");

        String message = hanoi.transfer(pins[0], pins[1]);
        System.out.println(hanoi + message);

        gameIsOver = hanoi.hasFinished();
      }

      System.out.println("Congratulations!");
      scanner.close();
    } catch (Exception e) {
      System.out.println("Ops... Something went wrong.");
    }
  }
}
