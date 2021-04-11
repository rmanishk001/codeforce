
import java.util.Scanner;

public class A1512 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int[] array=new int[b];
            for (int j=0;j<array.length;j++)
            {
                array[j]=sc.nextInt();
            }
            int aa=0;
            for (int j=0;j<array.length;j++)
            {
                int count=0;
                for (int k=0;k< array.length;k++)
                {
                    if (j!=k)
                    {
                        if (array[j]==array[k])
                        {
                            count++;
                            break;
                        }
                    }
                }
                if (count==0)
                {
                    aa=j+1;
                    break;
                }
            }
            System.out.println(aa);
        }
    }
}
