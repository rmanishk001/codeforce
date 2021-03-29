import java.util.Scanner;
 
public class A1101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d=sc.nextLong();
            long k=d;
 
                if (d<b || d>c)
                {
                    System.out.println(d);
 
                }else {
                    long kk=c/d;
 
                    System.out.println((kk+1)*d);
 
                }
 
 
        }
    }
}
