
import java.util.Arrays;
import java.util.Scanner;

public class A1535 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            int[] array=new int[4];
            int b=sc.nextInt();
            array[0]=b;
            int c=sc.nextInt();
            array[1]=c;
            int d=sc.nextInt();
            array[2]=d;
            int e=sc.nextInt();
            array[3]=e;
            Arrays.sort(array);
            int f=0;
            int s=0;
            if (b>c)
            {
                f=b;
            }else {
                f=c;
            }
            if (d>e)
            {
                s=d;
            }else {
                s=e;
            }
            if (array[array.length-2]==f && array[array.length-1]==s || array[array.length-2]==s && array[array.length-1]==f)
            {
               System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
