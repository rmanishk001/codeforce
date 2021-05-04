
import java.util.Scanner;

public class B879 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        long b=sc.nextLong();

        int[] array=new int[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        if (b<=array.length-1)
        {
            long bb=array[0];
            long cc=b;
            long hh=0;
            int count=0;
            for (int i=1;i<array.length;i++)
            {

                if (hh>=cc)
                {
                    System.out.println(bb);
                    count++;
                    break;
                }
                if (bb>array[i])
                {
                    hh++;
                }else {
                    hh=1;
                    bb=array[i];
                }
            }
            if (count==0)
            {
                System.out.println(bb);
            }

        }else {
            int  bb=0;
            for (int i=0;i<array.length;i++)
            {
                if (array[i]>bb)
                {
                    bb=array[i];
                }
            }
            System.out.println(bb);
        }

    }
}
