import java.util.*;

class cricket{
    private String team;
    private String coach;
    private String location;
    private String players;
    private String captain;
     
    cricket (String input){
        String[] parts = input.split("#");
        team = parts[0].trim();
        coach = parts[1].trim();
        location = parts[2].trim();
        players = parts[3].trim();
        captain = parts[4].trim();
    }
    public void printDetail(){
        System.out.println("Enter the team details");
        System.out.println("Team: " + team);
        System.out.println("Coach: "+  coach);
        System.out.println("Location: " + location);
        System.out.println("Players: "+  players);
        System.out.println("Captain: "  + captain);
    }
}


public class q8 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   String input = sc.nextLine();
   cricket detail = new cricket(input);
   detail.printDetail();

    sc.close();
   }
}
