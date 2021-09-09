
import java.util.Arrays;
import java.util.Scanner;

class A1539{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            int[] array=new int[b];
            int[] tem=new int[b];
            for (int i=0;i<array.length;i++)
            {
                array[i]=sc.nextInt();
                tem[i]=array[i];
            }
            int[] array2=new int[b];
            for (int i=0;i< array2.length;i++)
            {
                array2[i]=sc.nextInt();
            }
            Arrays.sort(array);
            Arrays.sort(array2);
            int count=0;
            for (int i=0,j=array.length-1;i<array.length;i++)
            {
               if (c>0)
               {
                   if (array2[j]>array[i]){
                       count=count+array2[j];
                       j--;
                       c--;
                   }else {
                       count=count+array[i];
                   }
               }else {
                   count=count+array[i];
               }

            }
            System.out.println(count);


            a--;

        }

    }
}
