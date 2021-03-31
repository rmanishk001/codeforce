import java.util.Arrays;
import java.util.Scanner;
 
public class A27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i<a;i++)
        {array[i]=sc.nextInt();
 
        }
        Arrays.sort(array);
        int count=0;
        for (int i=0;i< array.length;i++)
        {
            int k=i;
            if ((k+1)!=array[i])
            {
                    System.out.println(i+1);
                  count++;  break;
                    
            }
        }
        if (count==0)
        {
            System.out.println(array[array.length-1]+1);
        }
    }
}
