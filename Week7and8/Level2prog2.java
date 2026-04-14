package Week7and8;
import java.util.Scanner;

public class Level2prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,i,sum1=0,sum2=0;
        System.out.println("Enter a natural number:");
        num=sc.nextInt();
        if(num>0)
        {
            for(i=1;i<=num;i++)
            {
                sum1=recursion(sum1,i);
            }
            sum2=sum(num);
            if(sum1==sum2)
            {
                System.out.println("The sum of natural numbers till "+num+" comes same from both recursion and formula method and is equal to "+sum1);

            }
        }
    }
        public static int recursion(int s,int n)
        {
            return(s+n);
        }
        public static int sum(int number)
        {
            return (number*(number+1))/2;
        }

    }
    
