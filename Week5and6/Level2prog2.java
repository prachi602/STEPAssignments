package Week5and6;
import java.util.Scanner;

public class Level2prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,digit,i,c=0,maxDigit=10,largest,second_largest,pos1=0,pos2=0;
        int [] arr=new int[maxDigit];
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(i=num;i>0;i=i/10) 
        {
           digit=i%10;
           arr[c]=digit;
           c++;
        }
        maxDigit=c;
        largest=arr[0];
        for(i=0;i<=maxDigit;i++)
        {
          if(arr[i]>=largest)
          {
            largest=arr[i];
            pos1=i;
          }
        }
        second_largest=arr[pos1+1];
        for(i=0;i<=maxDigit;i++)
        {
          if(i!=pos1 && arr[i]>second_largest && arr[i]<=largest)
          {
            second_largest=arr[i];
          }
        }
        System.out.println("The largest digit:"+largest+" at position "+(pos1+3));
        System.out.println("The second largest number is :"+second_largest+" at position "+(pos2+3));
        }
    }
