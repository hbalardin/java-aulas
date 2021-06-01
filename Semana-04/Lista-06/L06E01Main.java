public class L06E01Main {
  public static void main(String[] args) {
    L06E03ForeignCar foreignCar = new L06E03ForeignCar("Gurgel", "BR800");
    System.out.println("== " + foreignCar.getVehicleType() + " ==");
    System.out.println(foreignCar);
    foreignCar.honk();
    System.out.println("My currently speed is " + foreignCar.getSpeed() + " km/h.");
    
    String negative = "";
    if (!foreignCar.hasSupportToIsofix()){
      negative += "n't";
    }
    System.out.println("I have" + negative + " support to Isofix.");
    System.out.println("Fabricator's CNPJ: " + foreignCar.getCNPJ() + ".");
    
    L06E03NationalCar nationalCar = new L06E03NationalCar("Ford", "Mustang");
    System.out.println();
    System.out.println("== " + nationalCar.getVehicleType() + " ==");
    System.out.println(nationalCar);
    nationalCar.honk();
    System.out.println("My currently speed is " + nationalCar.getSpeed() + " km/h.");
    
    negative = "";
    if (!nationalCar.hasSupportToIsofix()){
      negative += "n't";
    }
    System.out.println("I have" + negative + " support to Isofix.");
    System.out.println("I'm from " + nationalCar.getCountry() + ".");
    
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
