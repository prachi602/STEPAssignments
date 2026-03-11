package Week3and4;
import java.util.Scanner;
public class Level1prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num,sum=0.0;
        int i;
        System.out.println("Enter 0 to indicate the end ");
        i=1;
        while(true)
        {
            System.out.println("Enter "+i+"th number for addition");
            num=sc.nextInt();
            if(num==0)
                break;
            else
             sum=sum+num;
            i++;
            
        }
        System.out.println("The sum is:"+sum);
    }
    
}
