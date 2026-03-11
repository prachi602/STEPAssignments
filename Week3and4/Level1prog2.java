package Week3and4;

import java.util.Scanner;

public class Level1prog2 {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int month,day;
      System.out.println("Enter the month and day number:");
      month=sc.nextInt();
      day=sc.nextInt();
      if(month>12 || day>31)
      {
        System.out.println("Invalid entry of month/day , recheck");
      }
      else
      {
        if((month==3 && day>=20)||(month==4)||(month==5)||(month==6 && day<=20))
          System.out.println("It's Spring Season");
        else
          System.out.println("Not the Spring Season");
      }
    }
    
}
