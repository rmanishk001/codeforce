import java.util.Scanner;
 
public class A1478 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        long l=sc.nextLong();
        long m=sc.nextLong();
        long n=sc.nextLong();
        long d=sc.nextLong();
 
        int count=0;
        for (int i=1;i<=d;i++)
        {
            int count2=0;
            if (i%k==0)
            {
                count2++;
 
            }else if (i%l==0)
            {
count2++;
            }else if (i%m==0)
            {count2++;
 
            }else if (i%n==0)
            {
                count2++;
            }
            if (count2>0)
            {
                count++;
            }
        }
        System.out.println(count);
 
    }
}
