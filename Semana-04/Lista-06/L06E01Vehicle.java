import java.util.Random;

public class L06E01Vehicle {
  private String brand;
  private String model;
  private String type;

  public L06E01Vehicle(String brand, String model, String type){
    this.brand = brand;
    this.model = model;
    this.type = type;
  }

  public String getVehicleType(){
    return this.type;
  }

  public int getSpeed(){
    Random random = new Random();
    int speed = random.nextInt(101);

    return speed;
  }

  public void honk(){
    System.out.println("Beep beep!!");
  }

  public String toString(){
    char firstLetter = this.brand.toLowerCase().charAt(0);

    String woololo = "";
    if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u'){
      woololo += "n";
    }

    return "I'm a" + woololo + " " + this.brand + " " + this.model + "." ;
  }
}
