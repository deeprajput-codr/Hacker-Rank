import java.util.*;

class cricket{
    String inning;
    String team;
    Long score;
    public void printDetail(){
        System.out.println("Innings number : " + inning);
        System.out.println("BattingTeam :" + team);
        System.out.println("Runs scored :" + score);
    }
}
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cricket detail = new cricket();
        System.out.println("Enter the innings number");
        System.out.println("Enter the BattingTeam");
        System.out.println("Enter the runs scored");
        System.out.println("Innings Details :");

        detail.inning = sc.nextLine();
        detail.team = sc.nextLine();
        detail.score = sc.nextLong();

        detail.printDetail();
        sc.close();
    }
}
