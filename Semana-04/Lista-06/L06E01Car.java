import java.util.Random;

public class L06E01Car extends L06E01Vehicle {
  public L06E01Car(String brand, String model){
    super(brand, model, "Car");
  }

  public boolean hasSupportToIsofix(){
    Random random = new Random();
    boolean hasSupportToIsofix = random.nextBoolean();

    return hasSupportToIsofix;
  }
}
