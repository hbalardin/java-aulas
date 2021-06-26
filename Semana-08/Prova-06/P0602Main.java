import java.util.ArrayList;

public class P0602Main {
  public static void main(String[] args){
    Deck deck = new Deck(Colors.ANSI_CYAN);
    deck.duplicate(Colors.ANSI_PURPLE);

    deck.shuffle();

    ArrayList<Card> cards = deck.draw(5);
    for (Card card: cards){
      System.out.print(card + " ");
    }
  }
}
