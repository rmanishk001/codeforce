
import java.util.Scanner;

public class A1140 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        //
        int count=0;
        int count2=0;
        for (int i=0;i<array.length;i++)
        {

            count2=Math.max(count2,array[i]);
            if (i==count2-1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
