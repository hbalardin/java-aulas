import java.util.Random;

public class L06E01Truck extends L06E01Vehicle {
  public L06E01Truck(String brand, String model){
    super(brand, model, "Truck");
  }

  public int getMaximumLoadCapacity(){
    Random random = new Random();
    int capacity = random.nextInt(801);

    return capacity;
  }

  public void honk(){
    System.out.println("Fon fon!!");
  }
}
