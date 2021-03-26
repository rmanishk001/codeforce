import java.util.Scanner;
 
public class A195 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a*c;
        int sum2=b*c;
        if (sum<=sum2)
        {
            System.out.println("0");
        }else {
            int count=0;
            for (int i=0;;i++)
            {
                if (sum2>=sum)
                {
                    break;
                }
                sum2=sum2+b;
                count++;
            }
            System.out.println(count);
        }
    }
}
