package Week1and2;
import java.util.Scanner;

public class Level3prog3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fromcity,viacity,tocity, name;
        double dis_fromtovia, dis_viatofinal, time_fromtovia , time_viatofinal;
        System.out.println("Enter the name of traveller:");
        name=sc.nextLine();
        System.out.println("Enter the city user starts travelling from:");
        fromcity=sc.nextLine();
        System.out.println("Enter the city user travells via:");
        viacity=sc.nextLine();
        System.out.println("Enter the city user travells to:");
        tocity=sc.nextLine();
        System.out.println("Enter the distance(km) and time(hours) taken from initial city to via city:");
        dis_fromtovia=sc.nextDouble();
        time_fromtovia=sc.nextDouble();
        System.out.println("Enter the distance(km) and time(hours) taken from via to final city:");
        dis_viatofinal=sc.nextDouble();
        time_viatofinal=sc.nextDouble();
        System.out.println("The total distance(km) travelled by "+name+" from "+fromcity+" to "+tocity+" via "+viacity+" is "+(dis_fromtovia+dis_viatofinal)+" and the total time(hours) taken is "+(time_fromtovia+time_viatofinal));




    }
    
}
