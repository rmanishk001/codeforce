import java.util.Scanner;
 
public class A1141 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a > b || b%a!=0) {
            System.out.println("-1");
        } else {
 
            int count = 0;
            long p = b / a;
            while (p % 2 == 0) {
                p = p / 2;
                count++;
            }
            while (p % 3 == 0) {
                p = p / 3;
                count++;
            }
            if (p == 1) {
                System.out.println(count);
            } else {
                System.out.println("-1");
            }
 
        }
    }
}
