import java.util.Arrays;
import java.util.Scanner;
 
public class M802 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        long sum=0;
        int bb=b;
        for (int i=0;i<array.length;i++)
        {
            if(b==0)
            {
                break;
            }else {
                sum=sum+array[i];
                b--;
            }
 
        }
        System.out.println(sum);
    }
}
