import java.util.ArrayDeque;

public class Pin {
  private String name;
  private int disksQuantity;
  private ArrayDeque<Integer> disks;

  public Pin(String name, int disksQuantity, boolean isInitialPin) {
    this.name = name;
    this.disksQuantity = disksQuantity;
    this.disks = new ArrayDeque<>();

    if (isInitialPin) {
      for (int i = disksQuantity; i > 0; i--){
        this.disks.push(i);
      }
    }
  }

  public String toString(){
    String response = "-";
    response = response.repeat(this.disksQuantity + 1 - this.disks.size());

    for (Integer disk: disks){
      response += disk;
    }
    response += " | " + name;

    return response;
  }

  public String getName(){
    return this.name;
  }

  public Integer getDisk(){
    if (this.disks.isEmpty()) return 0;
    return this.disks.peek();
  }

  public Integer removeDisk(){
    return this.disks.pop();
  }
  
  public void addDisk(Integer disk){
    this.disks.push(disk);
  }

  public boolean gameIsOver(){
    ArrayDeque<Integer> clonedDisks = this.disks.clone();

    for (int i = 1; i <= disksQuantity; i++){
      if (clonedDisks.isEmpty()) return false;

      Integer pop = clonedDisks.pop();

      if (i != pop) return false;
    }
    return true;
  }
}
