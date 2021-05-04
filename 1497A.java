import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
 
public class A1497 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int j=0;j<a;j++)
        {
            int b=sc.nextInt();
            int[] array=new int[b];
            for (int i=0;i<array.length;i++)
            {
                array[i]=sc.nextInt();
            }
            Arrays.sort(array);
            int length=0;
            int[] array2=new int[array.length];
            System.out.print(array[0]+" ");
            for (int i=1;i<array.length;i++)
            {
                int  count=0;
                for (int k=i-1;k>=0;k--)
                {
                    if (array[i]!=array[k])
                    {
                        break;
                    }else {
                        count++;
                    }
                }
                if (count==0)
                {
                    System.out.print(array[i]+" ");
                }else {
                    array2[length]=array[i];
                    length++;
                }
            }
            for (int i=0;i<length;i++)
            {
                System.out.print(array2[i]+" ");
            }
            System.out.println();
 
        }
    }
}
