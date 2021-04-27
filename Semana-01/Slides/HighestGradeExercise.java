import java.util.Scanner;

class HighestGradeExercise {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter 1° grade: ");
    double firstGrade = scan.nextFloat();

    System.out.print("Enter 2° grade: ");
    double secondGrade = scan.nextFloat();

    if (firstGrade > secondGrade) {
      System.out.println("1° grade is higher than second.");
    } else if (firstGrade < secondGrade) {
      System.out.println("1° grade is less than second.");
    } else {
      System.out.println("Two grades are equals.");
    }
  } 
}
