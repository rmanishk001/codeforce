import java.util.Scanner;

public class B242 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long[] array=new long[a];
        long[] array2=new long[a];
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        for (int i=0;i<a;i++)
        {
            array[i]=sc.nextLong();
            array2[i]=sc.nextLong();
            min=Math.min(array[i],min);
            max=Math.max(array2[i],max);
        }
        System.out.println(ans(min,max,array,array2));
    }
    public static long ans(long a,long b,long[] array,long[] array2)
    {
        long ans=-1;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]==a && array2[i]==b)
            {
                return i+1;
            }
        }
        return ans;
    }
}
