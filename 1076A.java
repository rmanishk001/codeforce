import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
 
public class A1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String value = sc.next();
        if (a == 1) {
            System.out.println(value);
        } else {
            char[] array = value.toCharArray();
            char h = array[array.length - 1];
            int count = array.length-1;
            for (int i=0;i<array.length-1;++i)
            {
                if (array[i]>array[i+1])
                {
                    count=i;
                    break;
                }
            }
            System.out.println(value.substring(0,count)+value.substring(count+1));
 
            }
        }
    }
