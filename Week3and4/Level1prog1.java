package Week3and4;
import java.util.Scanner;
public class Level1prog1 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        if(num%5==0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not divisible by 5");
    }
    
}
