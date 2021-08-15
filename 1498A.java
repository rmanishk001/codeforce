
import java.util.Scanner;

public class A1489 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)

        {
            int b=sc.nextInt();
            while (true)
            {
                int l=valu(b);
                if (l>1)
                {
                    System.out.println(b);
                break;
                }
                b++;
            }


            a--;
        }
    }


    public static int valu(int valu)
    {
        String and=String.valueOf(valu);
        int b=0;
        for (int i=0;i<and.length();i++)
        {
            b=b+Integer.parseInt(String.valueOf(and.charAt(i)));
        }
        //
        int ll=1;

        for (int i=2;i<=b;i++)
        {
            if (valu%i==0 && b%i==0)
            {
                ll=i;
                break;

            }
        }
        return ll;


    }
}
