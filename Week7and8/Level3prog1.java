package Week7and8;
import java.util.Scanner;

public class Level3prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []height=new int[11];
        int i,sum=0,shortest,tallest;
        double mean;
        for(i=0;i<height.length;i++)
        {
            height[i]=(int)((Math.random()*250)+150); //filling the height array with random height values in cms from 150 to 250 cms using Math function 
        }
        sum=Sum(height);
        mean=Mean(sum);
        shortest=Short(height);
        tallest=Tall(height);
        System.out.println("The sum of height of 11 players:"+sum);
        System.out.println("The mean of height of 11 players:"+mean);
        System.out.println("The shortest height of 11 players:"+shortest);
        System.out.println("The tallest height of 11 players:"+tallest);
    }
    public static int Sum(int[]arr)
    {
        int i,s=0;
        for(i=0;i<arr.length;i++)
        {
            s=s+arr[i];
        }
        return s;
    }
    public static double Mean(int sum)
    {
        return(sum/11.0);
    }
    public static int Short(int []ht)
    {
        int shortest,i;
        shortest=ht[0];
       for(i=0;i<ht.length;i++)
       {
          if(ht[i]<shortest)
          {
            shortest=ht[i];
          }
       }
       return shortest;
    }
    public static int Tall(int[] htt)
    {
        int i,tallest;
        tallest=htt[0];
        for(i=0;i<htt.length;i++)
        {
            if(htt[i]>tallest)
            {
                tallest=htt[i];
            }
        }
        return tallest;
    }
}