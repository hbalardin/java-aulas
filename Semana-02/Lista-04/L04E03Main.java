import java.util.Scanner;

public class L04E03Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("------ Fitness person IMC ------ ");

    System.out.print("Enter height: ");
    double height = scanner.nextDouble();

    System.out.print("Enter weight: ");
    double weight = scanner.nextDouble();
    
    FitnessPerson fitnessPerson = new FitnessPerson(height, weight);
    
    double imc = 0;
    imc = fitnessPerson.calculateIMC();
    System.out.println("Fitness Person IMC is: " + imc);

    System.out.print("Enter weight gain: ");
    double kilos = scanner.nextDouble();
    
    while (kilos != 0) {
      fitnessPerson.weightGain(kilos);
      imc = fitnessPerson.calculateIMC();

      System.out.println("Fitness Person new IMC is: " + imc);

      System.out.print("Enter weight gain: ");
      kilos = scanner.nextDouble();
    }
    scanner.close();
  }
}
