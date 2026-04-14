package Week7and8;

import java.util.Scanner;

public class Level1prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberStudents, handshakes;
        System.out.println("Enter number of students:");
        numberStudents=sc.nextInt();
        handshakes=HandShake(numberStudents);
        System.out.println("The possible number of handshakes:"+handshakes);
    }
    public static int HandShake(int n)
    {
        int hs;
        hs =(n*(n-1))/2;
        return hs;
    }
    
}
