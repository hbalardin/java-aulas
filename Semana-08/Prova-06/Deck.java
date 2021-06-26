import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
  private ArrayList<Card> cards = new ArrayList<Card>();

  public Deck(String color){
    this.addCards(color);
  }

  private void addCards(String color){
    ArrayList<String> suits = new ArrayList<>(Arrays.asList("♥", "♠", "♦", "♣"));
    ArrayList<String> names = new ArrayList<>(Arrays.asList(
      "A",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "10",
      "J",
      "Q",
      "K"
    ));

    for(String suit: suits){
      for(String name: names){
        Card card = new Card(name, suit, color);
        this.cards.add(card);
      }
    }
  }

  public void duplicate(String color){
    this.addCards(color);
  }

  public void shuffle(){
    Collections.shuffle(this.cards);
  }

  public Card draw(){
    Card card = this.cards.get(0);
    this.cards.remove(0);

    return card;
  }

  public ArrayList<Card> draw(int quantity){
    ArrayList<Card> cards = new ArrayList<>();

    for (int i = 0; i < quantity; i ++){
      cards.add(this.draw());
    }

    return cards;
  }

  public String toString(){
    return cards.toString();
  }
}
