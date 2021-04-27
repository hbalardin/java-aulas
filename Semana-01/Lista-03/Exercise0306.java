import java.util.Scanner;
 
class Exercise0306 {
  public static void main(String[] args){  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first 9 numbers of your cpf: ");
    String cpfString = scanner.next();
    scanner.close();

    int firstDigit = 0;
    int secondDigit = 0;

    int[] digits = new int[9];
    
    for (int i = 0; i < digits.length; i++) {
      digits[i] = Integer.parseInt(cpfString.substring(i, i + 1));
    }

    int[] firstBase = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };

    int[] firstProducts = new int[9];
    for (int i = 0; i < firstProducts.length; i++){
      firstProducts[i] = (firstBase[i] * digits[i]);
    }

    int firstProductsSum = 0;
    for (int product: firstProducts){
      firstProductsSum += product;
    }

    int firstSumRest = firstProductsSum % 11;
    if (firstSumRest < 2){
      firstDigit = 0;
    }
    else {
      firstDigit = 11 - firstSumRest;
    }

    cpfString += firstDigit;

    int[] newDigits = new int[10];
    for (int i = 0; i < newDigits.length; i++){
      newDigits[i] = Integer.parseInt(cpfString.substring(i, i + 1));
    }

    int[] secondBase = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

    int[] secondProducts = new int[10];
    for (int i = 0; i < secondProducts.length; i++){
      secondProducts[i] = (secondBase[i] * newDigits[i]);
    }

    int secondProductsSum = 0;
    for (int i = 0; i < secondProducts.length; i++){
      secondProductsSum += secondProducts[i];
    }

    int secondSumRest = secondProductsSum % 11;
    if (secondSumRest < 2){
      secondDigit = 0;
    }
    else {
      secondDigit = 11 - secondSumRest;
    }

    cpfString += secondDigit;

    String cpf1 = cpfString.substring(0, 3);
    String cpf2 = cpfString.substring(3, 6);
    String cpf3 = cpfString.substring(6, 9);
    String cpf4 = cpfString.substring(9, 11);

    System.out.print("Your complete CPF é: " + cpf1 + "." + cpf2 + "." + cpf3 + "-" + cpf4);
  }
}
