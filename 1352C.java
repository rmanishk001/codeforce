import java.util.Scanner;
 
public class C1352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            long b = sc.nextLong();
            long c = sc.nextLong();
            if (b > c) {
                System.out.println(c);
 
            } else {
                long sum=c;
                long sum2=c;
 
long x=c;
long y=c;
long n=b;
long k=c;
                y = k;
                while (x/n>1)
                {
                    x /= n;
                    y += x;
                }
                while (y - y / n != k)
                {
                    y += 1;
                }
                System.out.println(y);
 
            }
 
 
        }
    }
}
