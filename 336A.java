import java.util.Scanner;
 
public class A336 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long bb=Math.abs(a)+Math.abs(b);
        if (a>0 && b>0)
        {
            System.out.println("0 "+bb+" "+bb+" 0");
        }else if (a<0 && b<0)
        {
            System.out.println("-"+bb+" 0 0 -"+bb);
 
        }else if (a>0 && b<0)
        {
System.out.println("0  -"+bb+" "+bb +" 0 ");
        }else if (a<0 && b>0)
        {
System.out.println("-"+bb+"  0 0 "+bb);
        }
    }
}
