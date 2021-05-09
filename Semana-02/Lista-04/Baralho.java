public class Baralho {
  String[] cartas = new String[52];

  Baralho(){
    char[] naipes = {'c', 'o', 'e', 'p'};

    for(int n = 1; n <= 4; n++){
      char naipe = naipes[n - 1];

      for(int c = 0; c < 9; c++) {
        int pos = ((n - 1) * 13) + c;
        
        int numero = pos % 13 + 2;
        String nome = "" + numero;
        
        Carta carta = new Carta(nome, naipe);
        this.cartas[pos] = carta.mostrar();
      }
      
      int pos = ((n - 1 ) * 13) + 9;
      Carta carta = new Carta("J", naipe);
      this.cartas[pos] = carta.mostrar();

      pos += 1;
      carta = new Carta("Q", naipe);
      this.cartas[pos] = carta.mostrar();
      
      pos += 1;
      carta = new Carta("K", naipe);
      this.cartas[pos] = carta.mostrar();
      
      pos += 1;
      carta = new Carta("A", naipe);
      this.cartas[pos] = carta.mostrar();
    }
  }

  void mostrar() {
    for (String carta: this.cartas){
      System.out.println(carta);
    }
  }
}
