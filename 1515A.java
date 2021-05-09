import java.util.Arrays;
import java.util.Scanner;
 
public class A1515 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in );
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
 
            int[] array=new int[b];
            for (int j=0;j<array.length;j++)
            {
                array[j]=sc.nextInt();
            }
            int count2=0;
            int[] array2=new int[b];
            for (int j=0;j<array.length;j++)
            {
                int sum2=0;
                int count3=0;
                for (int k=0,l=j;;k++,l++)
                {
                    if (l==array.length)
                    {
                        l=0;
                    }
                    if (k==array.length)
                    {
                        break;
                    }
                    array2[k]=array[l];
                    sum2=sum2+array2[k];
                    if (sum2==c)
                    {
                        count3++;
                        break;
                    }
 
                }
                if (count3==0)
                {
                    count2++;
                    break;
                }
            }
            if (count2==0)
            {
                System.out.println("NO");
            }else {
                System.out.println("YES");
                for (int j=0;j<array2.length;j++)
                {
                    System.out.print(array2[j]+" ");
                }
                System.out.println();
            }
 
 
        }
        }
    }
 
