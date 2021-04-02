import java.util.Scanner;
 
public class B327 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long k=a;
        for (long i=1;;i++)
        {
            System.out.print((i+k)*10+" ");
            a--;
            if (a==0)
            {
                break;
            }
        }
    }
