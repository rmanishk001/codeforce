
import java.util.Scanner;

public class A1177 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String value="1";
        for (int i=2;i<=10000;i++)
        {
            value=value+i;
        }
        System.out.println(value.charAt(a-1));
    }
}
