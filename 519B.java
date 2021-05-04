import java.util.Arrays;
import java.util.Scanner;

public class B519 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        int[] array2=new int[a-1];
        int[] arrray3=new int[a-2];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        for (int i=0;i<array2.length;i++)
        {
            array2[i]=sc.nextInt();
        }
        for (int i=0;i<arrray3.length;i++)
        {
            arrray3[i]=sc.nextInt();
        }
        Arrays.sort(array);
       Arrays.sort(array2);
       Arrays.sort(arrray3);
       int count=0;
       int count2=0;
       for (int i=0;i<array2.length;i++)
       {if (array2[i]!=array[i])
       {
           System.out.println(array[i]);
           count++;
           break;
       }

       }
       if (count==0)
       {
           System.out.println(array[array.length-1]);
       }
       for (int i=0;i<arrray3.length;i++)
       {
           if (array2[i]!=arrray3[i])
           {
               System.out.println(array2[i]);
               count2++;
               break;
           }
       }
       if (count2==0)
       {
           System.out.println(array2[array2.length-1]);
       }

    }
}
