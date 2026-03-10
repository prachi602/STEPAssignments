package Week1and2;

import java.util.Scanner;
public class Level2prog2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double base, height,area;
        System.out.println("Enter the base of triangle:");
        base=sc.nextDouble();
        System.out.println("Enter the height of triangle:");
        height=sc.nextDouble();
        area=(0.5*base)*height;
        System.out.println("Area of triangle in square inches is"+(area*0.155)+"and in square cm is "+(area));

    }
    
}
