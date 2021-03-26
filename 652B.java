import java.util.Arrays;
import java.util.Scanner;
 
public class B652 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
 
            for (int i = 0, j = array.length - 1; i <array.length / 2; i++, j--) {
                System.out.print(array[i] + " ");
 
                System.out.print(array[j] + " ");
            }
            if (array.length%2!=0)
            {
                System.out.println(array[(array.length/2)]);
            }
        }
    }
 
