package Week5and6;
import java.util.Scanner;

public class Level2prog3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num,c=0,i;
    System.out.println("Enter a number:");
    num=sc.nextInt();
    for(i=num;i>0;i=i/10)
    {
      c++;
    }
    int []arr=new int [c];
    c=0;
    for(i=num;i>0;i=i/10)
    {
       arr[c++]=i%10;
    }
    for(i=0;i<arr.length;i++)
    {
       System.out.println("Digit "+(i+1)+" :"+arr[i]);
    }
}
    
}

