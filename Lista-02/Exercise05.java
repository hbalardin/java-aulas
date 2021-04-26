import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class Exercise05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    decimalFormat.setRoundingMode(RoundingMode.CEILING);

    System.out.print("Enter a grade between 0 and 10: ");
    double grade = scan.nextDouble();

    String roundedGrade = decimalFormat.format(grade);

    System.out.print("The rounded grade is: " + roundedGrade);
  }
}
