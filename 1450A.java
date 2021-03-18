

import java.util.Arrays;
import java.util.Scanner;

public class A1450 {

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                int b = sc.nextInt();
                String name = sc.next();
                char[] array = name.toCharArray();
                Arrays.sort(array);
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j]);
                }
                System.out.println();
            }
        }
    }
