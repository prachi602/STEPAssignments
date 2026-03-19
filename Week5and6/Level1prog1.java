package Week5and6;
import java.util.Scanner;
public class Level1prog1 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int[] age=new int[10];
        int i;
        System.out.println("Enter the age for 10 students");
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the age for student "+(i+1)+":");
            age[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(age[i]>=18)
            {
                System.out.println("The student "+(i+1)+" with age "+age[i]+" is eligible to vote.");
            }
            else
            {
                System.out.println("The student "+(i+1)+" with age "+age[i]+" is not eligible to vote.");
            }
        }
    }
}
