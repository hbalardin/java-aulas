import java.util.Random;

public class L05E04Hangman {
  private String[] words;

  private String word;

  private String mask;
  
  private int errors;

  public L05E04Hangman(){
    this.words = new String[10];

    this.words[0] = "potato";
    this.words[1] = "tomato";
    this.words[2] = "cow";
    this.words[3] = "rooster";
    this.words[4] = "carrot";
    this.words[5] = "building";
    this.words[6] = "dog";
    this.words[7] = "elephant";
    this.words[8] = "house";
    this.words[9] = "bathroom";

    Random random = new Random();
    this.word = this.words[random.nextInt(10)];

    this.mask = "";
    for (int i = 0; i < this.word.length(); i++){
      this.mask += "-";
    }

    this.errors = 0;
  }

  public void attempt(char letter){
    String mask = "";
    boolean gotcha = false;

    for (int i = 0; i < this.word.length(); i++){
      if (letter == this.word.charAt(i)){
        mask += letter;
        gotcha = true;
      } else {
        mask += this.mask.charAt(i);
      }
    }
    this.mask = mask;

    if (!gotcha){
      this.errors += 1;
    }
  }

  public boolean hasFinished(){
    for (int i = 0; i < this.mask.length(); i++){
      if (this.mask.charAt(i) != this.word.charAt(i)){
        return false;
      }
    }
    return true;
  }

  public String toString(){
    String response = "";
    for (int i = 0; i < this.mask.length(); i++){
      response += this.mask.charAt(i) + " ";
    }

    return response;
  }

  public int getErrors(){
    return this.errors;
  }
}
