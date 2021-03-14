import java.util.Scanner;
 
public class Lcm {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int f=0;
            int s=0;
            int count=0;
           if (2*l<=r)
           {
               System.out.println(l+" "+2*l);
           }else {
               System.out.println("-1"+" "+"-1");
           }
        }
    }
}
