

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C1462 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {
            int b=sc.nextInt();
            if (b==46)
            {
                System.out.println(Integer.MAX_VALUE);
            }
            if (b>46)
            {
                System.out.println("-1");
            }else {
                System.out.println(main(b));
            }
            a--;
        }
    }


    public static int hh(int b)
    {
        int count=0;
        while (b>0)
        {
            count=count+b%10;
            b=b/10;
        }
        return count;
    }
    public static boolean istrue(int n)
    {
        String val=String.valueOf(n);
        final Set<Integer> set = new HashSet<>();

       return String.valueOf(n).chars().allMatch(set::add);
    }

    public static int main(int b)
    {
        for (int i=0;i<Integer.MAX_VALUE;i++)
        {
            if (hh(i)==b )
            {
                if (istrue(i)==true) {
                    return i;
                }
            }
        }
        return -1;
    }
}
