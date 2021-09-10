

import java.util.Scanner;

public class B188 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

            int b=sc.nextInt();
            for (int i=0;i<b;i++)
            {
                System.out.print("  ");
            }
            System.out.print("0");
            System.out.println();
            int count2=b-1;
            for (int i=1;i<=b;i++)
            {
                for (int m=0;m<count2;m++)
                {
                    System.out.print("  ");
                }
                count2--;
                System.out.print("0 ");

                for (int j=1;j<=i;j++)
                {
                    System.out.print(j+ " ");
                }
                for (int k=i-1;k>=1;k--)
                {
                    System.out.print(k+" ");
                }
                System.out.print("0");
                System.out.println();
            }


            int count=1;
            for (int i=b-1;i>=1;i--)
            {
                for (int k=0;k<count;k++)
                {
                    System.out.print("  ");
                }
                count++;
                System.out.print("0 ");

                for (int j=1;j<=i;j++)
                {
                    System.out.print(j+ " ");
                }
                for (int k=i-1;k>=1;k--)
                {
                    System.out.print(k+" ");
                }
                System.out.print(0);
                System.out.println();

        }
        for (int i=0;i<b;i++)
        {
            System.out.print("  ");
        }
        System.out.print("0");
    }
}
