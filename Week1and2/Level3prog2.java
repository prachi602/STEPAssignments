package Week1and2;
import java.util.Scanner;

public class Level3prog2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double salary,bonus;
        System.out.print("Enter the salary: ");
        salary=sc.nextDouble();
        System.out.print("Enter the bonus: ");
        bonus=sc.nextDouble();
        System.out.println("\nThe salary is INR "+salary+"and the bonus is INR "+bonus+"\nHence the total income is INR  "+(salary+bonus));
     }
    
}
