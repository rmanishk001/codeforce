import java.util.Scanner;
 
public class A322 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a+b)-1);
        for (int i=1;i<=b;i++)
        {
            System.out.println("1"+" "+i);
        }
        for (int i=2;i<=a;i++)
        {
            System.out.println(i+" "+"1");
        }
 
    }
}
