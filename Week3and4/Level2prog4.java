package Week3and4;
import java.util.Scanner;
public class Level2prog4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i;
        System.out.println("Enter number:");
        num=sc.nextInt();
        if(num>0)
        {
            for(i=1;i<=num;i++)
            {
                if((i%3==0)&&(i%5==0))
                {
                    System.out.println("FIZZBUZZ");
                }
                else if(i%5==0)
                {
                    System.out.println("BUZZ");
                }
                else if(i%3==0)
                {
                    System.out.println("FIZZ");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }
    
}
