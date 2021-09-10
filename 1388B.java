
import java.util.Scanner;

public class B1389 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)

        {
            int b=sc.nextInt();
            int c=(b+3)/4;
            for (int i=0;i<b-c;++i)
            {
                System.out.print("9");
            }
            for (int i=0;i<c;++i)
            {
                System.out.print("8");
            }
            System.out.println();
            a--;
        }
    }
}
