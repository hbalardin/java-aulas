import java.util.Random;

public class P0402Main {
  public static void main(String[] args){
    P0402Carta[] cartas = new P0402Carta[3];
    
    for (int i = 0; i < cartas.length; i++){
      Random r = new Random();
      int cartaSorteada = r.nextInt(2);

      if (cartaSorteada == 1){
        cartas[i] = new P0402CartaNormal();
      } else {
        cartas[i] = new P0402CartaEspanhola();
      }
    }

    for (P0402Carta carta: cartas){
      System.out.println(carta);
    }
  }
}
