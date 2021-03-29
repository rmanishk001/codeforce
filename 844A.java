import java.util.Scanner;

public class A844 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int a=sc.nextInt();
        if (input.length()<a)
        {
            System.out.println("impossible");
        }else {
            int count=0;
            for (int i=0;i<input.length();i++)
            {
                int count2=0;
                for (int j=0;j<i;j++)
                {
                    if (input.charAt(i)==input.charAt(j))
                    {
                        count2++;break;
                    }
                }
                if (count2==0)
                {
                    count++;
                }
            }
            if (count>=a)
            {
                System.out.println("0");
            }else {
                System.out.println(Math.abs(count-a));
            }
        }
    }
}
