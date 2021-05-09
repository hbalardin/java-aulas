/*
  I really wanted to write this code in english but I dunno
  how to write the cards names and "naipes".
*/
public class Carta {
  String nome;
  char naipe;

  Carta(String nome, char naipe) {
    this.nome = nome;
    this.naipe = naipe;
  }

  String mostrar() {
    String carta = nome + naipe;
    return carta;
  }
}
