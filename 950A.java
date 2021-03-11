

import java.util.Scanner;

public class A950 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] arrayy=new int[3];
        arrayy[0]=a;
        arrayy[1]=b;
        arrayy[2]=c;
        int count=0;

            if (a>b)
            {
                int k=b+c;
                if (k<=a)
                {
                    System.out.println(k*2);
                }else {
                    int sum=0;
                    int kk=Math.abs(a-b);
                    c=c-kk;
                     sum=(a*2)+c;
                     if (sum%2==0)
                     {
                      System.out.println(sum);
                     }else {
                         System.out.println(sum-1);
                     }


                }

            }else {
                int k=a+c;
                if (k<=b)
                {
                    System.out.println(k*2);
                }else {
                    int sum=0;
                    int kk=Math.abs(a-b);
                    c=c-kk;
                    if (c>0)
                    {

                    }
                    sum=(b*2)+c;
                    if (sum%2==0)
                    {
                        System.out.println(sum);
                    }else {
                        System.out.println(sum-1);
                    }


                }

            }

    }
}
