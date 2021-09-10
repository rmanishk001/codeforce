
import java.util.Scanner;

public class B1550 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {


            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            String valu=sc.next();
            if(d>=0)
            {
                System.out.println((c*b)+(d*b));
            }else {
                char ll;
                if (valu.charAt(0)=='1')
                {
                    ll='0';
                }else {
                    ll='1';
                }
                int count=1;
                int counter=0;
                for (int i=1;i<valu.length();i++)
                {
               if (valu.charAt(i)!=valu.charAt(i-1))
               {
                   count++;
               }

                }
                System.out.println((count/2+1)*d+(c*b));
            }

            a--;
        }
    }
}
