import java.util.Scanner;
 
public class B1076 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long aa=0;
        for (long i=2;i<=Math.sqrt(a);i++)
        {
            if (a%i==0)
            {
                aa=i;break;
            }
        }
        if (aa==0)
        {System.out.println("1");
 
        }else {
            System.out.println((a-aa)/2+1);
        }
    }
}
