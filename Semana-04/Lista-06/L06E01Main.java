public class L06E01Main {
  public static void main(String[] args) {
    L06E01Car car = new L06E01Car("Ford", "Mustang");
    System.out.println("== " + car.getVehicleType() + " ==");
    System.out.println(car);
    car.honk();
    System.out.println("My currently speed is " + car.getSpeed() + " km/h.");
    
    String negative = "";
    if (!car.hasSupportToIsofix()){
      negative += "n't";
    }
    System.out.println("I have" + negative + " support to Isofix.");
    
    L06E01Truck truck = new L06E01Truck("Scania", "Brutus");
    System.out.println();
    System.out.println("== " + truck.getVehicleType() + " ==");
    System.out.println(truck);
    truck.honk();
    System.out.println("My currently speed is " + truck.getSpeed() + " km/h.");
    System.out.println("My maximum load capacity is " + truck.getMaximumLoadCapacity() + " kg.");
    
    
    L06E01Motorcycle motorcycle = new L06E01Motorcycle("Honda", "CG125");
    System.out.println();
    System.out.println("== " + motorcycle.getVehicleType() + " ==");
    System.out.println(motorcycle);
    motorcycle.honk();
    System.out.println("My currently speed is " + motorcycle.getSpeed() + " km/h.");
    
    String power = "";
    if (motorcycle.isEletric()){
      power = "eletricity";
    } else {
      power = "gas";
    }
    System.out.println("I'm powered by " + power + ".");
  }
}
