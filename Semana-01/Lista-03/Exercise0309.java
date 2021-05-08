import java.util.Scanner;

class Exercise0309 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String[] teams = new String[4];

    for (int i = 0; i < teams.length; i++) {
      int n = i + 1;
      System.out.print(n + " - Enter a soccer team name: ");
      String team = scanner.nextLine();
      teams[i] = team;
    }

    scanner.close();

    System.out.println("Confrontations:");
    System.out.println("--------------------------");

    for (int i = 0; i < teams.length - 1; i++){
      String team = teams[i];
      for (int j = i + 1; j < teams.length; j++){
        String nextTeam = teams[j];
        System.out.println(team + " X " + nextTeam);
      }
    }
  }
}