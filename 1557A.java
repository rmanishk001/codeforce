package Codeforce;

import java.util.Scanner;

public class A1557 {
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
         int valu=array[0];
         double sum=0;
         for (int j=0;j< array.length;j++)
         {
             if (array[j]>valu)
             {
                 valu=array[j];
             }
             sum=sum+array[j];
         }

         //
         System.out.println((double) 1.0*(sum-valu)/ (array.length-1)+valu);

     }
    }
}
