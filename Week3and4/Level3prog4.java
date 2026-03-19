package Week3and4;
import java.util.Scanner;
public class Level3prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight,height,BMI;
        System.out.println("ENTER THE WEIGHT(KG) AND HEIGHT(CM):");
        weight=sc.nextDouble();
        height=sc.nextDouble();
        BMI=weight/((height/100)*(height/100));
        if(BMI<=18.4)
            System.out.println("Underweight");
        else if(BMI>18.4 && BMI<24.9)
            System.out.println("Normal");
        else if(BMI>=25.0 && BMI<=39.9)
            System.out.println("Overweight");
}
}
