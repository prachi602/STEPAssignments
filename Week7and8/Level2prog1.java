package Week7and8;
import java.util.Scanner;

public class Level2prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  i,num,sum1,sum2, prod,num_factors;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        num_factors=count_factors(num);
       int []fac=new int[num_factors];
       fac=factors(num,num_factors);
        sum1=sum(fac);
        sum2=sumsq(fac);
        prod=product(fac);
        System.out.println("The number of factors :"+num_factors);
        System.out.println("The factors of "+num+" are:");
        for(i=0;i<fac.length;i++)
        {
            System.out.println(fac[i]);
        }
        System.out.println("The sum of factors :"+sum1);
        System.out.println("The sum of square of factors :"+sum2);
        System.out.println("The product of factors :"+prod);


    }
    public static int count_factors(int n) {
        int i,c=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        return c;
        
    }
    public static int [] factors(int n,int c)
    {
        int []f=new int[c];
        int i,j=0;
        for(i=1;i<=n;i++)
         {
            if(n%i==0)
                f[j++]=i;
         }
         return f;

    }
    public static int sum(int []arr)
    {
        int i,sum=0;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int sumsq(int []array)
    {
        int i,s=0;
        for(i=0;i<array.length;i++)
        {
            s=s+(int)Math.pow(array[i],2);
        }
        return s;
    }
    public static int product(int []a)
    {
        int i,p=1;
        for(i=0;i<a.length;i++)
        {
            p=p*a[i];
        }
        return p;
    }
}