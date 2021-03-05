import java.util.Arrays;
import java.util.Scanner;
 
public class Sereja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
        int m = s.nextInt();
        int res = 0, j = 0;
        Arrays.sort(a);
        for(int i = 0; i < m; i++) {
            if(i < a.length) res += a[i];
            else res -= d;
        }
        System.out.println(res);
    }
}
