import java.util.Scanner;

public class A1457 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {
            int b=sc.nextInt();
            int count=1;
int k=b;
            while (b>0)
            {
                for (int i=0;i<count;i++){
                    System.out.print("(");
                }
                for (int i=0;i<count;i++)
                {
                    System.out.print(")");
                }
                for (int i=count;i<k;i++)
                {
                    System.out.print("()");
                }System.out.println();
                count++;
                b--;
            }
            a--;
        }
    }
}
