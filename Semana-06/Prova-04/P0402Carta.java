public abstract class P0402Carta {
  private String numero;
  private String naipe;

  P0402Carta(){};

  public void setNumero(String numero){
    this.numero = numero;
  }

  public void setNaipe(String naipe){
    this.naipe = naipe;
  }

  public String getNumero(){
    return this.numero;
  }

  public String getNaipe(){
    return this.naipe;
  }

  public abstract String toString();
}
