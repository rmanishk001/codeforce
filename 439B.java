

import java.util.Arrays;
import java.util.Scanner;

public class B439 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long b=sc.nextInt();
        long[] array=new  long[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        long count=0;
        for (int i=0;i<array.length;i++)
        {
count+=array[i]*b;
if (b>1)
{
    b--;
}
        }
        System.out.println(count);
    }
}
