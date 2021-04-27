import java.util.Scanner;

class Exercise0309 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String[] teams = new String[4];
  
    System.out.print("1 - Enter a soccer team name: ");
    String firstTeam = scanner.next();
    teams[0] = firstTeam;
  
    System.out.print("2 - Enter a soccer team name: ");
    String secondTeam = scanner.next();
    teams[1] = secondTeam;
  
    System.out.print("3 - Enter a soccer team name: ");
    String thirdTeam = scanner.next();
    teams[2] = thirdTeam;
  
    System.out.print("4 - Enter a soccer team name: ");
    String fourthTeam = scanner.next();
    teams[3] = fourthTeam;

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