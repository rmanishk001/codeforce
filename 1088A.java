import java.util.Scanner;
 
public class A1008 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if (x==1)
        {
            System.out.println("-1");
        }else {
 
 
        if ( x%2!=0)
        {
            System.out.println(x-1+" "+"2");
        }else {
 
 
                System.out.println(x+" "+x);
 
        }
    }
}
}
