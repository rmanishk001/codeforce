
import java.util.Scanner;

public class A1152 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        long[] array=new long[n];
        long[] array2=new long[m];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextLong();
        }
        //
        for (int i=0;i< array2.length;i++)
        {
            array2[i]=sc.nextLong();
        }
        //
        int c0=0;
        int c1=0;
        for (int i=0;i< array.length;i++)
        {
            if (array[i]%2==0)
            {
                c0++;
            }else {
                c1++;
            }
        }
        //
        int k1=0;int k2=0;
        for (int i=0;i< array2.length;i++)
        {
            if (array2[i]%2==0)
            {
                k1++;
            }else {
                k2++;
            }
        }
        int ans=Math.min(c0,k2)+Math.min(c1,k1);
        System.out.println(ans);
    }
}
