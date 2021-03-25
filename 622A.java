import java.util.Scanner;
 
public class A622 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long aa=1;
long count=0;
long sum=0 ;
        for (long i=1;;i++)
        {
            sum=sum+i;
            if (sum==a)
            {
                System.out.println(i);
                break;
            }else if (sum>a)
            {
                for (long j=i;j>0;j--)
                {
 
                    if (sum==a)
                    {
                        System.out.println(j);
                        break;
 
                    }
                    sum--;
                }
                break;
            }
        }
    }
}
