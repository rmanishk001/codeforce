import java.util.Arrays;
import java.util.Scanner;

public class B1496 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();

                long[] arrray = new long[b];
                for (int i = 0; i < arrray.length; i++) {
                    arrray[i] = sc.nextLong();
                }
                Arrays.sort(arrray);
            if (c>0) {
                long l = istrue(arrray);


                if (l < arrray[arrray.length - 1]) {
                    long m = (l + arrray[arrray.length - 1]) / 2;
                    if (m*2!=(l+ arrray[arrray.length-1])){
                        m++;
                    }
                    if (isvalid(m, arrray) == true) {
                        System.out.println(b);
                    } else {
                        System.out.println(b + 1);
                    }
                } else {
                    System.out.println(b + c);
                }
            }else {
                System.out.println(b);
            }
            a--;
        }
    }
    public static long  istrue(long[] array){
        long count=0;

        for (int i=0;i< array.length;i++)
        {
            if (i!=array[i]){
                count=i;
                return count;
            }
        }

        return array[array.length-1]+1;
    }
    public static boolean isvalid(long m,long[] array){
        for (int i=0;i<array.length;i++)
        {
            if (array[i]==m)
            {
                return true;
            }
        }
        return false;
    }
}
