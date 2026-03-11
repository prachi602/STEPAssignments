package Week3and4;
import java.util.Scanner;
public class Level3prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,i,sum=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>num)
            System.out.println("Abundant Number");
        else
            System.err.println("Not Abundant");
    }
    
}
