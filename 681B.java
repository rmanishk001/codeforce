import java.util.Scanner;
 
public class B681 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        int count=0;
        long aa=a/1234;
        long bb=a/123456;
        long cc=a/1234567;
        for (int i=0;i<=cc;i++)
        {
            for (int j=0;j<=bb;j++)
            {
 
                   long k=a-i*1234567-j*123456;
                   if (k>=0 && k%1234==0)
                   {
                       count++;
                       break;
                   }
 
 
            }
            if (count>0)
            {
                break;
            }
        }
        if (count>0) {
            System.out.println("YES");
 
        }else {
        System.out.println("NO");}
    }
}
