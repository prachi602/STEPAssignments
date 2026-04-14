package Week7and8;

import java.util.Scanner;

public class Level1prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s1,s2,s3, perimeter,r;
        System.out.println("enter the 3 sides of the trangular park in km:");
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        s3=sc.nextDouble();
        perimeter=s1+s2+s3;
        r=rounds(perimeter);
        System.out.println("The number of rounds the athelet has to take is:"+r);
    
}
public static double rounds(double peri)
{
    return (peri/5);
}

}