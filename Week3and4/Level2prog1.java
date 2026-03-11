package Week3and4;
import java.util.Scanner;

public class Level1prog1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num,c=1,k=1;
        System.out.println("Enter the number limit: ");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                System.out.println("The "+(c++)+"even number is :"+i);
            }
            else 
                System.out.println("The "+(k++)+"odd bnumber is :"+i);

        }



    }

    
}
