
import java.util.Scanner;

public class A1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        while (b > 0) {
            int a = sc.nextInt();
            int[] array = new int[a];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            if (valu(array) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

b--;
        }
    }

    public static boolean valu(int[] array)
    {
        int count=array[0];
        for (int i=1;i<array.length;i++)
        {
            if (count>array[i])
            {
                count=array[i];
            }else {
                return true;
            }
        }
        return false;
    }
}
