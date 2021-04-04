
import java.util.Scanner;

public class A203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int count = 0;
        if (x == 0 || x==a || x==b) {
            System.out.println("YES");
        } else {
            for (int i = 0; i < t; i++)
            {
                if ((a-(i*d1))==x)
                {
                    count++;
                }

            }

            for (int i = 0; i < t; i++)
            {
                if ((b-(i*d2))==x)
                {
                    count++;
                }

            }



            for (int i = 0; i < t; i++) {
                for (int j = 0; j <t; j++) {
                    if ((a - (d1 * i)) + (b - (d2 * j)) == x) {
                        count++;
                        break;
                    }
                }
            }
            if (count > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
