
import java.util.Scanner;
import java.util.Vector;

public class A134 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        int sum=0;
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }


        int[] array2=new int[a];
        long sum2=0;
        int length=0;

        for (int i=0;i<array.length;i++)
        {
            if (array[i]*a==sum)
            {
                array2[length]=i+1;
                sum2++;
                length++;
            }

        }
        System.out.println(sum2);
        for (int i=0;i<length;i++)
        {

                System.out.print(array2[i]+" ");

        }

    }
}
