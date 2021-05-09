public class P0206Main {
  public static void main(String[] args) {
    P0206Dice firstDice = new P0206Dice();
    int firstResult = firstDice.getResult();
    firstDice.show();
    
    P0206Dice secondDice = new P0206Dice();
    int secondResult = secondDice.getResult();
    secondDice.show();

    if(firstResult == secondResult){
      System.out.println("Equal results!");
    } else {
      System.out.println("Different results!");
    }
  }
}
