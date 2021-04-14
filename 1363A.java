import java.util.Scanner;
 
public class A1364 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            int[] array = new int[a];
            int even = 0;
            int odd = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
                if (array[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (odd == 0) {
                System.out.println("NO");
            } else if (even==0) {
                if (b%2==0)
                {
                    System.out.println("NO");
                }else {
                    System.out.println("YES");
                }
            } else {
                if (odd % 2 != 0 || odd == 1) {
                    int sum3 = even + odd;
                    if (sum3 >= b) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    int sum3 = even + (odd - 1);
                    if (sum3 >= b) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
 
    }
}
