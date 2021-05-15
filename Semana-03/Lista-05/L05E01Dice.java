import java.util.Random;

public class L05E01Dice {
  private int[] results;
  private int quantity;

  public L05E01Dice(int quantity){
    this.quantity = quantity;
    this.results = new int[quantity];

    this.roll();
  }

  private void roll(){
    Random random = new Random();

    for(int i = 0; i < this.quantity; i++){
      this.results[i] = random.nextInt(6) + 1;
    }
  }

  public void rollAgain(){
    this.roll();
  }

  public int[] getResults(){
    return this.results;
  }

  public boolean areEquals(){
    boolean areEquals = true;
    int firstResult = this.results[0];

    for(int i = 1; i < this.results.length && areEquals; i++){
      if (this.results[i] != firstResult) {
        areEquals = false;
      }
    }
    return areEquals;
  }

  public String toString(){
    String results = "";
    for (int result: this.results){
      results += result + " ";
    }
    return "Dice results: " + results;
  }
}
