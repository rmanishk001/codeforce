
import java.util.Scanner;

public class B59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        int sum=0;
        int aa=100;
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
            sum=sum+array[i];
            if (array[i]%2!=0 && array[i]<aa)
            {aa=array[i];

            }
        }
        //
        if (sum%2!=0)
        {
            System.out.println(sum);
        }else {
            if (aa%2!=0)
            {
                System.out.println(sum-aa);
            }else {
                System.out.println("0");
            }

        }

    }
}
