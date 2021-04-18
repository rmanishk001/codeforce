import java.util.Scanner;

public class C149 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++)
        {
            long b=sc.nextLong();
            long c=sc.nextLong();
          if (b%2!=0 && b%4!=0)
          {
              System.out.println("1 "+b/2+" "+(b/2));

          }else {
              if (b%4!=0)
              {
                  System.out.println("2 "+(b/2-1)+" "+(b/2-1));
              }else {
                  System.out.println(b/2+" "+b/4+" "   +b/4);
              }

          }
        }
    }
}
