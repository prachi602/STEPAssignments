package Week3and4;
import java.util.Scanner;

public class Level2prog2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double salary,year,bonus;
        System.out.println("Enter the salry and year of service:");
        salary=sc.nextDouble();
        year=sc.nextDouble();
        if(year>=5)
        {
            bonus=5;
        }
        else 
            bonus=0;
        System.out.println("The salary:"+salary+"\n The serive year:"+year+"\nTHe bonus:"+bonus+"%");


    }
    
}
