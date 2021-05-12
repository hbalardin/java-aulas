public class P0202TrafficLight {
  String color;

  P0202TrafficLight(){
    this.color = "green";
  }

  void showColor(){
    System.out.println(this.color);
  }

  void changeColor(){
    switch (this.color) {
      case "green":
        this.color = "yellow";
        break;
      case "yellow":
        this.color = "red";
        break;
      case "red":
        this.color = "green";
        break;
      default:
        this.color = "under maintenance";
    }
  }
}
