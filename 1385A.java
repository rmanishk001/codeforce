import java.util.Scanner;
 
public class B1385 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] array=new int[n*2];
            for (int j=0;j<array.length;j++)
            {
                array[j]=sc.nextInt();
            }
            //
            for (int j=0;j<array.length;j++)
            {
                int count=0;
                for (int k=0;k<j;k++)
                {
                    if (array[j]==array[k])
                    {
                        count++;
                    }
                }
                if (count==0)
                {
                    System.out.print(array[j]+" ");
                }
            }
            System.out.println();
        }
    }
}
