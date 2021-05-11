
import java.util.Scanner;

public class B78 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String v="ROYGBIV";
        int count=0;
        int b=a/7;
        int aa=a%7;

        for (int i=0;i<b;i++)
        {
            System.out.print(v);
        }
        if(aa==1)
        {
            System.out.print("G");
        }
        else if (aa==2)
        {System.out.print("GB");

        }else if (aa==3)
        {System.out.print("YGB");

        }else if (aa==4)
        {System.out.print("YGBI");

        }else if (aa==5)
        {System.out.print("OYGBI");

        }else if (aa==6)
        {
            System.out.print( "OYGBIV");
        }
    }
}
