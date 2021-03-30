import java.util.Scanner;
 
public class A463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for (int k = 0; k < b; k++) {
            int a = sc.nextInt();
            int[] array = new int[a];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            //
            int count = 0;
           int ans=array[array.length-1];
           for (int i= array.length-1;i>=0;i--)
            {
                if (ans<array[i])
                {
                    count++;
                }else {
                    ans=array[i];
                }
 
            }
 
                System.out.println(count);
            }
        }
    }
