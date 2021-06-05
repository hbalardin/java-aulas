import java.util.Scanner;

public class Menu {
  private String question;
  private String[] options;
  private int optionsQuantity;
  private Scanner scanner;

  public Menu(String question, int limit){
    this.question = question;
    this.options = new String[limit];
    this.optionsQuantity = 0;

    this.scanner = new Scanner(System.in);
  }

  public Menu(String question, int limit, String[] options){
    this(question, limit);

    this.add(options);
  }

  public void add(String option){
    this.options[this.optionsQuantity] = option;
    this.optionsQuantity += 1;
  }

  public void add(String[] options){
    for (int i = 0; i < options.length; i ++){
      this.add(options[i]);
    }
  }

  public String toString() {
    String response = this.question + "\n";

    for (int i = 0; i < this.optionsQuantity; i++) {
      System.out.printf("%d - %s\n", i+1, this.options[i]);
    }

    return response;
  }

  public int getOption(){
    int option = 0;

    while (option < 1 || option > this.optionsQuantity){
      System.out.print(this);
      System.out.print("Choose an option: ");
      
      option = this.scanner.nextInt();
      this.scanner.nextLine(); // to clear enter input
    }
    
    return option;
  }
}
