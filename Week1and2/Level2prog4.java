package Week1and2;
import java.util.Scanner;
public class Level2prog4{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double dis_feet,dis_miles,dis_yards;
    System.out.print("Enter distance in feets:");
    dis_feet=sc.nextDouble();
    dis_miles=dis_feet/5280;
    dis_yards=dis_feet/3;
    System.out.print("\n Distance in miles is "+dis_miles+"and in yards is:"+dis_yards);
}
}
