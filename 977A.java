import java.util.Scanner;
 
public class wrong_sub {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int times=sc.nextInt();
        int mod=0;
        for (int i=0;i<times;i++)
        {
            if (no%10==0)
            {
                no=no/10;
 
            }else {
                no=no-1;
 
            }
 
        }
        System.out.println(no);
    }
}
