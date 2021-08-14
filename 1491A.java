
import java.util.Scanner;

public class A1491 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] array=new int[a];
        int one=0;
        int zer=0;
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
            if (array[i]==0)
            {
                zer++;
            }else if (array[i]==1)
            {
                one++;
            }

        }
        //
        for (int i=0;i<b;i++)
        {
          int c=sc.nextInt();
          int d=sc.nextInt();
          if (c==1)
          {
              int l=d-1;

              if (array[l]==0)
              {
                  zer--;
                  one++;
                  array[l]=1;

              }else {
                  one--;
                  zer++;
                  array[l]=0;

              }


          }else {
              if (d<=one)
              {
                  System.out.println("1");
              }else {
                  System.out.println("0");
              }
          }
        }
        System.out.println();
    }

}
