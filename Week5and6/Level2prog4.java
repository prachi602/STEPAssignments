package Week5and6;
import java.util.Scanner;

public class Level2prog4 {
    public static void main(String args[])
    {
        int students,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the number of students:");
        students=sc.nextInt();
        int []arr=new int[students];
        double []marks=new double[3];
        double percentage;
        for(i=0;i<arr.length;i++){
            System.out.println("Enter the marks for physics ,chemistry,maths for student "+(i+1));
           System.out.println("Enter marks for physics:");
            marks[0]=sc.nextInt();
            System.out.println("Enter marks for chemistry:");
            marks[1]=sc.nextInt();
            System.out.println("Enter marks for maths:");
            marks[2]=sc.nextInt();
           percentage=(marks[0]+marks[1]+marks[2])/3.0;
           System.out.println("marks for physics:"+marks[0]);
           System.out.println("marks for chemistry:"+marks[1]);
           System.out.println("marks for maths:"+marks[2]);
           System.out.println("Percentage:"+percentage);
           if(percentage>=80)
            System.out.println("A");
        else if(percentage>=70 && percentage<=79)
            System.out.println("B");
        else if(percentage>=60 && percentage<=69)
            System.out.println("C");
        else if(percentage>=50 && percentage<=59)
            System.out.println("D");
        else if(percentage>=40 && percentage<=49)
            System.out.println("E");
        else
            System.out.println("R");
        }
    }    
}
