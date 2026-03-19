package Week3and4;
import java.util.Scanner;
public class Level3prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,i,digit,sum=0;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        i=num;
        while(i>0)
        {
            digit=i%10;
            sum=sum+((digit*digit)*digit);
            i=i/10;
        }
        if(sum==num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
    
}
