
import java.util.Scanner;

public class PRAC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {

            int b=sc.nextInt();
            int count=0;
            for (int i=1;;i++)
            {
                String va=String.valueOf(i);

                if (i%3!=0 && va.charAt(va.length()-1)!='3')
                {
                 count++;
                }
                if (count==b)
                {
                    System.out.println(i);
                    break;
                }
            }
            a--;
        }
    }
}
