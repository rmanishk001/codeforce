import java.util.Scanner;

public class A1380 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int j=0;j<a;j++)
        {
            int b=sc.nextInt();
            int[] array=new int[b];
            for (int i=0;i<array.length;i++)
            {
                array[i]=sc.nextInt();
        }
            int count=0;
            for (int  i=1;i<array.length-1;i++)
            {
                if (array[i]>array[i-1] &&array[i]>array[i+1])
                {
                    System.out.println("YES");
                    System.out.println(i+" "+(i+1)+" "+(i+2));
                count++;
                break;}
            }
            if (count==0)
            {
                System.out.println("NO");
            }

        }
    }
}
