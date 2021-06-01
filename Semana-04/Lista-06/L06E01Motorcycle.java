import java.util.Random;

public class L06E01Motorcycle extends L06E01Vehicle {
  public L06E01Motorcycle(String brand, String model){
    super(brand, model, "Motorcycle");
  }

  public boolean isEletric(){
    Random random = new Random();
    boolean isEletric = random.nextBoolean();

    return isEletric;
  }

  public int getSpeed(){
    Random random = new Random();
    int speed = random.nextInt(61);

    return speed;
  }
}
