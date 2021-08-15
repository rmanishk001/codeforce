
import java.util.Scanner;

public class A1504 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {
            String b=sc.next();
            String n='a'+b;
            String k=b+'a';
            if (!ispl(n))
            {
                System.out.println("YES");
                System.out.println(n);
            }else if (!ispl(k))
            {
                System.out.println("YES");
                System.out.println(k);
            }else {
                System.out.println("NO");
            }


            a--;

        }
    }
    static  boolean  ispl(String v)
    {
        int n=v.length();
        for (int i=0;i<n;i++)
        {
            if (v.charAt(i)!=v.charAt(v.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
