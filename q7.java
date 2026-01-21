import java.util.*;
class cricket{
    int over;
    int balls;
    int runs;
    String batsman;
    String bowler;
    String nonStriker;

    public void printDetail(){
        System.out.println("Over: " + over);
        System.out.println("Ball: " + balls);
        System.out.println("Runs: " + runs);
        System.out.println("Batsman: " + batsman);
        System.out.println("Bowler: " + bowler);
        System.out.println("NonStriker: " + nonStriker);
    }
}


public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cricket detail = new cricket();
        System.out.println("Enter the over");
        detail.over = sc.nextInt();
        System.out.println("Enter the ball");
        detail.balls = sc.nextInt();
        System.out.println("Enter the runs");
        detail.runs = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the batsman name");
        detail.batsman = sc.nextLine();
        System.out.println("Enter the bowler name");
        detail.bowler = sc.nextLine();
        System.out.println("Enter the nonStriker name");
        detail.nonStriker = sc.nextLine();

        detail.printDetail();
        sc.close();
    }
}
