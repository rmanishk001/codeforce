import java.util.Arrays;
import java.util.Scanner;
 
public class B682 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long[] array=new long[a];
        for (int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        //
        //
        Arrays.sort(array);
        long count=1;
        for (int i=0;i< array.length;i++)
        {
            if (array[i]==count)
            {
                count++;
            }else if (count<array[i]){
                array[i]=count;
                count++;
 
            }
        }
        System.out.println(count);
    }
}
