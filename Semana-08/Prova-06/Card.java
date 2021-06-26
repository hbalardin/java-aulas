public class Card {
  private String name;
  private String suit;
  private String color;

  public Card(String name, String suit, String color){
    this.name = name;
    this.suit = suit;
    this.color = color;
  };

  public String toString(){
    return this.color + this.name + this.suit + Colors.ANSI_RESET;
  }
}
