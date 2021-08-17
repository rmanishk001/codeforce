
import java.util.Scanner;

public class A709 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        //
        int sum=0;
        int count=0;
        for (int i=0;i<array.length;)
        {
            if (array[i]<=b)
            {
                if (sum>c)
                {
                    count++;
                    sum=0;
                }else {
                    sum=sum+array[i];
                    i++;
                }
            }else {
                i++;
            }
        }
        if (sum>c)
        {
            count++;
        }
        System.out.println(count);
    }
}
