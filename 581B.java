import java.util.Scanner;

public class B581 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long max=0;
        long[] aray=new long[a];
        for (int i=0;i<aray.length;i++)
        {
            aray[i]=sc.nextLong();

        }
        long[] array2=new long[a];
        for (int i=aray.length-1;i>=0;i--)
        {
            array2[i]=Math.max(max+1-aray[i],0);
            max=Math.max(max,aray[i]);
        }
        for (long v:array2
             ) {
            System.out.print(v+" ");
        }
    }
}
