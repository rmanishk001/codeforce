
import java.util.Scanner;

public class B1077 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int count=0;
        for (int i=1;i<array.length-1;i++)
        {
            if (array[i-1]==1 && array[i+1]==1 && array[i]==0)
            {
                count++;
                if (i<array.length-1) {
                    i=i+2;
                }
            }
        }
        System.out.println(count);
    }
}
