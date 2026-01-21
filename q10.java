import java.util.Scanner;

class car{
    String brand;
    String model;
    int year;
    double price;
    double engine;
    car( String brand , String model, int year, double price, double engine){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }
    public void printDetail(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " +"$" + price);
        System.out.println("Engine Capacity: " + engine +" L");
    }
}
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the brand of the car:");
        String brand = sc.nextLine();
        System.out.println("Enter the model of the car:");
        String model = sc.nextLine();
        System.out.println("Enter the year of manufacture:");
        int year = sc.nextInt();
        System.out.println("Enter the price of the car:");
        double price = sc.nextDouble();
        System.out.println("Enter the engine capacity of the car:");
        double engine = sc.nextDouble();
        if (year >1985 && price > 0 && engine > 0) {
             car detail  = new car(brand, model, year, price, engine);
            System.out.println("Car Details: ");
            detail.printDetail();
        }
        else{
            System.out.println("Invalid Input ");
        }
        sc.close();
    }
}
