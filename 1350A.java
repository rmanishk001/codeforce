
import java.util.Scanner;

public class A1350 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long b = sc.nextLong();
            long c = sc.nextLong();
            if (b == 1) {
                System.out.println((c*2)-1);

            } else {
                if (b % 2 == 0) {
                    System.out.println(b + (c * 2));
                } else {
                    int count = 0;
                    for (int j = 1; j <= b; j++) {
                        if (b % j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        b = b + b;
                        c--;
                        if (c > 0) {
                            System.out.println(b + (c * 2));
                        }else {
                            System.out.println(b);
                        }
                    } else {
                        int count2=0;
                        for (int j =2;j<b;j++)
                        {
                            if (b%j==0)
                            {
                                count2=j;
                                break;
                            }
                        }
                        b=b+count2;
                        c--;
                        System.out.println(b+(c*2));
                    }
                }

            }
        }
    }
}
