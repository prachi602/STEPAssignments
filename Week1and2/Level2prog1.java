package Week1and2;
import java.util.Scanner;
public class Level2prog1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double number2 = sc.nextDouble();
        double sum = number1+number2;
        double diff= number1-number2;
        double prod= number1 * number2;
        double quo= number1/number2;
        System.out.println("The Sum of "+number1+" and "+number2+" is "+sum);
        System.out.println("The Difference of "+number1+" and "+number2+" is "+diff);
        System.out.println("The Product of "+number1+" and "+number2+" is "+prod);
        System.out.println("The Quotient of "+number1+" and "+number2+" is "+quo);
}
}