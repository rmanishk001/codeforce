

import java.util.Scanner;

public class A1364 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int[] array=new int[b];
            int c=sc.nextInt();
            long sum=0;
            for (int j=0;j< array.length;j++)
            {
                array[j]=sc.nextInt();
                sum=sum+array[j];

            }
            //
            if (sum%c!=0)
            {
                System.out.println(array.length);
            }else {
                int count=0;
                int count2= b;
                for (int j= array.length-1,k=0;j>=0;j--,k++)
                {
                    if (array[k]%c!=0 || array[j]%c!=0)
                    {

                        count2--;
                        System.out.println(count2);
                   count++;
                    break;}else {
                        sum=sum-array[j];
                 count2--;
                    }

                }
                if (count==0)
                {
                    System.out.println("-1");
                }
            }
        }
    }
}
