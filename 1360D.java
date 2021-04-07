
import java.util.Scanner;

public class D1360 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long ans=n;
            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) {
                    if (j <= k) {
                        ans = Math.min(ans, n / j);
                    }

                    if (n / j <= k) {
                        ans = Math.min(ans, j);
                    }
                }
            }
            System.out.println(ans);

        }

    }
}
