import java.util.Random;

public class P0203Oracle {
  Random random;

  P0203Oracle(){
    random = new Random();
  }

  void drawNumber(){
    int number = random.nextInt(61);
    System.out.print(number);
  }
}
