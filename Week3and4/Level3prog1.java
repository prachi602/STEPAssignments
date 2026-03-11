package Week3and4;
import java.util.Scanner;
public class Level3prog1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num,i,c=0;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
                c++;
        }
        if(c>2)
            System.out.println("Not a prime number");
        else
            System.out.println("It's a prime number");
    }
    
}
