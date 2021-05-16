import java.text.DecimalFormat;
import java.util.Random;

public class L05E02Bank {
  private double balance;

  public L05E02Bank(){
    Random random = new Random();
    this.balance = random.nextDouble() * 100;
  }

  public String toString(){
    DecimalFormat df = new DecimalFormat("###.##");
    String parsedBalance = df.format(this.balance);
    return "Balance: $" + parsedBalance;
  }

  public double getBalance(){
    return this.balance;
  }

  public void increment(double quantity){
    this.balance += quantity;
  }

  public boolean decrement(double quantity){
    boolean hasEnoughMoney = true;
    if (this.balance >= quantity){

      this.balance -= quantity;
      return hasEnoughMoney;
    }

    hasEnoughMoney = false;
    return hasEnoughMoney;
  }

  public void monetize(){
    this.balance *= 1.01;
  }
}
