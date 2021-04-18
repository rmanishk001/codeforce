import java.util.Scanner;
 
public class B552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long x= n;
        long m = 0;
        long kkk = 2;
        while (x > 0)
        {
            x /= 10;
            m++;
        }
        long ans = (long)n*m + m - 1;
        long k = 1;
        for (int i = 0; i < m-1; i++)
        {
            k *= 10;
            ans -=k;
        }
        System.out.println(ans);
    }
}
