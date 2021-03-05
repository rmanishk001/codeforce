
import java.util.Scanner;

public class A669 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long sum=0;
        long count=0;
        long count2=0;
       if (a>=3)
       {
            sum=a/3;
            long kk=sum*3;
            long kkk=Math.abs(a-kk);
            if (kkk==1 || kkk==2 )
            {
                System.out.println((sum*2)+1);
            }else {
                System.out.println(sum*2);
            }
       }else if (a==2)
       {
           System.out.println("1");
       }else if (a==1)
       {
           System.out.println("1");
       }
    }
}
