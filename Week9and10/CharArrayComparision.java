import java.util.Scanner;
public class CharArrayComparision{
    public static char[] charAtArray(String str)
    {
        char[] carray= new char[str.length()];
        for(int i=0;i<carray.length;i++)
        {
            carray[i]=str.charAt(i);
        }
        return carray;
    }
    public static boolean compareArray(char[] arr1,char[] arr2)
    {
        if(arr1.length!=arr2.length)
        {
            return false;
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
      }
      public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
         String str=sc.next();
         char[] arr1=new char[str.length()];
         char[]arr2=new char[str.length()];
         arr1=charAtArray(str);
         arr2=str.toCharArray();
         boolean result=compareArray(arr1, arr2);
         System.out.println("Character array from user-defined charAt method:");
            for(char c: arr1)
                System.out.println(c+" ");
        System.out.println("Character array from user-defined charAt method:");
            for(char c: arr2)
                 System.out.println(c+" ");
            System.out.println("Are to two arrays same? "+result);    

      }
}