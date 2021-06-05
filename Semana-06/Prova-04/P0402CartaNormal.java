import java.util.Random;

public class P0402CartaNormal extends P0402Carta {
  public P0402CartaNormal(){
    super();
    Random r = new Random();
    int numeroSorteado = r.nextInt(13) + 1;
    
    switch (numeroSorteado) {
      case 1:
        this.setNumero("A");
        break;
      case 11:
        this.setNumero("J");
        break;
      case 12:
        this.setNumero("Q");
        break;
      case 13:
        this.setNumero("K");
        break;
      default:
        this.setNumero(numeroSorteado + "");
    }

    int naipeSorteado = r.nextInt(4) + 1;

    switch (naipeSorteado) {
      case 1:
        this.setNaipe("♠");
        break;
      case 2:
        this.setNaipe("♥");
        break;
      case 3:
        this.setNaipe("♦");
        break;
      default:
        this.setNaipe("♣");
    }
  }

  public String toString(){
    return "Carta de baralho normal: " + this.getNumero() + this.getNaipe();
  }
}
