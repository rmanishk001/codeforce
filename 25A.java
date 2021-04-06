
import java.util.Scanner;

public class A25 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        int c=0;
        int d=0;
        int f=0;
        int l=0;
        for (int i=0;i<a;i++)
        {
            array[i]=sc.nextInt();
            if (array[i]%2==0) {
                c++;
                f = i;
            }else {
                d++;
                l=i;
            }
        }
        if (c==1)
        {
            System.out.println(f+1);
        }else if (d==1)
        {
            System.out.println(l+1);
        }else {
            System.out.println("0");
        }
        //

    }
}
