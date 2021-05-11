import java.util.Scanner;
 
public class A171 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String valu=sc.next();
        String valu2=sc.next();
 
        String b="";
        for (int i=valu2.length()-1;i>=0;i--)
        {
            b=b+valu2.charAt(i);
        }
        long a=Long.parseLong(String.valueOf(valu));
        Long bb=Long.parseLong(String.valueOf(b));
        System.out.println(a+bb);
 
    }
}
