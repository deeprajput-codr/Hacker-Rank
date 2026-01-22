import java.util.Scanner;

class inning{
    String inn_1_name ;
    Long inn_1_run ;
    String inn_2_name ;
    Long inn_2_run ;

    public void inning_1(){
        System.out.println("BattingTeam: " + inn_1_name);
        System.out.println("Runs scored: " + inn_1_run);
    }
    public void inning_2(){
        System.out.println("BattingTeam: " + inn_2_name);
        System.out.println("Runs scored: " + inn_2_run);
    }
}

public class q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inning scoreBoard = new inning();
        System.out.println("Enter the values for Innings 1");
        System.out.println("Enter the BattingTeam");
        scoreBoard.inn_1_name = sc.nextLine();
        System.out.println("Enter the runs scored");
        scoreBoard.inn_1_run = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the values for Innings 2");
        System.out.println("Enter the BattingTeam");
        scoreBoard.inn_2_name = sc.nextLine();
        System.out.println("Enter the runs scored");
        scoreBoard.inn_2_run = sc.nextLong();
        System.out.println("Innings 1 Details");
        scoreBoard.inning_1();
        System.out.println("Innings 2 Details");
        scoreBoard.inning_2();
        sc.close();
    }
}
