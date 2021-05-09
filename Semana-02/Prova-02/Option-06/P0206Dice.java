import java.util.Random;

public class P0206Dice {
  int face;

  P0206Dice(){
    Random random = new Random();

    int result = random.nextInt(6) + 1;
    this.face = result;
  }

  int getResult(){
    return this.face;
  }

  void show(){
    System.out.println(this.face);
  }
}
