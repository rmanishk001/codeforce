import java.util.Scanner;
 
public class A124 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;
        for (int i=b;i<=a;i++)
        {
            int bb=a-i;
 
            if (i>b && bb<=c)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
