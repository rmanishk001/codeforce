import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A919 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        for (long i=19;;i++)
        {

            long count=0;
            long kk=i;
            while (kk>0)
            {
                count=count+kk%10;
                kk=kk/10;
            }
            if (count==10)
            {
                a--;
                if (a==0)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
