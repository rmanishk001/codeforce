
import java.util.Scanner;

public class A145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String input2 = sc.next();

            int count = 0;
            int count2=0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != input2.charAt(i)) {
                    if (input.charAt(i) == '4') {
                        count++;
                    } else {
                        count2++;
                    }
                }
            }
            System.out.println(Math.max(count,count2));

    }
}
