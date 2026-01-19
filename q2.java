import java.util.*;

class sportEvent{
    String venue;
    String city;

    public void printDetail(){
        System.out.println("Venue Name : " + venue);
        System.out.println("City Name : " + city);
        System.out.println(venue);
    }
}
public class q2 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        sportEvent detail = new sportEvent();
        System.out.println("Enter the venue name");
        System.out.println("Enter the city name");
        System.out.println("Venue Details");
        detail.venue = sc.nextLine();
        detail.city = sc.nextLine();
        detail.printDetail();
        sc.close();
    }
}
