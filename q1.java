import java.util.Scanner;

// create a new class//
class cricket {
    String name;
    String countryName;
    String skill;
    public void printDetail(){
       
        System.out.println("Player Name : " + name);
        System.out.println("Player Country : " + countryName);
        System.out.println("Player Skill : " + skill);
    }
}

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cricket player = new cricket();
         System.out.println("Enter the player name");
        System.out.println("Enter the Country name");
        System.out.println("Enter the skill");
        player.name = sc.nextLine();
        player.countryName = sc.nextLine();
        player.skill = sc.nextLine();
        player.printDetail();
        sc.close();
    }
}