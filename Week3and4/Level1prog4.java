package Week3and4;
import java.util.Scanner;
public class Level1prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter a natural number:");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        if(sum==(n*(n+1))/2)
            System.out.println("The sum upto "+n+" natural numbers is:"+sum);
    }
    
}
