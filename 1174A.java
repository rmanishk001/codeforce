import java.util.Arrays;
import java.util.Scanner;
 
public class A1174 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[2*a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        //
        int count=0;
        for (int i=0;i< array.length;i++)
        {
            if (array[0]==array[i])
            {
                count++;
            }
        }
        //
        if (count== array.length)
        {
            System.out.println("-1");
        }else {
            Arrays.sort(array);
            for (int i=0;i< array.length;i++)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
}
