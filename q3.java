import java.util.Scanner;
class cricket{
    Long over;
    Long ball;
    Long runs;
    String bowlerName;
    String batsmanName;
    String nonStriker;
    public void printDetail(){
        System.out.println("Over : " + over);
        System.out.println("Ball : " + ball);
        System.out.println("Runs : " + runs);
        System.out.println("Batsman : " + batsmanName);
        System.out.println("Bowler : " + bowlerName);
        System.out.println("NonStriker : " + nonStriker);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cricket detail = new cricket();
        System.out.println("Enter the over");
        System.out.println("Enter the ball");
        System.out.println("Enter the runs");
        System.out.println("Enter the batsman name");
        System.out.println("Enter the bowler name");
        System.out.println("Enter the nonStriker name");
        System.out.println("Delivery Details :");
        detail.over = sc.nextLong();
        detail.ball = sc.nextLong();
        detail.runs = sc.nextLong();
        sc.nextLine();
        detail.batsmanName = sc.nextLine();
        detail.bowlerName = sc.nextLine();
        detail.nonStriker = sc.nextLine();

        detail.printDetail();
        sc.close();
    }
}
