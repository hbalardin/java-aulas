import java.util.ArrayList;

public class Hanoi {
  private ArrayList<Pin> pins;

  public Hanoi(int disksQuantity) {
    this.pins = new ArrayList<>();

    this.pins.add(new Pin("A", disksQuantity, true));
    this.pins.add(new Pin("B", disksQuantity, false));
    this.pins.add(new Pin("C", disksQuantity, false));
  }

  public String toString(){
    String response = "";

    for (Pin pin: this.pins){
      response += pin + "\n";
    }

    return response;
  }

  public boolean hasFinished(){
    return this.pins.get(1).gameIsOver();
  }

  public String transfer(String from, String to){
    int fromPinIndex = this.findIndexByName(from.toUpperCase());
    int toPinIndex = this.findIndexByName(to.toUpperCase());

    String errorMessage = "Invalid move! Try again." + "\n";

    if (!(fromPinIndex >= 0) || !(toPinIndex >= 0)){
      return errorMessage;
    }


    int movedDisk = this.pins.get(fromPinIndex).getDisk();
    int lastDisk = this.pins.get(toPinIndex).getDisk();

    if (movedDisk > lastDisk && lastDisk != 0) return errorMessage;

    Integer removedDisk = this.pins.get(fromPinIndex).removeDisk();
    this.pins.get(toPinIndex).addDisk(removedDisk);

    return "";
  }

  public int findIndexByName(String name){
    for (Pin pin: pins){
      if (name.equals(pin.getName())) return pins.indexOf(pin);
    }
    return -1;
  }
}
