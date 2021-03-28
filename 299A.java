import java.util.Arrays;
import java.util.Scanner;
 
public class A299 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long[] array=new long[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        long arrayy=array[0];
        int count=0;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]%arrayy==0)
            {
                count++;
            }
        }
        if (count==array.length)
        {
            System.out.println(arrayy);
        }else {
            System.out.println("-1");
        }
    }
}
