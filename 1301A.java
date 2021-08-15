
import java.util.Scanner;

public class A1301 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {
            String valu=sc.next();
            String valu2=sc.next();
            String valu3=sc.next();

      if (valid(valu,valu2,valu3)==true)
       {
            System.out.println("YES");
         }else {
    System.out.println("NO");
         }
            a--;

        }
    }
    public static boolean valid(String valu,String val2,String val3)
    {
        for (int i=0;i<val2.length();i++)
        {
           if (valu.charAt(i)!=val3.charAt(i) && val3.charAt(i)!=val2.charAt(i))
            {
                return false;
            }

        }
        return true;
    }
}
