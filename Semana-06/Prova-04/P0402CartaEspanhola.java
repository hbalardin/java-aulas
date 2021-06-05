import java.util.Random;

public class P0402CartaEspanhola extends P0402Carta {
  public P0402CartaEspanhola(){
    super();
    Random r = new Random();
    int numeroSorteado = r.nextInt(12) + 1;
    
    switch (numeroSorteado) {
      case 10:
        this.setNumero("Sota");
        break;
      case 11:
        this.setNumero("Cavalo");
        break;
      case 12:
        this.setNumero("Rei");
        break;
      default:
        this.setNumero(numeroSorteado + "");
    }

    int naipeSorteado = r.nextInt(4) + 1;

    switch (naipeSorteado) {
      case 1:
        this.setNaipe("ouros");
        break;
      case 2:
        this.setNaipe("espadas");
        break;
      case 3:
        this.setNaipe("copas");
        break;
      default:
        this.setNaipe("bastos");
    }
  }

  public String toString(){
    return "Carta de baralho espanhol: " + this.getNumero() + " de " + this.getNaipe();
  }
}
