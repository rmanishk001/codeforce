import java.util.Arrays;
import java.util.Scanner;

class A845{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a*2];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        //
        Arrays.sort(array);
        if (array[a-1]<array[a])
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
