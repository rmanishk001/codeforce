
import java.util.Arrays;
import java.util.Scanner;

public class A1417 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        for (int i=0;i<f;i++)
        {

            //
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] array=new int[a];
            for (int j=0;j<array.length;j++)
            {
                array[j]=sc.nextInt();
            }
            //
            int count=0;
            while (true)
            {
                if (array[1]>b)
                {
                    break;
                }
                Arrays.sort(array);
                array[1]=array[0]+array[1];
                count++;

            }
            System.out.println(--count);
            //

        }
    }
}
