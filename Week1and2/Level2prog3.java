package Week1and2;
import java.util.Scanner;
public class Level2prog3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        float perimeter,side;
        System.out.println("Enter the perimeter of the square:");
        perimeter=sc.nextFloat();
        side=perimeter/4;
        System.out.println("The side of the square:"+ side);
    }
}
