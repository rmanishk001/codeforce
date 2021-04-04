import java.util.Scanner;
 
public class A230 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int t = -1;
        for(int i = 0;i < 1005;i++) {
            for(int j = 0;j < 1005;j++) {
                if((a*i - c*j) == (d-b)) {
                    if(t == -1) {
                        t = b + a*i;
                    } else {
                        t = Math.min(t,b+a*i);
                    }
                }
            }
 
        }
        System.out.println(t);
    }
}
