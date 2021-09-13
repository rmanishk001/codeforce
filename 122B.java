
import java.util.Scanner;

public class B122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.next();
        int a=0;
        int b=0;
        for (int i=0;i<val.length();i++)
        {
            if (val.charAt(i)=='4')
            {
                a++;
            }else if (val.charAt(i)=='7')
            {
                b++;
            }
        }
        if (a==0 && b==0)
        {
            System.out.println("-1");

        }else {
            if (a==b)
            {
                System.out.println("4");
            }else if (a>b)
            {
                System.out.println("4");
            }else {
                System.out.println("7");
            }
        }
    }
}
