import java.util.Arrays;
import java.util.Scanner;
 
public class A1252 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        //
       for (int i=1;i< array.length;i++)
       {
           System.out.print(array[i]+" ");
       }
       System.out.print(array[0]);
    }
}
