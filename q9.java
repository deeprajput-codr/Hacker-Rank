import java.util.Scanner;

class laptop {
    String brand;
    String processor;
    String os;
    Long range;
    Long ram;
    public void printDetail(){
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Processor Name: " + processor);
        System.out.println("OS: " + os);
        System.out.println("Processor Range: " + range +" bit");
        System.out.println("Ram: " + ram + " GB");
    }
    
}

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        laptop detail = new laptop();
        System.out.println("Enter the brand of the laptop:");
        detail.brand = sc.nextLine();
        System.out.println("Enter the processor of the laptop:");
        detail.processor = sc.nextLine();
        System.out.println("Enter the OS of the laptop:");
        detail.os = sc.nextLine();
        System.out.println("Enter the processor range of the laptop:");
        detail.range = sc.nextLong();
        System.out.println("Enter the ram size of the laptop:");
        detail.ram = sc.nextLong();
       
        if (detail.range > 0 || detail.ram >0) {
             System.out.println("Laptop Details:");
             detail.printDetail();
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
