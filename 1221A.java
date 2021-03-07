import java.io.FileOutputStream;
import java.util.Scanner;
 
public class A1221 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            long count=0;
            long[] array = new long[b];
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextLong();
                if (array[j] <= 2048)
                {
                count=count+array[j];
            }
            }
 
            //
 
 
                if (count >= 2048) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
 
                    //
 
 
                }
 
            }
 
