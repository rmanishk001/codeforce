
import java.util.Scanner;

public class chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    while (a>0)
    {
        int b=sc.nextInt();
        long[] array=new long[b];
        long[] array2=new long[b];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextLong();
        }
        for (int j=0;j<array.length;j++)
        {
            array2[j]=sc.nextLong();
        }
        System.out.println(ans(array,array2));

        a--;
    }
    }
    public static long min(long[] array)
    {
        long a=array[0];
        for (int i=0;i<array.length;i++)
        {
            a=Math.min(array[i],a);
        }
        return a;
    }
    public static long ans(long[] array,long[] array2)
    {
        long a=min(array);
        long b=min(array2);

        long count=0;
        for (int i=0;i<array.length;i++)
        {
            count=count+Math.max((array[i]-a),(array2[i]-b));
        }
        return count;
    }
}
