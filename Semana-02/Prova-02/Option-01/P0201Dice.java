import java.util.Random;

public class P0201Dice {
  int face;

  P0201Dice(){
    Random random = new Random();

    int result = random.nextInt(6) + 1;
    this.face = result;
  }

  void show(){
    System.out.println(this.face);
  }
}
