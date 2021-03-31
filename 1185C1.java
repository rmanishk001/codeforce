import java.util.Arrays;
import java.util.Scanner;
 
public class C885 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i<a;i++)
 
        {
            array[i]=sc.nextInt();
 
 
        }
        //
        System.out.println("0");
        for (int i=1;i< array.length;i++)
        {
            int[] array2=new int[i];
            for (int j=0;j<=(i-1);j++)
            {
                array2[j]=array[j];
            }
            Arrays.sort(array2);
            int count=0;
            int sum=array[i];
            for (int k=0;k< array2.length;k++)
            {
                sum=sum+array2[k];
                if (sum>b)
                {
                    count++;
                }
            }
            System.out.println(count);
 
        }
    }
}
