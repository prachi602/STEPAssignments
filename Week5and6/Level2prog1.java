package Week5and6;
import java.util.Scanner;

public class Level2prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double []age= new double[3];
        double []height= new double[3];
        int pos1=0,pos2=0,i;
        double young,tall;
        System.out.println("Enter age and height for Amar:");
        age[0]=sc.nextDouble();
        height[0]=sc.nextDouble();
        System.out.println("Enter age and height for Akhbar:");
        age[1]=sc.nextDouble();
        height[1]=sc.nextDouble();
         System.out.println("Enter age and height for Anthony:");
         age[2]=sc.nextDouble();
        height[2]=sc.nextDouble();
        young=age[0];
        tall=height[0];
        for(i=0;i<age.length;i++)
        {
            if(age[i]<young)
            {
                young=age[i];
            }
            if(height[i]>tall)
            {
                tall=height[i];
            }
        }
        for(i=0;i<age.length;i++)
        {
            if(young==age[i])
                pos1=i;
            if(tall==height[i])
                pos2=i;
        }
        if(pos1==0)
            System.out.println("Amar is the Youngest with the age:"+age[0]);
        else if(pos1==1)
            System.out.println("Akhbar is the Youngest with the age:"+age[1]);
        else if(pos1==2)
            System.out.println("Anthony is the Youngest with the age:"+age[2]);
        if(pos2==0)
            System.out.println("Amar is the tallest with the height:"+height[0]);
        else if(pos2==1)
            System.out.println("Akhbar is the tallest with the height:"+height[1]);
        else if(pos2==2)
            System.out.println("Anthony is the tallest with the height:"+height[2]);
            
    }
    
}
