package Week5and6;
import java.util.Scanner;

public class Level1prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []table=new int[10];
        int num,i;
        System.out.println("Enter a number whose table you want to display:");
        num=sc.nextInt();
        for(i=0;i<table.length;i++)
        {
          table[i]=num*(i+1);
        }
        System.out.println("The table of "+num+":");
        for(i=0;i<table.length;i++)
        {
          System.out.println(num+"*"+(i+1)+"="+table[i]);
          
        }
    }
    
}
