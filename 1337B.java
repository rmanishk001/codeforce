import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
 
public class B1337 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            long k = b * 10;
            if (k >= n) {
                System.out.println("YES");
            } else {
                while (a > 0) {
                    n = (n / 2) + 10;
                    a--;
                }
                n = n - k;
                if (n > 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
