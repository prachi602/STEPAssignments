package Week7and8;

import java.util.Scanner;

public class Level1prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principal,rate,time,interest;
        System.out.println("Enter the principal,rate per annum and time(in years):");
        principal=sc.nextDouble();
        rate=sc.nextDouble();
        time=sc.nextDouble();
        interest=simpleinterest(principal,rate,time);
        System.out.println("The Simple Interest is "+interest+" for the principal "+principal+" and rate of interest "+rate+" and time "+time+ " .");
    }
    public static double simpleinterest(double p,double r,double t)
    {
        double SI= ((p*r)*t)/100;
        return SI;
    }
    
}
