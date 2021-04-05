import java.util.Scanner;
 
public class A111877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int count = 0;
        if (a > 3) {
            if (a % 2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("1" + " " + (a - 3) / 2);
            }
        }else {
            System.out.println("NO");
        }
    }
    }
