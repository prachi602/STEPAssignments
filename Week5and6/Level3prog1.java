package Week5and6;
import java.util.Scanner;

public class Level3prog1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num, i,j,k=0,d;
        int []arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(j=0;j<arr.length;j++)
        {
            k=0;
         for(i=num;i>0;i=i/10)
         {
            d=i%10;
            if(arr[j]==d)
            {
                k++;
            }
           
         }
         System.out.println("The frequency of digit "+arr[j]+" is:"+k);

        }
    }
}

        