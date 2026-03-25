package Week5and6;
import java.util.Scanner;

public class Level1prog2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int []num=new int[5];
        int i;
        System.out.println("Enter 5 numbers:");
        for(i=0;i<num.length;i++)
        {
            System.out.println("Enter "+(i+1)+"number:");
            num[i]=sc.nextInt();
        }
        for(i=0;i<num.length;i++)
        {
            if(num[i]==0)
                System.out.println((i+1)+" number is:Zero");
            else if(num[i]<0)
                System.out.println((i+1)+" number is:Negative");
            else
            {
                System.out.println((i+1)+" number is:Positive");
                if(num[i]%2==0)
                    System.out.println((i+1)+" number is:Even");
                else
                    System.out.println((i+1)+" number is:Odd");
            }

        }
        if(num[0]==num[num.length-1])
            System.out.println("Number at 1st and last position matches");
        else
            System.out.println("Number at 1st and last position does not match");
    }
    
}
