import java.io.*;
import java.util.*;

class cricket {
    private String venueName;
    private String cityName;
    
    cricket(String input){
        String[] parts = input.split(", ");
        venueName = parts[0].trim();
        cityName = parts[1].trim();
    }
    public void printDetail(){
        System.out.println("Venue Name : " + venueName);
        System.out.println("City Name :  " + cityName);
    }
}

public class q6 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       cricket location = new cricket(input);
        System.out.println("Enter the venue details");
        System.out.println("Venue Details ");
        location.printDetail();
        sc.close();
    }
}