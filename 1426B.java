
import java.util.Scanner;

public class B1426 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a > 0) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (b == 1) {
                int count=0;
                while (b > 0) {
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    int c1 = sc.nextInt();
                    int d1 = sc.nextInt();
                    if (b1==c1)
                    {
                        count++;
                    }
                    b--;

                }
                if (c%2==0 && count>0) {

                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            } else {

                if (c % 2 != 0) {
                    while (b > 0) {
                        int a1 = sc.nextInt();
                        int b1 = sc.nextInt();
                        int c1 = sc.nextInt();
                        int d1 = sc.nextInt();
                        b--;

                    }
                    System.out.println("NO");
                } else {
                    int count = 0;
                    int count2 = 0;
                    while (b > 0) {
                        int a1 = sc.nextInt();
                        int b1 = sc.nextInt();
                        int c1 = sc.nextInt();
                        int d1 = sc.nextInt();
                        if (a1 == d1) {
                            count++;
                        }
                        if (c1 == b1) {
                            count2++;
                        }
                        b--;

                    }
                    if (count2 > 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }

                }
            }                a--;

        }
    }
}
