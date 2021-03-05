import java.util.Scanner;
 
public class A931 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=Math.abs(a-b);
        int ans=0;
        for (int i=1;i<=k;i++)
        {
            ans=ans+i;
        }
        int d=k;
        int l=k/2;
        int ll=k-l;
        int final1=0;
        int final2=0;
        for (int i=1;i<=l;i++)
        {
            final1=final1+i;
        }
        for (int j=1;j<=ll;j++)
        {
            final2=final2+j;
        }
        int total=final1+final2;
        if (ans>total)
        {
            System.out.println(total);
        }else {
            System.out.println(ans);
        }
    }
}
