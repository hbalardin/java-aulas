import java.util.Scanner;

class BytesExercise {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    System.out.print("Enter Byte number: ");
    int receivedBytes = scan.nextInt();

    double kbytes = receivedBytes / 1024.0;
    double mbytes = kbytes / 1024.0;
    double b = receivedBytes * 8;
    double kb = b / 1024.0;
    double mb = kb / 1024.0;

    System.out.println(receivedBytes + " bytes = " + kbytes + " KB");
    System.out.println(receivedBytes + " bytes = " + mbytes + " MB");
    System.out.println(receivedBytes + " bytes = " + b + " bits");
    System.out.println(receivedBytes + " bytes = " + kb + " Kb");
    System.out.println(receivedBytes + " bytes = " + mb + " Mb");
  }
}