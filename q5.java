import java.util.Scanner;

class cricket {
     private String name;
     private String country;
     private String skill;
    
   cricket(String input) {
        String[] parts = input.split(",");
        name = parts[0].trim();
        country = parts[1].trim();
        skill = parts[2].trim();
    }
    public void printDetail(){
       
        System.out.println("Player Name : " + name);
        System.out.println("Country Name :  " + country);
        System.out.println("Skill :  " + skill);
    }
}
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String det = sc.nextLine();
        cricket player  = new cricket(det);
        System.out.println("Enter the player details");
        System.out.println("Player Details ");
        
        player.printDetail();
        sc.close();
    }
 }
