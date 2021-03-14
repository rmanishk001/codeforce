
import java.util.Scanner;

public class besttim {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            System.out.println(b-1);
            for (int j=2;j<=b;j++)
            {
                System.out.print(j+" ");

            }
        }
    }
}
