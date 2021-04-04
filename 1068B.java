
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1068 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long a=Long.parseLong(br.readLine());
        long count=0;
        if (a<=2)
        {
            System.out.println(a);
        }else {
            for (long i = 1; i * i <= a; i++) {
                if (i * i == a) {
                    count++;
                } else if (a % i == 0) {
                    count = count + 2;
                }
            }
        
        System.out.println(count);
    }}
}
