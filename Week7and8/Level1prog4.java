package Week7and8;
import java.util.Scanner;

public class Level1prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num=sc.nextInt();
        if(check(num)==0)
            System.out.println("The integer entered is a zero");
        else if(check(num)==1)
            System.out.println("The integer entered is positive");
        else
            System.out.println("The integer entered is negative");
    }
    public static int check(int n)
    {
        if(n==0)
            return 0;
        else if(n>0)
            return 1;
        else
            return -1;
    }
    
}
