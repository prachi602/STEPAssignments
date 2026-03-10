package Week1and2;
import java.util.Scanner;

public class Level3prog1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double celcius,fahrenheit;
        System.out.println("Enter the temp in celcius:");
        celcius=sc.nextDouble();
        fahrenheit=(celcius*(9/5))+32;
        System.out.println("The temperature in fahrenheit is: "+fahrenheit);
     }
    
}
