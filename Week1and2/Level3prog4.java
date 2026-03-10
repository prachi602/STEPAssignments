package Week1and2;
import java.util.Scanner;
public class Level3prog4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2,swap;
        System.out.println("Enter the two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        swap=num1;
        num1=num2;
        num2=swap;
        System.out.println("THe numbers after swapping are:"+num1+" "+num2);
    }
}