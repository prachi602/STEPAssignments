package Week5and6;
import java.util.Scanner;

public class Level1prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double []arr=new double[10];
        double sum=0.0;
        int i;
        System.out.println("Enter zero to terminate the filling of numbers");
        i=0;
        while(true)
        {
            if(i==10)
                 break;
            else
           {
             System.out.println("Enter "+(i+1)+" number:");
             arr[i]=sc.nextDouble();
             if(arr[i]==0)
             {
                arr[i]=0;
                break;
             }
            }
            i++;
        } 
        for(i=0; (arr[i]!=0);i++)
        {
            System.out.println((i+1)+" number:"+arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("Sum :"+sum);
    }
    
}
