import java.util.Scanner;
 
public class B1283 {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for (int i=0;i<a;i++)
    {
        int b=sc.nextInt();
        int c=sc.nextInt();
        int full=b-b%c;
        full+=Math.min(b%c,c/2);
        System.out.println(full);
    }
}
}
